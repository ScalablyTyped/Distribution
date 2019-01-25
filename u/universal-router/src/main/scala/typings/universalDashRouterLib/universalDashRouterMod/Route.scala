package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[C /* <: Context */, R] extends js.Object {
  var action: js.UndefOr[
    js.Function2[
      /* context */ (RouteContext[C, R]) with C, 
      /* params */ Params, 
      R | js.Promise[R] | scala.Unit
    ]
  ] = js.undefined
  var children: js.UndefOr[(Routes[C, R]) | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[(Route[_, _]) | scala.Null] = js.undefined
  var path: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
}

