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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abbreviation")(abbreviation)
    __obj.updateDynamic("capabilities")(capabilities)
    __obj.updateDynamic("collection")(collection)
    __obj.updateDynamic("defaultTeam")(defaultTeam)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[WebApiProject]
  }
}

