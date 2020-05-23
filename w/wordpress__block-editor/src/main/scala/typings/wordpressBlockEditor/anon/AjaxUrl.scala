package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxUrl extends js.Object {
  var ajaxUrl: String
  var nonce: String
  var unlockNonce: String
}

object AjaxUrl {
  @scala.inline
  def apply(ajaxUrl: String, nonce: String, unlockNonce: String): AjaxUrl = {
    val __obj = js.Dynamic.literal(ajaxUrl = ajaxUrl.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], unlockNonce = unlockNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxUrl]
  }
}

