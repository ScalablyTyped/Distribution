package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionReference32 extends DefinitionReference {
  
  var _links: js.Any = js.native
  
  /**
    * The author of the definition.
    */
  var authoredBy: IdentityRef = js.native
  
  /**
    * A reference to the definition that this definition is a draft of, if this is a draft definition.
    */
  var draftOf: DefinitionReference = js.native
  
  /**
    * The list of drafts associated with this definition, if this is not a draft definition.
    */
  var drafts: js.Array[DefinitionReference] = js.native
  
  var metrics: js.Array[BuildMetric] = js.native
  
  /**
    * The quality of the definition document (draft, etc.)
    */
  var quality: DefinitionQuality = js.native
  
  /**
    * The default queue for builds run against this definition.
    */
  var queue: AgentPoolQueue = js.native
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
  
  @scala.inline
  implicit class BuildDefinitionReference32MutableBuilder[Self <: BuildDefinitionReference32] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthoredBy(value: IdentityRef): Self = StObject.set(x, "authoredBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftOf(value: DefinitionReference): Self = StObject.set(x, "draftOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrafts(value: js.Array[DefinitionReference]): Self = StObject.set(x, "drafts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftsVarargs(value: DefinitionReference*): Self = StObject.set(x, "drafts", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[BuildMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsVarargs(value: BuildMetric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setQuality(value: DefinitionQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: AgentPoolQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
