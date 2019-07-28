package typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
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
  def this(pProperties: IPropertySet) = this()
  /** Gets the property set for the MediaProtectionPMPServer . */
  var properties: IPropertySet = js.native
}

