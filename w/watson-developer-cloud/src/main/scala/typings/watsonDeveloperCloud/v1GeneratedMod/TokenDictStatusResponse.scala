package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object describing the current status of the wordlist. */
trait TokenDictStatusResponse extends js.Object {
  /** Current wordlist status for the specified collection. */
  var status: js.UndefOr[String] = js.undefined
  /** The type for this wordlist. Can be `tokenization_dictionary` or `stopwords`. */
  var `type`: js.UndefOr[String] = js.undefined
}

object TokenDictStatusResponse {
  @scala.inline
  def apply(status: String = null, `type`: String = null): TokenDictStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDictStatusResponse]
  }
}

