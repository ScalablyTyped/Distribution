package typings.winrtUwp.Windows.Media.Editing

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.Effects.IVideoCompositorDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a layer of a media overlay. */
@js.native
trait MediaOverlayLayer extends js.Object {
  /** Gets the definition of the custom compositor associated with the media overlay layer, if there is one. */
  var customCompositorDefinition: IVideoCompositorDefinition = js.native
  /** Gets the list of overlays for this media overlay layer. */
  var overlays: IVector[MediaOverlay] = js.native
}

object MediaOverlayLayer {
  @scala.inline
  def apply(customCompositorDefinition: IVideoCompositorDefinition, overlays: IVector[MediaOverlay]): MediaOverlayLayer = {
    val __obj = js.Dynamic.literal(customCompositorDefinition = customCompositorDefinition.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaOverlayLayer]
  }
  @scala.inline
  implicit class MediaOverlayLayerOps[Self <: MediaOverlayLayer] (val x: Self) extends AnyVal {
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
    def setCustomCompositorDefinition(value: IVideoCompositorDefinition): Self = this.set("customCompositorDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlays(value: IVector[MediaOverlay]): Self = this.set("overlays", value.asInstanceOf[js.Any])
  }
  
}

