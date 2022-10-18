package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApiTagDefinition extends StObject {
  
  /**
    * Whether or not the tag definition is active.
    */
  var active: Boolean
  
  /**
    * ID of the tag definition.
    */
  var id: String
  
  /**
    * The name of the tag definition.
    */
  var name: String
  
  /**
    * Resource URL for the Tag Definition.
    */
  var url: String
}
object WebApiTagDefinition {
  
  inline def apply(active: Boolean, id: String, name: String, url: String): WebApiTagDefinition = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiTagDefinition]
  }
  
  extension [Self <: WebApiTagDefinition](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
