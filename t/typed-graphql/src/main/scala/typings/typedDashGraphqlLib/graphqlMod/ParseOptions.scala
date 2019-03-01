package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/parser.js
trait ParseOptions extends js.Object {
  var noLocation: js.UndefOr[scala.Boolean] = js.undefined
  var noSource: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    noLocation: js.UndefOr[scala.Boolean] = js.undefined,
    noSource: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noLocation)) __obj.updateDynamic("noLocation")(noLocation)
    if (!js.isUndefined(noSource)) __obj.updateDynamic("noSource")(noSource)
    __obj.asInstanceOf[ParseOptions]
  }
}

