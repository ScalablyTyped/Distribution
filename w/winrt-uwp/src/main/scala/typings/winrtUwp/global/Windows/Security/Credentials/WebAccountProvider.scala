package typings.winrtUwp.global.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a web account authentication provider. */
@JSGlobal("Windows.Security.Credentials.WebAccountProvider")
@js.native
class WebAccountProvider protected ()
  extends typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider {
  /**
    * Creates an instance of the WebAccountProvider class.
    * @param id The web account provider id.
    * @param displayName The display name for the web account provider.
    * @param iconUri The Uri of the icon image to display for the web account provider.
    */
  def this(id: String, displayName: String, iconUri: Uri) = this()
}

