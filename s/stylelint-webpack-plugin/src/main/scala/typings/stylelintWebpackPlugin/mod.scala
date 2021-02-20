package typings.stylelintWebpackPlugin

import typings.stylelintWebpackPlugin.getOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {import('webpack').Compiler} Compiler */
  @JSImport("stylelint-webpack-plugin", JSImport.Default)
  @js.native
  class default () extends StylelintWebpackPlugin {
    def this(options: js.Object) = this()
  }
  
  type Compiler = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any
  
  /** @typedef {import('webpack').Compiler} Compiler */
  @js.native
  trait StylelintWebpackPlugin extends StObject {
    
    /**
      * @param {Compiler} compiler
      * @returns {void}
      */
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /**
      *
      * @param {Compiler} compiler
      * @returns {string}
      */
    def getContext(compiler: Compiler): String = js.native
    
    var options: Options = js.native
  }
  object StylelintWebpackPlugin {
    
    @scala.inline
    def apply(apply: Compiler => Unit, getContext: Compiler => String, options: Options): StylelintWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), getContext = js.Any.fromFunction1(getContext), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylelintWebpackPlugin]
    }
    
    @scala.inline
    implicit class StylelintWebpackPluginMutableBuilder[Self <: StylelintWebpackPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContext(value: Compiler => String): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
