package typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.ProviderNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Size
import typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
import typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
import typings.winrtDashUwp.WindowsNs.MediaNs.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An allocator that can create PerceptionFrames directly which can be written into or copied from Windows::Media::VideoFrame into a PerceptionFrame. */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionVideoFrameAllocator")
@js.native
class PerceptionVideoFrameAllocator protected () extends js.Object {
  /**
    * Initializes a new PerceptionVideoFrameAllocator with the required properties for use by the IPerceptionFrameProvider to create PerceptionFrames published via PerceptionFrameProviderManagerService::PublishFrameForProvider.
    * @param maxOutstandingFrameCountForWrite This is the number of buffers in flight required by the FrameProvider to produce its * frames at framerate. The suggestion is at least 2.
    * @param format The Windows::Graphics::Imaging::BitmapPixelFormat describing the format of the bytes of the frame.
    * @param resolution The resolution in pixels of the frame.
    * @param alpha The Windows::Graphics::Imaging::BitmapAlphaMode describing how transparency is handled in the pixels.
    */
  def this(
    maxOutstandingFrameCountForWrite: Double,
    format: BitmapPixelFormat,
    resolution: Size,
    alpha: BitmapAlphaMode
  ) = this()
  /**
    * Creates an empty PerceptionFrame with the properties specified when creating the PerceptionVideoFrameAllocator.
    * @return The empty frame with the properties specified when creating the PerceptionVideoFrameAllocator.
    */
  def allocateFrame(): PerceptionFrame = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
  /**
    * Creates a deep copy of the video FrameProvider with the bytes already filled in with the resulting PerceptionFrame.
    * @param frame The input frame from which to copy the pixel data.
    * @return The resulting filled PerceptionFrame.
    */
  def copyFromVideoFrame(frame: VideoFrame): PerceptionFrame = js.native
}

