package typings.winrtUwp.Windows.Media.Protection

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Protected Media Path (PMP) server to enable playback of protected content using digital rights management (DRM). */
trait MediaProtectionPMPServer extends js.Object {
  /** Gets the property set for the MediaProtectionPMPServer . */
  var properties: IPropertySet
}

object MediaProtectionPMPServer {
  @scala.inline
  def apply(properties: IPropertySet): MediaProtectionPMPServer = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProtectionPMPServer]
  }
}

