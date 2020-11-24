package typings.webcl.WEBCL

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//3.4
@js.native
trait WebCLContext extends js.Object {
  
  def createBuffer(memFlags: MemFlagsBits, sizeInBytes: Double): WebCLBuffer = js.native
  def createBuffer(memFlags: MemFlagsBits, sizeInBytes: Double, hostPtr: ArrayBufferView): WebCLBuffer = js.native
  
  def createCommandQueue(device: WebCLDevice): WebCLCommandQueue = js.native
  def createCommandQueue(device: WebCLDevice, properties: CommandQueueProperties): WebCLCommandQueue = js.native
  
  def createImage(memFlags: MemFlagsBits, descriptor: WebCLImageDescriptor): WebCLImage = js.native
  def createImage(memFlags: MemFlagsBits, descriptor: WebCLImageDescriptor, hostPtr: ArrayBufferView): WebCLImage = js.native
  
  def createProgram(source: String): WebCLProgram = js.native
  
  def createSampler(normalizedCoords: Double, addressingMode: AddressingMode, filterMode: FilterMode): WebCLSampler = js.native
  
  def createUserEvent(): WebCLUserEvent = js.native
  
  def getInfo(name: ContextInfo): js.Any = js.native
  
  def getSupportedImageFormats(): js.Array[WebCLImageDescriptor] = js.native
  def getSupportedImageFormats(memFlags: MemFlagsBits): js.Array[WebCLImageDescriptor] = js.native
  
  def release(): Unit = js.native
  
  def releaseAll(): Unit = js.native
}
