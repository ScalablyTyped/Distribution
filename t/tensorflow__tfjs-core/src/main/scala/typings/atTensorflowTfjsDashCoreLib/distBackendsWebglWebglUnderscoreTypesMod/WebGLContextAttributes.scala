package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglWebglUnderscoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLContextAttributes extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  var depth: js.UndefOr[scala.Boolean] = js.undefined
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var stencil: js.UndefOr[scala.Boolean] = js.undefined
}

object WebGLContextAttributes {
  @scala.inline
  def apply(
    alpha: js.UndefOr[scala.Boolean] = js.undefined,
    antialias: js.UndefOr[scala.Boolean] = js.undefined,
    depth: js.UndefOr[scala.Boolean] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined,
    premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    stencil: js.UndefOr[scala.Boolean] = js.undefined
  ): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth)
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat)
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil)
    __obj.asInstanceOf[WebGLContextAttributes]
  }
}

