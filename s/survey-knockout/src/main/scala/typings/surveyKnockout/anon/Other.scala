package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Other extends StObject {
  
  var control: String
  
  var other: String
  
  var root: String
}
object Other {
  
  @scala.inline
  def apply(control: String, other: String, root: String): Other = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  
  @scala.inline
  implicit class OtherMutableBuilder[Self <: Other] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
