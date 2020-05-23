package typings.winrtUwp.Windows.ApplicationModel

import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an application's name, description, and logo. */
trait AppDisplayInfo extends js.Object {
  /** Gets the application's description. */
  var description: String
  /** Gets the application's display name. */
  var displayName: String
  /**
    * Get the application's logo.
    * @param size The size of the rectangle in which the logo must fit.
    * @return The largest logo in your Package.appxmanifest file that will fit in the specified Size.
    */
  def getLogo(size: Size): RandomAccessStreamReference
}

object AppDisplayInfo {
  @scala.inline
  def apply(description: String, displayName: String, getLogo: Size => RandomAccessStreamReference): AppDisplayInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getLogo = js.Any.fromFunction1(getLogo))
    __obj.asInstanceOf[AppDisplayInfo]
  }
}

