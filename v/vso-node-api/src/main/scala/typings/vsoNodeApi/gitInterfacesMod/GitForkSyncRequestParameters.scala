package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitForkSyncRequestParameters extends StObject {
  
  /**
    * Fully-qualified identifier for the source repository.
    */
  var source: GlobalGitRepositoryKey = js.native
  
  /**
    * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all refs will be synchronized.
    */
  var sourceToTargetRefs: js.Array[SourceToTargetRef] = js.native
}
object GitForkSyncRequestParameters {
  
  @scala.inline
  def apply(source: GlobalGitRepositoryKey, sourceToTargetRefs: js.Array[SourceToTargetRef]): GitForkSyncRequestParameters = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], sourceToTargetRefs = sourceToTargetRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitForkSyncRequestParameters]
  }
  
  @scala.inline
  implicit class GitForkSyncRequestParametersMutableBuilder[Self <: GitForkSyncRequestParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: GlobalGitRepositoryKey): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceToTargetRefs(value: js.Array[SourceToTargetRef]): Self = StObject.set(x, "sourceToTargetRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceToTargetRefsVarargs(value: SourceToTargetRef*): Self = StObject.set(x, "sourceToTargetRefs", js.Array(value :_*))
  }
}
