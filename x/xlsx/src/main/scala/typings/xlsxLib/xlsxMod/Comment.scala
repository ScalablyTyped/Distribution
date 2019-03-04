package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** Author of the comment block */
  var a: js.UndefOr[java.lang.String] = js.undefined
  /** Plaintext of the comment */
  var t: java.lang.String
}

object Comment {
  @scala.inline
  def apply(t: java.lang.String, a: java.lang.String = null): Comment = {
    val __obj = js.Dynamic.literal(t = t)
    if (a != null) __obj.updateDynamic("a")(a)
    __obj.asInstanceOf[Comment]
  }
}

