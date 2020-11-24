package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//3.8
@js.native
trait WebCLProgram extends js.Object {
  
  def build(): Unit = js.native
  def build(
    devices: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    whenFinished: WebCLCallback
  ): Unit = js.native
  def build(devices: js.UndefOr[scala.Nothing], options: String): Unit = js.native
  def build(devices: js.UndefOr[scala.Nothing], options: String, whenFinished: WebCLCallback): Unit = js.native
  def build(devices: js.Array[WebCLDevice]): Unit = js.native
  def build(devices: js.Array[WebCLDevice], options: js.UndefOr[scala.Nothing], whenFinished: WebCLCallback): Unit = js.native
  def build(devices: js.Array[WebCLDevice], options: String): Unit = js.native
  def build(devices: js.Array[WebCLDevice], options: String, whenFinished: WebCLCallback): Unit = js.native
  
  def createKernel(kernelName: String): WebCLKernel = js.native
  
  def createKernelsInProgram(): js.Array[WebCLKernel] = js.native
  
  def getBuildInfo(device: WebCLDevice, name: ProgramBuildInfo): js.Any = js.native
  
  def getInfo(name: ProgramInfo): js.Any = js.native
  
  def release(): Unit = js.native
}
