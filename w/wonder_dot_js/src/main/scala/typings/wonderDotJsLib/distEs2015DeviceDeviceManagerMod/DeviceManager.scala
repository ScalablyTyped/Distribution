package typings
package wonderDotJsLib.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "DeviceManager")
@js.native
class DeviceManager () extends js.Object {
  var alphaToCoverage: scala.Boolean = js.native
  var blend: scala.Boolean = js.native
  var contextConfig: wonderDotJsLib.distEs2015CoreDataMainDataMod.ContextConfigData = js.native
  var depthFunc: EDepthFunction = js.native
  var depthTest: scala.Boolean = js.native
  var depthWrite: scala.Boolean = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var polygonOffset: wonderDotJsLib.distEs2015MathVector2Mod.Vector2 = js.native
  var polygonOffsetMode: EPolygonOffsetMode = js.native
  var scissorTest: scala.Boolean = js.native
  var side: ESide = js.native
  var view: wonderDotJsLib.distEs2015StructureViewMod.IView = js.native
  def clear(options: js.Any): scala.Unit = js.native
  def createGL(
    canvasId: java.lang.String,
    contextConfig: wonderDotJsLib.distEs2015CoreDataMainDataMod.ContextConfigData,
    useDevicePixelRatio: scala.Boolean
  ): scala.Unit = js.native
  def getPixelRatio(): scala.Double = js.native
  def getViewport(): wonderDotJsLib.distEs2015StructureRectRegionMod.RectRegion = js.native
  def setBlendEquation(blendEquation: EBlendEquation): scala.Unit = js.native
  def setBlendEquationSeparate(blendEquationSeparate: js.Array[EBlendEquation]): scala.Unit = js.native
  def setBlendFunc(blendSrc: EBlendFunc, blendDst: EBlendFunc): scala.Unit = js.native
  def setBlendFuncSeparate(blendFuncSeparate: js.Array[EBlendFunc]): scala.Unit = js.native
  def setColorWrite(writeRed: js.Any, writeGreen: js.Any, writeBlue: js.Any, writeAlpha: js.Any): scala.Unit = js.native
  def setHardwareScaling(level: scala.Double): scala.Unit = js.native
  def setPixelRatio(pixelRatio: scala.Double): scala.Unit = js.native
  def setScissor(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setScreen(): scala.Unit = js.native
  def setViewport(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/device/DeviceManager", "DeviceManager")
@js.native
object DeviceManager extends js.Object {
  def getInstance(): js.Any = js.native
}

