package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceRepoTrigger
  extends StObject
     with ReleaseTriggerBase {
  
  var alias: String
  
  var branchFilters: js.Array[String]
}
object SourceRepoTrigger {
  
  inline def apply(alias: String, branchFilters: js.Array[String], triggerType: ReleaseTriggerType): SourceRepoTrigger = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], branchFilters = branchFilters.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRepoTrigger]
  }
  
  extension [Self <: SourceRepoTrigger](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setBranchFilters(value: js.Array[String]): Self = StObject.set(x, "branchFilters", value.asInstanceOf[js.Any])
    
    inline def setBranchFiltersVarargs(value: String*): Self = StObject.set(x, "branchFilters", js.Array(value*))
  }
}
