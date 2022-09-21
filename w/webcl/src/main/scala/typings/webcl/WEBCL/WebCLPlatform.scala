package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.2
@js.native
trait WebCLPlatform extends StObject {
  
  def enableExtension(extensionName: String): Boolean = js.native
  
  def getDevices(): js.Array[WebCLDevice] = js.native
  def getDevices(deviceType: DeviceTypeBits): js.Array[WebCLDevice] = js.native
  
  def getInfo(name: PlatformInfo): Any = js.native
  
  def getSupportedExtensions(): js.Array[String] = js.native
}
