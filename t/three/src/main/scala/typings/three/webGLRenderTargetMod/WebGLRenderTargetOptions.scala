package typings.three.webGLRenderTargetMod

import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import typings.three.depthTextureMod.DepthTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderTargetOptions extends js.Object {
   // UnsignedByteType;
  var anisotropy: js.UndefOr[Double] = js.undefined
   // 1;
  var depthBuffer: js.UndefOr[Boolean] = js.undefined
   // true;
  var depthTexture: js.UndefOr[DepthTexture] = js.undefined
  var format: js.UndefOr[Double] = js.undefined
   // true;
  var generateMipmaps: js.UndefOr[Boolean] = js.undefined
  var magFilter: js.UndefOr[TextureFilter] = js.undefined
  var minFilter: js.UndefOr[TextureFilter] = js.undefined
   // true;
  var stencilBuffer: js.UndefOr[Boolean] = js.undefined
   // RGBAFormat;
  var `type`: js.UndefOr[TextureDataType] = js.undefined
  var wrapS: js.UndefOr[Wrapping] = js.undefined
  var wrapT: js.UndefOr[Wrapping] = js.undefined
}

object WebGLRenderTargetOptions {
  @scala.inline
  def apply(
    anisotropy: js.UndefOr[Double] = js.undefined,
    depthBuffer: js.UndefOr[Boolean] = js.undefined,
    depthTexture: DepthTexture = null,
    format: js.UndefOr[Double] = js.undefined,
    generateMipmaps: js.UndefOr[Boolean] = js.undefined,
    magFilter: TextureFilter = null,
    minFilter: TextureFilter = null,
    stencilBuffer: js.UndefOr[Boolean] = js.undefined,
    `type`: TextureDataType = null,
    wrapS: Wrapping = null,
    wrapT: Wrapping = null
  ): WebGLRenderTargetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anisotropy)) __obj.updateDynamic("anisotropy")(anisotropy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depthBuffer)) __obj.updateDynamic("depthBuffer")(depthBuffer.get.asInstanceOf[js.Any])
    if (depthTexture != null) __obj.updateDynamic("depthTexture")(depthTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateMipmaps)) __obj.updateDynamic("generateMipmaps")(generateMipmaps.get.asInstanceOf[js.Any])
    if (magFilter != null) __obj.updateDynamic("magFilter")(magFilter.asInstanceOf[js.Any])
    if (minFilter != null) __obj.updateDynamic("minFilter")(minFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(stencilBuffer)) __obj.updateDynamic("stencilBuffer")(stencilBuffer.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (wrapS != null) __obj.updateDynamic("wrapS")(wrapS.asInstanceOf[js.Any])
    if (wrapT != null) __obj.updateDynamic("wrapT")(wrapT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLRenderTargetOptions]
  }
}

