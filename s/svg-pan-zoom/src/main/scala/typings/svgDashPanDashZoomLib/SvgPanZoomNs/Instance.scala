package typings
package svgDashPanDashZoomLib.SvgPanZoomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * Creates a new SvgPanZoom instance with given element selector.
    *
    * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
    * @param  {Object} options        provides customization options at the initialization of the object.
    * @return {Instance}              Current instance
    */
  def apply(svg: java.lang.String): Instance = js.native
  def apply(svg: java.lang.String, options: Options): Instance = js.native
  def apply(svg: stdLib.HTMLElement): Instance = js.native
  def apply(svg: stdLib.HTMLElement, options: Options): Instance = js.native
  def apply(svg: stdLib.SVGElement): Instance = js.native
  def apply(svg: stdLib.SVGElement, options: Options): Instance = js.native
  /**
    * Adjust viewport pan (only) so it will be centered in SVG
    * Does not zoom/fit image
    *
    * @return {Instance}    Current instance
    */
  def center(): Instance = js.native
  /**
    * Adjust viewport size (only) so it will contain in SVG
    * Does not center image
    *
    * @return {Instance}    Current instance
    */
  def contain(): Instance = js.native
  def destroy(): scala.Unit = js.native
  def disableControlIcons(): Instance = js.native
  def disableDblClickZoom(): Instance = js.native
  def disableMouseWheelZoom(): Instance = js.native
  /**
    * Disables panning on svg element
    * @return {Instance} Current instance
    */
  def disablePan(): Instance = js.native
  def disableZoom(): Instance = js.native
  def enableControlIcons(): Instance = js.native
  def enableDblClickZoom(): Instance = js.native
  def enableMouseWheelZoom(): Instance = js.native
  /**
    * Enables Panning on svg element
    * @return {Instance} Current instance
    */
  def enablePan(): Instance = js.native
  def enableZoom(): Instance = js.native
  /**
    * Adjust viewport size (only) so it will fit in SVG
    * Does not center image
    *
    * @return {Instance}    Current instance
    */
  def fit(): Instance = js.native
  /**
    * Get pan vector
    *
    * @return {Object} {x: 0, y: 0}
    * @return {Instance}    Current instance
    */
  def getPan(): Point = js.native
  /**
    * Get all calculate svg dimensions
    *
    * @return {Object} {width: 0, height: 0, realZoom: 0, viewBox: { width: 0, height: 0 }}
    */
  def getSizes(): Sizes = js.native
  /**
    * Get zoom scale/level
    *
    * @return {float} zoom scale
    */
  def getZoom(): scala.Double = js.native
  def isControlIconsEnabled(): scala.Boolean = js.native
  def isDblClickZoomEnabled(): scala.Boolean = js.native
  def isMouseWheelZoomEnabled(): scala.Boolean = js.native
  /**
    * Checks if Panning is enabled or not
    * @return {Boolean} true or false based on panning settings
    */
  def isPanEnabled(): scala.Boolean = js.native
  def isZoomEnabled(): scala.Boolean = js.native
  /**
    * Pan to a rendered position
    *
    * @param  {Object} point {x: 0, y: 0}
    * @return {Instance}    Current instance
    */
  def pan(point: Point): Instance = js.native
  /**
    * Relatively pan the graph by a specified rendered position vector
    *
    * @param  {Object} point {x: 0, y: 0}
    * @return {Instance}    Current instance
    */
  def panBy(point: Point): Instance = js.native
  def reset(): Instance = js.native
  def resetPan(): Instance = js.native
  def resetZoom(): Instance = js.native
  /**
    * Recalculates cached svg dimensions and controls position
    *
    * @return {Instance}    Current instance
    */
  def resize(): Instance = js.native
  def setBeforePan(
    fn: js.Function2[
      /* oldPoint */ Point, 
      /* newPoint */ Point, 
      scala.Unit | scala.Boolean | PointModifier
    ]
  ): Instance = js.native
  def setBeforeZoom(
    fn: js.Function2[/* oldScale */ scala.Double, /* newScale */ scala.Double, scala.Unit | scala.Boolean]
  ): Instance = js.native
  def setMaxZoom(zoom: scala.Double): Instance = js.native
  def setMinZoom(zoom: scala.Double): Instance = js.native
  def setOnPan(fn: js.Function1[/* point */ Point, scala.Unit]): Instance = js.native
  def setOnUpdatedCTM(fn: js.Function1[/* newCTM */ stdLib.SVGMatrix, scala.Unit]): Instance = js.native
  def setOnZoom(fn: js.Function1[/* scale */ scala.Double, scala.Unit]): Instance = js.native
  def setZoomScaleSensitivity(scale: scala.Double): Instance = js.native
  /**
    * Update content cached BorderBox
    * Use when viewport contents change
    *
    * @return {Instance}    Current instance
    */
  def updateBBox(): Instance = js.native
  def zoom(scale: scala.Double): scala.Unit = js.native
  def zoomAtPoint(scale: scala.Double, point: Point): Instance = js.native
  def zoomAtPointBy(scale: scala.Double, point: Point): Instance = js.native
  def zoomBy(scale: scala.Double): Instance = js.native
  def zoomIn(): Instance = js.native
  def zoomOut(): Instance = js.native
}

