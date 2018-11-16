package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Renderer")
@js.native
class Renderer protected () extends js.Object {
  def this(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends) = this()
  def getContext(): vexflowLib.VexNs.IRenderContext = js.native
  def resize(width: scala.Double, height: scala.Double): Renderer = js.native
}

@JSGlobal("Vex.Flow.Renderer")
@js.native
object Renderer extends js.Object {
  var USE_CANVAS_PROXY: scala.Boolean = js.native
  def bolsterCanvasContext(ctx: stdLib.CanvasRenderingContext2D): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
  def buildContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends): vexflowLib.VexNs.IRenderContext = js.native
  def buildContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends, width: scala.Double): vexflowLib.VexNs.IRenderContext = js.native
  def buildContext(
    sel: stdLib.HTMLElement,
    backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
    width: scala.Double,
    height: scala.Double
  ): vexflowLib.VexNs.IRenderContext = js.native
  def buildContext(
    sel: stdLib.HTMLElement,
    backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
    width: scala.Double,
    height: scala.Double,
    background: java.lang.String
  ): vexflowLib.VexNs.IRenderContext = js.native
  def drawDashedLine(
    context: vexflowLib.VexNs.IRenderContext,
    fromX: scala.Double,
    fromY: scala.Double,
    toX: scala.Double,
    toY: scala.Double,
    dashPattern: js.Array[scala.Double]
  ): scala.Unit = js.native
  def getCanvasContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
  def getCanvasContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends, width: scala.Double): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
  def getCanvasContext(
    sel: stdLib.HTMLElement,
    backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
    width: scala.Double,
    height: scala.Double
  ): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
  def getCanvasContext(
    sel: stdLib.HTMLElement,
    backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
    width: scala.Double,
    height: scala.Double,
    background: java.lang.String
  ): vexflowLib.VexNs.FlowNs.CanvasContext = js.native
  def getRaphaelContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends): vexflowLib.VexNs.FlowNs.RaphaelContext = js.native
  def getRaphaelContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends, width: scala.Double): vexflowLib.VexNs.FlowNs.RaphaelContext = js.native
  def getRaphaelContext(
    sel: stdLib.HTMLElement,
    backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
    width: scala.Double,
    height: scala.Double
  ): vexflowLib.VexNs.FlowNs.RaphaelContext = js.native
  def getRaphaelContext(
    sel: stdLib.HTMLElement,
    backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
    width: scala.Double,
    height: scala.Double,
    background: java.lang.String
  ): vexflowLib.VexNs.FlowNs.RaphaelContext = js.native
  def getSVGContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends): vexflowLib.VexNs.FlowNs.SVGContext = js.native
  def getSVGContext(sel: stdLib.HTMLElement, backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends, width: scala.Double): vexflowLib.VexNs.FlowNs.SVGContext = js.native
  def getSVGContext(
    sel: stdLib.HTMLElement,
    backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
    width: scala.Double,
    height: scala.Double
  ): vexflowLib.VexNs.FlowNs.SVGContext = js.native
  def getSVGContext(
    sel: stdLib.HTMLElement,
    backend: vexflowLib.VexNs.FlowNs.RendererNs.Backends,
    width: scala.Double,
    height: scala.Double,
    background: java.lang.String
  ): vexflowLib.VexNs.FlowNs.SVGContext = js.native
}

