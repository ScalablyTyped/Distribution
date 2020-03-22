package typings.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorHandler[R] = js.Function2[
    /* error */ typings.universalRouter.mod.RouteError, 
    /* context */ typings.universalRouter.mod.ResolveContext, 
    typings.universalRouter.mod.RouteResult[R]
  ]
  type ResolveRoute[R, C /* <: typings.universalRouter.mod.RouterContext */] = js.Function2[
    /* context */ typings.universalRouter.mod.RouteContext[R, C], 
    /* params */ typings.universalRouter.mod.RouteParams, 
    typings.universalRouter.mod.RouteResult[R]
  ]
  type RouteParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type RouteResult[T] = js.UndefOr[T | scala.Null | (js.Promise[js.UndefOr[T | scala.Null]])]
  type RouterContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Routes[R, C /* <: typings.universalRouter.mod.RouterContext */] = js.Array[typings.universalRouter.mod.Route[R, C]]
}
