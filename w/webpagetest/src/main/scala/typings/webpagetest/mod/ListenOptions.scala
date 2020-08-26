package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenOptions extends js.Object {
  /** public x509 certificate file path to use for SSL */
  var cert: js.UndefOr[String] = js.native
  /** private key file path to use for SSL */
  var key: js.UndefOr[String] = js.native
}

object ListenOptions {
  @scala.inline
  def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  @scala.inline
  implicit class ListenOptionsOps[Self <: ListenOptions] (val x: Self) extends AnyVal {
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
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

