package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single frame of video data. */
@JSGlobal("Windows.Media.VideoFrame")
@js.native
open class VideoFrame protected ()
  extends StObject
     with typings.winrtUwp.Windows.Media.VideoFrame {
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
  
  /** Disposes of the object and associated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Copies the current VideoFrame into a provided VideoFrame object.
    * @param frame The target video frame into which the current frame will be copied.
    * @return An asynchronous action.
    */
  /* CompleteClass */
  override def copyToAsync(frame: typings.winrtUwp.Windows.Media.VideoFrame): IPromiseWithIAsyncAction = js.native
  
  /** Gets the IDirect3DSurface object containing the pixel data of the video frame, when one is present. */
  /* CompleteClass */
  var direct3DSurface: IDirect3DSurface = js.native
  
  /** Gets or sets the duration of the video frame. */
  /* CompleteClass */
  var duration: Double = js.native
  
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  /* CompleteClass */
  var extendedProperties: IPropertySet = js.native
  
  /** Gets or sets a value that indicates whether an video frame is the first frame after a gap in the stream. */
  /* CompleteClass */
  var isDiscontinuous: Boolean = js.native
  
  /** Gets a value indicating whether the video frame is read-only. */
  /* CompleteClass */
  var isReadOnly: Boolean = js.native
  
  /** Gets or sets the relative time of the frame within the video stream. */
  /* CompleteClass */
  var relativeTime: Double = js.native
  
  /** Gets the SoftwareBitmap object containing the pixel data of the video frame, when one is present. */
  /* CompleteClass */
  var softwareBitmap: SoftwareBitmap = js.native
  
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  /* CompleteClass */
  var systemRelativeTime: Double = js.native
  
  /** Gets a string indicating the type of video data the video frame contains. */
  /* CompleteClass */
  var `type`: String = js.native
}
