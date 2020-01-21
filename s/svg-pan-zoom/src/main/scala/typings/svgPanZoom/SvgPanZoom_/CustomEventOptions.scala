package typings.svgPanZoom.SvgPanZoom_

import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEventOptions extends js.Object {
  @JSName("instance")
  var instance_Original: Instance = js.native
  var svgElement: SVGSVGElement = js.native
  /**
    * Creates a new SvgPanZoom instance with given element selector.
    *
    * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
    * @param  {Object} options        provides customization options at the initialization of the object.
    * @return {Instance}              Current instance
    */
  def instance(svg: String): Instance = js.native
  def instance(svg: String, options: Options): Instance = js.native
  def instance(svg: HTMLElement): Instance = js.native
  def instance(svg: HTMLElement, options: Options): Instance = js.native
  def instance(svg: SVGElement): Instance = js.native
  def instance(svg: SVGElement, options: Options): Instance = js.native
}

