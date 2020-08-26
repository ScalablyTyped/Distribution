package typings.vexflow.mod.Flow

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.vexflow.Vex.Flow.Renderer.Backends
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Renderer")
@js.native
class Renderer protected ()
  extends typings.vexflow.Vex.Flow.Renderer {
  def this(sel: HTMLElement, backend: Backends) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Renderer")
@js.native
object Renderer extends js.Object {
  var USE_CANVAS_PROXY: Boolean = js.native
  def bolsterCanvasContext(ctx: CanvasRenderingContext2D): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends): IRenderContext = js.native
  def buildContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    background: String
  ): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: js.UndefOr[scala.Nothing], height: Double): IRenderContext = js.native
  def buildContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    background: String
  ): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double): IRenderContext = js.native
  def buildContext(
    sel: HTMLElement,
    backend: Backends,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    background: String
  ): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): IRenderContext = js.native
  def drawDashedLine(
    context: IRenderContext,
    fromX: Double,
    fromY: Double,
    toX: Double,
    toY: Double,
    dashPattern: js.Array[Double]
  ): Unit = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: js.UndefOr[scala.Nothing], height: Double): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    background: String
  ): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(
    sel: HTMLElement,
    backend: Backends,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: js.UndefOr[scala.Nothing], height: Double): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    background: String
  ): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(
    sel: HTMLElement,
    backend: Backends,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: js.UndefOr[scala.Nothing], height: Double): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(
    sel: HTMLElement,
    backend: Backends,
    width: js.UndefOr[scala.Nothing],
    height: Double,
    background: String
  ): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(
    sel: HTMLElement,
    backend: Backends,
    width: Double,
    height: js.UndefOr[scala.Nothing],
    background: String
  ): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): typings.vexflow.Vex.Flow.SVGContext = js.native
  @js.native
  object Backends extends js.Object {
    /* 1 */ val CANVAS: typings.vexflow.Vex.Flow.Renderer.Backends.CANVAS with Double = js.native
    /* 0 */ val RAPHAEL: typings.vexflow.Vex.Flow.Renderer.Backends.RAPHAEL with Double = js.native
    /* 1 */ val SVG: typings.vexflow.Vex.Flow.Renderer.Backends.SVG with Double = js.native
    /* 2 */ val VML: typings.vexflow.Vex.Flow.Renderer.Backends.VML with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Renderer.Backends with Double] = js.native
  }
  
  @js.native
  object LineEndType extends js.Object {
    /* 1 */ val DOWN: typings.vexflow.Vex.Flow.Renderer.LineEndType.DOWN with Double = js.native
    /* 1 */ val NONE: typings.vexflow.Vex.Flow.Renderer.LineEndType.NONE with Double = js.native
    /* 0 */ val UP: typings.vexflow.Vex.Flow.Renderer.LineEndType.UP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Renderer.LineEndType with Double] = js.native
  }
  
}

