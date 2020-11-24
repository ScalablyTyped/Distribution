package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportOptions extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var projectionMatrix: js.UndefOr[ViewMatrix] = js.native
  
  var viewMatrix: js.UndefOr[ViewMatrix] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ViewportOptions {
  
  @scala.inline
  def apply(): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportOptions]
  }
  
  @scala.inline
  implicit class ViewportOptionsOps[Self <: ViewportOptions] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setProjectionMatrixVarargs(value: Double*): Self = this.set("projectionMatrix", js.Array(value :_*))
    
    @scala.inline
    def setProjectionMatrix(value: ViewMatrix): Self = this.set("projectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectionMatrix: Self = this.set("projectionMatrix", js.undefined)
    
    @scala.inline
    def setViewMatrixVarargs(value: Double*): Self = this.set("viewMatrix", js.Array(value :_*))
    
    @scala.inline
    def setViewMatrix(value: ViewMatrix): Self = this.set("viewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMatrix: Self = this.set("viewMatrix", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
