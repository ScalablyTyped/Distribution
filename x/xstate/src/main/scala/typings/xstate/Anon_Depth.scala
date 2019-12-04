package typings.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Depth extends js.Object {
  var depth: Null | Double
}

object Anon_Depth {
  @scala.inline
  def apply(depth: Int | Double = null): Anon_Depth = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Depth]
  }
}

