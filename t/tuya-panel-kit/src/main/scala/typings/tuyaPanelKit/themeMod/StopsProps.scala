package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopsProps extends js.Object {
  
  var offset: String = js.native
  
  var stopColor: String = js.native
  
  var stopOpacity: String = js.native
}
object StopsProps {
  
  @scala.inline
  def apply(offset: String, stopColor: String, stopOpacity: String): StopsProps = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], stopColor = stopColor.asInstanceOf[js.Any], stopOpacity = stopOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopsProps]
  }
  
  @scala.inline
  implicit class StopsPropsOps[Self <: StopsProps] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColor(value: String): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacity(value: String): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
  }
}
