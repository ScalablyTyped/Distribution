package typings.wampy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function0[scala.Unit]
  
  type ChallengeCallback = js.Function2[
    /* auth_method */ java.lang.String, 
    /* extra */ typings.wampy.mod.Dict, 
    java.lang.String
  ]
  
  type Dict = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ErrorCallback = js.Function1[/* args */ typings.wampy.mod.ErrorArgs, scala.Unit]
  
  type EventCallback = js.Function1[/* args */ typings.wampy.mod.DataArgs, scala.Unit]
  
  type Payload = typings.wampy.mod.Args | typings.wampy.mod.Dict | java.lang.String | scala.Double | scala.Boolean | js.Array[js.Any] | scala.Null
  
  type RPCCallback = js.Function1[/* args */ typings.wampy.mod.DataArgs, typings.wampy.mod.RPCResult | scala.Unit]
  
  type SuccessCallback = js.Function1[/* args */ typings.wampy.mod.DataArgs, scala.Unit]
  
  type UnsubscibeCallbacksHash = typings.wampy.mod.SubscribeCallbacksHash
}
