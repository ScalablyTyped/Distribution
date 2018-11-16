package typings
package threeLib.threeDashCanvasrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-canvasrenderer", "CanvasRenderer")
@js.native
class CanvasRenderer ()
  extends threeLib.threeDashCoreMod.Renderer {
  def this(parameters: CanvasRendererParameters) = this()
  var autoClear: scala.Boolean = js.native
  var info: threeLib.Anon_Render = js.native
  var sortElements: scala.Boolean = js.native
  var sortObjects: scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def clearColor(): scala.Unit = js.native
  def clearDepth(): scala.Unit = js.native
  def clearStencil(): scala.Unit = js.native
  def enableScissorTest(): scala.Unit = js.native
  def getClearAlpha(): scala.Double = js.native
  def getClearColor(): threeLib.threeDashCoreMod.Color = js.native
  def getMaxAnisotropy(): scala.Double = js.native
  def getPixelRatio(): scala.Double = js.native
  def setClearColor(color: java.lang.String): scala.Unit = js.native
  def setClearColor(color: java.lang.String, opacity: scala.Double): scala.Unit = js.native
  def setClearColor(color: scala.Double): scala.Unit = js.native
  def setClearColor(color: scala.Double, opacity: scala.Double): scala.Unit = js.native
  def setClearColor(color: threeLib.threeDashCoreMod.Color): scala.Unit = js.native
  def setClearColor(color: threeLib.threeDashCoreMod.Color, opacity: scala.Double): scala.Unit = js.native
  // setClearColor(color: string, opacity?: number): void;
  // setClearColor(color: number, opacity?: number): void;
  def setClearColorHex(hex: scala.Double): scala.Unit = js.native
  // setClearColor(color: string, opacity?: number): void;
  // setClearColor(color: number, opacity?: number): void;
  def setClearColorHex(hex: scala.Double, alpha: scala.Double): scala.Unit = js.native
  def setFaceCulling(): scala.Unit = js.native
  def setPixelRatio(value: scala.Double): scala.Unit = js.native
  def setScissor(): scala.Unit = js.native
  def setViewport(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def supportsVertexTextures(): scala.Unit = js.native
}

