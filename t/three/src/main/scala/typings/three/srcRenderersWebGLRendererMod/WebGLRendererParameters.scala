package typings.three.srcRenderersWebGLRendererMod

import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRendererParameters extends js.Object {
  /**
  	 * default is true.
  	 */
  var alpha: js.UndefOr[Boolean] = js.undefined
  /**
  	 * default is false.
  	 */
  var antialias: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A Canvas where the renderer draws its output.
  	 */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  /**
  	 * A WebGL Rendering Context.
  	 * (https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext)
  	 *	Default is null
  	 */
  var context: js.UndefOr[WebGLRenderingContext] = js.undefined
  /**
  	 * default is true.
  	 */
  var depth: js.UndefOr[Boolean] = js.undefined
  /**
  	 * default is false.
  	 */
  var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.undefined
  /**
  	 *	Can be "high-performance", "low-power" or "default"
  	 */
  var powerPreference: js.UndefOr[String] = js.undefined
  /**
  	 *	shader precision. Can be "highp", "mediump" or "lowp".
  	 */
  var precision: js.UndefOr[String] = js.undefined
  /**
  	 * default is true.
  	 */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
  /**
  	 * default is false.
  	 */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  /**
  	 * default is true.
  	 */
  var stencil: js.UndefOr[Boolean] = js.undefined
}

object WebGLRendererParameters {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Boolean] = js.undefined,
    antialias: js.UndefOr[Boolean] = js.undefined,
    canvas: HTMLCanvasElement = null,
    context: WebGLRenderingContext = null,
    depth: js.UndefOr[Boolean] = js.undefined,
    logarithmicDepthBuffer: js.UndefOr[Boolean] = js.undefined,
    powerPreference: String = null,
    precision: String = null,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    stencil: js.UndefOr[Boolean] = js.undefined
  ): WebGLRendererParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth)
    if (!js.isUndefined(logarithmicDepthBuffer)) __obj.updateDynamic("logarithmicDepthBuffer")(logarithmicDepthBuffer)
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference)
    if (precision != null) __obj.updateDynamic("precision")(precision)
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil)
    __obj.asInstanceOf[WebGLRendererParameters]
  }
}

