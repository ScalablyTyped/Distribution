package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Protected Media Path (PMP) server to enable playback of protected content using digital rights management (DRM). */
@JSGlobal("Windows.Media.Protection.MediaProtectionPMPServer")
@js.native
class MediaProtectionPMPServer protected () extends js.Object {
  /**
                   * Initializes a new instance of the MediaProtectionPMPServer class with the specified properties.
                   * @param pProperties The set of properties used to initialize the server.
                   */
  def this(pProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet) = this()
  /** Gets the property set for the MediaProtectionPMPServer . */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
}

