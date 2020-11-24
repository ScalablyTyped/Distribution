package typings.vueCropperjs.mod

import typings.std.Event
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueCropperMethods extends js.Object {
  
  /**
    * Clear image from the cropper
    */
  def clear(): Unit = js.native
  
  /**
    * Destroy the cropper and remove the instance from the image.
    */
  def destroy(): Unit = js.native
  
  /**
    * Disable (freeze) the cropper.
    */
  def disable(): Unit = js.native
  
  /**
    * Enable (unfreeze) the cropper.
    */
  def enable(): Unit = js.native
  
  /**
    * Output the canvas (image wrapper) position and size data.
    */
  def getCanvasData(): CanvasData = js.native
  
  /**
    * Output the container size data.
    */
  def getContainerData(): ContainerData = js.native
  
  /**
    * Output the crop box position and size data.
    */
  def getCropBoxData(): CropBoxData = js.native
  
  /**
    * Get a canvas drawn the cropped image (lossy compression). If it is not cropped, then returns a canvas drawn the whole image.
    * Avoid to get a blank (or black) output image, you might need to set the maxWidth and maxHeight properties to limited numbers, because of the size limits of a canvas element.
    * Also, you should limit them maximum zoom ratio (in the zoom event) as the same reason.
    * @param options
    */
  def getCroppedCanvas(): HTMLCanvasElement = js.native
  def getCroppedCanvas(options: CroppedCanvasOptions): HTMLCanvasElement = js.native
  
  /**
    * Output the final cropped area position and size data (base on the natural size of the original image).
    */
  def getData(): CropperData = js.native
  def getData(rounded: Boolean): CropperData = js.native
  
  /**
    * Output the image position, size, and other related data.
    */
  def getImageData(): ImageData = js.native
  
  /**
    * Initialize the cropper
    */
  def initCrop(): Unit = js.native
  
  /**
    * Move the canvas (image wrapper) with relative offsets.
    * @param offsetX Moving size (px) in the horizontal direction.
    * @param offsetY Moving size (px) in the vertical direction. If not present, its default value is offsetX.
    */
  def move(offsetX: Double): Unit = js.native
  def move(offsetX: Double, offsetY: Double): Unit = js.native
  
  /**
    * Move the canvas (image wrapper) to an absolute point.
    * @param x The left value of the canvas
    * @param y The top value of the canvas. If not present, its default value is x.
    */
  def moveTo(x: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /**
    * Zoom the canvas (image wrapper) with a relative ratio.
    * @param ratio Zoom in: requires a positive number (ratio > 0) Zoom out: requires a negative number (ratio < 0)
    * @param _originalEvent
    */
  def relativeZoom(ratio: Double): Unit = js.native
  def relativeZoom(ratio: Double, _originalEvent: Event): Unit = js.native
  
  /**
    * Replace the image's src and rebuild the cropper.
    * @param url A new image url.
    * @param hasSameSize Default false If the new image has the same size as the old one,
    * then it will not rebuild the cropper and only update the URLs of all related images. This can be used for applying filters.
    */
  def replace(url: String): Unit = js.native
  def replace(url: String, hasSameSize: Boolean): Unit = js.native
  
  /**
    * Reset cropper to original state
    */
  def reset(): Unit = js.native
  
  /**
    * Rotate the image with a relative degree.
    * @param degree Rotate right: requires a positive number (degree > 0) Rotate left: requires a negative number (degree < 0)
    */
  def rotate(degree: Double): Unit = js.native
  
  /**
    * Rotate the image to an absolute degree.
    * @param degree Amount to rotate image
    */
  def rotateTo(degree: Double): Unit = js.native
  
  /**
    * Scale the image.
    * Requires CSS3 2D Transforms support (IE 9+).
    * @param scaleX The scaling factor to apply to the abscissa of the image. When equal to 1 it does nothing
    * @param scaleY The scaling factor to apply to the ordinate of the image. When equal to 1 it does nothing
    */
  def scale(scaleX: Double): Unit = js.native
  def scale(scaleX: Double, scaleY: Double): Unit = js.native
  
  /**
    * @param _scaleX The scaling factor to apply to the abscissa of the image. When equal to 1 it does nothing
    */
  def scaleX(_scaleX: Double): Unit = js.native
  
  /**
    * @param _scaleY The scaling factor to apply to the ordinate of the image. When equal to 1 it does nothing
    */
  def scaleY(_scaleY: Double): Unit = js.native
  
  /**
    * Change the aspect ratio of the crop box.
    * @param aspectRatio
    */
  def setAspectRatio(aspectRatio: Double): Unit = js.native
  
  /**
    * Change the canvas (image wrapper) position and size with new data.
    * @param data Canvas Data to be set
    */
  def setCanvasData(data: CanvasData): Unit = js.native
  
  /**
    * Change the crop box position and size with new data.
    * @param data Crop Box Data
    */
  def setCropBoxData(data: CropBoxData): Unit = js.native
  
  /**
    * Change the cropped area position and size with new data (base on the original image).
    * Note: This method only available when the value of the viewMode option is greater than or equal to 1.
    * @param data The cropper data to set with. You may need to round the data properties before passing them in.
    */
  def setData(data: CropperData): Unit = js.native
  
  /**
    * Change the drag mode.
    * Tips: You can toggle the "crop" and "move" mode by double click on the cropper.
    * @param mode
    */
  def setDragMode(mode: DragMode): Unit = js.native
  
  /**
    * Zoom the canvas (image wrapper) to an absolute ratio.
    * @param ratio Requires a positive number (ratio > 0)
    * @param _originalEvent
    */
  def zoomTo(ratio: Double): Unit = js.native
  def zoomTo(ratio: Double, _originalEvent: Event): Unit = js.native
}
