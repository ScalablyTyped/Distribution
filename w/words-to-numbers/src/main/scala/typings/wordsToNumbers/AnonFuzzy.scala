package typings.wordsToNumbers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFuzzy extends js.Object {
  var fuzzy: Boolean
}

object AnonFuzzy {
  @scala.inline
  def apply(fuzzy: Boolean): AnonFuzzy = {
    val __obj = js.Dynamic.literal(fuzzy = fuzzy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFuzzy]
  }
}

