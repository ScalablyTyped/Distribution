package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//3.4
@js.native
trait WebCLContext extends js.Object {
  def createBuffer(memFlags: MemFlagsBits, sizeInBytes: scala.Double): WebCLBuffer = js.native
  def createBuffer(memFlags: MemFlagsBits, sizeInBytes: scala.Double, hostPtr: stdLib.ArrayBufferView): WebCLBuffer = js.native
  def createCommandQueue(device: WebCLDevice): WebCLCommandQueue = js.native
  def createCommandQueue(device: WebCLDevice, properties: CommandQueueProperties): WebCLCommandQueue = js.native
  def createImage(memFlags: MemFlagsBits, descriptor: WebCLImageDescriptor): WebCLImage = js.native
  def createImage(memFlags: MemFlagsBits, descriptor: WebCLImageDescriptor, hostPtr: stdLib.ArrayBufferView): WebCLImage = js.native
  def createProgram(source: java.lang.String): WebCLProgram = js.native
  def createSampler(normalizedCoords: scala.Double, addressingMode: AddressingMode, filterMode: FilterMode): WebCLSampler = js.native
  def createUserEvent(): WebCLUserEvent = js.native
  def getInfo(name: ContextInfo): js.Any = js.native
  def getSupportedImageFormats(): js.Array[WebCLImageDescriptor] = js.native
  def getSupportedImageFormats(memFlags: MemFlagsBits): js.Array[WebCLImageDescriptor] = js.native
  def release(): scala.Unit = js.native
  def releaseAll(): scala.Unit = js.native
}

