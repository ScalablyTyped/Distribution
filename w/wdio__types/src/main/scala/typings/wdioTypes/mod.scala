package typings.wdioTypes

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import typings.std.Pick
import typings.wdioTypes.buildOptionsMod.Testrunner
import typings.wdioTypes.buildReportersMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type FunctionProperties[T] = Pick[T, FunctionPropertyNames[T]]
  
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonArray = std.Array<@wdio/types.@wdio/types.JsonPrimitive | @wdio/types.@wdio/types.JsonObject | @wdio/types.@wdio/types.JsonArray>
  }}}
  to avoid circular code involving: 
  - @wdio/types.@wdio/types.JsonArray
  */
  @js.native
  trait JsonArray
    extends StObject
       with Array[JsonPrimitive | JsonObject | JsonArray]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonCompatible = @wdio/types.@wdio/types.JsonObject | @wdio/types.@wdio/types.JsonArray
  }}}
  to avoid circular code involving: 
  - @wdio/types.@wdio/types.JsonArray
  - @wdio/types.@wdio/types.JsonCompatible
  */
  type JsonCompatible = JsonObject | Any
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonObject = {[x: string] : @wdio/types.@wdio/types.JsonPrimitive | @wdio/types.@wdio/types.JsonObject | @wdio/types.@wdio/types.JsonArray}
  }}}
  to avoid circular code involving: 
  - @wdio/types.@wdio/types.JsonArray
  - @wdio/types.@wdio/types.JsonCompatible
  - @wdio/types.@wdio/types.JsonObject
  */
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.PromiseLike<infer U> ? U : T
    }}}
    */
  type ThenArg[T] = T
  
  object global {
    
    object WebDriver {
      
      type Capabilities = typings.wdioTypes.buildCapabilitiesMod.Capabilities
      
      type DesiredCapabilities = typings.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
    }
    
    object WebdriverIO {
      
      type Config = Testrunner
      
      type CucumberOpts = StringDictionary[Any]
      
      trait HookFunctionExtension extends StObject
      
      type JasmineOpts = StringDictionary[Any]
      
      type MochaOpts = StringDictionary[Any]
      
      type ReporterOption = Options
      
      type ServiceOption = typings.wdioTypes.buildServicesMod.ServiceOption
      
      trait WDIODevtoolsOptions extends StObject
      
      trait WDIOVSCodeServiceOptions extends StObject
    }
  }
}
