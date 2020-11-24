package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearButtonControls extends js.Object {
  
  var clearButton: String = js.native
  
  var controls: String = js.native
  
  var root: String = js.native
  
  var small: String = js.native
}
object ClearButtonControls {
  
  @scala.inline
  def apply(clearButton: String, controls: String, root: String, small: String): ClearButtonControls = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearButtonControls]
  }
  
  @scala.inline
  implicit class ClearButtonControlsOps[Self <: ClearButtonControls] (val x: Self) extends AnyVal {
    
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
    def setClearButton(value: String): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: String): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: String): Self = this.set("small", value.asInstanceOf[js.Any])
  }
}
