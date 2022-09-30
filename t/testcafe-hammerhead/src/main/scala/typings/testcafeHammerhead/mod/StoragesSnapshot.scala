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
  
  extension [Self <: StoragesSnapshot](x: Self) {
    
    inline def setLocalStorage(value: String): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
    
    inline def setSessionStorage(value: String): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
  }
}
