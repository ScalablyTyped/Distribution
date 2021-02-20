package typings.vegaTypings

import org.scalablytyped.runtime.Instantiable1
import typings.std.HTMLElement
import typings.vegaTypings.runtimeMod.Loader_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("vega-typings/types/runtime/renderer", "CanvasHandler")
  @js.native
  class CanvasHandler () extends Handler
  
  @JSImport("vega-typings/types/runtime/renderer", "Handler")
  @js.native
  class Handler () extends StObject
  
  @JSImport("vega-typings/types/runtime/renderer", "Renderer")
  @js.native
  class Renderer protected () extends StObject {
    def this(loader: Loader_) = this()
    
    def initialize(el: HTMLElement, width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
    
    def resize(width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
  }
  
  @JSImport("vega-typings/types/runtime/renderer", "renderModule")
  @js.native
  def renderModule(moduleName: String, renderModule: RenderModule_): RenderModule_ = js.native
  
  @js.native
  trait RenderModule_ extends StObject {
    
    var handler: Handler = js.native
    
    var headless: js.UndefOr[Renderer] = js.native
    
    var renderer: Instantiable1[/* loader */ Loader_, Renderer] = js.native
  }
  object RenderModule_ {
    
    @scala.inline
    def apply(handler: Handler, renderer: Instantiable1[/* loader */ Loader_, Renderer]): RenderModule_ = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderModule_]
    }
    
    @scala.inline
    implicit class RenderModule_MutableBuilder[Self <: RenderModule_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadless(value: Renderer): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      @scala.inline
      def setRenderer(value: Instantiable1[/* loader */ Loader_, Renderer]): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.canvas
    - typings.vegaTypings.vegaTypingsStrings.svg
    - typings.vegaTypings.vegaTypingsStrings.none
  */
  trait Renderers extends StObject
  object Renderers {
    
    @scala.inline
    def canvas: typings.vegaTypings.vegaTypingsStrings.canvas = "canvas".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.canvas]
    
    @scala.inline
    def none: typings.vegaTypings.vegaTypingsStrings.none = "none".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.none]
    
    @scala.inline
    def svg: typings.vegaTypings.vegaTypingsStrings.svg = "svg".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.svg]
  }
}
