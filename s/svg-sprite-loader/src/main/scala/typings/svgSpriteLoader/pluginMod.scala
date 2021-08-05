package typings.svgSpriteLoader

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("svg-sprite-loader/plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /** Render plain sprite without styles and usages */
    var plainSprite: js.UndefOr[Boolean] = js.undefined
    
    /** Custom tag attributes for the svg */
    var spriteAttrs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPlainSprite(value: Boolean): Self = StObject.set(x, "plainSprite", value.asInstanceOf[js.Any])
      
      inline def setPlainSpriteUndefined: Self = StObject.set(x, "plainSprite", js.undefined)
      
      inline def setSpriteAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "spriteAttrs", value.asInstanceOf[js.Any])
      
      inline def setSpriteAttrsUndefined: Self = StObject.set(x, "spriteAttrs", js.undefined)
    }
  }
  
  type SVGSpriteLoaderPlugin = Plugin
}
