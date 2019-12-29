package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebCL extends js.Object {
  def createContext(): WebCLContext = js.native
  def createContext(deviceType: DeviceTypeBits): WebCLContext = js.native
  def createContext(devices: js.Array[WebCLDevice]): WebCLContext = js.native
  def createContext(device: WebCLDevice): WebCLContext = js.native
  def createContext(platform: WebCLPlatform): WebCLContext = js.native
  def createContext(platform: WebCLPlatform, deviceType: DeviceTypeBits): WebCLContext = js.native
  def enableExtension(extensionName: String): Boolean = js.native
  def getPlatforms(): js.Array[WebCLPlatform] = js.native
  def getSupportedExtensions(): js.Array[String] = js.native
  def releaseAll(): Unit = js.native
  def waitForEvents(eventWaitList: js.Array[WebCLEvent]): Unit = js.native
  def waitForEvents(eventWaitList: js.Array[WebCLEvent], whenFinished: WebCLCallback): Unit = js.native
}

