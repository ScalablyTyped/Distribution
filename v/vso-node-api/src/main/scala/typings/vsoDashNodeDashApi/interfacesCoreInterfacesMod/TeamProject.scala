package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamProject extends TeamProjectReference {
  /**
    * The links to other objects related to this object.
    */
  var _links: js.Any
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
  @scala.inline
  def apply(
    _links: js.Any,
    abbreviation: String,
    capabilities: StringDictionary[StringDictionary[String]],
    defaultTeam: WebApiTeamRef,
    description: String,
    id: String,
    name: String,
    revision: Double,
    state: js.Any,
    url: String,
    visibility: ProjectVisibility
  ): TeamProject = {
    val __obj = js.Dynamic.literal(_links = _links, abbreviation = abbreviation, capabilities = capabilities, defaultTeam = defaultTeam, description = description, id = id, name = name, revision = revision, state = state, url = url, visibility = visibility)
  
    __obj.asInstanceOf[TeamProject]
  }
}

