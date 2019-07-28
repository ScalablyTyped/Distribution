package typings.vueDashRouter

import typings.vueDashRouter.typesRouterMod.Position
import typings.vueDashRouter.typesRouterMod._PositionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends _PositionResult {
  var offset: js.UndefOr[Position] = js.undefined
  var selector: String
}

object Anon_Offset {
  @scala.inline
  def apply(selector: String, offset: Position = null): Anon_Offset = {
    val __obj = js.Dynamic.literal(selector = selector)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Anon_Offset]
  }
}

