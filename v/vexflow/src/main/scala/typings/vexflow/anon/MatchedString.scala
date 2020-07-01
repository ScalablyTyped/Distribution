package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedString extends js.Object {
  var incrementPos: js.UndefOr[scala.Nothing] = js.undefined
  var matchedString: js.UndefOr[scala.Nothing] = js.undefined
  var pos: js.Any
  var success: Boolean
}

object MatchedString {
  @scala.inline
  def apply(pos: js.Any, success: Boolean): MatchedString = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedString]
  }
}

