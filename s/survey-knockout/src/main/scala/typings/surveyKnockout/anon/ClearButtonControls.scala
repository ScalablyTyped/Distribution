package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearButtonControls extends StObject {
  
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
  implicit class ClearButtonControlsMutableBuilder[Self <: ClearButtonControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearButton(value: String): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: String): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
