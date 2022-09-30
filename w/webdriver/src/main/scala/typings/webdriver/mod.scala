package typings.webdriver

import typings.std.Record
import typings.wdioProtocols.typesMod.CommandEndpoint
import typings.webdriver.anon.Default
import typings.webdriver.anon.DefaultMatch
import typings.webdriver.anon.DefaultMatchRequired
import typings.webdriver.anon.Match
import typings.webdriver.anon.MatchRequired
import typings.webdriver.anon.PartialSessionFlags
import typings.webdriver.anon.Required
import typings.webdriver.anon.RequiredType
import typings.webdriver.anon.Type
import typings.webdriver.anon.TypeValidate
import typings.webdriver.anon.Validate
import typings.webdriver.requestMod.WebDriverResponse
import typings.webdriver.typesMod.AttachOptions
import typings.webdriver.typesMod.BaseClient
import typings.webdriver.typesMod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webdriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with WebDriver
  /* static members */
  object default {
    
    @JSImport("webdriver", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * allows user to attach to existing sessions
      */
    inline def attachToSession(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")().asInstanceOf[Client]
    inline def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ Any, Any]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ Any, Any], userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ Any, Any],
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ Any, Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ Any, Any],
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ Any, Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(options: Unit, modifier: Unit, userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: Unit,
      modifier: Unit,
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ Any, Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: Unit,
      modifier: Unit,
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ Any, Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(options: AttachOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
    inline def attachToSession(options: AttachOptions, modifier: js.Function1[/* repeated */ Any, Any]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(options: AttachOptions, modifier: js.Function1[/* repeated */ Any, Any], userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ Any, Any],
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ Any, Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ Any, Any],
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ Any, Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(options: AttachOptions, modifier: Unit, userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: AttachOptions,
      modifier: Unit,
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ Any, Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: AttachOptions,
      modifier: Unit,
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ Any, Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    
    inline def newSession(options: typings.wdioTypes.optionsMod.WebDriver): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: typings.wdioTypes.optionsMod.WebDriver, modifier: js.Function1[/* repeated */ Any, Any]): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: typings.wdioTypes.optionsMod.WebDriver,
      modifier: js.Function1[/* repeated */ Any, Any],
      userPrototype: js.Object
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: typings.wdioTypes.optionsMod.WebDriver,
      modifier: js.Function1[/* repeated */ Any, Any],
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: typings.wdioTypes.optionsMod.WebDriver,
      modifier: js.Function1[/* repeated */ Any, Any],
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: typings.wdioTypes.optionsMod.WebDriver, modifier: Unit, userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: typings.wdioTypes.optionsMod.WebDriver,
      modifier: Unit,
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: typings.wdioTypes.optionsMod.WebDriver,
      modifier: Unit,
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    
    /**
      * Changes The instance session id and browser capabilities for the new session
      * directly into the passed in browser object
      *
      * @param   {Object} instance  the object we get from a new browser session.
      * @returns {string}           the new session id of the browser
      */
    inline def reloadSession(instance: Client): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  /* Inlined @wdio/types.@wdio/types.Options.Definition<std.Required<@wdio/types.@wdio/types.Options.WebDriver>> */
  object DEFAULTS {
    
    @JSImport("webdriver", "DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver", "DEFAULTS.agent")
    @js.native
    def agent: DefaultMatch = js.native
    inline def agent_=(x: DefaultMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("agent")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.capabilities")
    @js.native
    def capabilities: Type = js.native
    inline def capabilities_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.connectionRetryCount")
    @js.native
    def connectionRetryCount: Required = js.native
    inline def connectionRetryCount_=(x: Required): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryCount")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.connectionRetryTimeout")
    @js.native
    def connectionRetryTimeout: Required = js.native
    inline def connectionRetryTimeout_=(x: Required): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.enableDirectConnect")
    @js.native
    def enableDirectConnect: MatchRequired = js.native
    inline def enableDirectConnect_=(x: MatchRequired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableDirectConnect")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.headers")
    @js.native
    def headers: DefaultMatchRequired = js.native
    inline def headers_=(x: DefaultMatchRequired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headers")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.hostname")
    @js.native
    def hostname: RequiredType = js.native
    inline def hostname_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hostname")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.key")
    @js.native
    def key: RequiredType = js.native
    inline def key_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.logLevel")
    @js.native
    def logLevel: Match = js.native
    inline def logLevel_=(x: Match): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.logLevels")
    @js.native
    def logLevels: Default = js.native
    inline def logLevels_=(x: Default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevels")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.outputDir")
    @js.native
    def outputDir: RequiredType = js.native
    inline def outputDir_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.path")
    @js.native
    def path: RequiredType = js.native
    inline def path_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.port")
    @js.native
    def port: Required = js.native
    inline def port_=(x: Required): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("port")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.protocol")
    @js.native
    def protocol: RequiredType = js.native
    inline def protocol_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocol")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.queryParams")
    @js.native
    def queryParams: DefaultMatchRequired = js.native
    inline def queryParams_=(x: DefaultMatchRequired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.strictSSL")
    @js.native
    def strictSSL: MatchRequired = js.native
    inline def strictSSL_=(x: MatchRequired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.transformRequest")
    @js.native
    def transformRequest: TypeValidate = js.native
    inline def transformRequest_=(x: TypeValidate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.transformResponse")
    @js.native
    def transformResponse: Validate = js.native
    inline def transformResponse_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver", "DEFAULTS.user")
    @js.native
    def user: RequiredType = js.native
    inline def user_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("user")(x.asInstanceOf[js.Any])
  }
  
  inline def command(method: String, endpointUri: String, commandInfo: CommandEndpoint): js.ThisFunction1[/* this */ BaseClient, /* repeated */ Any, js.Promise[WebDriverResponse]] = (^.asInstanceOf[js.Dynamic].applyDynamic("command")(method.asInstanceOf[js.Any], endpointUri.asInstanceOf[js.Any], commandInfo.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ BaseClient, /* repeated */ Any, js.Promise[WebDriverResponse]]]
  inline def command(method: String, endpointUri: String, commandInfo: CommandEndpoint, doubleEncodeVariables: Boolean): js.ThisFunction1[/* this */ BaseClient, /* repeated */ Any, js.Promise[WebDriverResponse]] = (^.asInstanceOf[js.Dynamic].applyDynamic("command")(method.asInstanceOf[js.Any], endpointUri.asInstanceOf[js.Any], commandInfo.asInstanceOf[js.Any], doubleEncodeVariables.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ BaseClient, /* repeated */ Any, js.Promise[WebDriverResponse]]]
  
  inline def getPrototype(hasIsW3CIsChromeIsFirefoxIsMobileIsSauceIsSeleniumStandalone: PartialSessionFlags): Record[String, js.PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(hasIsW3CIsChromeIsFirefoxIsMobileIsSauceIsSeleniumStandalone.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.PropertyDescriptor]]
  
  trait WebDriver extends StObject
}
