package typings.winrtDashUwp.WindowsNs.MediaNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns.IDirect3DSurface
import typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode
import typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat
import typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single frame of video data. */
@JSGlobal("Windows.Media.VideoFrame")
@js.native
class VideoFrame protected () extends js.Object {
  /**
    * Initializes a new instance of the VideoFrame class.
    * @param format The pixel format of the video frame.
    * @param width The width of the video frame, in pixels.
    * @param height The height of the video frame, in pixels.
    */
  def this(format: BitmapPixelFormat, width: Double, height: Double) = this()
  /**
    * Initializes a new instance of the VideoFrame class.
    * @param format The pixel format of the video frame.
    * @param width The width of the video frame, in pixels.
    * @param height The height of the video frame, in pixels.
    * @param alpha The alpha mode of the video frame.
    */
  def this(format: BitmapPixelFormat, width: Double, height: Double, alpha: BitmapAlphaMode) = this()
  /** Gets the IDirect3DSurface object containing the pixel data of the video frame, when one is present. */
  var direct3DSurface: IDirect3DSurface = js.native
  /** Gets or sets the duration of the video frame. */
  var duration: Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: IPropertySet = js.native
  /** Gets or sets a value that indicates whether an video frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean = js.native
  /** Gets a value indicating whether the video frame is read-only. */
  var isReadOnly: Boolean = js.native
  /** Gets or sets the relative time of the frame within the video stream. */
  var relativeTime: Double = js.native
  /** Gets the SoftwareBitmap object containing the pixel data of the video frame, when one is present. */
  var softwareBitmap: SoftwareBitmap = js.native
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double = js.native
  /** Gets a string indicating the type of video data the video frame contains. */
  var `type`: String = js.native
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
  /**
    * Copies the current VideoFrame into a provided VideoFrame object.
    * @param frame The target video frame into which the current frame will be copied.
    * @return An asynchronous action.
    */
  def copyToAsync(frame: VideoFrame): IPromiseWithIAsyncAction = js.native
}

