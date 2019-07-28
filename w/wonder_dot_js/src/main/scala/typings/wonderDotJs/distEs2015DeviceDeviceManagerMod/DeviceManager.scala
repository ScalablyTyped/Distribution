package typings.wonderDotJs.distEs2015DeviceDeviceManagerMod

import typings.std.WebGLRenderingContext
import typings.wonderDotJs.distEs2015CoreDataMainDataMod.ContextConfigData
import typings.wonderDotJs.distEs2015MathVector2Mod.Vector2
import typings.wonderDotJs.distEs2015StructureRectRegionMod.RectRegion
import typings.wonderDotJs.distEs2015StructureViewMod.IView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "DeviceManager")
@js.native
class DeviceManager () extends js.Object {
  var alphaToCoverage: Boolean = js.native
  var blend: Boolean = js.native
  var contextConfig: ContextConfigData = js.native
  var depthFunc: EDepthFunction = js.native
  var depthTest: Boolean = js.native
  var depthWrite: Boolean = js.native
  var gl: WebGLRenderingContext = js.native
  var polygonOffset: Vector2 = js.native
  var polygonOffsetMode: EPolygonOffsetMode = js.native
  var scissorTest: Boolean = js.native
  var side: ESide = js.native
  var view: IView = js.native
  def clear(options: js.Any): Unit = js.native
  def createGL(canvasId: String, contextConfig: ContextConfigData, useDevicePixelRatio: Boolean): Unit = js.native
  def getPixelRatio(): Double = js.native
  def getViewport(): RectRegion = js.native
  def setBlendEquation(blendEquation: EBlendEquation): Unit = js.native
  def setBlendEquationSeparate(blendEquationSeparate: js.Array[EBlendEquation]): Unit = js.native
  def setBlendFunc(blendSrc: EBlendFunc, blendDst: EBlendFunc): Unit = js.native
  def setBlendFuncSeparate(blendFuncSeparate: js.Array[EBlendFunc]): Unit = js.native
  def setColorWrite(writeRed: js.Any, writeGreen: js.Any, writeBlue: js.Any, writeAlpha: js.Any): Unit = js.native
  def setHardwareScaling(level: Double): Unit = js.native
  def setPixelRatio(pixelRatio: Double): Unit = js.native
  def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def setScreen(): Unit = js.native
  def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/device/DeviceManager", "DeviceManager")
@js.native
object DeviceManager extends js.Object {
  def getInstance(): js.Any = js.native
}

