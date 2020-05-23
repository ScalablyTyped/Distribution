package typings.wordsToNumbers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fuzzy extends js.Object {
  var fuzzy: Boolean
}

object Fuzzy {
  @scala.inline
  def apply(fuzzy: Boolean): Fuzzy = {
    val __obj = js.Dynamic.literal(fuzzy = fuzzy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fuzzy]
  }
}

