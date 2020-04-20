package typings.tabrisPluginFirebase.mod._Global_.firebase

import org.scalablytyped.runtime.TopLevel
import typings.tabris.mod.PropertyChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagingEvents extends js.Object {
  var instanceIdChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Messaging, String], Unit]] = js.undefined
  var message: js.UndefOr[js.Function1[/* event */ MessageEvent, Unit]] = js.undefined
  var tokenChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Messaging, String], Unit]] = js.undefined
}

@JSGlobal("firebase.MessagingEvents")
@js.native
object MessagingEvents extends TopLevel[MessagingEvents]

