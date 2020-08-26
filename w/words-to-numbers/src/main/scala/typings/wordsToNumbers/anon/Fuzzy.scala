package typings.wordsToNumbers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fuzzy extends js.Object {
  var fuzzy: Boolean = js.native
}

object Fuzzy {
  @scala.inline
  def apply(fuzzy: Boolean): Fuzzy = {
    val __obj = js.Dynamic.literal(fuzzy = fuzzy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fuzzy]
  }
  @scala.inline
  implicit class FuzzyOps[Self <: Fuzzy] (val x: Self) extends AnyVal {
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
    def setFuzzy(value: Boolean): Self = this.set("fuzzy", value.asInstanceOf[js.Any])
  }
  
}

