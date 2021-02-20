package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRepoTrigger extends ReleaseTriggerBase {
  
  var alias: String = js.native
  
  var branchFilters: js.Array[String] = js.native
}
object SourceRepoTrigger {
  
  @scala.inline
  def apply(alias: String, branchFilters: js.Array[String], triggerType: ReleaseTriggerType): SourceRepoTrigger = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], branchFilters = branchFilters.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRepoTrigger]
  }
  
  @scala.inline
  implicit class SourceRepoTriggerMutableBuilder[Self <: SourceRepoTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchFilters(value: js.Array[String]): Self = StObject.set(x, "branchFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchFiltersVarargs(value: String*): Self = StObject.set(x, "branchFilters", js.Array(value :_*))
  }
}
