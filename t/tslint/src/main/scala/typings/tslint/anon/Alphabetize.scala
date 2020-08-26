package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alphabetize extends js.Object {
  var alphabetize: Boolean = js.native
  var order: String = js.native
}

object Alphabetize {
  @scala.inline
  def apply(alphabetize: Boolean, order: String): Alphabetize = {
    val __obj = js.Dynamic.literal(alphabetize = alphabetize.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alphabetize]
  }
  @scala.inline
  implicit class AlphabetizeOps[Self <: Alphabetize] (val x: Self) extends AnyVal {
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
    def setAlphabetize(value: Boolean): Self = this.set("alphabetize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
  }
  
}

