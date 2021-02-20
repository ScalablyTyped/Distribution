package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelExecutionInputBase extends ExecutionInput {
  
  var continueOnError: Boolean = js.native
  
  var maxNumberOfAgents: Double = js.native
}
object ParallelExecutionInputBase {
  
  @scala.inline
  def apply(continueOnError: Boolean, maxNumberOfAgents: Double, parallelExecutionType: ParallelExecutionTypes): ParallelExecutionInputBase = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxNumberOfAgents = maxNumberOfAgents.asInstanceOf[js.Any], parallelExecutionType = parallelExecutionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelExecutionInputBase]
  }
  
  @scala.inline
  implicit class ParallelExecutionInputBaseMutableBuilder[Self <: ParallelExecutionInputBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumberOfAgents(value: Double): Self = StObject.set(x, "maxNumberOfAgents", value.asInstanceOf[js.Any])
  }
}
