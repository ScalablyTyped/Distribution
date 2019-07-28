package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionReference extends js.Object {
  /**
    * The date the definition was created.
    */
  var createdDate: Date
  /**
    * The ID of the referenced definition.
    */
  var id: Double
  /**
    * The name of the referenced definition.
    */
  var name: String
  /**
    * The folder path of the definition.
    */
  var path: String
  /**
    * A reference to the project.
    */
  var project: TeamProjectReference
  /**
    * A value that indicates whether builds can be queued against this definition.
    */
  var queueStatus: DefinitionQueueStatus
  /**
    * The definition revision number.
    */
  var revision: Double
  /**
    * The type of the definition.
    */
  var `type`: DefinitionType
  /**
    * The definition's URI.
    */
  var uri: String
  /**
    * The REST URL of the definition.
    */
  var url: String
}

object DefinitionReference {
  @scala.inline
  def apply(
    createdDate: Date,
    id: Double,
    name: String,
    path: String,
    project: TeamProjectReference,
    queueStatus: DefinitionQueueStatus,
    revision: Double,
    `type`: DefinitionType,
    uri: String,
    url: String
  ): DefinitionReference = {
    val __obj = js.Dynamic.literal(createdDate = createdDate, id = id, name = name, path = path, project = project, queueStatus = queueStatus, revision = revision, uri = uri, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DefinitionReference]
  }
}

