package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Media.Editing.MediaOverlay
import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides context for performing a custom overlay operation within the CompositeFrame method. */
trait CompositeVideoFrameContext extends js.Object {
  /** Gets the background frame for an overlay operation. */
  var backgroundFrame: VideoFrame
  /** Gets the output frame for an overlay operation. */
  var outputFrame: VideoFrame
  /** Gets the list of Direct3D surfaces to be used in an overlay operation. */
  var surfacesToOverlay: IVectorView[IDirect3DSurface]
  /**
    * Gets a MediaOverlay object for the provided Direct3D surface.
    * @param surfaceToOverlay The Direct3D surface.
    * @return The created MediaOverlay object.
    */
  def getOverlayForSurface(surfaceToOverlay: IDirect3DSurface): MediaOverlay
}

object CompositeVideoFrameContext {
  @scala.inline
  def apply(
    backgroundFrame: VideoFrame,
    getOverlayForSurface: IDirect3DSurface => MediaOverlay,
    outputFrame: VideoFrame,
    surfacesToOverlay: IVectorView[IDirect3DSurface]
  ): CompositeVideoFrameContext = {
    val __obj = js.Dynamic.literal(backgroundFrame = backgroundFrame.asInstanceOf[js.Any], getOverlayForSurface = js.Any.fromFunction1(getOverlayForSurface), outputFrame = outputFrame.asInstanceOf[js.Any], surfacesToOverlay = surfacesToOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeVideoFrameContext]
  }
}

