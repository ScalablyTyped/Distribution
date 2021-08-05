package typings.webdriver

import typings.std.PropertyDescriptor
import typings.std.Record
import typings.webdriver.anon.Default
import typings.webdriver.anon.DefaultMatch
import typings.webdriver.anon.DefaultMatchRequired
import typings.webdriver.anon.DefaultMatchRequiredType
import typings.webdriver.anon.DefaultMatchRequiredTypeValidate
import typings.webdriver.anon.Match
import typings.webdriver.anon.MatchRequired
import typings.webdriver.anon.MatchRequiredType
import typings.webdriver.anon.MatchRequiredTypeValidate
import typings.webdriver.anon.PartialSessionFlags
import typings.webdriver.anon.Required
import typings.webdriver.anon.RequiredType
import typings.webdriver.anon.RequiredTypeValidate
import typings.webdriver.anon.Type
import typings.webdriver.anon.TypeValidate
import typings.webdriver.anon.Validate
import typings.webdriver.anon.`0`
import typings.webdriver.anon.`1`
import typings.webdriver.anon.`2`
import typings.webdriver.anon.`3`
import typings.webdriver.anon.`4`
import typings.webdriver.anon.`5`
import typings.webdriver.anon.`6`
import typings.webdriver.anon.`7`
import typings.webdriver.typesMod.AttachOptions
import typings.webdriver.typesMod.Client
import typings.webdriver.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("webdriver/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver/build", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with typings.webdriver.buildMod.WebDriver
  /* static members */
  object default {
    
    @JSImport("webdriver/build", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachToSession(): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")().asInstanceOf[Client]
    inline def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any], userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(options: Unit, modifier: Unit, userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: Unit,
      modifier: Unit,
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: Unit,
      modifier: Unit,
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(options: AttachOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
    inline def attachToSession(options: AttachOptions, modifier: js.Function1[/* repeated */ js.Any, js.Any]): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: AttachOptions,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(options: AttachOptions, modifier: Unit, userPrototype: js.Object): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: AttachOptions,
      modifier: Unit,
      userPrototype: js.Object,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    inline def attachToSession(
      options: AttachOptions,
      modifier: Unit,
      userPrototype: Unit,
      commandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): Client = (^.asInstanceOf[js.Dynamic].applyDynamic("attachToSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], commandWrapper.asInstanceOf[js.Any])).asInstanceOf[Client]
    
    inline def newSession(): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")().asInstanceOf[js.Promise[Client]]
    inline def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: Unit, modifier: js.Function1[/* repeated */ js.Any, js.Any], userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: Unit,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: Unit, modifier: Unit, userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: Unit,
      modifier: Unit,
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: Unit,
      modifier: Unit,
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: Options): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, js.Any], userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: Options,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: Options,
      modifier: js.Function1[/* repeated */ js.Any, js.Any],
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(options: Options, modifier: Unit, userPrototype: js.Object): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: Options,
      modifier: Unit,
      userPrototype: js.Object,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    inline def newSession(
      options: Options,
      modifier: Unit,
      userPrototype: Unit,
      customCommandWrapper: js.Function1[/* repeated */ js.Any, js.Any]
    ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("newSession")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], userPrototype.asInstanceOf[js.Any], customCommandWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
    
    inline def reloadSession(instance: Client): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadSession")(instance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  /* Inlined @wdio/config.@wdio/config.DefaultOptions<webdriver.webdriver/build/types.Options> */
  object DEFAULTS {
    
    @JSImport("webdriver/build", "DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver/build", "DEFAULTS.agent")
    @js.native
    def agent: js.UndefOr[RequiredType] = js.native
    inline def agent_=(x: js.UndefOr[RequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("agent")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.capabilities")
    @js.native
    def capabilities: js.UndefOr[DefaultMatch] = js.native
    inline def capabilities_=(x: js.UndefOr[DefaultMatch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.connectionPollInterval")
    @js.native
    def connectionPollInterval: js.UndefOr[Type] = js.native
    inline def connectionPollInterval_=(x: js.UndefOr[Type]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPollInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.connectionRetryCount")
    @js.native
    def connectionRetryCount: js.UndefOr[Required] = js.native
    inline def connectionRetryCount_=(x: js.UndefOr[Required]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryCount")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.connectionRetryTimeout")
    @js.native
    def connectionRetryTimeout: js.UndefOr[`0`] = js.native
    inline def connectionRetryTimeout_=(x: js.UndefOr[`0`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.directConnectHost")
    @js.native
    def directConnectHost: js.UndefOr[RequiredTypeValidate] = js.native
    inline def directConnectHost_=(x: js.UndefOr[RequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directConnectHost")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.directConnectPath")
    @js.native
    def directConnectPath: js.UndefOr[DefaultMatchRequiredTypeValidate] = js.native
    inline def directConnectPath_=(x: js.UndefOr[DefaultMatchRequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directConnectPath")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.directConnectPort")
    @js.native
    def directConnectPort: js.UndefOr[TypeValidate] = js.native
    inline def directConnectPort_=(x: js.UndefOr[TypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directConnectPort")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.directConnectProtocol")
    @js.native
    def directConnectProtocol: js.UndefOr[Validate] = js.native
    inline def directConnectProtocol_=(x: js.UndefOr[Validate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directConnectProtocol")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.headers")
    @js.native
    def headers: js.UndefOr[`3`] = js.native
    inline def headers_=(x: js.UndefOr[`3`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headers")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.hostname")
    @js.native
    def hostname: js.UndefOr[`1`] = js.native
    inline def hostname_=(x: js.UndefOr[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hostname")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.key")
    @js.native
    def key: js.UndefOr[DefaultMatchRequired] = js.native
    inline def key_=(x: js.UndefOr[DefaultMatchRequired]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.logLevel")
    @js.native
    def logLevel: js.UndefOr[Match] = js.native
    inline def logLevel_=(x: js.UndefOr[Match]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.logLevels")
    @js.native
    def logLevels: js.UndefOr[Default] = js.native
    inline def logLevels_=(x: js.UndefOr[Default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevels")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.path")
    @js.native
    def path: js.UndefOr[DefaultMatchRequiredType] = js.native
    inline def path_=(x: js.UndefOr[DefaultMatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.port")
    @js.native
    def port: js.UndefOr[MatchRequiredType] = js.native
    inline def port_=(x: js.UndefOr[MatchRequiredType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("port")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.protocol")
    @js.native
    def protocol: js.UndefOr[`6`] = js.native
    inline def protocol_=(x: js.UndefOr[`6`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocol")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.queryParams")
    @js.native
    def queryParams: js.UndefOr[`5`] = js.native
    inline def queryParams_=(x: js.UndefOr[`5`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.requestedCapabilities")
    @js.native
    def requestedCapabilities: js.UndefOr[`7`] = js.native
    inline def requestedCapabilities_=(x: js.UndefOr[`7`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestedCapabilities")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.strictSSL")
    @js.native
    def strictSSL: js.UndefOr[`4`] = js.native
    inline def strictSSL_=(x: js.UndefOr[`4`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.transformRequest")
    @js.native
    def transformRequest: js.UndefOr[MatchRequiredTypeValidate] = js.native
    inline def transformRequest_=(x: js.UndefOr[MatchRequiredTypeValidate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.transformResponse")
    @js.native
    def transformResponse: js.UndefOr[MatchRequired] = js.native
    inline def transformResponse_=(x: js.UndefOr[MatchRequired]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build", "DEFAULTS.user")
    @js.native
    def user: js.UndefOr[`2`] = js.native
    inline def user_=(x: js.UndefOr[`2`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("user")(x.asInstanceOf[js.Any])
  }
  
  inline def getPrototype(hasIsW3CIsChromeIsMobileIsSauceIsSeleniumStandalone: PartialSessionFlags): Record[String, PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(hasIsW3CIsChromeIsMobileIsSauceIsSeleniumStandalone.asInstanceOf[js.Any]).asInstanceOf[Record[String, PropertyDescriptor]]
  
  trait WebDriver extends StObject
}
