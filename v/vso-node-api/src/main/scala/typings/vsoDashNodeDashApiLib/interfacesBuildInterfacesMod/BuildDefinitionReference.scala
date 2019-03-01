package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionReference extends DefinitionReference {
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
  var latestBuild: Build
  var latestCompletedBuild: Build
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

object BuildDefinitionReference {
  @scala.inline
  def apply(
    _links: js.Any,
    authoredBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdDate: stdLib.Date,
    draftOf: DefinitionReference,
    drafts: js.Array[DefinitionReference],
    id: scala.Double,
    latestBuild: Build,
    latestCompletedBuild: Build,
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
  ): BuildDefinitionReference = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("authoredBy")(authoredBy)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("draftOf")(draftOf)
    __obj.updateDynamic("drafts")(drafts)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("latestBuild")(latestBuild)
    __obj.updateDynamic("latestCompletedBuild")(latestCompletedBuild)
    __obj.updateDynamic("metrics")(metrics)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("quality")(quality)
    __obj.updateDynamic("queue")(queue)
    __obj.updateDynamic("queueStatus")(queueStatus)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BuildDefinitionReference]
  }
}

