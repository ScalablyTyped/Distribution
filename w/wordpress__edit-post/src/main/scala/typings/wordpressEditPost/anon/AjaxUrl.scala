package typings.wordpressEditPost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxUrl extends js.Object {
  var ajaxUrl: String = js.native
  var nonce: String = js.native
  var unlockNonce: String = js.native
}

object AjaxUrl {
  @scala.inline
  def apply(ajaxUrl: String, nonce: String, unlockNonce: String): AjaxUrl = {
    val __obj = js.Dynamic.literal(ajaxUrl = ajaxUrl.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], unlockNonce = unlockNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxUrl]
  }
  @scala.inline
  implicit class AjaxUrlOps[Self <: AjaxUrl] (val x: Self) extends AnyVal {
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
    def setAjaxUrl(value: String): Self = this.set("ajaxUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnlockNonce(value: String): Self = this.set("unlockNonce", value.asInstanceOf[js.Any])
  }
  
}

