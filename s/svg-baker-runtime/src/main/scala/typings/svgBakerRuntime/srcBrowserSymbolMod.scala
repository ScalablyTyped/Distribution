package typings.svgBakerRuntime

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserSymbolMod {
  
  @JSImport("svg-baker-runtime/src/browser-symbol", JSImport.Default)
  @js.native
  open class default () extends BrowserSpriteSymbol
  /* static members */
  object default {
    
    @JSImport("svg-baker-runtime/src/browser-symbol", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromExistingNode(node: Element): BrowserSpriteSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromExistingNode")(node.asInstanceOf[js.Any]).asInstanceOf[BrowserSpriteSymbol]
  }
  
  @js.native
  trait BrowserSpriteSymbol
    extends typings.svgBakerRuntime.srcSymbolMod.default {
    
    var isMounted: Boolean = js.native
    
    def mount(target: String): Element = js.native
    def mount(target: Element): Element = js.native
    
    def render(): Element = js.native
    
    def unmount(): Unit = js.native
  }
}
