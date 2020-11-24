package typings.wdioProtocols.WDIOProtocols

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a command endpoint
  */
@js.native
trait CommandEndpoint extends js.Object {
  
  /**
    * command name
    */
  var command: String = js.native
  
  /**
    * command description
    */
  var description: String = js.native
  
  /**
    * set to true if command is only supported in Selenium Hub Node
    */
  var isHubCommand: js.UndefOr[Boolean] = js.native
  
  /**
    * supported command parameters
    */
  var parameters: js.Array[CommandParameters] = js.native
  
  /**
    * link to specification reference
    */
  var ref: String = js.native
  
  /**
    * information on return data
    */
  var returns: js.UndefOr[CommandReturnObject] = js.native
  
  /**
    * supported environments
    */
  var support: js.UndefOr[SupportedEnvironments] = js.native
  
  /**
    * variables within the command path (e.g. /:sessionId/element)
    */
  var variables: js.UndefOr[js.Array[CommandPathVariables]] = js.native
}
object CommandEndpoint {
  
  @scala.inline
  def apply(command: String, description: String, parameters: js.Array[CommandParameters], ref: String): CommandEndpoint = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandEndpoint]
  }
  
  @scala.inline
  implicit class CommandEndpointOps[Self <: CommandEndpoint] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: CommandParameters*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[CommandParameters]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHubCommand(value: Boolean): Self = this.set("isHubCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHubCommand: Self = this.set("isHubCommand", js.undefined)
    
    @scala.inline
    def setReturns(value: CommandReturnObject): Self = this.set("returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
    
    @scala.inline
    def setSupport(value: SupportedEnvironments): Self = this.set("support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupport: Self = this.set("support", js.undefined)
    
    @scala.inline
    def setVariablesVarargs(value: CommandPathVariables*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[CommandPathVariables]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
