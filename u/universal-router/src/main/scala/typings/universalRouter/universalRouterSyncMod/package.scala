package typings.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object universalRouterSyncMod {
  type Context = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ErrorHandler[C /* <: typings.universalRouter.universalRouterSyncMod.Context */, R] = js.Function2[
    /* error */ typings.std.Error with typings.universalRouter.AnonStatus, 
    /* context */ C with (typings.universalRouter.universalRouterSyncMod.RouteContext[C, R]), 
    typings.universalRouter.universalRouterSyncMod.Result[R]
  ]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResolveRoute[C /* <: typings.universalRouter.universalRouterSyncMod.Context */, R] = js.Function2[
    /* context */ C with (typings.universalRouter.universalRouterSyncMod.RouteContext[C, R]), 
    /* params */ typings.universalRouter.universalRouterSyncMod.QueryParams, 
    typings.universalRouter.universalRouterSyncMod.Result[R]
  ]
  type Result[T] = T | scala.Unit
  type Routes[C /* <: typings.universalRouter.universalRouterSyncMod.Context */, R] = js.Array[typings.universalRouter.universalRouterSyncMod.Route[C, R]]
}
