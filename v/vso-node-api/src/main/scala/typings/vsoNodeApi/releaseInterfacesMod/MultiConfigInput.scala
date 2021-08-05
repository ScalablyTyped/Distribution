package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiConfigInput
  extends StObject
     with ParallelExecutionInputBase {
  
  var multipliers: String
}
object MultiConfigInput {
  
  inline def apply(
    continueOnError: Boolean,
    maxNumberOfAgents: Double,
    multipliers: String,
    parallelExecutionType: ParallelExecutionTypes
  ): MultiConfigInput = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxNumberOfAgents = maxNumberOfAgents.asInstanceOf[js.Any], multipliers = multipliers.asInstanceOf[js.Any], parallelExecutionType = parallelExecutionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiConfigInput]
  }
  
  extension [Self <: MultiConfigInput](x: Self) {
    
    inline def setMultipliers(value: String): Self = StObject.set(x, "multipliers", value.asInstanceOf[js.Any])
  }
}
