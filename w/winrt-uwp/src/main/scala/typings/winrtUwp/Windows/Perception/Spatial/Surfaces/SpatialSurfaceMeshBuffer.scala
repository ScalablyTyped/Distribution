package typings.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialSurfaceMeshBuffer extends js.Object {
  
  var data: js.Any = js.native
  
   /* unmapped type */ var elementCount: js.Any = js.native
  
   /* unmapped type */ var format: js.Any = js.native
  
   /* unmapped type */ var stride: js.Any = js.native
}
object SpatialSurfaceMeshBuffer {
  
  @scala.inline
  def apply(data: js.Any, elementCount: js.Any, format: js.Any, stride: js.Any): SpatialSurfaceMeshBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elementCount = elementCount.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceMeshBuffer]
  }
  
  @scala.inline
  implicit class SpatialSurfaceMeshBufferOps[Self <: SpatialSurfaceMeshBuffer] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementCount(value: js.Any): Self = this.set("elementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Any): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStride(value: js.Any): Self = this.set("stride", value.asInstanceOf[js.Any])
  }
}
