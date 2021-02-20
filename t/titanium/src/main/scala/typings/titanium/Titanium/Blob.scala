package typings.titanium.Titanium

import typings.std.ArrayBuffer
import typings.titanium.Dimension
import typings.titanium.Titanium.Filesystem.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A container for binary data.
  */
@js.native
trait Blob extends Proxy {
  
  /**
    * Appends the data from another blob to this blob.
    */
  def append(blob: Blob): Unit = js.native
  
  /**
    * Returns a `Promise` that resolves with the contents of the blob as binary data contained in an `ArrayBuffer`.
    */
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  
  /**
    * File object represented by this blob, or `null` if this blob is not
    * associated with a file.
    */
  val file: File = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.file> property.
    * @deprecated Access <Titanium.Blob.file> instead.
    */
  def getFile(): File = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.height> property.
    * @deprecated Access <Titanium.Blob.height> instead.
    */
  def getHeight(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.length> property.
    * @deprecated Access <Titanium.Blob.length> instead.
    */
  def getLength(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.mimeType> property.
    * @deprecated Access <Titanium.Blob.mimeType> instead.
    */
  def getMimeType(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.nativePath> property.
    * @deprecated Access <Titanium.Blob.nativePath> instead.
    */
  def getNativePath(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.size> property.
    * @deprecated Access <Titanium.Blob.size> instead.
    */
  def getSize(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.text> property.
    * @deprecated Access <Titanium.Blob.text> instead.
    */
  def getText(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.uprightHeight> property.
    * @deprecated Access <Titanium.Blob.uprightHeight> instead.
    */
  def getUprightHeight(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.uprightWidth> property.
    * @deprecated Access <Titanium.Blob.uprightWidth> instead.
    */
  def getUprightWidth(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Blob.width> property.
    * @deprecated Access <Titanium.Blob.width> instead.
    */
  def getWidth(): Double = js.native
  
  /**
    * If this blob represents an image, this is the height of the image in pixels.
    */
  val height: Double = js.native
  
  /**
    * Creates a new blob by compressing the underlying image to the specified quality.
    */
  def imageAsCompressed(quality: Double): Blob = js.native
  
  /**
    * Creates a new blob by cropping the underlying image to the specified dimensions.
    */
  def imageAsCropped(options: Dimension): Blob = js.native
  
  /**
    * Creates a new blob by resizing and scaling the underlying image to the specified dimensions.
    */
  def imageAsResized(width: Double, height: Double): Blob = js.native
  
  /**
    * Returns a thumbnail version of the underlying image, optionally with a border and rounded corners.
    */
  def imageAsThumbnail(size: Double): Blob = js.native
  def imageAsThumbnail(size: Double, borderSize: js.UndefOr[scala.Nothing], cornerRadius: Double): Blob = js.native
  def imageAsThumbnail(size: Double, borderSize: Double): Blob = js.native
  def imageAsThumbnail(size: Double, borderSize: Double, cornerRadius: Double): Blob = js.native
  
  /**
    * Returns a copy of the underlying image with an added alpha channel.
    */
  def imageWithAlpha(): Blob = js.native
  
  /**
    * Returns a copy of the underlying image with rounded corners added.
    */
  def imageWithRoundedCorner(cornerSize: Double): Blob = js.native
  def imageWithRoundedCorner(cornerSize: Double, borderSize: Double): Blob = js.native
  
  /**
    * Returns a copy of the underlying image with an added transparent border.
    */
  def imageWithTransparentBorder(size: Double): Blob = js.native
  
  /**
    * Length of this blob in bytes.
    */
  val length: Double = js.native
  
  /**
    * Mime type of the data in this blob.
    */
  val mimeType: String = js.native
  
  /**
    * If this blob represents a [File](Titanium.Filesystem.File), this is the file URL
    * that represents it.
    */
  val nativePath: String = js.native
  
  /**
    * Size of the blob in pixels (for image blobs) or bytes (for all other blobs).
    */
  val size: Double = js.native
  
  /**
    * UTF-8 string representation of the data in this blob.
    */
  val text: String = js.native
  
  /**
    * Returns an `ArrayBuffer` representation of this blob.
    */
  def toArrayBuffer(): ArrayBuffer = js.native
  
  /**
    * If the blob references an image, this provides the height in pixels after factoring in EXIF orientation.
    */
  val uprightHeight: Double = js.native
  
  /**
    * If the blob references an image, this provides the width in pixels after factoring in EXIF orientation.
    */
  val uprightWidth: Double = js.native
  
  /**
    * If this blob represents an image, this is the width of the image in pixels.
    */
  val width: Double = js.native
}
