package typings.stylehacks

import typings.postcss.mod.Node
import typings.postcss.mod.Plugin
import typings.stylehacks.stylehacksBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {{lint?: boolean}} Options */
  /**
    * @type {import('postcss').PluginCreator<Options>}
    * @param {Options} opts
    * @return {import('postcss').Plugin}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(opts: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("stylehacks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detect(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("stylehacks", "postcss")
  @js.native
  def postcss: `true` = js.native
  inline def postcss_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("postcss")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    var lint: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLint(value: Boolean): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
      
      inline def setLintUndefined: Self = StObject.set(x, "lint", js.undefined)
    }
  }
}
