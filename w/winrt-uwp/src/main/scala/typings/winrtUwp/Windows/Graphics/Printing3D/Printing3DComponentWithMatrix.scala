package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Numerics.Matrix4x4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D Manufacturing Format (3MF) component that's applied to the object definition with a matrix transform. */
@js.native
trait Printing3DComponentWithMatrix extends js.Object {
  
  /** Gets or sets the 3D Manufacturing Format (3MF) primitive component that's applied to the object definition with a matrix transform. */
  var component: Printing3DComponent = js.native
  
  /** Gets or sets the matrix transform that's applied to the 3D Manufacturing Format (3MF) primitive component. */
  var matrix: Matrix4x4 = js.native
}
object Printing3DComponentWithMatrix {
  
  @scala.inline
  def apply(component: Printing3DComponent, matrix: Matrix4x4): Printing3DComponentWithMatrix = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DComponentWithMatrix]
  }
  
  @scala.inline
  implicit class Printing3DComponentWithMatrixOps[Self <: Printing3DComponentWithMatrix] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: Printing3DComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: Matrix4x4): Self = this.set("matrix", value.asInstanceOf[js.Any])
  }
}
