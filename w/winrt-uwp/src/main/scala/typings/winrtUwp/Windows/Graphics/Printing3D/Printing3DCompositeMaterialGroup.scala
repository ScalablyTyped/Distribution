package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of composite materials. */
@js.native
trait Printing3DCompositeMaterialGroup extends js.Object {
  
  /** Gets an list of mixtures that define individual composite materials. Each mixture is defined by listing the proportion of the overall mixture for each base material (values between 0 and 1), where the proportion values are specified in the same order as the base materials in MaterialIndices . */
  var composites: IVector[Printing3DCompositeMaterial] = js.native
  
  /** Gets the identifier (ID) of the base material group that defines the materials used in the composite material group. */
  var materialGroupId: Double = js.native
  
  /** Gets an ordered list of base materials that are used to make the composite materials in the group. The order of base materials is maintained in the mixture values defined by Composites . */
  var materialIndices: IVector[Double] = js.native
}
object Printing3DCompositeMaterialGroup {
  
  @scala.inline
  def apply(
    composites: IVector[Printing3DCompositeMaterial],
    materialGroupId: Double,
    materialIndices: IVector[Double]
  ): Printing3DCompositeMaterialGroup = {
    val __obj = js.Dynamic.literal(composites = composites.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any], materialIndices = materialIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DCompositeMaterialGroup]
  }
  
  @scala.inline
  implicit class Printing3DCompositeMaterialGroupOps[Self <: Printing3DCompositeMaterialGroup] (val x: Self) extends AnyVal {
    
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
    def setComposites(value: IVector[Printing3DCompositeMaterial]): Self = this.set("composites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialGroupId(value: Double): Self = this.set("materialGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialIndices(value: IVector[Double]): Self = this.set("materialIndices", value.asInstanceOf[js.Any])
  }
}
