package typings
package svgDashPanDashZoomLib.SvgPanZoomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEventOptions extends js.Object {
  @JSName("instance")
  var instance_Original: Instance = js.native
  var svgElement: stdLib.SVGSVGElement = js.native
  /**
       * Creates a new SvgPanZoom instance with given element selector.
       *
       * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
       * @param  {Object} options        provides customization options at the initialization of the object.
       * @return {Instance}              Current instance
       */
  def instance(svg: java.lang.String): Instance = js.native
  /**
       * Creates a new SvgPanZoom instance with given element selector.
       *
       * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
       * @param  {Object} options        provides customization options at the initialization of the object.
       * @return {Instance}              Current instance
       */
  def instance(svg: java.lang.String, options: Options): Instance = js.native
  /**
       * Creates a new SvgPanZoom instance with given element selector.
       *
       * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
       * @param  {Object} options        provides customization options at the initialization of the object.
       * @return {Instance}              Current instance
       */
  def instance(svg: stdLib.HTMLElement): Instance = js.native
  /**
       * Creates a new SvgPanZoom instance with given element selector.
       *
       * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
       * @param  {Object} options        provides customization options at the initialization of the object.
       * @return {Instance}              Current instance
       */
  def instance(svg: stdLib.HTMLElement, options: Options): Instance = js.native
  /**
       * Creates a new SvgPanZoom instance with given element selector.
       *
       * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
       * @param  {Object} options        provides customization options at the initialization of the object.
       * @return {Instance}              Current instance
       */
  def instance(svg: stdLib.SVGElement): Instance = js.native
  /**
       * Creates a new SvgPanZoom instance with given element selector.
       *
       * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
       * @param  {Object} options        provides customization options at the initialization of the object.
       * @return {Instance}              Current instance
       */
  def instance(svg: stdLib.SVGElement, options: Options): Instance = js.native
}

