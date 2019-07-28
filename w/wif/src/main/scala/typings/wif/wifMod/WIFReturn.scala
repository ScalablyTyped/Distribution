package typings.wif.wifMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WIFReturn extends js.Object {
  val compressed: Boolean
  val privateKey: Buffer
  val version: Double
}

object WIFReturn {
  @scala.inline
  def apply(compressed: Boolean, privateKey: Buffer, version: Double): WIFReturn = {
    val __obj = js.Dynamic.literal(compressed = compressed, privateKey = privateKey, version = version)
  
    __obj.asInstanceOf[WIFReturn]
  }
}

