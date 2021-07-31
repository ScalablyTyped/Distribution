package typings.wdioConfig

import org.scalablytyped.runtime.TopLevel
import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriver.WebDriver.W3CCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Capabilities = (js.Array[DesiredCapabilities | W3CCapabilities]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MultiRemoteCapabilities */ js.Any)
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config * / any, 'capabilities' | keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Hooks * / any> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config * / any[P]}
  - Dropped {[ k in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.HookFunctions * / any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.HookFunctions * / any[k] | std.Array<std.NonNullable</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.HookFunctions * / any[k]>>} */ trait ConfigOptions extends StObject {
    
    var capabilities: js.UndefOr[Capabilities] = js.undefined
    
    var specFileRetryAttempts: js.UndefOr[Double] = js.undefined
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapabilities(value: Capabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      @scala.inline
      def setCapabilitiesVarargs(value: (DesiredCapabilities | W3CCapabilities)*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
      
      @scala.inline
      def setSpecFileRetryAttempts(value: Double): Self = StObject.set(x, "specFileRetryAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecFileRetryAttemptsUndefined: Self = StObject.set(x, "specFileRetryAttempts", js.undefined)
    }
  }
  
  type DefaultOptions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: {  type :'string' | 'number' | 'object' | 'boolean' | 'function',   default :T[k] | undefined,   required :boolean | undefined,   validate :(option : k): void | undefined,   match :std.RegExp | undefined}}
    */ typings.wdioConfig.wdioConfigStrings.DefaultOptions & TopLevel[T]
  
  type Hooks = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.HookFunctions * / any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.HookFunctions * / any[k] | std.Array<std.NonNullable</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.HookFunctions * / any[k]>>}
    */ typings.wdioConfig.wdioConfigStrings.Hooks & TopLevel[js.Any]
}
