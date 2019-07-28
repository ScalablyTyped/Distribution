package typings.viewerjs.viewerjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JavaScript image viewer.
  * @see {@link https://github.com/fengyuanchen/viewerjs}
  */
@js.native
trait Viewer extends js.Object {
  /**
    * Destroy the viewer and remove the instance.
    */
  def destroy(): Unit = js.native
  /**
    * Exit  modal mode.
    * @description Only available in inline mode.
    */
  def exit(): Unit = js.native
  /**
    * Enter modal mode.
    * @description Only available in inline mode.
    */
  def full(): Unit = js.native
  /**
    * hide the viewer.
    * @description Only available in modal mode.
    */
  def hide(): Unit = js.native
  /**
    * Move the image with relative offsets.
    * @param offsetX Moving size (px) in the horizontal direction
    * @param offsetY Moving size (px) in the vertical direction. If not present, its default value is `offsetX`
    */
  def move(offsetX: Double): Unit = js.native
  def move(offsetX: Double, offsetY: Double): Unit = js.native
  /**
    * Move the image to an absolute point.
    * @param x The `left` value of the image
    * @param y The `top` value of the image. If not present, its default value is `x`.
    */
  def moveTo(x: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  /**
    * View the next image.
    */
  def next(): Unit = js.native
  /**
    * Play the images.
    */
  def play(): Unit = js.native
  /**
    * View the previous image.
    */
  def prev(): Unit = js.native
  /**
    * Reset the image to its initial state.
    */
  def reset(): Unit = js.native
  /**
    * Rotate the image with a relative degree.
    * @param degree Rotate right: requires a positive number (degree > 0). Rotate left: requires a negative number (degree < 0)
    */
  def rotate(degree: Double): Unit = js.native
  /**
    * Rotate the image to an absolute degree.
    */
  def rotateTo(degree: Double): Unit = js.native
  /**
    * Scale the image.
    * @param scaleX The scaling factor to apply on the abscissa of the image. When equal to `1` it does nothing.
    * @param scaleY The scaling factor to apply on the ordinate of the image. If not present, its default value is `scaleX`.
    */
  def scale(scaleX: Double): Unit = js.native
  def scale(scaleX: Double, scaleY: Double): Unit = js.native
  /**
    * Scale the abscissa of the image.
    * @param scaleX The scaling factor to apply on the abscissa of the image. When equal to `1` it does nothing.
    */
  def scaleX(scaleX: Double): Unit = js.native
  /**
    * Scale the ordinate of the image.
    * @param scaleY The scaling factor to apply on the abscissa of the image. When equal to `1` it does nothing.
    */
  def scaleY(scaleY: Double): Unit = js.native
  /**
    * Show the viewer.
    * @description Only available in modal mode.
    */
  def show(): Unit = js.native
  /**
    * Stop play.
    */
  def stop(): Unit = js.native
  /**
    * Toggle the image size between its natural size and initial size.
    */
  def toggle(): Unit = js.native
  /**
    * Show the current ratio of the image with percentage.
    * @description Requires the `tooltip` option set to `true`.
    */
  def tooltip(): Unit = js.native
  /**
    * Update the viewer instance when the source images changed (added, removed or sorted).
    * @description If you load images dynamically (with XMLHTTPRequest), you can use this method to add the new images to the viewer instance.
    */
  def update(): Unit = js.native
  /**
    * View one of the images with image's index.
    * @param index The index of the image for viewing. Default: `0`.
    */
  def view(): Unit = js.native
  def view(index: Double): Unit = js.native
  /**
    * Zoom the image with a relative ratio
    * @param ratio Zoom in: requires a positive number (ratio > 0). Zoom out: requires a negative number (ratio < 0)
    * @param hasTooltip Show tooltip. Default: `false`
    */
  def zoom(ratio: Double): Unit = js.native
  def zoom(ratio: Double, hasTooltip: Boolean): Unit = js.native
  /**
    * Zoom the image to an absolute ratio.
    * @param ratio Requires a positive number (ratio > 0)
    * @param hasTooltip Show tooltip. Default: `false`
    */
  def zoomTo(ratio: Double): Unit = js.native
  def zoomTo(ratio: Double, hasTooltip: Boolean): Unit = js.native
}

