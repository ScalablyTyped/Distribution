package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/parser.js
trait ParseOptions extends js.Object {
  var noLocation: js.UndefOr[Boolean] = js.undefined
  var noSource: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(noLocation: js.UndefOr[Boolean] = js.undefined, noSource: js.UndefOr[Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noLocation)) __obj.updateDynamic("noLocation")(noLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(noSource)) __obj.updateDynamic("noSource")(noSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

