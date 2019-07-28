package typings.wampy

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wampyMod {
  type Callback = js.Function0[Unit]
  type ChallengeCallback = js.Function2[/* auth_method */ String, /* extra */ Dict, String]
  type Dict = StringDictionary[js.Any]
  type ErrorCallback = js.Function1[/* args */ ErrorArgs, Unit]
  type EventCallback = js.Function1[/* args */ DataArgs, Unit]
  type Payload = Args | Dict | String | Double | Boolean | js.Array[js.Any] | Null
  type RPCCallback = js.Function1[/* args */ DataArgs, RPCResult | Unit]
  type SuccessCallback = js.Function1[/* args */ DataArgs, Unit]
  type UnsubscibeCallbacksHash = SubscribeCallbacksHash
}
