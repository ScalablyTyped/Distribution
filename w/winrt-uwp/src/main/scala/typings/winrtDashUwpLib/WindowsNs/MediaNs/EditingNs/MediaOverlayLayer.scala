package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EditingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a layer of a media overlay. */
@JSGlobal("Windows.Media.Editing.MediaOverlayLayer")
@js.native
/** Initializes a new instance of the MediaOverlayLayer class. */
class MediaOverlayLayer () extends js.Object {
  /**
    * Initializes a new instance of the MediaOverlayLayer class.
    * @param compositorDefinition The definition of the custom compositor associated with the media overlay layer.
    */
  def this(compositorDefinition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IVideoCompositorDefinition) = this()
  /** Gets the definition of the custom compositor associated with the media overlay layer, if there is one. */
  var customCompositorDefinition: winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs.IVideoCompositorDefinition = js.native
  /** Gets the list of overlays for this media overlay layer. */
  var overlays: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[MediaOverlay] = js.native
}

