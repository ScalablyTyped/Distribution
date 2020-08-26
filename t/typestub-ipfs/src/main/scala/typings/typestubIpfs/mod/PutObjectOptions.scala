package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectOptions extends js.Object {
  var enc: js.UndefOr[js.Any] = js.native
}

object PutObjectOptions {
  @scala.inline
  def apply(): PutObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectOptions]
  }
  @scala.inline
  implicit class PutObjectOptionsOps[Self <: PutObjectOptions] (val x: Self) extends AnyVal {
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
    def setEnc(value: js.Any): Self = this.set("enc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnc: Self = this.set("enc", js.undefined)
  }
  
}

