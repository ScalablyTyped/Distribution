package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamSettingsDataContractBase extends StObject {
  
  /**
    * Collection of links relevant to resource
    */
  var _links: js.Any
  
  /**
    * Full http link to the resource
    */
  var url: String
}
object TeamSettingsDataContractBase {
  
  @scala.inline
  def apply(_links: js.Any, url: String): TeamSettingsDataContractBase = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsDataContractBase]
  }
  
  @scala.inline
  implicit class TeamSettingsDataContractBaseMutableBuilder[Self <: TeamSettingsDataContractBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
