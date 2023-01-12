package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitStrings.route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyType extends StObject {
  
  var key: String
  
  var `type`: route
}
object KeyType {
  
  inline def apply(key: String): KeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("route")
    __obj.asInstanceOf[KeyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyType] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: route): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
