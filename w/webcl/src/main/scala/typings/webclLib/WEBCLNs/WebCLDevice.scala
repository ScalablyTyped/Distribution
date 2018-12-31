package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.3
trait WebCLDevice extends js.Object {
  def enableExtension(extensionName: java.lang.String): scala.Boolean
  def getInfo(name: DeviceInfo): js.Any
  def getSupportedExtensions(): js.Array[java.lang.String]
}

