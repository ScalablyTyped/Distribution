package typings.winrtUwp.global.Windows.Media.Protection

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Protected Media Path (PMP) server to enable playback of protected content using digital rights management (DRM). */
@JSGlobal("Windows.Media.Protection.MediaProtectionPMPServer")
@js.native
class MediaProtectionPMPServer protected ()
  extends typings.winrtUwp.Windows.Media.Protection.MediaProtectionPMPServer {
  /**
    * Initializes a new instance of the MediaProtectionPMPServer class with the specified properties.
    * @param pProperties The set of properties used to initialize the server.
    */
  def this(pProperties: IPropertySet) = this()
  /** Gets the property set for the MediaProtectionPMPServer . */
  /* CompleteClass */
  override var properties: IPropertySet = js.native
}

