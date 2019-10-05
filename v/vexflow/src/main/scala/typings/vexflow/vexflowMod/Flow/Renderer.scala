package typings.vexflow.vexflowMod.Flow

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
  def buildContext(sel: HTMLElement, backend: typings.vexflow.Vex.Flow.Renderer.Backends): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: typings.vexflow.Vex.Flow.Renderer.Backends, width: Double): IRenderContext = js.native
  def buildContext(
    sel: HTMLElement,
    backend: typings.vexflow.Vex.Flow.Renderer.Backends,
    width: Double,
    height: Double
  ): IRenderContext = js.native
  def buildContext(
    sel: HTMLElement,
    backend: typings.vexflow.Vex.Flow.Renderer.Backends,
    width: Double,
    height: Double,
    background: String
  ): IRenderContext = js.native
  def drawDashedLine(
    context: IRenderContext,
    fromX: Double,
    fromY: Double,
    toX: Double,
    toY: Double,
    dashPattern: js.Array[Double]
  ): Unit = js.native
  def getCanvasContext(sel: HTMLElement, backend: typings.vexflow.Vex.Flow.Renderer.Backends): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: typings.vexflow.Vex.Flow.Renderer.Backends, width: Double): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(
    sel: HTMLElement,
    backend: typings.vexflow.Vex.Flow.Renderer.Backends,
    width: Double,
    height: Double
  ): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getCanvasContext(
    sel: HTMLElement,
    backend: typings.vexflow.Vex.Flow.Renderer.Backends,
    width: Double,
    height: Double,
    background: String
  ): typings.vexflow.Vex.Flow.CanvasContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: typings.vexflow.Vex.Flow.Renderer.Backends): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: typings.vexflow.Vex.Flow.Renderer.Backends, width: Double): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(
    sel: HTMLElement,
    backend: typings.vexflow.Vex.Flow.Renderer.Backends,
    width: Double,
    height: Double
  ): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getRaphaelContext(
    sel: HTMLElement,
    backend: typings.vexflow.Vex.Flow.Renderer.Backends,
    width: Double,
    height: Double,
    background: String
  ): typings.vexflow.Vex.Flow.RaphaelContext = js.native
  def getSVGContext(sel: HTMLElement, backend: typings.vexflow.Vex.Flow.Renderer.Backends): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: typings.vexflow.Vex.Flow.Renderer.Backends, width: Double): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(
    sel: HTMLElement,
    backend: typings.vexflow.Vex.Flow.Renderer.Backends,
    width: Double,
    height: Double
  ): typings.vexflow.Vex.Flow.SVGContext = js.native
  def getSVGContext(
    sel: HTMLElement,
    backend: typings.vexflow.Vex.Flow.Renderer.Backends,
    width: Double,
    height: Double,
    background: String
  ): typings.vexflow.Vex.Flow.SVGContext = js.native
  type Backends = typings.vexflow.Vex.Flow.Renderer.Backends
  type LineEndType = typings.vexflow.Vex.Flow.Renderer.LineEndType
}

