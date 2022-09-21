package typings.svgBakerRuntime

import typings.std.Element
import typings.svgBakerRuntime.browserSpriteConfigMod.BrowserSpriteConfig
import typings.svgBakerRuntime.spriteConfigMod.SpriteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserSpriteMod {
  
  @JSImport("svg-baker-runtime/src/browser-sprite", JSImport.Default)
  @js.native
  open class default () extends BrowserSprite {
    def this(cfg: SpriteConfig & BrowserSpriteConfig) = this()
  }
  
  @js.native
  trait BrowserSprite
    extends typings.svgBakerRuntime.spriteMod.default {
    
    /**
      * override
      * Add new symbol. If symbol with the same id exists it will be replaced.
      * If sprite already mounted - `symbol.mount(sprite.node)` will be called.
      * @fires Events#SYMBOL_MOUNT
      * @return `true` - symbol was added, `false` - replaced
      */
    def add(symbol: typings.svgBakerRuntime.browserSymbolMod.default): Boolean = js.native
    
    /**
      * Attach to existing DOM node
      * @return attached DOM Element. null if node to attach not found.
      */
    def attach(target: String): Element | Null = js.native
    def attach(target: Element): Element | Null = js.native
    
    /**
      * override
      */
    /* protected */ @JSName("config")
    var config_BrowserSprite: SpriteConfig & BrowserSpriteConfig = js.native
    
    var isMounted: Boolean = js.native
    
    /**
      * @fires Events#MOUNT
      * @return rendered sprite node. null if mount node not found.
      */
    def mount(): Element | Null = js.native
    def mount(target: String): Element | Null = js.native
    def mount(target: String, prepend: Boolean): Element | Null = js.native
    def mount(target: Unit, prepend: Boolean): Element | Null = js.native
    
    var node: Element | Null = js.native
    
    def render(): Element = js.native
    
    /**
      * Detach sprite from the DOM
      */
    def unmount(): Unit = js.native
    
    /**
      * Update URLs in sprite and usage elements
      * @return `true` - URLs was updated, `false` - sprite is not mounted
      */
    def updateUrls(oldUrl: String, newUrl: String): Boolean = js.native
  }
}
