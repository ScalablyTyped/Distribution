package typings.winrtUwp.Windows.Media.Casting

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the media content that can be sent to another device. */
trait CastingSource extends js.Object {
  /** Gets or sets an alternative URI for the content for use with DLNA ByRef. */
  var preferredSourceUri: Uri
}

object CastingSource {
  @scala.inline
  def apply(preferredSourceUri: Uri): CastingSource = {
    val __obj = js.Dynamic.literal(preferredSourceUri = preferredSourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingSource]
  }
}

