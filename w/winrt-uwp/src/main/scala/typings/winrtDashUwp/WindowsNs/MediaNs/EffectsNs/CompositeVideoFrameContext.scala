package typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.IDirect3DSurface
import typings.winrtDashUwp.WindowsNs.MediaNs.EditingNs.MediaOverlay
import typings.winrtDashUwp.WindowsNs.MediaNs.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides context for performing a custom overlay operation within the CompositeFrame method. */
@JSGlobal("Windows.Media.Effects.CompositeVideoFrameContext")
@js.native
abstract class CompositeVideoFrameContext () extends js.Object {
  /** Gets the background frame for an overlay operation. */
  var backgroundFrame: VideoFrame = js.native
  /** Gets the output frame for an overlay operation. */
  var outputFrame: VideoFrame = js.native
  /** Gets the list of Direct3D surfaces to be used in an overlay operation. */
  var surfacesToOverlay: IVectorView[IDirect3DSurface] = js.native
  /**
    * Gets a MediaOverlay object for the provided Direct3D surface.
    * @param surfaceToOverlay The Direct3D surface.
    * @return The created MediaOverlay object.
    */
  def getOverlayForSurface(surfaceToOverlay: IDirect3DSurface): MediaOverlay = js.native
}

