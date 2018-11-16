package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of an image stream. */
@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
class ImageEncodingProperties () extends js.Object {
  /** Gets or sets the image height. */
  var height: scala.Double = js.native
  /** Gets additional format properties for the image stream. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets the subtype of the format. */
  var subtype: java.lang.String = js.native
  /** Gets the format type. */
  var `type`: java.lang.String = js.native
  /** Gets or sets the image width. */
  var width: scala.Double = js.native
}

/** Describes the format of an image stream. */
@JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
@js.native
object ImageEncodingProperties extends js.Object {
  /**
                   * Creates an instance of ImageEncodingProperties for a BMP image.
                   * @return The image encoding properties.
                   */
  def createBmp(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties = js.native
  /**
                   * Creates an instance of ImageEncodingProperties for a JPEG image.
                   * @return The properties for the image stream.
                   */
  def createJpeg(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties = js.native
  /**
                   * Creates an instance of ImageEncodingProperties for a JPEG XR image.
                   * @return The properties for the image stream.
                   */
  def createJpegXR(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties = js.native
  /**
                   * Creates an instance of ImageEncodingProperties for a PNG image.
                   * @return The properties for the image stream.
                   */
  def createPng(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties = js.native
  /**
                   * Creates an instance of ImageEncodingProperties for an uncompressed image.
                   * @param format The media pixel format.
                   * @return The image encoding properties.
                   */
  def createUncompressed(format: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaPixelFormat): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.ImageEncodingProperties = js.native
}

