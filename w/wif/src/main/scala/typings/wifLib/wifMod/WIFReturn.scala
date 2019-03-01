package typings
package wifLib.wifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WIFReturn extends js.Object {
  val compressed: scala.Boolean
  val privateKey: nodeLib.Buffer
  val version: scala.Double
}

object WIFReturn {
  @scala.inline
  def apply(compressed: scala.Boolean, privateKey: nodeLib.Buffer, version: scala.Double): WIFReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compressed")(compressed)
    __obj.updateDynamic("privateKey")(privateKey)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WIFReturn]
  }
}

