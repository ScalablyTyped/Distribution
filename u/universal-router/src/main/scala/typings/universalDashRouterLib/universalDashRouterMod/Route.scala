package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[C /* <: Context */, R] extends js.Object {
  /**
    * action method should return anything except `null` or `undefined` to be resolved by router
    * otherwise router will throw `Page not found` error if all matched routes returned nothing
    */
  var action: js.UndefOr[
    js.Function2[
      /* context */ (ActionContext[C, R]) with C, 
      /* params */ Params, 
      R | js.Promise[R] | scala.Unit
    ]
  ] = js.undefined
  /**
    * array of route objects
    */
  var children: js.UndefOr[(Routes[C, R]) | scala.Null] = js.undefined
  /**
    * unique string
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * automatically filled by the router
    */
  var parent: js.UndefOr[(Route[_, _]) | scala.Null] = js.undefined
  var path: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
}

