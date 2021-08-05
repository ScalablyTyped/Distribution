package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableMultipliersServerExecutionOptions
  extends StObject
     with ServerTargetExecutionOptions {
  
  /**
    * Indicates whether failure of one job should prevent the phase from running in other jobs.
    */
  var continueOnError: Boolean
  
  /**
    * The maximum number of server jobs to run in parallel.
    */
  var maxConcurrency: Double
  
  var multipliers: js.Array[String]
}
object VariableMultipliersServerExecutionOptions {
  
  inline def apply(continueOnError: Boolean, maxConcurrency: Double, multipliers: js.Array[String], `type`: Double): VariableMultipliersServerExecutionOptions = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], multipliers = multipliers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableMultipliersServerExecutionOptions]
  }
  
  extension [Self <: VariableMultipliersServerExecutionOptions](x: Self) {
    
    inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMultipliers(value: js.Array[String]): Self = StObject.set(x, "multipliers", value.asInstanceOf[js.Any])
    
    inline def setMultipliersVarargs(value: String*): Self = StObject.set(x, "multipliers", js.Array(value :_*))
  }
}
