package typings.uws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPerMessageDeflateOptions extends js.Object {
  var clientMaxWindowBits: js.UndefOr[Double] = js.native
  var clientNoContextTakeover: js.UndefOr[Boolean] = js.native
  var memLevel: js.UndefOr[Double] = js.native
  var serverMaxWindowBits: js.UndefOr[Double] = js.native
  var serverNoContextTakeover: js.UndefOr[Boolean] = js.native
}

object IPerMessageDeflateOptions {
  @scala.inline
  def apply(): IPerMessageDeflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPerMessageDeflateOptions]
  }
  @scala.inline
  implicit class IPerMessageDeflateOptionsOps[Self <: IPerMessageDeflateOptions] (val x: Self) extends AnyVal {
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
    def setMemLevel(value: Double): Self = this.set("memLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemLevel: Self = this.set("memLevel", js.undefined)
    @scala.inline
    def setServerMaxWindowBits(value: Double): Self = this.set("serverMaxWindowBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerMaxWindowBits: Self = this.set("serverMaxWindowBits", js.undefined)
    @scala.inline
    def setServerNoContextTakeover(value: Boolean): Self = this.set("serverNoContextTakeover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerNoContextTakeover: Self = this.set("serverNoContextTakeover", js.undefined)
  }
  
}

