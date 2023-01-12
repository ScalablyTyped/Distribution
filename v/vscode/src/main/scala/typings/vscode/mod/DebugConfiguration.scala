package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugConfiguration
  extends StObject
     with /**
  * Additional debug type specific properties.
  */
/* key */ StringDictionary[Any] {
  
  /**
    * The name of the debug session.
    */
  var name: String
  
  /**
    * The request type of the debug session.
    */
  var request: String
  
  /**
    * The type of the debug session.
    */
  var `type`: String
}
object DebugConfiguration {
  
  inline def apply(name: String, request: String, `type`: String): DebugConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugConfiguration] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
