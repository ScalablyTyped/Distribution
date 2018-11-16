package typings
package titaniumLib.TitaniumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A container for binary data.
	 */
@js.native
trait Blob extends Proxy {
  /**
  		 * File object represented by this blob, or `null` if this blob is not
  		 * associated with a file.
  		 */
  val file: titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  		 * If this blob represents an image, this is the height of the image in pixels.
  		 */
  val height: scala.Double = js.native
  /**
  		 * Length of this blob in bytes.
  		 */
  val length: scala.Double = js.native
  /**
  		 * Mime type of the data in this blob.
  		 */
  val mimeType: java.lang.String = js.native
  /**
  		 * If this blob represents a [File](Titanium.Filesystem.File), this is the file URL
  		 * that represents it.
  		 */
  val nativePath: java.lang.String = js.native
  /**
  		 * Size of the blob in pixels (for image blobs) or bytes (for all other blobs).
  		 */
  val size: scala.Double = js.native
  /**
  		 * UTF-8 string representation of the data in this blob.
  		 */
  val text: java.lang.String = js.native
  /**
  		 * If this blob represents an image, this is the width of the image in pixels.
  		 */
  val width: scala.Double = js.native
  /**
  		 * Appends the data from another blob to this blob.
  		 */
  def append(blob: Blob): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Blob.file> property.
  		 */
  def getFile(): titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  		 * Gets the value of the <Titanium.Blob.height> property.
  		 */
  def getHeight(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Blob.length> property.
  		 */
  def getLength(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Blob.mimeType> property.
  		 */
  def getMimeType(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Blob.nativePath> property.
  		 */
  def getNativePath(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Blob.size> property.
  		 */
  def getSize(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Blob.text> property.
  		 */
  def getText(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Blob.width> property.
  		 */
  def getWidth(): scala.Double = js.native
  /**
  		 * Creates a new blob by compressing the underlying image to the specified quality.
  		 */
  def imageAsCompressed(quality: scala.Double): Blob = js.native
  /**
  		 * Creates a new blob by cropping the underlying image to the specified dimensions.
  		 */
  def imageAsCropped(options: js.Any): Blob = js.native
  /**
  		 * Creates a new blob by resizing and scaling the underlying image to the specified dimensions.
  		 */
  def imageAsResized(width: scala.Double, height: scala.Double): Blob = js.native
  /**
  		 * Returns a thumbnail version of the underlying image, optionally with a border and rounded corners.
  		 */
  def imageAsThumbnail(size: scala.Double): Blob = js.native
  /**
  		 * Returns a thumbnail version of the underlying image, optionally with a border and rounded corners.
  		 */
  def imageAsThumbnail(size: scala.Double, borderSize: scala.Double): Blob = js.native
  /**
  		 * Returns a thumbnail version of the underlying image, optionally with a border and rounded corners.
  		 */
  def imageAsThumbnail(size: scala.Double, borderSize: scala.Double, cornerRadius: scala.Double): Blob = js.native
  /**
  		 * Returns a copy of the underlying image with an added alpha channel.
  		 */
  def imageWithAlpha(): Blob = js.native
  /**
  		 * Returns a copy of the underlying image with rounded corners added.
  		 */
  def imageWithRoundedCorner(cornerSize: scala.Double): Blob = js.native
  /**
  		 * Returns a copy of the underlying image with rounded corners added.
  		 */
  def imageWithRoundedCorner(cornerSize: scala.Double, borderSize: scala.Double): Blob = js.native
  /**
  		 * Returns a copy of the underlying image with an added transparent border.
  		 */
  def imageWithTransparentBorder(size: scala.Double): Blob = js.native
}

