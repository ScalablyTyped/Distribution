package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//3.8
@js.native
trait WebCLProgram extends StObject {
  
  def build(): Unit = js.native
  def build(devices: js.Array[WebCLDevice]): Unit = js.native
  def build(devices: js.Array[WebCLDevice], options: String): Unit = js.native
  def build(devices: js.Array[WebCLDevice], options: String, whenFinished: WebCLCallback): Unit = js.native
  def build(devices: js.Array[WebCLDevice], options: Unit, whenFinished: WebCLCallback): Unit = js.native
  def build(devices: Unit, options: String): Unit = js.native
  def build(devices: Unit, options: String, whenFinished: WebCLCallback): Unit = js.native
  def build(devices: Unit, options: Unit, whenFinished: WebCLCallback): Unit = js.native
  
  def createKernel(kernelName: String): WebCLKernel = js.native
  
  def createKernelsInProgram(): js.Array[WebCLKernel] = js.native
  
  def getBuildInfo(device: WebCLDevice, name: ProgramBuildInfo): Any = js.native
  
  def getInfo(name: ProgramInfo): Any = js.native
  
  def release(): Unit = js.native
}
