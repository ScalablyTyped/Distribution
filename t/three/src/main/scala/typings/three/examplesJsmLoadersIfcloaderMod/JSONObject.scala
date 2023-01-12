package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONObject
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var expressID: Double
  
  var `type`: String
}
object JSONObject {
  
  inline def apply(expressID: Double, `type`: String): JSONObject = {
    val __obj = js.Dynamic.literal(expressID = expressID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONObject] (val x: Self) extends AnyVal {
    
    inline def setExpressID(value: Double): Self = StObject.set(x, "expressID", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
