package typings
package subscriptionsDashTransportDashWsLib.distClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Observer[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
}

