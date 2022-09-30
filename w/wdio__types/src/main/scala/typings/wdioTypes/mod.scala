package typings.wdioTypes

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import typings.std.Pick
import typings.wdioTypes.optionsMod.Testrunner
import typings.wdioTypes.reportersMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type FunctionProperties[T] = Pick[T, FunctionPropertyNames[T]]
  
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  
  @js.native
  trait JsonArray
    extends StObject
       with Array[JsonPrimitive | JsonObject | JsonArray]
  
  type JsonCompatible = JsonObject | Any
  
  trait JsonObject
    extends StObject
       with /* x */ StringDictionary[JsonPrimitive | JsonObject | JsonArray]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  type JsonPrimitive = String | Double | Boolean | Null
  
  type ThenArg[T] = T
  
  object global {
    
    object WebDriver {
      
      type Capabilities = typings.wdioTypes.capabilitiesMod.Capabilities
      
      type DesiredCapabilities = typings.wdioTypes.capabilitiesMod.DesiredCapabilities
    }
    
    object WebdriverIO {
      
      type Config = Testrunner
      
      type CucumberOpts = StringDictionary[Any]
      
      trait HookFunctionExtension extends StObject
      
      type JasmineOpts = StringDictionary[Any]
      
      type MochaOpts = StringDictionary[Any]
      
      type ReporterOption = Options
      
      type ServiceOption = typings.wdioTypes.servicesMod.ServiceOption
      
      trait WDIODevtoolsOptions extends StObject
      
      trait WDIOVSCodeServiceOptions extends StObject
    }
  }
}
