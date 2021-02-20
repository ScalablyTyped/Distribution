package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugConfiguration
  extends /**
  * Additional debug type specific properties.
  */
/* key */ StringDictionary[js.Any] {
  
  /**
    * The name of the debug session.
    */
  var name: String = js.native
  
  /**
    * The request type of the debug session.
    */
  var request: String = js.native
  
  /**
    * The type of the debug session.
    */
  var `type`: String = js.native
}
object DebugConfiguration {
  
  @scala.inline
  def apply(name: String, request: String, `type`: String): DebugConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugConfiguration]
  }
  
  @scala.inline
  implicit class DebugConfigurationMutableBuilder[Self <: DebugConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
