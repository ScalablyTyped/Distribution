package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleAgentExecutionOptions
  extends StObject
     with AgentTargetExecutionOptions {
  
  /**
    * Indicates whether failure on one agent should prevent the phase from running on other agents.
    */
  var continueOnError: Boolean
  
  /**
    * The maximum number of agents to use simultaneously.
    */
  var maxConcurrency: Double
}
object MultipleAgentExecutionOptions {
  
  @scala.inline
  def apply(continueOnError: Boolean, maxConcurrency: Double, `type`: Double): MultipleAgentExecutionOptions = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleAgentExecutionOptions]
  }
  
  @scala.inline
  implicit class MultipleAgentExecutionOptionsMutableBuilder[Self <: MultipleAgentExecutionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
  }
}
