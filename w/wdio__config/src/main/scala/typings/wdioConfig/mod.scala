package typings.wdioConfig

import typings.wdioConfig.anon.After
import typings.wdioConfig.anon.Capabilities
import typings.wdioConfig.anon.Hostname
import typings.wdioConfig.configParserMod.default
import typings.wdioConfig.typesMod.ConfigOptions
import typings.wdioConfig.typesMod.DefaultOptions
import typings.wdioConfig.wdioConfigStrings.`eu-central-1`
import typings.wdioConfig.wdioConfigStrings.`us-east-1`
import typings.wdioConfig.wdioConfigStrings.eu
import typings.wdioConfig.wdioConfigStrings.us
import typings.webdriver.WebDriver.DesiredCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wdio/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wdio/config", "ConfigParser")
  @js.native
  class ConfigParser () extends default
  /* static members */
  object ConfigParser {
    
    @JSImport("@wdio/config", "ConfigParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFilePaths(patterns: js.Any, omitWarnings: js.Any): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  inline def DEFAULT_CONFIGS(): After = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_CONFIGS")().asInstanceOf[After]
  
  inline def detectBackend(): Hostname = ^.asInstanceOf[js.Dynamic].applyDynamic("detectBackend")().asInstanceOf[Hostname]
  inline def detectBackend(options: Unit, isRDC: Boolean): Hostname = (^.asInstanceOf[js.Dynamic].applyDynamic("detectBackend")(options.asInstanceOf[js.Any], isRDC.asInstanceOf[js.Any])).asInstanceOf[Hostname]
  inline def detectBackend(options: ConfigOptions): Hostname = ^.asInstanceOf[js.Dynamic].applyDynamic("detectBackend")(options.asInstanceOf[js.Any]).asInstanceOf[Hostname]
  inline def detectBackend(options: ConfigOptions, isRDC: Boolean): Hostname = (^.asInstanceOf[js.Dynamic].applyDynamic("detectBackend")(options.asInstanceOf[js.Any], isRDC.asInstanceOf[js.Any])).asInstanceOf[Hostname]
  
  inline def getSauceEndpoint(region: /* keyof @wdio/config.anon.Eu */ us | eu | `eu-central-1` | `us-east-1`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSauceEndpoint")(region.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSauceEndpoint(region: /* keyof @wdio/config.anon.Eu */ us | eu | `eu-central-1` | `us-east-1`, isRDC: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSauceEndpoint")(region.asInstanceOf[js.Any], isRDC.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isCloudCapability(conf: Capabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudCapability")(conf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCloudCapability(conf: DesiredCapabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudCapability")(conf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateConfig[T](defaults: DefaultOptions[T], options: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def validateConfig[T](defaults: DefaultOptions[T], options: T, keysToKeep: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], keysToKeep.asInstanceOf[js.Any])).asInstanceOf[T]
}
