package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiProject extends TeamProjectReference {
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
    val __obj = js.Dynamic.literal(abbreviation = abbreviation, capabilities = capabilities, collection = collection, defaultTeam = defaultTeam, description = description, id = id, name = name, revision = revision, state = state, url = url, visibility = visibility)
  
    __obj.asInstanceOf[WebApiProject]
  }
}

