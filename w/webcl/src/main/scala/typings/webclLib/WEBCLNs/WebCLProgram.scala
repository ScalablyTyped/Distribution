package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//3.8
@js.native
trait WebCLProgram extends js.Object {
  def build(): scala.Unit = js.native
  def build(devices: js.Array[WebCLDevice]): scala.Unit = js.native
  def build(devices: js.Array[WebCLDevice], options: java.lang.String): scala.Unit = js.native
  def build(devices: js.Array[WebCLDevice], options: java.lang.String, whenFinished: WebCLCallback): scala.Unit = js.native
  def createKernel(kernelName: java.lang.String): WebCLKernel = js.native
  def createKernelsInProgram(): js.Array[WebCLKernel] = js.native
  def getBuildInfo(device: WebCLDevice, name: ProgramBuildInfo): js.Any = js.native
  def getInfo(name: ProgramInfo): js.Any = js.native
  def release(): scala.Unit = js.native
}

