package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an error that occurred. */
trait ErrorDetails extends js.Object {
  /** Gets a short description of the error. */
  var description: String
  /** Gets the address to a help page about the error. */
  var helpUri: Uri
  /** Gets a detailed description of the error. */
  var longDescription: String
}

object ErrorDetails {
  @scala.inline
  def apply(description: String, helpUri: Uri, longDescription: String): ErrorDetails = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], helpUri = helpUri.asInstanceOf[js.Any], longDescription = longDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
}

