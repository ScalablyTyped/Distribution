package typings.wif.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WIFReturn extends js.Object {
  val compressed: Boolean = js.native
  val privateKey: Buffer = js.native
  val version: Double = js.native
}

object WIFReturn {
  @scala.inline
  def apply(compressed: Boolean, privateKey: Buffer, version: Double): WIFReturn = {
    val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WIFReturn]
  }
  @scala.inline
  implicit class WIFReturnOps[Self <: WIFReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompressed(value: Boolean): Self = this.set("compressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKey(value: Buffer): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

