package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

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
  var capabilities: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  /**
    * The shallow ref to the default team.
    */
  var defaultTeam: WebApiTeamRef
}

object TeamProject {
  @scala.inline
  def apply(
    _links: js.Any,
    abbreviation: java.lang.String,
    capabilities: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]],
    defaultTeam: WebApiTeamRef,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    revision: scala.Double,
    state: js.Any,
    url: java.lang.String,
    visibility: ProjectVisibility
  ): TeamProject = {
    val __obj = js.Dynamic.literal(_links = _links, abbreviation = abbreviation, capabilities = capabilities, defaultTeam = defaultTeam, description = description, id = id, name = name, revision = revision, state = state, url = url, visibility = visibility)
  
    __obj.asInstanceOf[TeamProject]
  }
}

