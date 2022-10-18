package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerTarget
  extends StObject
     with PhaseTarget {
  
  /**
    * The execution options.
    */
  var executionOptions: ServerTargetExecutionOptions
}
object ServerTarget {
  
  inline def apply(executionOptions: ServerTargetExecutionOptions, `type`: Double): ServerTarget = {
    val __obj = js.Dynamic.literal(executionOptions = executionOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTarget]
  }
  
  extension [Self <: ServerTarget](x: Self) {
    
    inline def setExecutionOptions(value: ServerTargetExecutionOptions): Self = StObject.set(x, "executionOptions", value.asInstanceOf[js.Any])
  }
}
