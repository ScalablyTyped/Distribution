package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

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
    if (status != null) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TokenDictStatusResponse]
  }
}

