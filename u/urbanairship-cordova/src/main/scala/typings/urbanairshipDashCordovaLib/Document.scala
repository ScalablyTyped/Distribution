package typings
package urbanairshipDashCordovaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Additional Document Events
@js.native
trait Document extends js.Object {
  @JSName("addEventListener")
  def addEventListener_urbanairshippush(
    `type`: urbanairshipDashCordovaLib.urbanairshipDashCordovaLibStrings.urbanairshipDOTpush,
    listener: js.Function1[/* ev */ urbanairshipDashCordovaLib.UrbanAirshipPluginNs.PushEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_urbanairshippush(
    `type`: urbanairshipDashCordovaLib.urbanairshipDashCordovaLibStrings.urbanairshipDOTpush,
    listener: js.Function1[/* ev */ urbanairshipDashCordovaLib.UrbanAirshipPluginNs.PushEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_urbanairshipregistration(
    `type`: urbanairshipDashCordovaLib.urbanairshipDashCordovaLibStrings.urbanairshipDOTregistration,
    listener: js.Function1[
      /* ev */ urbanairshipDashCordovaLib.UrbanAirshipPluginNs.RegistrationEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_urbanairshipregistration(
    `type`: urbanairshipDashCordovaLib.urbanairshipDashCordovaLibStrings.urbanairshipDOTregistration,
    listener: js.Function1[
      /* ev */ urbanairshipDashCordovaLib.UrbanAirshipPluginNs.RegistrationEvent, 
      scala.Unit
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

