package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionInput extends StObject {
  
  var parallelExecutionType: ParallelExecutionTypes
}
object ExecutionInput {
  
  @scala.inline
  def apply(parallelExecutionType: ParallelExecutionTypes): ExecutionInput = {
    val __obj = js.Dynamic.literal(parallelExecutionType = parallelExecutionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionInput]
  }
  
  @scala.inline
  implicit class ExecutionInputMutableBuilder[Self <: ExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParallelExecutionType(value: ParallelExecutionTypes): Self = StObject.set(x, "parallelExecutionType", value.asInstanceOf[js.Any])
  }
}
