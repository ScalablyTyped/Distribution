package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IEventController extends js.Object {
  var onStartListening: js.UndefOr[
    js.Function2[/* events */ IEventManager, /* type */ java.lang.String, scala.Unit]
  ] = js.undefined
  var onStopListening: js.UndefOr[
    js.Function2[/* events */ IEventManager, /* type */ java.lang.String, scala.Unit]
  ] = js.undefined
}

