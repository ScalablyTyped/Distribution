package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLContextAttributes extends js.Object {
  var alpha: js.UndefOr[GLboolean] = js.undefined
  var antialias: js.UndefOr[GLboolean] = js.undefined
  var depth: js.UndefOr[GLboolean] = js.undefined
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined
  var powerPreference: js.UndefOr[WebGLPowerPreference] = js.undefined
  var premultipliedAlpha: js.UndefOr[GLboolean] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[GLboolean] = js.undefined
  var stencil: js.UndefOr[GLboolean] = js.undefined
}

object WebGLContextAttributes {
  @scala.inline
  def apply(
    alpha: js.UndefOr[GLboolean] = js.undefined,
    antialias: js.UndefOr[GLboolean] = js.undefined,
    depth: js.UndefOr[GLboolean] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined,
    powerPreference: WebGLPowerPreference = null,
    premultipliedAlpha: js.UndefOr[GLboolean] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[GLboolean] = js.undefined,
    stencil: js.UndefOr[GLboolean] = js.undefined
  ): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth)
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat)
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference)
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil)
    __obj.asInstanceOf[WebGLContextAttributes]
  }
}

