package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamSettingsDataContractBase extends StObject {
  
  /**
    * Collection of links relevant to resource
    */
  var _links: Any
  
  /**
    * Full http link to the resource
    */
  var url: String
}
object TeamSettingsDataContractBase {
  
  inline def apply(_links: Any, url: String): TeamSettingsDataContractBase = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsDataContractBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamSettingsDataContractBase] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
