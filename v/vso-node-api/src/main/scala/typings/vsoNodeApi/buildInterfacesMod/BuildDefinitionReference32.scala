package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionReference32 extends DefinitionReference {
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

object BuildDefinitionReference32 {
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
  ): BuildDefinitionReference32 = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], authoredBy = authoredBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], draftOf = draftOf.asInstanceOf[js.Any], drafts = drafts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueStatus = queueStatus.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionReference32]
  }
}

