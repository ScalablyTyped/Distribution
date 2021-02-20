package typings.urbanairshipCordova

import typings.urbanairshipCordova.UrbanAirshipPlugin.PushEvent
import typings.urbanairshipCordova.UrbanAirshipPlugin.RegistrationEvent
import typings.urbanairshipCordova.urbanairshipCordovaStrings.urbanairshipDotpush
import typings.urbanairshipCordova.urbanairshipCordovaStrings.urbanairshipDotregistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Additional Document Events
@js.native
trait Document extends StObject {
  
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
