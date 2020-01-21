package typings.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Context = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ErrorHandler[C /* <: typings.universalRouter.mod.Context */, R] = js.Function2[
    /* error */ typings.std.Error with typings.universalRouter.AnonStatus, 
    /* context */ C with (typings.universalRouter.mod.RouteContext[C, R]), 
    typings.universalRouter.mod.Result[R]
  ]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResolveRoute[C /* <: typings.universalRouter.mod.Context */, R] = js.Function2[
    /* context */ C with (typings.universalRouter.mod.RouteContext[C, R]), 
    /* params */ typings.universalRouter.mod.QueryParams, 
    typings.universalRouter.mod.Result[R]
  ]
  type Result[T] = T | (js.Promise[T | scala.Unit]) | scala.Unit
  type Routes[C /* <: typings.universalRouter.mod.Context */, R] = js.Array[typings.universalRouter.mod.Route[C, R]]
}
