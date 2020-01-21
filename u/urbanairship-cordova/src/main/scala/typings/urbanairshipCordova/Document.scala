package typings.urbanairshipCordova

import typings.urbanairshipCordova.UrbanAirshipPlugin.PushEvent
import typings.urbanairshipCordova.UrbanAirshipPlugin.RegistrationEvent
import typings.urbanairshipCordova.urbanairshipCordovaStrings.urbanairshipDotpush
import typings.urbanairshipCordova.urbanairshipCordovaStrings.urbanairshipDotregistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Additional Document Events
@js.native
trait Document extends js.Object {
  @JSName("addEventListener")
  def addEventListener_urbanairshippush(`type`: urbanairshipDotpush, listener: js.Function1[/* ev */ PushEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_urbanairshippush(`type`: urbanairshipDotpush, listener: js.Function1[/* ev */ PushEvent, Unit], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_urbanairshipregistration(`type`: urbanairshipDotregistration, listener: js.Function1[/* ev */ RegistrationEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_urbanairshipregistration(
    `type`: urbanairshipDotregistration,
    listener: js.Function1[/* ev */ RegistrationEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
}

