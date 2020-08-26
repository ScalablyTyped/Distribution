package typings.ws.mod

import typings.node.zlibMod.ZlibOptions
import typings.ws.anon.ChunkSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerMessageDeflateOptions extends js.Object {
  var clientMaxWindowBits: js.UndefOr[Double] = js.native
  var clientNoContextTakeover: js.UndefOr[Boolean] = js.native
  var concurrencyLimit: js.UndefOr[Double] = js.native
  var serverMaxWindowBits: js.UndefOr[Double] = js.native
  var serverNoContextTakeover: js.UndefOr[Boolean] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var zlibDeflateOptions: js.UndefOr[ChunkSize] = js.native
  var zlibInflateOptions: js.UndefOr[ZlibOptions] = js.native
}

object PerMessageDeflateOptions {
  @scala.inline
  def apply(): PerMessageDeflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerMessageDeflateOptions]
  }
  @scala.inline
  implicit class PerMessageDeflateOptionsOps[Self <: PerMessageDeflateOptions] (val x: Self) extends AnyVal {
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
    def setClientMaxWindowBits(value: Double): Self = this.set("clientMaxWindowBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientMaxWindowBits: Self = this.set("clientMaxWindowBits", js.undefined)
    @scala.inline
    def setClientNoContextTakeover(value: Boolean): Self = this.set("clientNoContextTakeover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientNoContextTakeover: Self = this.set("clientNoContextTakeover", js.undefined)
    @scala.inline
    def setConcurrencyLimit(value: Double): Self = this.set("concurrencyLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrencyLimit: Self = this.set("concurrencyLimit", js.undefined)
    @scala.inline
    def setServerMaxWindowBits(value: Double): Self = this.set("serverMaxWindowBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerMaxWindowBits: Self = this.set("serverMaxWindowBits", js.undefined)
    @scala.inline
    def setServerNoContextTakeover(value: Boolean): Self = this.set("serverNoContextTakeover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerNoContextTakeover: Self = this.set("serverNoContextTakeover", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setZlibDeflateOptions(value: ChunkSize): Self = this.set("zlibDeflateOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZlibDeflateOptions: Self = this.set("zlibDeflateOptions", js.undefined)
    @scala.inline
    def setZlibInflateOptions(value: ZlibOptions): Self = this.set("zlibInflateOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZlibInflateOptions: Self = this.set("zlibInflateOptions", js.undefined)
  }
  
}

