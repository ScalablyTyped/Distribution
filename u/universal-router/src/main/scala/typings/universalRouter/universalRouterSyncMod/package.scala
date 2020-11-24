package typings.universalRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object universalRouterSyncMod {
  
  type ErrorHandler[R] = js.Function2[
    /* error */ typings.universalRouter.universalRouterSyncMod.RouteError, 
    /* context */ typings.universalRouter.universalRouterSyncMod.ResolveContext, 
    typings.universalRouter.universalRouterSyncMod.RouteResultSync[R]
  ]
  
  type ResolveRoute[R, C /* <: typings.universalRouter.universalRouterSyncMod.RouterContext */] = js.Function2[
    /* context */ typings.universalRouter.universalRouterSyncMod.RouteContext[R, C], 
    /* params */ typings.universalRouter.universalRouterSyncMod.RouteParams, 
    typings.universalRouter.universalRouterSyncMod.RouteResultSync[R]
  ]
  
  type RouteParams = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  
  type RouteResultSync[T] = js.UndefOr[T | scala.Null]
  
  type RouterContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Routes[R, C /* <: typings.universalRouter.universalRouterSyncMod.RouterContext */] = js.Array[typings.universalRouter.universalRouterSyncMod.Route[R, C]]
}
