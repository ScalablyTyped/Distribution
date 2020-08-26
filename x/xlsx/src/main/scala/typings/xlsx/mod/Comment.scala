package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /** Author of the comment block */
  var a: js.UndefOr[String] = js.native
  /** Plaintext of the comment */
  var t: String = js.native
}

object Comment {
  @scala.inline
  def apply(t: String): Comment = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def setT(value: String): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def setA(value: String): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
  }
  
}

