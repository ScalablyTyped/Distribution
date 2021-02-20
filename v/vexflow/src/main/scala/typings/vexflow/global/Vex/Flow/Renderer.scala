package typings.vexflow.global.Vex.Flow

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.vexflow.Vex.Flow.Renderer.Backends
import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Renderer")
@js.native
class Renderer protected ()
  extends typings.vexflow.Vex.Flow.Renderer {
  def this(sel: HTMLElement, backend: Backends) = this()
}
object Renderer {
  
  @JSGlobal("Vex.Flow.Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Vex.Flow.Renderer.Backends")
  @js.native
  object Backends extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Renderer.Backends with Double] = js.native
    
    /* 1 */ val CANVAS: typings.vexflow.Vex.Flow.Renderer.Backends.CANVAS with Double = js.native
    
    /* 0 */ val RAPHAEL: typings.vexflow.Vex.Flow.Renderer.Backends.RAPHAEL with Double = js.native
    
    /* 1 */ val SVG: typings.vexflow.Vex.Flow.Renderer.Backends.SVG with Double = js.native
    
    /* 2 */ val VML: typings.vexflow.Vex.Flow.Renderer.Backends.VML with Double = js.native
  }
  
  @JSGlobal("Vex.Flow.Renderer.LineEndType")
  @js.native
  object LineEndType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Renderer.LineEndType with Double] = js.native
    
    /* 1 */ val DOWN: typings.vexflow.Vex.Flow.Renderer.LineEndType.DOWN with Double = js.native
    
    /* 1 */ val NONE: typings.vexflow.Vex.Flow.Renderer.LineEndType.NONE with Double = js.native
    
    /* 0 */ val UP: typings.vexflow.Vex.Flow.Renderer.LineEndType.UP with Double = js.native
  }
  
  /* static member */
  @JSGlobal("Vex.Flow.Renderer.USE_CANVAS_PROXY")
  @js.native
  def USE_CANVAS_PROXY: Boolean = js.native
  @scala.inline
  def USE_CANVAS_PROXY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USE_CANVAS_PROXY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Vex.Flow.Renderer.bolsterCanvasContext")
  @js.native
  def bolsterCanvasContext(ctx: CanvasRenderingContext2D): typings.vexflow.Vex.Flow.CanvasContext = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Renderer.buildContext")
  @js.native
  def buildContext(sel: HTMLElement, backend: Backends): IRenderContext = js.native
  @JSGlobal("Vex.Flow.Renderer.buildContext")
  @js.native
  def buildContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    background: String
  ): IRenderContext = js.native
  @JSGlobal("Vex.Flow.Renderer.buildContext")
  @js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: js.UndefOr[scala.Nothing], height: Double): IRenderContext = js.native
  @JSGlobal("Vex.Flow.Renderer.buildContext")
  @js.native
  def buildContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    background: String
  ): IRenderContext = js.native
  @JSGlobal("Vex.Flow.Renderer.buildContext")
  @js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double): IRenderContext = js.native
  @JSGlobal("Vex.Flow.Renderer.buildContext")
  @js.native
  def buildContext(
    sel: HTMLElement,
    backend: Backends,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    background: String
  ): IRenderContext = js.native
  @JSGlobal("Vex.Flow.Renderer.buildContext")
  @js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): IRenderContext = js.native
  @JSGlobal("Vex.Flow.Renderer.buildContext")
  @js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): IRenderContext = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Renderer.drawDashedLine")
  @js.native
  def drawDashedLine(
    context: IRenderContext,
    fromX: Double,
    fromY: Double,
    toX: Double,
    toY: Double,
    dashPattern: js.Array[Double]
  ): Unit = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Renderer.getCanvasContext")
  @js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends): typings.vexflow.Vex.Flow.CanvasContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getCanvasContext")
  @js.native
  def getCanvasContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.CanvasContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getCanvasContext")
  @js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: js.UndefOr[scala.Nothing], height: Double): typings.vexflow.Vex.Flow.CanvasContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getCanvasContext")
  @js.native
  def getCanvasContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    background: String
  ): typings.vexflow.Vex.Flow.CanvasContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getCanvasContext")
  @js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.Vex.Flow.CanvasContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getCanvasContext")
  @js.native
  def getCanvasContext(
    sel: HTMLElement,
    backend: Backends,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.CanvasContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getCanvasContext")
  @js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.Vex.Flow.CanvasContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getCanvasContext")
  @js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.Vex.Flow.CanvasContext = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Renderer.getRaphaelContext")
  @js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getRaphaelContext")
  @js.native
  def getRaphaelContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getRaphaelContext")
  @js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: js.UndefOr[scala.Nothing], height: Double): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getRaphaelContext")
  @js.native
  def getRaphaelContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    background: String
  ): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getRaphaelContext")
  @js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getRaphaelContext")
  @js.native
  def getRaphaelContext(
    sel: HTMLElement,
    backend: Backends,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getRaphaelContext")
  @js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getRaphaelContext")
  @js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Renderer.getSVGContext")
  @js.native
  def getSVGContext(sel: HTMLElement, backend: Backends): typings.vexflow.Vex.Flow.SVGContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getSVGContext")
  @js.native
  def getSVGContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.SVGContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getSVGContext")
  @js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: js.UndefOr[scala.Nothing], height: Double): typings.vexflow.Vex.Flow.SVGContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getSVGContext")
  @js.native
  def getSVGContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    background: String
  ): typings.vexflow.Vex.Flow.SVGContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getSVGContext")
  @js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.Vex.Flow.SVGContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getSVGContext")
  @js.native
  def getSVGContext(
    sel: HTMLElement,
    backend: Backends,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.SVGContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getSVGContext")
  @js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.Vex.Flow.SVGContext = js.native
  @JSGlobal("Vex.Flow.Renderer.getSVGContext")
  @js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.Vex.Flow.SVGContext = js.native
}
