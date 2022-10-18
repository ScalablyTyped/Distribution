package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionInput extends StObject {
  
  var parallelExecutionType: ParallelExecutionTypes
}
object ExecutionInput {
  
  inline def apply(parallelExecutionType: ParallelExecutionTypes): ExecutionInput = {
    val __obj = js.Dynamic.literal(parallelExecutionType = parallelExecutionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionInput]
  }
  
  extension [Self <: ExecutionInput](x: Self) {
    
    inline def setParallelExecutionType(value: ParallelExecutionTypes): Self = StObject.set(x, "parallelExecutionType", value.asInstanceOf[js.Any])
  }
}
