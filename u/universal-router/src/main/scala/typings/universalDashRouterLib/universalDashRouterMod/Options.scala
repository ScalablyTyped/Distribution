package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[C /* <: Context */, R] extends js.Object {
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[C] = js.undefined
  var errorHandler: js.UndefOr[
    js.Function2[
      /* error */ stdLib.Error with universalDashRouterLib.Anon_Status, 
      /* context */ C with (RouteContext[C, R]), 
      _
    ]
  ] = js.undefined
  var resolveRoute: js.UndefOr[js.Function2[/* context */ C with (RouteContext[C, R]), /* params */ Params, _]] = js.undefined
}

