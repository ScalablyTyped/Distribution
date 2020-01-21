package typings.vsoNodeApi.coreInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectInfo extends js.Object {
  var abbreviation: String
  var description: String
  var id: String
  var lastUpdateTime: Date
  var name: String
  var properties: js.Array[ProjectProperty]
  /**
    * Current revision of the project
    */
  var revision: Double
  var state: js.Any
  var uri: String
  var version: Double
  var visibility: ProjectVisibility
}

object ProjectInfo {
  @scala.inline
  def apply(
    abbreviation: String,
    description: String,
    id: String,
    lastUpdateTime: Date,
    name: String,
    properties: js.Array[ProjectProperty],
    revision: Double,
    state: js.Any,
    uri: String,
    version: Double,
    visibility: ProjectVisibility
  ): ProjectInfo = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectInfo]
  }
}

