package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.9
@js.native
trait WebCLKernel extends js.Object {
  def getArgInfo(index: scala.Double): WebCLKernelArgInfo = js.native
  def getInfo(name: KernelInfo): js.Any = js.native
  def getWorkGroupInfo(device: WebCLDevice, name: KernelWorkGroupInfo): js.Any = js.native
  def release(): scala.Unit = js.native
  def setArg(index: scala.Double, buffer: WebCLBuffer): scala.Unit = js.native
  def setArg(index: scala.Double, image: WebCLImage): scala.Unit = js.native
  def setArg(index: scala.Double, value: stdLib.ArrayBufferView): scala.Unit = js.native
  def setArg(index: scala.Double, value: WebCLSampler): scala.Unit = js.native
}

