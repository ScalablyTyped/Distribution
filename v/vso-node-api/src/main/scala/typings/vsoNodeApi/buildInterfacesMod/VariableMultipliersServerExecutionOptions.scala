package typings.vsoNodeApi.buildInterfacesMod

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
  implicit class VariableMultipliersServerExecutionOptionsOps[Self <: VariableMultipliersServerExecutionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = this.set("continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrency(value: Double): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipliersVarargs(value: String*): Self = this.set("multipliers", js.Array(value :_*))
    
    @scala.inline
    def setMultipliers(value: js.Array[String]): Self = this.set("multipliers", value.asInstanceOf[js.Any])
  }
}
