package typings.subscriptionsDashTransportDashWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distClientMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error
  import typings.subscriptionsDashTransportDashWs.Anon_OriginalError

  type ConnectionParams = StringDictionary[js.Any]
  type ConnectionParamsOptions = ConnectionParams | js.Function | js.Promise[ConnectionParams]
  type FormatedError = Error with Anon_OriginalError
  type Operations = StringDictionary[Operation]
}
