package typings.winrtUwp.Windows.Media.Casting

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the media content that can be sent to another device. */
@js.native
trait CastingSource extends js.Object {
  /** Gets or sets an alternative URI for the content for use with DLNA ByRef. */
  var preferredSourceUri: Uri = js.native
}

object CastingSource {
  @scala.inline
  def apply(preferredSourceUri: Uri): CastingSource = {
    val __obj = js.Dynamic.literal(preferredSourceUri = preferredSourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingSource]
  }
  @scala.inline
  implicit class CastingSourceOps[Self <: CastingSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreferredSourceUri(value: Uri): Self = this.set("preferredSourceUri", value.asInstanceOf[js.Any])
  }
  
}

