package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6.1
trait WebCLBuffer extends WebCLMemoryObject {
  def createSubBuffer(memFlags: MemFlagsBits, origin: scala.Double, sizeInBytes: scala.Double): WebCLBuffer
}

object WebCLBuffer {
  @scala.inline
  def apply(
    createSubBuffer: js.Function3[MemFlagsBits, scala.Double, scala.Double, WebCLBuffer],
    getInfo: js.Function1[MemInfo, js.Any],
    release: js.Function0[scala.Unit]
  ): WebCLBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSubBuffer")(createSubBuffer)
    __obj.updateDynamic("getInfo")(getInfo)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[WebCLBuffer]
  }
}

