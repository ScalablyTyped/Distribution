package typings.winrtUwp.Windows.Media.Casting

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the media content that can be sent to another device. */
@JSGlobal("Windows.Media.Casting.CastingSource")
@js.native
abstract class CastingSource () extends js.Object {
  /** Gets or sets an alternative URI for the content for use with DLNA ByRef. */
  var preferredSourceUri: Uri = js.native
}

