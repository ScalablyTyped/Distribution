package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Web extends StObject {
  
  var app: String | Null
  
  var web: String | Null
}
object Web {
  
  inline def apply(): Web = {
    val __obj = js.Dynamic.literal(app = null, web = null)
    __obj.asInstanceOf[Web]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Web] (val x: Self) extends AnyVal {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppNull: Self = StObject.set(x, "app", null)
    
    inline def setWeb(value: String): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebNull: Self = StObject.set(x, "web", null)
  }
}
