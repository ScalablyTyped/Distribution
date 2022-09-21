package typings.svgSpriteLoader

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("svg-sprite-loader/plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /** Render plain sprite without styles and usages */
    var plainSprite: js.UndefOr[Boolean] = js.undefined
    
    /** Custom tag attributes for the svg */
    var spriteAttrs: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPlainSprite(value: Boolean): Self = StObject.set(x, "plainSprite", value.asInstanceOf[js.Any])
      
      inline def setPlainSpriteUndefined: Self = StObject.set(x, "plainSprite", js.undefined)
      
      inline def setSpriteAttrs(value: StringDictionary[Any]): Self = StObject.set(x, "spriteAttrs", value.asInstanceOf[js.Any])
      
      inline def setSpriteAttrsUndefined: Self = StObject.set(x, "spriteAttrs", js.undefined)
    }
  }
  
  type SVGSpriteLoaderPlugin = Plugin
}
