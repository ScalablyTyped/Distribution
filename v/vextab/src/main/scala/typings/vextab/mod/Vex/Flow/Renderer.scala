package typings.vextab.mod.Vex.Flow

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.vexflow.Vex.Flow.Renderer.Backends
import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Renderer")
@js.native
open class Renderer protected ()
  extends typings.vexflow.mod.Flow.Renderer {
  def this(sel: HTMLElement, backend: Backends) = this()
}
object Renderer {
  
  @JSImport("vextab", "Vex.Flow.Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.Renderer.Backends")
  @js.native
  object Backends extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Renderer.Backends & Double] = js.native
    
    /* 1 */ val CANVAS: typings.vexflow.Vex.Flow.Renderer.Backends.CANVAS & Double = js.native
    
    /* 0 */ val RAPHAEL: typings.vexflow.Vex.Flow.Renderer.Backends.RAPHAEL & Double = js.native
    
    /* 1 */ val SVG: typings.vexflow.Vex.Flow.Renderer.Backends.SVG & Double = js.native
    
    /* 2 */ val VML: typings.vexflow.Vex.Flow.Renderer.Backends.VML & Double = js.native
  }
  
  @JSImport("vextab", "Vex.Flow.Renderer.LineEndType")
  @js.native
  object LineEndType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Renderer.LineEndType & Double] = js.native
    
    /* 1 */ val DOWN: typings.vexflow.Vex.Flow.Renderer.LineEndType.DOWN & Double = js.native
    
    /* 1 */ val NONE: typings.vexflow.Vex.Flow.Renderer.LineEndType.NONE & Double = js.native
    
    /* 0 */ val UP: typings.vexflow.Vex.Flow.Renderer.LineEndType.UP & Double = js.native
  }
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Renderer.USE_CANVAS_PROXY")
  @js.native
  def USE_CANVAS_PROXY: Boolean = js.native
  inline def USE_CANVAS_PROXY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USE_CANVAS_PROXY")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def bolsterCanvasContext(ctx: CanvasRenderingContext2D): typings.vexflow.Vex.Flow.CanvasContext = ^.asInstanceOf[js.Dynamic].applyDynamic("bolsterCanvasContext")(ctx.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.CanvasContext]
  
  /* static member */
  inline def buildContext(sel: HTMLElement, backend: Backends): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Double): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Unit, background: String): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double, background: String): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  inline def buildContext(sel: HTMLElement, backend: Backends, width: Unit, height: Unit, background: String): IRenderContext = (^.asInstanceOf[js.Dynamic].applyDynamic("buildContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[IRenderContext]
  
  /* static member */
  inline def drawDashedLine(
    context: IRenderContext,
    fromX: Double,
    fromY: Double,
    toX: Double,
    toY: Double,
    dashPattern: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawDashedLine")(context.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any], toX.asInstanceOf[js.Any], toY.asInstanceOf[js.Any], dashPattern.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def getCanvasContext(sel: HTMLElement, backend: Backends): typings.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Unit, background: String): typings.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double): typings.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double, background: String): typings.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.CanvasContext]
  inline def getCanvasContext(sel: HTMLElement, backend: Backends, width: Unit, height: Unit, background: String): typings.vexflow.Vex.Flow.CanvasContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.CanvasContext]
  
  /* static member */
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends): typings.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Unit, background: String): typings.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double): typings.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double, background: String): typings.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.RaphaelContext]
  inline def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Unit, height: Unit, background: String): typings.vexflow.Vex.Flow.RaphaelContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getRaphaelContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.RaphaelContext]
  
  /* static member */
  inline def getSVGContext(sel: HTMLElement, backend: Backends): typings.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Unit, background: String): typings.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double): typings.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Unit, height: Double, background: String): typings.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.SVGContext]
  inline def getSVGContext(sel: HTMLElement, backend: Backends, width: Unit, height: Unit, background: String): typings.vexflow.Vex.Flow.SVGContext = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGContext")(sel.asInstanceOf[js.Any], backend.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.SVGContext]
}
