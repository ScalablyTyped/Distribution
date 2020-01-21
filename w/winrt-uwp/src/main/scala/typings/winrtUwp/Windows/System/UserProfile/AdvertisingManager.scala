package typings.winrtUwp.Windows.System.UserProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a property that lets the caller retrieve the advertising ID, which is an ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. */
@JSGlobal("Windows.System.UserProfile.AdvertisingManager")
@js.native
abstract class AdvertisingManager () extends js.Object

/* static members */
@JSGlobal("Windows.System.UserProfile.AdvertisingManager")
@js.native
object AdvertisingManager extends js.Object {
  /** Retrieves a unique ID used to provide more relevant advertising by understanding which apps are used by the user and how they are used, and to improve quality of service by determining the frequency and effectiveness of ads and to detect fraud and security issues. This ID is per-user, per-device; all of the apps for a single user on a device have the same advertising ID. If the advertising ID feature is turned off, no ID is retrieved. */
  var advertisingId: String = js.native
}

