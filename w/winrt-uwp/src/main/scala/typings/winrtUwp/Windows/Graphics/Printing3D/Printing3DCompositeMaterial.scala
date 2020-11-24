package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a composite material that's defined by a mixture of base materials. */
@js.native
trait Printing3DCompositeMaterial extends js.Object {
  
  /** Gets the mixture of base materials used in the composite material. Each mixture is defined by listing the proportion of the overall mixture for each base material (values between 0 and 1). */
  var values: IVector[Double] = js.native
}
object Printing3DCompositeMaterial {
  
  @scala.inline
  def apply(values: IVector[Double]): Printing3DCompositeMaterial = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DCompositeMaterial]
  }
  
  @scala.inline
  implicit class Printing3DCompositeMaterialOps[Self <: Printing3DCompositeMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValues(value: IVector[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
