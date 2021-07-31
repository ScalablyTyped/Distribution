package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Media.Editing.MediaOverlay
import typings.winrtUwp.Windows.Media.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides context for performing a custom overlay operation within the CompositeFrame method. */
trait CompositeVideoFrameContext extends StObject {
  
  /** Gets the background frame for an overlay operation. */
  var backgroundFrame: VideoFrame
  
  /**
    * Gets a MediaOverlay object for the provided Direct3D surface.
    * @param surfaceToOverlay The Direct3D surface.
    * @return The created MediaOverlay object.
    */
  def getOverlayForSurface(surfaceToOverlay: IDirect3DSurface): MediaOverlay
  
  /** Gets the output frame for an overlay operation. */
  var outputFrame: VideoFrame
  
  /** Gets the list of Direct3D surfaces to be used in an overlay operation. */
  var surfacesToOverlay: IVectorView[IDirect3DSurface]
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
  
  @scala.inline
  implicit class CompositeVideoFrameContextMutableBuilder[Self <: CompositeVideoFrameContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundFrame(value: VideoFrame): Self = StObject.set(x, "backgroundFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOverlayForSurface(value: IDirect3DSurface => MediaOverlay): Self = StObject.set(x, "getOverlayForSurface", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutputFrame(value: VideoFrame): Self = StObject.set(x, "outputFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfacesToOverlay(value: IVectorView[IDirect3DSurface]): Self = StObject.set(x, "surfacesToOverlay", value.asInstanceOf[js.Any])
  }
}
