package typings.wonderJs.distEs2015DeviceDeviceManagerMod

import typings.std.WebGLRenderingContext
import typings.wonderJs.distEs2015CoreDataMainDataMod.ContextConfigData
import typings.wonderJs.distEs2015MathVector2Mod.Vector2
import typings.wonderJs.distEs2015StructureRectRegionMod.RectRegion
import typings.wonderJs.distEs2015StructureViewMod.IView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015/device/DeviceManager", "DeviceManager")
@js.native
open class DeviceManager () extends StObject {
  
  var alphaToCoverage: Boolean = js.native
  
  var blend: Boolean = js.native
  
  def clear(options: Any): Unit = js.native
  
  var contextConfig: ContextConfigData = js.native
  
  def createGL(canvasId: String, contextConfig: ContextConfigData, useDevicePixelRatio: Boolean): Unit = js.native
  
  var depthFunc: EDepthFunction = js.native
  
  var depthTest: Boolean = js.native
  
  var depthWrite: Boolean = js.native
  
  def getPixelRatio(): Double = js.native
  
  def getViewport(): RectRegion = js.native
  
  var gl: WebGLRenderingContext = js.native
  
  var polygonOffset: Vector2 = js.native
  
  var polygonOffsetMode: EPolygonOffsetMode = js.native
  
  var scissorTest: Boolean = js.native
  
  def setBlendEquation(blendEquation: EBlendEquation): Unit = js.native
  
  def setBlendEquationSeparate(blendEquationSeparate: js.Array[EBlendEquation]): Unit = js.native
  
  def setBlendFunc(blendSrc: EBlendFunc, blendDst: EBlendFunc): Unit = js.native
  
  def setBlendFuncSeparate(blendFuncSeparate: js.Array[EBlendFunc]): Unit = js.native
  
  def setColorWrite(writeRed: Any, writeGreen: Any, writeBlue: Any, writeAlpha: Any): Unit = js.native
  
  def setHardwareScaling(level: Double): Unit = js.native
  
  def setPixelRatio(pixelRatio: Double): Unit = js.native
  
  def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  def setScreen(): Unit = js.native
  
  def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  var side: ESide = js.native
  
  var view: IView = js.native
}
/* static members */
object DeviceManager {
  
  @JSImport("wonder.js/dist/es2015/device/DeviceManager", "DeviceManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
}
