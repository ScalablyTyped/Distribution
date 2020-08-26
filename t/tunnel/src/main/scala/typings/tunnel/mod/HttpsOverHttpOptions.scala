package typings.tunnel.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpsOverHttpOptions extends HttpOptions {
  var ca: js.UndefOr[js.Array[Buffer]] = js.native
  var cert: js.UndefOr[Buffer] = js.native
  var key: js.UndefOr[Buffer] = js.native
}

object HttpsOverHttpOptions {
  @scala.inline
  def apply(): HttpsOverHttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpsOverHttpOptions]
  }
  @scala.inline
  implicit class HttpsOverHttpOptionsOps[Self <: HttpsOverHttpOptions] (val x: Self) extends AnyVal {
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
    def setCaVarargs(value: Buffer*): Self = this.set("ca", js.Array(value :_*))
    @scala.inline
    def setCa(value: js.Array[Buffer]): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCert(value: Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setKey(value: Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

