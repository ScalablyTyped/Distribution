package typings
package universalDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object universalDashRouterMod {
  type Context = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ErrorHandler[C /* <: Context */, R] = js.Function2[
    /* error */ stdLib.Error with universalDashRouterLib.Anon_Status, 
    /* context */ C with (RouteContext[C, R]), 
    Result[R]
  ]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResolveRoute[C /* <: Context */, R] = js.Function2[/* context */ C with (RouteContext[C, R]), /* params */ QueryParams, Result[R]]
  type Result[T] = T | (js.Promise[T | scala.Unit]) | scala.Unit
  type Routes[C /* <: Context */, R] = js.Array[Route[C, R]]
}
