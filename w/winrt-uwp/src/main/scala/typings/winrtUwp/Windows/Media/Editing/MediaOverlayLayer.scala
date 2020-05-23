package typings.winrtUwp.Windows.Media.Editing

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.Effects.IVideoCompositorDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a layer of a media overlay. */
trait MediaOverlayLayer extends js.Object {
  /** Gets the definition of the custom compositor associated with the media overlay layer, if there is one. */
  var customCompositorDefinition: IVideoCompositorDefinition
  /** Gets the list of overlays for this media overlay layer. */
  var overlays: IVector[MediaOverlay]
}

object MediaOverlayLayer {
  @scala.inline
  def apply(customCompositorDefinition: IVideoCompositorDefinition, overlays: IVector[MediaOverlay]): MediaOverlayLayer = {
    val __obj = js.Dynamic.literal(customCompositorDefinition = customCompositorDefinition.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaOverlayLayer]
  }
}

