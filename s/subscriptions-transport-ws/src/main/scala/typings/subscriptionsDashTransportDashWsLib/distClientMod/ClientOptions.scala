package typings
package subscriptionsDashTransportDashWsLib.distClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientOptions extends js.Object {
  var connectionCallback: js.UndefOr[
    js.Function2[/* error */ js.Array[nodeLib.Error], /* result */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var connectionParams: js.UndefOr[ConnectionParamsOptions] = js.undefined
  var inactivityTimeout: js.UndefOr[scala.Double] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var reconnect: js.UndefOr[scala.Boolean] = js.undefined
  var reconnectionAttempts: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

