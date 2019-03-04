package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectInfo extends js.Object {
  var abbreviation: java.lang.String
  var description: java.lang.String
  var id: java.lang.String
  var lastUpdateTime: stdLib.Date
  var name: java.lang.String
  var properties: js.Array[ProjectProperty]
  /**
    * Current revision of the project
    */
  var revision: scala.Double
  var state: js.Any
  var uri: java.lang.String
  var version: scala.Double
  var visibility: ProjectVisibility
}

object ProjectInfo {
  @scala.inline
  def apply(
    abbreviation: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    lastUpdateTime: stdLib.Date,
    name: java.lang.String,
    properties: js.Array[ProjectProperty],
    revision: scala.Double,
    state: js.Any,
    uri: java.lang.String,
    version: scala.Double,
    visibility: ProjectVisibility
  ): ProjectInfo = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation, description = description, id = id, lastUpdateTime = lastUpdateTime, name = name, properties = properties, revision = revision, state = state, uri = uri, version = version, visibility = visibility)
  
    __obj.asInstanceOf[ProjectInfo]
  }
}

