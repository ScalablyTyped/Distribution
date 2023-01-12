package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamProject
  extends StObject
     with TeamProjectReference {
  
  /**
    * The links to other objects related to this object.
    */
  var _links: Any
  
  /**
    * Set of capabilities this project has (such as process template & version control).
    */
  var capabilities: StringDictionary[StringDictionary[String]]
  
  /**
    * The shallow ref to the default team.
    */
  var defaultTeam: WebApiTeamRef
}
object TeamProject {
  
  inline def apply(
    _links: Any,
    abbreviation: String,
    capabilities: StringDictionary[StringDictionary[String]],
    defaultTeam: WebApiTeamRef,
    description: String,
    id: String,
    name: String,
    revision: Double,
    state: Any,
    url: String,
    visibility: ProjectVisibility
  ): TeamProject = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], abbreviation = abbreviation.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], defaultTeam = defaultTeam.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamProject] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setDefaultTeam(value: WebApiTeamRef): Self = StObject.set(x, "defaultTeam", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
