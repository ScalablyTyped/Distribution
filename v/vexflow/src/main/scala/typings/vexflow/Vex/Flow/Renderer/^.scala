package typings.vexflow.Vex.Flow.Renderer

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.vexflow.Vex.Flow.CanvasContext
import typings.vexflow.Vex.Flow.RaphaelContext
import typings.vexflow.Vex.Flow.SVGContext
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Renderer")
@js.native
object ^ extends js.Object {
  var USE_CANVAS_PROXY: Boolean = js.native
  def bolsterCanvasContext(ctx: CanvasRenderingContext2D): CanvasContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends): IRenderContext = js.native
  def buildContext(sel: HTMLElement, backend: Backends, width: Double): IRenderContext = js.native
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
  def getCanvasContext(sel: HTMLElement, backend: Backends): CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double): CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): CanvasContext = js.native
  def getCanvasContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): CanvasContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends): RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double): RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): RaphaelContext = js.native
  def getRaphaelContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): RaphaelContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends): SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double): SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double): SVGContext = js.native
  def getSVGContext(sel: HTMLElement, backend: Backends, width: Double, height: Double, background: String): SVGContext = js.native
}

