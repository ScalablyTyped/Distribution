package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedRaw extends StObject {
  
  var `protected`: Boolean
  
  var raw: String
}
object ProtectedRaw {
  
  @scala.inline
  def apply(`protected`: Boolean, raw: String): ProtectedRaw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedRaw]
  }
  
  @scala.inline
  implicit class ProtectedRawMutableBuilder[Self <: ProtectedRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
