package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelExecutionInputBase
  extends StObject
     with ExecutionInput {
  
  var continueOnError: Boolean
  
  var maxNumberOfAgents: Double
}
object ParallelExecutionInputBase {
  
  inline def apply(continueOnError: Boolean, maxNumberOfAgents: Double, parallelExecutionType: ParallelExecutionTypes): ParallelExecutionInputBase = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxNumberOfAgents = maxNumberOfAgents.asInstanceOf[js.Any], parallelExecutionType = parallelExecutionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelExecutionInputBase]
  }
  
  extension [Self <: ParallelExecutionInputBase](x: Self) {
    
    inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfAgents(value: Double): Self = StObject.set(x, "maxNumberOfAgents", value.asInstanceOf[js.Any])
  }
}
