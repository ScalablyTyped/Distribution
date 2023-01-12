package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoragesSnapshot extends StObject {
  
  var localStorage: String
  
  var sessionStorage: String
}
object StoragesSnapshot {
  
  inline def apply(localStorage: String, sessionStorage: String): StoragesSnapshot = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any], sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoragesSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoragesSnapshot] (val x: Self) extends AnyVal {
    
    inline def setLocalStorage(value: String): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
    
    inline def setSessionStorage(value: String): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
  }
}
