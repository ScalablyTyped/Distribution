package typings.three.spriteMaterialMod

import typings.three.colorMod.Color
import typings.three.constantsMod.Blending
import typings.three.constantsMod.BlendingDstFactor
import typings.three.constantsMod.BlendingEquation
import typings.three.constantsMod.BlendingSrcFactor
import typings.three.constantsMod.DepthModes
import typings.three.constantsMod.Side
import typings.three.constantsMod.StencilFunc
import typings.three.constantsMod.StencilOp
import typings.three.materialMod.MaterialParameters
import typings.three.planeMod.Plane
import typings.three.textureMod.Texture
import typings.three.threeStrings.highp
import typings.three.threeStrings.lowp
import typings.three.threeStrings.mediump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture | Null] = js.undefined
  var color: js.UndefOr[Color | String | Double] = js.undefined
  var map: js.UndefOr[Texture | Null] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var sizeAttenuation: js.UndefOr[Boolean] = js.undefined
}

object SpriteMaterialParameters {
  @scala.inline
  def apply(
    alphaMap: js.UndefOr[Null | Texture] = js.undefined,
    alphaTest: js.UndefOr[Double] = js.undefined,
    blendDst: BlendingDstFactor = null,
    blendDstAlpha: js.UndefOr[Double] = js.undefined,
    blendEquation: BlendingEquation = null,
    blendEquationAlpha: js.UndefOr[Double] = js.undefined,
    blendSrc: BlendingSrcFactor | BlendingDstFactor = null,
    blendSrcAlpha: js.UndefOr[Double] = js.undefined,
    blending: Blending = null,
    clipIntersection: js.UndefOr[Boolean] = js.undefined,
    clipShadows: js.UndefOr[Boolean] = js.undefined,
    clippingPlanes: js.Array[Plane] = null,
    color: Color | String | Double = null,
    colorWrite: js.UndefOr[Boolean] = js.undefined,
    defines: js.Any = null,
    depthFunc: DepthModes = null,
    depthTest: js.UndefOr[Boolean] = js.undefined,
    depthWrite: js.UndefOr[Boolean] = js.undefined,
    dithering: js.UndefOr[Boolean] = js.undefined,
    flatShading: js.UndefOr[Boolean] = js.undefined,
    fog: js.UndefOr[Boolean] = js.undefined,
    map: js.UndefOr[Null | Texture] = js.undefined,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    polygonOffset: js.UndefOr[Boolean] = js.undefined,
    polygonOffsetFactor: js.UndefOr[Double] = js.undefined,
    polygonOffsetUnits: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Null | highp | mediump | lowp] = js.undefined,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    shadowSide: Side = null,
    side: Side = null,
    sizeAttenuation: js.UndefOr[Boolean] = js.undefined,
    stencilFail: StencilOp = null,
    stencilFunc: StencilFunc = null,
    stencilMask: js.UndefOr[Double] = js.undefined,
    stencilRef: js.UndefOr[Double] = js.undefined,
    stencilWrite: js.UndefOr[Boolean] = js.undefined,
    stencilZFail: StencilOp = null,
    stencilZPass: StencilOp = null,
    toneMapped: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    vertexColors: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SpriteMaterialParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alphaMap)) __obj.updateDynamic("alphaMap")(alphaMap.asInstanceOf[js.Any])
    if (!js.isUndefined(alphaTest)) __obj.updateDynamic("alphaTest")(alphaTest.get.asInstanceOf[js.Any])
    if (blendDst != null) __obj.updateDynamic("blendDst")(blendDst.asInstanceOf[js.Any])
    if (!js.isUndefined(blendDstAlpha)) __obj.updateDynamic("blendDstAlpha")(blendDstAlpha.get.asInstanceOf[js.Any])
    if (blendEquation != null) __obj.updateDynamic("blendEquation")(blendEquation.asInstanceOf[js.Any])
    if (!js.isUndefined(blendEquationAlpha)) __obj.updateDynamic("blendEquationAlpha")(blendEquationAlpha.get.asInstanceOf[js.Any])
    if (blendSrc != null) __obj.updateDynamic("blendSrc")(blendSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(blendSrcAlpha)) __obj.updateDynamic("blendSrcAlpha")(blendSrcAlpha.get.asInstanceOf[js.Any])
    if (blending != null) __obj.updateDynamic("blending")(blending.asInstanceOf[js.Any])
    if (!js.isUndefined(clipIntersection)) __obj.updateDynamic("clipIntersection")(clipIntersection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clipShadows)) __obj.updateDynamic("clipShadows")(clipShadows.get.asInstanceOf[js.Any])
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWrite)) __obj.updateDynamic("colorWrite")(colorWrite.get.asInstanceOf[js.Any])
    if (defines != null) __obj.updateDynamic("defines")(defines.asInstanceOf[js.Any])
    if (depthFunc != null) __obj.updateDynamic("depthFunc")(depthFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(depthTest)) __obj.updateDynamic("depthTest")(depthTest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depthWrite)) __obj.updateDynamic("depthWrite")(depthWrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dithering)) __obj.updateDynamic("dithering")(dithering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flatShading)) __obj.updateDynamic("flatShading")(flatShading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fog)) __obj.updateDynamic("fog")(fog.get.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffset)) __obj.updateDynamic("polygonOffset")(polygonOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffsetFactor)) __obj.updateDynamic("polygonOffsetFactor")(polygonOffsetFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffsetUnits)) __obj.updateDynamic("polygonOffsetUnits")(polygonOffsetUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (shadowSide != null) __obj.updateDynamic("shadowSide")(shadowSide.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeAttenuation)) __obj.updateDynamic("sizeAttenuation")(sizeAttenuation.get.asInstanceOf[js.Any])
    if (stencilFail != null) __obj.updateDynamic("stencilFail")(stencilFail.asInstanceOf[js.Any])
    if (stencilFunc != null) __obj.updateDynamic("stencilFunc")(stencilFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(stencilMask)) __obj.updateDynamic("stencilMask")(stencilMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stencilRef)) __obj.updateDynamic("stencilRef")(stencilRef.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stencilWrite)) __obj.updateDynamic("stencilWrite")(stencilWrite.get.asInstanceOf[js.Any])
    if (stencilZFail != null) __obj.updateDynamic("stencilZFail")(stencilZFail.asInstanceOf[js.Any])
    if (stencilZPass != null) __obj.updateDynamic("stencilZPass")(stencilZPass.asInstanceOf[js.Any])
    if (!js.isUndefined(toneMapped)) __obj.updateDynamic("toneMapped")(toneMapped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertexColors)) __obj.updateDynamic("vertexColors")(vertexColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteMaterialParameters]
  }
}

