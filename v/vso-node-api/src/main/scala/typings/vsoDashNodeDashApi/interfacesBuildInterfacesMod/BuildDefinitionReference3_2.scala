package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionReference3_2 extends DefinitionReference {
  var _links: js.Any
  /**
    * The author of the definition.
    */
  var authoredBy: IdentityRef
  /**
    * A reference to the definition that this definition is a draft of, if this is a draft definition.
    */
  var draftOf: DefinitionReference
  /**
    * The list of drafts associated with this definition, if this is not a draft definition.
    */
  var drafts: js.Array[DefinitionReference]
  var metrics: js.Array[BuildMetric]
  /**
    * The quality of the definition document (draft, etc.)
    */
  var quality: DefinitionQuality
  /**
    * The default queue for builds run against this definition.
    */
  var queue: AgentPoolQueue
}

object BuildDefinitionReference3_2 {
  @scala.inline
  def apply(
    _links: js.Any,
    authoredBy: IdentityRef,
    createdDate: Date,
    draftOf: DefinitionReference,
    drafts: js.Array[DefinitionReference],
    id: Double,
    metrics: js.Array[BuildMetric],
    name: String,
    path: String,
    project: TeamProjectReference,
    quality: DefinitionQuality,
    queue: AgentPoolQueue,
    queueStatus: DefinitionQueueStatus,
    revision: Double,
    `type`: DefinitionType,
    uri: String,
    url: String
  ): BuildDefinitionReference3_2 = {
    val __obj = js.Dynamic.literal(_links = _links, authoredBy = authoredBy, createdDate = createdDate, draftOf = draftOf, drafts = drafts, id = id, metrics = metrics, name = name, path = path, project = project, quality = quality, queue = queue, queueStatus = queueStatus, revision = revision, uri = uri, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildDefinitionReference3_2]
  }
}

