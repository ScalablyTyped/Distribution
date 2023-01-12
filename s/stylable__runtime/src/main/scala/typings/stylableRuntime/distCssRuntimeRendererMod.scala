package typings.stylableRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLStyleElement
import typings.stylableRuntime.distKeyedListRendererMod.DOMListRenderer
import typings.stylableRuntime.distTypesMod.RenderableStylesheet
import typings.stylableRuntime.esmCssRuntimeRendererMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssRuntimeRendererMod {
  
  @JSImport("@stylable/runtime/dist/css-runtime-renderer", "RuntimeRenderer")
  @js.native
  open class RuntimeRenderer () extends StObject {
    
    def findDepthIndex(depth: Double): Double = js.native
    
    def getStyles(ids: js.Array[String], sortIndexes: Boolean): js.Array[RenderableStylesheet] = js.native
    
    var id: Double | Null = js.native
    
    def init(_window: Window): Unit = js.native
    
    def onRegister(): Unit = js.native
    
    def register(stylesheet: RenderableStylesheet): Unit = js.native
    
    def removeStyle(stylesheet: RenderableStylesheet): Unit = js.native
    
    var renderer: (DOMListRenderer[RenderableStylesheet, HTMLStyleElement, Element]) | Null = js.native
    
    def sortStyles(styles: js.Array[RenderableStylesheet]): js.Array[RenderableStylesheet] = js.native
    def sortStyles(styles: js.Array[RenderableStylesheet], sortIndexes: Boolean): js.Array[RenderableStylesheet] = js.native
    
    var styles: js.Array[RenderableStylesheet] = js.native
    
    var stylesMap: StringDictionary[RenderableStylesheet] = js.native
    
    def update(): Unit = js.native
    
    var window: Window | Null = js.native
  }
  
  @JSImport("@stylable/runtime/dist/css-runtime-renderer", "$")
  @js.native
  val _empty: RuntimeRenderer = js.native
  
  object global {
    
    trait Window extends StObject {
      
      var __stylable_renderer_global_counter: js.UndefOr[Double] = js.undefined
    }
    object Window {
      
      inline def apply(): typings.stylableRuntime.distCssRuntimeRendererMod.global.Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.stylableRuntime.distCssRuntimeRendererMod.global.Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.stylableRuntime.distCssRuntimeRendererMod.global.Window] (val x: Self) extends AnyVal {
        
        inline def set__stylable_renderer_global_counter(value: Double): Self = StObject.set(x, "__stylable_renderer_global_counter", value.asInstanceOf[js.Any])
        
        inline def set__stylable_renderer_global_counterUndefined: Self = StObject.set(x, "__stylable_renderer_global_counter", js.undefined)
      }
    }
  }
}
