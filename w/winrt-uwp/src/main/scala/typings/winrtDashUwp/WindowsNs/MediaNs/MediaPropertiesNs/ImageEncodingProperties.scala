package typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an image stream. */
@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
/** Creates a new instance of the ImageEncodingProperties class. */
class ImageEncodingProperties () extends js.Object {
  /** Gets or sets the image height. */
  var height: Double = js.native
  /** Gets additional format properties for the image stream. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets the subtype of the format. */
  var subtype: String = js.native
  /** Gets the format type. */
  var `type`: String = js.native
  /** Gets or sets the image width. */
  var width: Double = js.native
}

/* static members */
@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
object ImageEncodingProperties extends js.Object {
  /**
    * Creates an instance of ImageEncodingProperties for a BMP image.
    * @return The image encoding properties.
    */
  def createBmp(): ImageEncodingProperties = js.native
  /**
    * Creates an instance of ImageEncodingProperties for a JPEG image.
    * @return The properties for the image stream.
    */
  def createJpeg(): ImageEncodingProperties = js.native
  /**
    * Creates an instance of ImageEncodingProperties for a JPEG XR image.
    * @return The properties for the image stream.
    */
  def createJpegXR(): ImageEncodingProperties = js.native
  /**
    * Creates an instance of ImageEncodingProperties for a PNG image.
    * @return The properties for the image stream.
    */
  def createPng(): ImageEncodingProperties = js.native
  /**
    * Creates an instance of ImageEncodingProperties for an uncompressed image.
    * @param format The media pixel format.
    * @return The image encoding properties.
    */
  def createUncompressed(format: MediaPixelFormat): ImageEncodingProperties = js.native
}

