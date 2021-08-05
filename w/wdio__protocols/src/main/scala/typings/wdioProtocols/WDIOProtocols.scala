package typings.wdioProtocols

import typings.wdioProtocols.anon.RecordCommandMethodComman
import typings.wdioProtocols.anon.RecordEnvironmentsstring
import typings.wdioProtocols.wdioProtocolsStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WDIOProtocols {
  
  /**
    * describes a command endpoint
    */
  trait CommandEndpoint extends StObject {
    
    /**
      * command name
      */
    var command: String
    
    /**
      * command description
      */
    var description: String
    
    /**
      * set to true if command is only supported in Selenium Hub Node
      */
    var isHubCommand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * supported command parameters
      */
    var parameters: js.Array[CommandParameters]
    
    /**
      * link to specification reference
      */
    var ref: String
    
    /**
      * information on return data
      */
    var returns: js.UndefOr[CommandReturnObject] = js.undefined
    
    /**
      * supported environments
      */
    var support: js.UndefOr[SupportedEnvironments] = js.undefined
    
    /**
      * variables within the command path (e.g. /:sessionId/element)
      */
    var variables: js.UndefOr[js.Array[CommandPathVariables]] = js.undefined
  }
  object CommandEndpoint {
    
    inline def apply(command: String, description: String, parameters: js.Array[CommandParameters], ref: String): CommandEndpoint = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandEndpoint]
    }
    
    extension [Self <: CommandEndpoint](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setIsHubCommand(value: Boolean): Self = StObject.set(x, "isHubCommand", value.asInstanceOf[js.Any])
      
      inline def setIsHubCommandUndefined: Self = StObject.set(x, "isHubCommand", js.undefined)
      
      inline def setParameters(value: js.Array[CommandParameters]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: CommandParameters*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setReturns(value: CommandReturnObject): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
      
      inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
      
      inline def setSupport(value: SupportedEnvironments): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
      
      inline def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
      
      inline def setVariables(value: js.Array[CommandPathVariables]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
      
      inline def setVariablesVarargs(value: CommandPathVariables*): Self = StObject.set(x, "variables", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wdioProtocols.wdioProtocolsStrings.POST
    - typings.wdioProtocols.wdioProtocolsStrings.GET
    - typings.wdioProtocols.wdioProtocolsStrings.DELETE
  */
  trait CommandMethod extends StObject
  object CommandMethod {
    
    inline def DELETE: typings.wdioProtocols.wdioProtocolsStrings.DELETE = "DELETE".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.DELETE]
    
    inline def GET: typings.wdioProtocols.wdioProtocolsStrings.GET = "GET".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.GET]
    
    inline def POST: typings.wdioProtocols.wdioProtocolsStrings.POST = "POST".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.POST]
  }
  
  trait CommandParameters extends StObject {
    
    var description: String
    
    var name: String
    
    var required: Boolean
    
    var `type`: String
  }
  object CommandParameters {
    
    inline def apply(description: String, name: String, required: Boolean, `type`: String): CommandParameters = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandParameters]
    }
    
    extension [Self <: CommandParameters](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CommandPath = string
  
  trait CommandPathVariables extends StObject {
    
    var description: String
    
    var name: String
    
    /**
      * the following are given for path variables, we should still define
      * it as values are populated automatically
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CommandPathVariables {
    
    inline def apply(description: String, name: String): CommandPathVariables = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandPathVariables]
    }
    
    extension [Self <: CommandPathVariables](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CommandReturnObject extends StObject {
    
    var description: String
    
    var name: String
    
    var `type`: String
  }
  object CommandReturnObject {
    
    inline def apply(description: String, name: String, `type`: String): CommandReturnObject = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandReturnObject]
    }
    
    extension [Self <: CommandReturnObject](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wdioProtocols.wdioProtocolsStrings.XCUITest
    - typings.wdioProtocols.wdioProtocolsStrings.UIAutomation
    - typings.wdioProtocols.wdioProtocolsStrings.UiAutomator
  */
  trait Environments extends StObject
  object Environments {
    
    inline def UIAutomation: typings.wdioProtocols.wdioProtocolsStrings.UIAutomation = "UIAutomation".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.UIAutomation]
    
    inline def UiAutomator: typings.wdioProtocols.wdioProtocolsStrings.UiAutomator = "UiAutomator".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.UiAutomator]
    
    inline def XCUITest: typings.wdioProtocols.wdioProtocolsStrings.XCUITest = "XCUITest".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.XCUITest]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wdioProtocols.wdioProtocolsStrings.ios
    - typings.wdioProtocols.wdioProtocolsStrings.android
  */
  trait Platform extends StObject
  object Platform {
    
    inline def android: typings.wdioProtocols.wdioProtocolsStrings.android = "android".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.android]
    
    inline def ios: typings.wdioProtocols.wdioProtocolsStrings.ios = "ios".asInstanceOf[typings.wdioProtocols.wdioProtocolsStrings.ios]
  }
  
  /* Inlined std.Record<@wdio/protocols.WDIOProtocols.CommandPath, std.Record<@wdio/protocols.WDIOProtocols.CommandMethod, @wdio/protocols.WDIOProtocols.CommandEndpoint>> */
  trait Protocol extends StObject {
    
    var string: RecordCommandMethodComman
  }
  object Protocol {
    
    inline def apply(string: RecordCommandMethodComman): Protocol = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    extension [Self <: Protocol](x: Self) {
      
      inline def setString(value: RecordCommandMethodComman): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
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
  trait SupportedEnvironments extends StObject {
    
    var android: RecordEnvironmentsstring
    
    var ios: RecordEnvironmentsstring
  }
  object SupportedEnvironments {
    
    inline def apply(android: RecordEnvironmentsstring, ios: RecordEnvironmentsstring): SupportedEnvironments = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportedEnvironments]
    }
    
    extension [Self <: SupportedEnvironments](x: Self) {
      
      inline def setAndroid(value: RecordEnvironmentsstring): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setIos(value: RecordEnvironmentsstring): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    }
  }
}
