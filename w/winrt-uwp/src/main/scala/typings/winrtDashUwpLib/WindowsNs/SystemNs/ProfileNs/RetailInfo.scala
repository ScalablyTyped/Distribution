package typings
package winrtDashUwpLib.WindowsNs.SystemNs.ProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A utility class that supports one method, IsDemoModeEnabled , and one property, Properties . Call IsDemoModeEnabled to determine whether the device where the app is running has specifically enabled its retail demo mode. */
@JSGlobal("Windows.System.Profile.RetailInfo")
@js.native
abstract class RetailInfo () extends js.Object

/* static members */
@JSGlobal("Windows.System.Profile.RetailInfo")
@js.native
object RetailInfo extends js.Object {
  /** Determines whether the device where the app is running has specifically enabled its retail demo mode. */
  var isDemoModeEnabled: scala.Boolean = js.native
  /** Gets an object that represents the set of available retail demo properties and their values. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
}

