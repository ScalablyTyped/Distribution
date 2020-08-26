package typings.victory.anon

import typings.victory.mod._CategoryPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YArray extends _CategoryPropType {
  var y: js.Array[String] = js.native
}

object YArray {
  @scala.inline
  def apply(y: js.Array[String]): YArray = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[YArray]
  }
  @scala.inline
  implicit class YArrayOps[Self <: YArray] (val x: Self) extends AnyVal {
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
    def setYVarargs(value: String*): Self = this.set("y", js.Array(value :_*))
    @scala.inline
    def setY(value: js.Array[String]): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

