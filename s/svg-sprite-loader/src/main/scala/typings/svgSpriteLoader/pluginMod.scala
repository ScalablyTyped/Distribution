package typings.svgSpriteLoader

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("svg-sprite-loader/plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    /** Render plain sprite without styles and usages */
    var plainSprite: js.UndefOr[Boolean] = js.native
    
    /** Custom tag attributes for the svg */
    var spriteAttrs: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlainSprite(value: Boolean): Self = StObject.set(x, "plainSprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainSpriteUndefined: Self = StObject.set(x, "plainSprite", js.undefined)
      
      @scala.inline
      def setSpriteAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "spriteAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteAttrsUndefined: Self = StObject.set(x, "spriteAttrs", js.undefined)
    }
  }
  
  type SVGSpriteLoaderPlugin = Plugin
}
