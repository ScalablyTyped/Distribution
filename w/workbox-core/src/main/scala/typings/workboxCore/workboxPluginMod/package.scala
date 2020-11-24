package typings.workboxCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object workboxPluginMod {
  
  type CacheDidUpdateCallback = js.Function1[
    /* param */ typings.workboxCore.workboxPluginMod.CacheDidUpdateCallbackParam, 
    js.Promise[scala.Unit]
  ]
  
  type CacheKeyWillBeUsedCallback = js.Function1[
    /* param */ typings.workboxCore.workboxPluginMod.CacheKeyWillBeUsedCallbackParam, 
    js.Promise[typings.std.Request | java.lang.String]
  ]
  
  type CacheWillUpdateCallback = js.Function1[
    /* param */ typings.workboxCore.workboxPluginMod.CacheWillUpdateCallbackParamParam, 
    js.Promise[js.UndefOr[typings.std.Response]]
  ]
  
  type CachedResponseWillBeUsedCallback = js.Function1[
    /* param */ typings.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam, 
    js.Promise[js.UndefOr[typings.std.Response]]
  ]
  
  type FetchDidFailCallback = js.Function1[
    /* param */ typings.workboxCore.workboxPluginMod.FetchDidFailCallbackParam, 
    js.Promise[scala.Unit]
  ]
  
  type FetchDidSucceedCallback = js.Function1[
    /* param */ typings.workboxCore.workboxPluginMod.FetchDidSucceedCallbackParam, 
    js.Promise[typings.std.Response]
  ]
  
  type RequestWillFetchCallback = js.Function1[
    /* param */ typings.workboxCore.workboxPluginMod.RequestWillFetchCallbackParam, 
    js.Promise[js.UndefOr[typings.std.Request]]
  ]
}
