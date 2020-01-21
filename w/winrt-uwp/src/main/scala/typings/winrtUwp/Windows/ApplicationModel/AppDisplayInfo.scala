package typings.winrtUwp.Windows.ApplicationModel

import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an application's name, description, and logo. */
@JSGlobal("Windows.ApplicationModel.AppDisplayInfo")
@js.native
abstract class AppDisplayInfo () extends js.Object {
  /** Gets the application's description. */
  var description: String = js.native
  /** Gets the application's display name. */
  var displayName: String = js.native
  /**
    * Get the application's logo.
    * @param size The size of the rectangle in which the logo must fit.
    * @return The largest logo in your Package.appxmanifest file that will fit in the specified Size.
    */
  def getLogo(size: Size): RandomAccessStreamReference = js.native
}

