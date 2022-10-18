package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApiTeamRef extends StObject {
  
  /**
    * Team (Identity) Guid. A Team Foundation ID.
    */
  var id: String
  
  /**
    * Team name
    */
  var name: String
  
  /**
    * Team REST API Url
    */
  var url: String
}
object WebApiTeamRef {
  
  inline def apply(id: String, name: String, url: String): WebApiTeamRef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiTeamRef]
  }
  
  extension [Self <: WebApiTeamRef](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
