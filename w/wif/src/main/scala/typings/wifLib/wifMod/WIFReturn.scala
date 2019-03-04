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
    val __obj = js.Dynamic.literal(compressed = compressed, privateKey = privateKey, version = version)
  
    __obj.asInstanceOf[WIFReturn]
  }
}

