package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiProject extends TeamProjectReference {
  
  /**
    * Set of capabilities this project has
    */
  var capabilities: StringDictionary[StringDictionary[String]] = js.native
  
  /**
    * Reference to collection which contains this project
    */
  var collection: WebApiProjectCollectionRef = js.native
  
  /**
    * Default team for this project
    */
  var defaultTeam: WebApiTeamRef = js.native
}
object WebApiProject {
  
  @scala.inline
  def apply(
    abbreviation: String,
    capabilities: StringDictionary[StringDictionary[String]],
    collection: WebApiProjectCollectionRef,
    defaultTeam: WebApiTeamRef,
    description: String,
    id: String,
    name: String,
    revision: Double,
    state: js.Any,
    url: String,
    visibility: ProjectVisibility
  ): WebApiProject = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], defaultTeam = defaultTeam.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiProject]
  }
  
  @scala.inline
  implicit class WebApiProjectMutableBuilder[Self <: WebApiProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection(value: WebApiProjectCollectionRef): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTeam(value: WebApiTeamRef): Self = StObject.set(x, "defaultTeam", value.asInstanceOf[js.Any])
  }
}
