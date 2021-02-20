package typings.wdioProtocols

import typings.wdioProtocols.anon.RecordCommandMethodComman
import typings.wdioProtocols.anon.RecordEnvironmentsstring
import typings.wdioProtocols.wdioProtocolsStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WDIOProtocols {
  
  /**
    * describes a command endpoint
    */
  @js.native
  trait CommandEndpoint extends StObject {
    
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
    implicit class CommandEndpointMutableBuilder[Self <: CommandEndpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHubCommand(value: Boolean): Self = StObject.set(x, "isHubCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHubCommandUndefined: Self = StObject.set(x, "isHubCommand", js.undefined)
      
      @scala.inline
      def setParameters(value: js.Array[CommandParameters]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersVarargs(value: CommandParameters*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturns(value: CommandReturnObject): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
      
      @scala.inline
      def setSupport(value: SupportedEnvironments): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
      
      @scala.inline
      def setVariables(value: js.Array[CommandPathVariables]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
      
      @scala.inline
      def setVariablesVarargs(value: CommandPathVariables*): Self = StObject.set(x, "variables", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wdioProtocols.wdioProtocolsStrings.POST
    - typings.wdioProtocols.wdioProtocolsStrings.GET
    - typings.wdioProtocols.wdioProtocolsStrings.DELETE
  */
  trait CommandMethod extends StObject
  object CommandMethod {
    
    @scala.inline
    def DELETE: typings.wdioProtocols.wdioProtocolsStrings.DELETE = "DELETE".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.DELETE]
    
    @scala.inline
    def GET: typings.wdioProtocols.wdioProtocolsStrings.GET = "GET".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.GET]
    
    @scala.inline
    def POST: typings.wdioProtocols.wdioProtocolsStrings.POST = "POST".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.POST]
  }
  
  @js.native
  trait CommandParameters extends StObject {
    
    var description: String = js.native
    
    var name: String = js.native
    
    var required: Boolean = js.native
    
    var `type`: String = js.native
  }
  object CommandParameters {
    
    @scala.inline
    def apply(description: String, name: String, required: Boolean, `type`: String): CommandParameters = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandParameters]
    }
    
    @scala.inline
    implicit class CommandParametersMutableBuilder[Self <: CommandParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CommandPath = string
  
  @js.native
  trait CommandPathVariables extends StObject {
    
    var description: String = js.native
    
    var name: String = js.native
    
    /**
      * the following are given for path variables, we should still define
      * it as values are populated automatically
      */
    var required: js.UndefOr[Boolean] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object CommandPathVariables {
    
    @scala.inline
    def apply(description: String, name: String): CommandPathVariables = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandPathVariables]
    }
    
    @scala.inline
    implicit class CommandPathVariablesMutableBuilder[Self <: CommandPathVariables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CommandReturnObject extends StObject {
    
    var description: String = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object CommandReturnObject {
    
    @scala.inline
    def apply(description: String, name: String, `type`: String): CommandReturnObject = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandReturnObject]
    }
    
    @scala.inline
    implicit class CommandReturnObjectMutableBuilder[Self <: CommandReturnObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wdioProtocols.wdioProtocolsStrings.XCUITest
    - typings.wdioProtocols.wdioProtocolsStrings.UIAutomation
    - typings.wdioProtocols.wdioProtocolsStrings.UiAutomator
  */
  trait Environments extends StObject
  object Environments {
    
    @scala.inline
    def UIAutomation: typings.wdioProtocols.wdioProtocolsStrings.UIAutomation = "UIAutomation".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.UIAutomation]
    
    @scala.inline
    def UiAutomator: typings.wdioProtocols.wdioProtocolsStrings.UiAutomator = "UiAutomator".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.UiAutomator]
    
    @scala.inline
    def XCUITest: typings.wdioProtocols.wdioProtocolsStrings.XCUITest = "XCUITest".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.XCUITest]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wdioProtocols.wdioProtocolsStrings.ios
    - typings.wdioProtocols.wdioProtocolsStrings.android
  */
  trait Platform extends StObject
  object Platform {
    
    @scala.inline
    def android: typings.wdioProtocols.wdioProtocolsStrings.android = "android".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.android]
    
    @scala.inline
    def ios: typings.wdioProtocols.wdioProtocolsStrings.ios = "ios".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.ios]
  }
  
  /* Inlined std.Record<@wdio/protocols.WDIOProtocols.CommandPath, std.Record<@wdio/protocols.WDIOProtocols.CommandMethod, @wdio/protocols.WDIOProtocols.CommandEndpoint>> */
  @js.native
  trait Protocol extends StObject {
    
    var string: RecordCommandMethodComman = js.native
  }
  object Protocol {
    
    @scala.inline
    def apply(string: RecordCommandMethodComman): Protocol = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    @scala.inline
    implicit class ProtocolMutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setString(value: RecordCommandMethodComman): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * supported mobile environments, e.g.
    * ```
    * "ios": {
    *   "UIAutomation": "8.0 to 9.3"
    * }
    * ```
    */
  /* Inlined std.Record<@wdio/protocols.WDIOProtocols.Platform, std.Record<@wdio/protocols.WDIOProtocols.Environments, string>> */
  @js.native
  trait SupportedEnvironments extends StObject {
    
    var android: RecordEnvironmentsstring = js.native
    
    var ios: RecordEnvironmentsstring = js.native
  }
  object SupportedEnvironments {
    
    @scala.inline
    def apply(android: RecordEnvironmentsstring, ios: RecordEnvironmentsstring): SupportedEnvironments = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportedEnvironments]
    }
    
    @scala.inline
    implicit class SupportedEnvironmentsMutableBuilder[Self <: SupportedEnvironments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAndroid(value: RecordEnvironmentsstring): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIos(value: RecordEnvironmentsstring): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    }
  }
}
