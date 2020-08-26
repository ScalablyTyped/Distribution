package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Protected Media Path (PMP) server to enable playback of protected content using digital rights management (DRM). */
@js.native
trait MediaProtectionPMPServer extends js.Object {
  /** Gets the property set for the MediaProtectionPMPServer . */
  var properties: IPropertySet = js.native
}

object MediaProtectionPMPServer {
  @scala.inline
  def apply(properties: IPropertySet): MediaProtectionPMPServer = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProtectionPMPServer]
  }
  @scala.inline
  implicit class MediaProtectionPMPServerOps[Self <: MediaProtectionPMPServer] (val x: Self) extends AnyVal {
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
    def setProperties(value: IPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

