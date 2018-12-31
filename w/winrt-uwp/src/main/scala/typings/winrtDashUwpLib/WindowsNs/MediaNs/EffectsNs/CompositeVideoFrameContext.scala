package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides context for performing a custom overlay operation within the CompositeFrame method. */
@JSGlobal("Windows.Media.Effects.CompositeVideoFrameContext")
@js.native
abstract class CompositeVideoFrameContext () extends js.Object {
  /** Gets the background frame for an overlay operation. */
  var backgroundFrame: winrtDashUwpLib.WindowsNs.MediaNs.VideoFrame = js.native
  /** Gets the output frame for an overlay operation. */
  var outputFrame: winrtDashUwpLib.WindowsNs.MediaNs.VideoFrame = js.native
  /** Gets the list of Direct3D surfaces to be used in an overlay operation. */
  var surfacesToOverlay: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.IDirect3DSurface] = js.native
  /**
    * Gets a MediaOverlay object for the provided Direct3D surface.
    * @param surfaceToOverlay The Direct3D surface.
    * @return The created MediaOverlay object.
    */
  def getOverlayForSurface(surfaceToOverlay: winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.IDirect3DSurface): winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.MediaOverlay = js.native
}

