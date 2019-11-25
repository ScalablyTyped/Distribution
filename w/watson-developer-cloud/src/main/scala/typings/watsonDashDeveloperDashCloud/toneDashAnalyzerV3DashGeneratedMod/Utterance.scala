package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Utterance. */
trait Utterance extends js.Object {
  /** An utterance contributed by a user in the conversation that is to be analyzed. The utterance can contain multiple sentences. */
  var text: String
  /** A string that identifies the user who contributed the utterance specified by the `text` parameter. */
  var user: js.UndefOr[String] = js.undefined
}

object Utterance {
  @scala.inline
  def apply(text: String, user: String = null): Utterance = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utterance]
  }
}

