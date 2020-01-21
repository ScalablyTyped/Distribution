package typings.whyDidYouUpdate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diffs extends js.Object {
  var name: String
  var next: js.Any
  var prev: js.Any
  var `type`: js.Any
}

object Diffs {
  @scala.inline
  def apply(name: String, next: js.Any, prev: js.Any, `type`: js.Any): Diffs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diffs]
  }
}

