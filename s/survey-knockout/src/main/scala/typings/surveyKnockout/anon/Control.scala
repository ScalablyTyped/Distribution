package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control extends StObject {
  
  var control: String = js.native
  
  var other: String = js.native
  
  var root: String = js.native
  
  var selectWrapper: String = js.native
}
object Control {
  
  @scala.inline
  def apply(control: String, other: String, root: String, selectWrapper: String): Control = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit class ControlMutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectWrapper(value: String): Self = StObject.set(x, "selectWrapper", value.asInstanceOf[js.Any])
  }
}
