package typings
package threeLib.srcRenderersWebGLRenderTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderTargetOptions extends js.Object {
   // UnsignedByteType;
  var anisotropy: js.UndefOr[scala.Double] = js.undefined
   // 1;
  var depthBuffer: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[scala.Double] = js.undefined
   // true;
  var generateMipmaps: js.UndefOr[scala.Boolean] = js.undefined
  var magFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter] = js.undefined
  var minFilter: js.UndefOr[threeLib.srcConstantsMod.TextureFilter] = js.undefined
   // true;
  var stencilBuffer: js.UndefOr[scala.Boolean] = js.undefined
   // RGBAFormat;
  var `type`: js.UndefOr[threeLib.srcConstantsMod.TextureDataType] = js.undefined
  var wrapS: js.UndefOr[threeLib.srcConstantsMod.Wrapping] = js.undefined
  var wrapT: js.UndefOr[threeLib.srcConstantsMod.Wrapping] = js.undefined
}

object WebGLRenderTargetOptions {
  @scala.inline
  def apply(
    anisotropy: scala.Int | scala.Double = null,
    depthBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    format: scala.Int | scala.Double = null,
    generateMipmaps: js.UndefOr[scala.Boolean] = js.undefined,
    magFilter: threeLib.srcConstantsMod.TextureFilter = null,
    minFilter: threeLib.srcConstantsMod.TextureFilter = null,
    stencilBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: threeLib.srcConstantsMod.TextureDataType = null,
    wrapS: threeLib.srcConstantsMod.Wrapping = null,
    wrapT: threeLib.srcConstantsMod.Wrapping = null
  ): WebGLRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    if (anisotropy != null) __obj.updateDynamic("anisotropy")(anisotropy.asInstanceOf[js.Any])
    if (!js.isUndefined(depthBuffer)) __obj.updateDynamic("depthBuffer")(depthBuffer)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(generateMipmaps)) __obj.updateDynamic("generateMipmaps")(generateMipmaps)
    if (magFilter != null) __obj.updateDynamic("magFilter")(magFilter)
    if (minFilter != null) __obj.updateDynamic("minFilter")(minFilter)
    if (!js.isUndefined(stencilBuffer)) __obj.updateDynamic("stencilBuffer")(stencilBuffer)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (wrapS != null) __obj.updateDynamic("wrapS")(wrapS)
    if (wrapT != null) __obj.updateDynamic("wrapT")(wrapT)
    __obj.asInstanceOf[WebGLRenderTargetOptions]
  }
}

