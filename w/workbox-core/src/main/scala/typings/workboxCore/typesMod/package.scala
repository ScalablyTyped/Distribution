package typings.workboxCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CacheDidUpdateCallback = js.Function1[/* param */ CacheDidUpdateCallbackParam, js.Promise[js.UndefOr[Unit | Null]]]

type CacheKeyWillBeUsedCallback = js.Function1[/* param */ CacheKeyWillBeUsedCallbackParam, js.Promise[Request | String]]

type CacheWillUpdateCallback = js.Function1[
/* param */ CacheWillUpdateCallbackParam, 
js.Promise[js.UndefOr[Response | Unit | Null]]]

type CachedResponseWillBeUsedCallback = js.Function1[
/* param */ CachedResponseWillBeUsedCallbackParam, 
js.Promise[js.UndefOr[Response | Unit | Null]]]

type FetchDidFailCallback = js.Function1[/* param */ FetchDidFailCallbackParam, js.Promise[js.UndefOr[Unit | Null]]]

type FetchDidSucceedCallback = js.Function1[/* param */ FetchDidSucceedCallbackParam, js.Promise[Response]]

type HandlerDidCompleteCallback = js.Function1[/* param */ HandlerDidCompleteCallbackParam, js.Promise[js.UndefOr[Unit | Null]]]

type HandlerDidErrorCallback = js.Function1[/* param */ HandlerDidErrorCallbackParam, js.Promise[js.UndefOr[Response]]]

type HandlerDidRespondCallback = js.Function1[/* param */ HandlerDidRespondCallbackParam, js.Promise[js.UndefOr[Unit | Null]]]

type HandlerWillRespondCallback = js.Function1[/* param */ HandlerWillRespondCallbackParam, js.Promise[Response]]

type HandlerWillStartCallback = js.Function1[/* param */ HandlerWillStartCallbackParam, js.Promise[js.UndefOr[Unit | Null]]]

type ManualHandlerCallback = js.Function1[/* options */ ManualHandlerCallbackOptions, js.Promise[Response]]

type MapLikeObject = StringDictionary[Any]

type PluginState = MapLikeObject

type RequestWillFetchCallback = js.Function1[/* param */ RequestWillFetchCallbackParam, js.Promise[Request]]

type RouteHandler = RouteHandlerCallback | RouteHandlerObject

type RouteHandlerCallback = js.Function1[/* options */ RouteHandlerCallbackOptions, js.Promise[Response]]

type RouteMatchCallback = js.Function1[/* options */ RouteMatchCallbackOptions, Any]
