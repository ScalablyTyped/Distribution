package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an application's name, description, and logo. */
@JSGlobal("Windows.ApplicationModel.AppDisplayInfo")
@js.native
abstract class AppDisplayInfo () extends js.Object {
  /** Gets the application's description. */
  var description: java.lang.String = js.native
  /** Gets the application's display name. */
  var displayName: java.lang.String = js.native
  /**
               * Get the application's logo.
               * @param size The size of the rectangle in which the logo must fit.
               * @return The largest logo in your Package.appxmanifest file that will fit in the specified Size.
               */
  def getLogo(size: winrtDashUwpLib.WindowsNs.FoundationNs.Size): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference = js.native
}

