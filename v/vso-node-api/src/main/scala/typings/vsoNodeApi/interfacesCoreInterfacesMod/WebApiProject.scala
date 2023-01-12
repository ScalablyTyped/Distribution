package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApiProject
  extends StObject
     with TeamProjectReference {
  
  /**
    * Set of capabilities this project has
    */
  var capabilities: StringDictionary[StringDictionary[String]]
  
  /**
    * Reference to collection which contains this project
    */
  var collection: WebApiProjectCollectionRef
  
  /**
    * Default team for this project
    */
  var defaultTeam: WebApiTeamRef
}
object WebApiProject {
  
  inline def apply(
    abbreviation: String,
    capabilities: StringDictionary[StringDictionary[String]],
    collection: WebApiProjectCollectionRef,
    defaultTeam: WebApiTeamRef,
    description: String,
    id: String,
    name: String,
    revision: Double,
    state: Any,
    url: String,
    visibility: ProjectVisibility
  ): WebApiProject = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], defaultTeam = defaultTeam.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiProject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebApiProject] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCollection(value: WebApiProjectCollectionRef): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setDefaultTeam(value: WebApiTeamRef): Self = StObject.set(x, "defaultTeam", value.asInstanceOf[js.Any])
  }
}
