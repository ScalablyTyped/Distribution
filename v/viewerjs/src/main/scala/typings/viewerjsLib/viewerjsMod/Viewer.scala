package typings
package viewerjsLib.viewerjsMod

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
  def destroy(): scala.Unit = js.native
  /**
       * Exit  modal mode.
       * @description Only available in inline mode.
       */
  def exit(): scala.Unit = js.native
  /**
       * Enter modal mode.
       * @description Only available in inline mode.
       */
  def full(): scala.Unit = js.native
  /**
       * hide the viewer.
       * @description Only available in modal mode.
       */
  def hide(): scala.Unit = js.native
  /**
       * Move the image with relative offsets.
       * @param offsetX Moving size (px) in the horizontal direction
       * @param offsetY Moving size (px) in the vertical direction. If not present, its default value is `offsetX`
       */
  def move(offsetX: scala.Double): scala.Unit = js.native
  /**
       * Move the image with relative offsets.
       * @param offsetX Moving size (px) in the horizontal direction
       * @param offsetY Moving size (px) in the vertical direction. If not present, its default value is `offsetX`
       */
  def move(offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  /**
       * Move the image to an absolute point.
       * @param x The `left` value of the image
       * @param y The `top` value of the image. If not present, its default value is `x`.
       */
  def moveTo(x: scala.Double): scala.Unit = js.native
  /**
       * Move the image to an absolute point.
       * @param x The `left` value of the image
       * @param y The `top` value of the image. If not present, its default value is `x`.
       */
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
       * View the next image.
       */
  def next(): scala.Unit = js.native
  /**
       * Play the images.
       */
  def play(): scala.Unit = js.native
  /**
       * View the previous image.
       */
  def prev(): scala.Unit = js.native
  /**
       * Reset the image to its initial state.
       */
  def reset(): scala.Unit = js.native
  /**
       * Rotate the image with a relative degree.
       * @param degree Rotate right: requires a positive number (degree > 0). Rotate left: requires a negative number (degree < 0)
       */
  def rotate(degree: scala.Double): scala.Unit = js.native
  /**
       * Rotate the image to an absolute degree.
       */
  def rotateTo(degree: scala.Double): scala.Unit = js.native
  /**
       * Scale the image.
       * @param scaleX The scaling factor to apply on the abscissa of the image. When equal to `1` it does nothing.
       * @param scaleY The scaling factor to apply on the ordinate of the image. If not present, its default value is `scaleX`.
       */
  def scale(scaleX: scala.Double): scala.Unit = js.native
  /**
       * Scale the image.
       * @param scaleX The scaling factor to apply on the abscissa of the image. When equal to `1` it does nothing.
       * @param scaleY The scaling factor to apply on the ordinate of the image. If not present, its default value is `scaleX`.
       */
  def scale(scaleX: scala.Double, scaleY: scala.Double): scala.Unit = js.native
  /**
       * Scale the abscissa of the image.
       * @param scaleX The scaling factor to apply on the abscissa of the image. When equal to `1` it does nothing.
       */
  def scaleX(scaleX: scala.Double): scala.Unit = js.native
  /**
       * Scale the ordinate of the image.
       * @param scaleY The scaling factor to apply on the abscissa of the image. When equal to `1` it does nothing.
       */
  def scaleY(scaleY: scala.Double): scala.Unit = js.native
  /**
       * Show the viewer.
       * @description Only available in modal mode.
       */
  def show(): scala.Unit = js.native
  /**
       * Stop play.
       */
  def stop(): scala.Unit = js.native
  /**
       * Toggle the image size between its natural size and initial size.
       */
  def toggle(): scala.Unit = js.native
  /**
       * Show the current ratio of the image with percentage.
       * @description Requires the `tooltip` option set to `true`.
       */
  def tooltip(): scala.Unit = js.native
  /**
       * Update the viewer instance when the source images changed (added, removed or sorted).
       * @description If you load images dynamically (with XMLHTTPRequest), you can use this method to add the new images to the viewer instance.
       */
  def update(): scala.Unit = js.native
  /**
       * View one of the images with image's index.
       * @param index The index of the image for viewing. Default: `0`.
       */
  def view(): scala.Unit = js.native
  /**
       * View one of the images with image's index.
       * @param index The index of the image for viewing. Default: `0`.
       */
  def view(index: scala.Double): scala.Unit = js.native
  /**
       * Zoom the image with a relative ratio
       * @param ratio Zoom in: requires a positive number (ratio > 0). Zoom out: requires a negative number (ratio < 0)
       * @param hasTooltip Show tooltip. Default: `false`
       */
  def zoom(ratio: scala.Double): scala.Unit = js.native
  /**
       * Zoom the image with a relative ratio
       * @param ratio Zoom in: requires a positive number (ratio > 0). Zoom out: requires a negative number (ratio < 0)
       * @param hasTooltip Show tooltip. Default: `false`
       */
  def zoom(ratio: scala.Double, hasTooltip: scala.Boolean): scala.Unit = js.native
  /**
       * Zoom the image to an absolute ratio.
       * @param ratio Requires a positive number (ratio > 0)
       * @param hasTooltip Show tooltip. Default: `false`
       */
  def zoomTo(ratio: scala.Double): scala.Unit = js.native
  /**
       * Zoom the image to an absolute ratio.
       * @param ratio Requires a positive number (ratio > 0)
       * @param hasTooltip Show tooltip. Default: `false`
       */
  def zoomTo(ratio: scala.Double, hasTooltip: scala.Boolean): scala.Unit = js.native
}

