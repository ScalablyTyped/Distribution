package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object describing the current status of the wordlist. */
@js.native
trait TokenDictStatusResponse extends js.Object {
  /** Current wordlist status for the specified collection. */
  var status: js.UndefOr[String] = js.native
  /** The type for this wordlist. Can be `tokenization_dictionary` or `stopwords`. */
  var `type`: js.UndefOr[String] = js.native
}

object TokenDictStatusResponse {
  @scala.inline
  def apply(): TokenDictStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenDictStatusResponse]
  }
  @scala.inline
  implicit class TokenDictStatusResponseOps[Self <: TokenDictStatusResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

