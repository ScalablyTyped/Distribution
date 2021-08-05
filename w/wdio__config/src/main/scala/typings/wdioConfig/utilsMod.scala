package typings.wdioConfig

import typings.wdioConfig.anon.Capabilities
import typings.wdioConfig.anon.Hostname
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

object utilsMod {
  
  @JSImport("@wdio/config/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectBackend(): Hostname = ^.asInstanceOf[js.Dynamic].applyDynamic("detectBackend")().asInstanceOf[Hostname]
  inline def detectBackend(options: Unit, isRDC: Boolean): Hostname = (^.asInstanceOf[js.Dynamic].applyDynamic("detectBackend")(options.asInstanceOf[js.Any], isRDC.asInstanceOf[js.Any])).asInstanceOf[Hostname]
  inline def detectBackend(options: ConfigOptions): Hostname = ^.asInstanceOf[js.Dynamic].applyDynamic("detectBackend")(options.asInstanceOf[js.Any]).asInstanceOf[Hostname]
  inline def detectBackend(options: ConfigOptions, isRDC: Boolean): Hostname = (^.asInstanceOf[js.Dynamic].applyDynamic("detectBackend")(options.asInstanceOf[js.Any], isRDC.asInstanceOf[js.Any])).asInstanceOf[Hostname]
  
  inline def getSauceEndpoint(region: /* keyof @wdio/config.anon.Eu */ us | eu | `eu-central-1` | `us-east-1`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSauceEndpoint")(region.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSauceEndpoint(region: /* keyof @wdio/config.anon.Eu */ us | eu | `eu-central-1` | `us-east-1`, isRDC: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSauceEndpoint")(region.asInstanceOf[js.Any], isRDC.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isCloudCapability(conf: Capabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudCapability")(conf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCloudCapability(conf: DesiredCapabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudCapability")(conf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCucumberFeatureWithLineNumber(spec: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCucumberFeatureWithLineNumber")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCucumberFeatureWithLineNumber(spec: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCucumberFeatureWithLineNumber")(spec.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeLineNumbers(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLineNumbers")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validObjectOrArray(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validObjectOrArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateConfig[T](defaults: DefaultOptions[T], options: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def validateConfig[T](defaults: DefaultOptions[T], options: T, keysToKeep: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], keysToKeep.asInstanceOf[js.Any])).asInstanceOf[T]
}
