package typings
package vueDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset
  extends vueDashRouterLib.typesRouterMod._PositionResult {
  var offset: js.UndefOr[vueDashRouterLib.typesRouterMod.Position] = js.undefined
  var selector: java.lang.String
}

object Anon_Offset {
  @scala.inline
  def apply(selector: java.lang.String, offset: vueDashRouterLib.typesRouterMod.Position = null): Anon_Offset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selector")(selector)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Anon_Offset]
  }
}

