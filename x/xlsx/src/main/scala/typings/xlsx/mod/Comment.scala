package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** Author of the comment block */
  var a: js.UndefOr[String] = js.undefined
  /** Plaintext of the comment */
  var t: String
}

object Comment {
  @scala.inline
  def apply(t: String, a: String = null): Comment = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

