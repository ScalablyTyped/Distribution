package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoClosingPairs extends js.Object {
  var autoClosingPairs: js.Array[NotIn] = js.native
}

object AutoClosingPairs {
  @scala.inline
  def apply(autoClosingPairs: js.Array[NotIn]): AutoClosingPairs = {
    val __obj = js.Dynamic.literal(autoClosingPairs = autoClosingPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoClosingPairs]
  }
  @scala.inline
  implicit class AutoClosingPairsOps[Self <: AutoClosingPairs] (val x: Self) extends AnyVal {
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
    def setAutoClosingPairsVarargs(value: NotIn*): Self = this.set("autoClosingPairs", js.Array(value :_*))
    @scala.inline
    def setAutoClosingPairs(value: js.Array[NotIn]): Self = this.set("autoClosingPairs", value.asInstanceOf[js.Any])
  }
  
}

