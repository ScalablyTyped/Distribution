package typings.webdriver

import typings.webdriver.anon.Default
import typings.webdriver.anon.DefaultMatch
import typings.webdriver.anon.DefaultMatchRequired
import typings.webdriver.anon.Match
import typings.webdriver.anon.MatchRequired
import typings.webdriver.anon.Required
import typings.webdriver.anon.RequiredType
import typings.webdriver.anon.Type
import typings.webdriver.anon.TypeValidate
import typings.webdriver.anon.Validate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConstantsMod {
  
  /* Inlined @wdio/types.@wdio/types.Options.Definition<std.Required<@wdio/types.@wdio/types.Options.WebDriver>> */
  object DEFAULTS {
    
    @JSImport("webdriver/build/constants", "DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver/build/constants", "DEFAULTS.agent")
    @js.native
    def agent: DefaultMatch = js.native
    inline def agent_=(x: DefaultMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("agent")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.capabilities")
    @js.native
    def capabilities: Type = js.native
    inline def capabilities_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.connectionRetryCount")
    @js.native
    def connectionRetryCount: Required = js.native
    inline def connectionRetryCount_=(x: Required): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryCount")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.connectionRetryTimeout")
    @js.native
    def connectionRetryTimeout: Required = js.native
    inline def connectionRetryTimeout_=(x: Required): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.enableDirectConnect")
    @js.native
    def enableDirectConnect: MatchRequired = js.native
    inline def enableDirectConnect_=(x: MatchRequired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableDirectConnect")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.headers")
    @js.native
    def headers: DefaultMatchRequired = js.native
    inline def headers_=(x: DefaultMatchRequired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headers")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.hostname")
    @js.native
    def hostname: RequiredType = js.native
    inline def hostname_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hostname")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.key")
    @js.native
    def key: RequiredType = js.native
    inline def key_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.logLevel")
    @js.native
    def logLevel: Match = js.native
    inline def logLevel_=(x: Match): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.logLevels")
    @js.native
    def logLevels: Default = js.native
    inline def logLevels_=(x: Default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevels")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.outputDir")
    @js.native
    def outputDir: RequiredType = js.native
    inline def outputDir_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputDir")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.path")
    @js.native
    def path: RequiredType = js.native
    inline def path_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.port")
    @js.native
    def port: Required = js.native
    inline def port_=(x: Required): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("port")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.protocol")
    @js.native
    def protocol: RequiredType = js.native
    inline def protocol_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocol")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.queryParams")
    @js.native
    def queryParams: DefaultMatchRequired = js.native
    inline def queryParams_=(x: DefaultMatchRequired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.strictSSL")
    @js.native
    def strictSSL: MatchRequired = js.native
    inline def strictSSL_=(x: MatchRequired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictSSL")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.transformRequest")
    @js.native
    def transformRequest: TypeValidate = js.native
    inline def transformRequest_=(x: TypeValidate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.transformResponse")
    @js.native
    def transformResponse: Validate = js.native
    inline def transformResponse_=(x: Validate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "DEFAULTS.user")
    @js.native
    def user: RequiredType = js.native
    inline def user_=(x: RequiredType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("user")(x.asInstanceOf[js.Any])
  }
  
  object REG_EXPS {
    
    @JSImport("webdriver/build/constants", "REG_EXPS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver/build/constants", "REG_EXPS.commandName")
    @js.native
    def commandName: js.RegExp = js.native
    inline def commandName_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commandName")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver/build/constants", "REG_EXPS.execFn")
    @js.native
    def execFn: js.RegExp = js.native
    inline def execFn_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("execFn")(x.asInstanceOf[js.Any])
  }
}
