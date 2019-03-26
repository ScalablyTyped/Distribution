package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wampyNs {
  type Callback = js.Function0[scala.Unit]
  type ChallengeCallback = js.Function2[/* auth_method */ java.lang.String, /* extra */ Dict, java.lang.String]
  type ErrorCallback = js.Function1[/* args */ ErrorArgs, scala.Unit]
  type EventCallback = js.Function1[/* args */ DataArgs, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - Args
    - Dict
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Array[js.Any]
    - scala.Null
  */
  type Payload = _Payload | js.Array[js.Any] | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type RPCCallback = js.Function1[/* args */ DataArgs, RPCResult | scala.Unit]
  type SuccessCallback = js.Function1[/* args */ DataArgs, scala.Unit]
  type UnsubscibeCallbacksHash = SubscribeCallbacksHash
}
