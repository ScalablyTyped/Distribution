package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionReference3_2 extends DefinitionReference {
  var _links: js.Any
  /**
    * The author of the definition.
    */
  var authoredBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
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
    authoredBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdDate: stdLib.Date,
    draftOf: DefinitionReference,
    drafts: js.Array[DefinitionReference],
    id: scala.Double,
    metrics: js.Array[BuildMetric],
    name: java.lang.String,
    path: java.lang.String,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference,
    quality: DefinitionQuality,
    queue: AgentPoolQueue,
    queueStatus: DefinitionQueueStatus,
    revision: scala.Double,
    `type`: DefinitionType,
    uri: java.lang.String,
    url: java.lang.String
  ): BuildDefinitionReference3_2 = {
    val __obj = js.Dynamic.literal(_links = _links, authoredBy = authoredBy, createdDate = createdDate, draftOf = draftOf, drafts = drafts, id = id, metrics = metrics, name = name, path = path, project = project, quality = quality, queue = queue, queueStatus = queueStatus, revision = revision, uri = uri, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BuildDefinitionReference3_2]
  }
}

