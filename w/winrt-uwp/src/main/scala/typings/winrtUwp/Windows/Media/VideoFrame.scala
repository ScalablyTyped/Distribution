package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single frame of video data. */
trait VideoFrame extends js.Object {
  /** Gets the IDirect3DSurface object containing the pixel data of the video frame, when one is present. */
  var direct3DSurface: IDirect3DSurface
  /** Gets or sets the duration of the video frame. */
  var duration: Double
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: IPropertySet
  /** Gets or sets a value that indicates whether an video frame is the first frame after a gap in the stream. */
  var isDiscontinuous: Boolean
  /** Gets a value indicating whether the video frame is read-only. */
  var isReadOnly: Boolean
  /** Gets or sets the relative time of the frame within the video stream. */
  var relativeTime: Double
  /** Gets the SoftwareBitmap object containing the pixel data of the video frame, when one is present. */
  var softwareBitmap: SoftwareBitmap
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: Double
  /** Gets a string indicating the type of video data the video frame contains. */
  var `type`: String
  /** Disposes of the object and associated resources. */
  def close(): Unit
  /**
    * Copies the current VideoFrame into a provided VideoFrame object.
    * @param frame The target video frame into which the current frame will be copied.
    * @return An asynchronous action.
    */
  def copyToAsync(frame: VideoFrame): IPromiseWithIAsyncAction
}

object VideoFrame {
  @scala.inline
  def apply(
    close: () => Unit,
    copyToAsync: VideoFrame => IPromiseWithIAsyncAction,
    direct3DSurface: IDirect3DSurface,
    duration: Double,
    extendedProperties: IPropertySet,
    isDiscontinuous: Boolean,
    isReadOnly: Boolean,
    relativeTime: Double,
    softwareBitmap: SoftwareBitmap,
    systemRelativeTime: Double,
    `type`: String
  ): VideoFrame = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), copyToAsync = js.Any.fromFunction1(copyToAsync), direct3DSurface = direct3DSurface.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], isDiscontinuous = isDiscontinuous.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any], softwareBitmap = softwareBitmap.asInstanceOf[js.Any], systemRelativeTime = systemRelativeTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFrame]
  }
}

