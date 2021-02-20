package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableMultipliersServerExecutionOptions extends ServerTargetExecutionOptions {
  
  /**
    * Indicates whether failure of one job should prevent the phase from running in other jobs.
    */
  var continueOnError: Boolean = js.native
  
  /**
    * The maximum number of server jobs to run in parallel.
    */
  var maxConcurrency: Double = js.native
  
  var multipliers: js.Array[String] = js.native
}
object VariableMultipliersServerExecutionOptions {
  
  @scala.inline
  def apply(continueOnError: Boolean, maxConcurrency: Double, multipliers: js.Array[String], `type`: Double): VariableMultipliersServerExecutionOptions = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], multipliers = multipliers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableMultipliersServerExecutionOptions]
  }
  
  @scala.inline
  implicit class VariableMultipliersServerExecutionOptionsMutableBuilder[Self <: VariableMultipliersServerExecutionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipliers(value: js.Array[String]): Self = StObject.set(x, "multipliers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipliersVarargs(value: String*): Self = StObject.set(x, "multipliers", js.Array(value :_*))
  }
}
