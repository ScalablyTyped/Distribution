package typings.stylableNode

import typings.stylableNode.anon.PartialOptions
import typings.stylableNode.anon.PartialStylableConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requireHookMod {
  
  @JSImport("@stylable/node/cjs/require-hook", "attachHook")
  @js.native
  def attachHook(): Unit = js.native
  @JSImport("@stylable/node/cjs/require-hook", "attachHook")
  @js.native
  def attachHook(hasMatcherAfterCompileStylableConfigRuntimePathIgnoreJSModules: PartialOptions): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var afterCompile: js.UndefOr[js.Function2[/* code */ String, /* filename */ String, String]] = js.native
    
    var ignoreJSModules: js.UndefOr[Boolean] = js.native
    
    def matcher(filename: String): Boolean = js.native
    
    var runtimePath: js.UndefOr[String] = js.native
    
    var stylableConfig: PartialStylableConfig = js.native
  }
  object Options {
    
    @scala.inline
    def apply(matcher: String => Boolean, stylableConfig: PartialStylableConfig): Options = {
      val __obj = js.Dynamic.literal(matcher = js.Any.fromFunction1(matcher), stylableConfig = stylableConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterCompile(value: (/* code */ String, /* filename */ String) => String): Self = StObject.set(x, "afterCompile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterCompileUndefined: Self = StObject.set(x, "afterCompile", js.undefined)
      
      @scala.inline
      def setIgnoreJSModules(value: Boolean): Self = StObject.set(x, "ignoreJSModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreJSModulesUndefined: Self = StObject.set(x, "ignoreJSModules", js.undefined)
      
      @scala.inline
      def setMatcher(value: String => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRuntimePath(value: String): Self = StObject.set(x, "runtimePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimePathUndefined: Self = StObject.set(x, "runtimePath", js.undefined)
      
      @scala.inline
      def setStylableConfig(value: PartialStylableConfig): Self = StObject.set(x, "stylableConfig", value.asInstanceOf[js.Any])
    }
  }
}
