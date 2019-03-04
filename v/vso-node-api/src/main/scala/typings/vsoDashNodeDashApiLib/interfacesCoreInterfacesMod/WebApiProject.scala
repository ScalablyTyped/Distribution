package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiProject extends TeamProjectReference {
  /**
    * Set of capabilities this project has
    */
  var capabilities: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
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
    abbreviation: java.lang.String,
    capabilities: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]],
    collection: WebApiProjectCollectionRef,
    defaultTeam: WebApiTeamRef,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    revision: scala.Double,
    state: js.Any,
    url: java.lang.String,
    visibility: ProjectVisibility
  ): WebApiProject = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation, capabilities = capabilities, collection = collection, defaultTeam = defaultTeam, description = description, id = id, name = name, revision = revision, state = state, url = url, visibility = visibility)
  
    __obj.asInstanceOf[WebApiProject]
  }
}

