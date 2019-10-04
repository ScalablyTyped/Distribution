package typings.three.srcMaterialsMaterialMod

import typings.three.srcConstantsMod.Blending
import typings.three.srcConstantsMod.BlendingDstFactor
import typings.three.srcConstantsMod.BlendingEquation
import typings.three.srcConstantsMod.BlendingSrcFactor
import typings.three.srcConstantsMod.Colors
import typings.three.srcConstantsMod.DepthModes
import typings.three.srcConstantsMod.Side
import typings.three.srcConstantsMod.StencilFunc
import typings.three.srcConstantsMod.StencilOp
import typings.three.srcMathPlaneMod.Plane
import typings.three.threeStrings.highp
import typings.three.threeStrings.lowp
import typings.three.threeStrings.mediump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialParameters extends js.Object {
  var alphaTest: js.UndefOr[Double] = js.undefined
  var blendDst: js.UndefOr[BlendingDstFactor] = js.undefined
  var blendDstAlpha: js.UndefOr[Double] = js.undefined
  var blendEquation: js.UndefOr[BlendingEquation] = js.undefined
  var blendEquationAlpha: js.UndefOr[Double] = js.undefined
  var blendSrc: js.UndefOr[BlendingSrcFactor | BlendingDstFactor] = js.undefined
  var blendSrcAlpha: js.UndefOr[Double] = js.undefined
  var blending: js.UndefOr[Blending] = js.undefined
  var clipIntersection: js.UndefOr[Boolean] = js.undefined
  var clipShadows: js.UndefOr[Boolean] = js.undefined
  var clippingPlanes: js.UndefOr[js.Array[Plane]] = js.undefined
  var colorWrite: js.UndefOr[Boolean] = js.undefined
  var depthFunc: js.UndefOr[DepthModes] = js.undefined
  var depthTest: js.UndefOr[Boolean] = js.undefined
  var depthWrite: js.UndefOr[Boolean] = js.undefined
  var dithering: js.UndefOr[Boolean] = js.undefined
  var flatShading: js.UndefOr[Boolean] = js.undefined
  var fog: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var overdraw: js.UndefOr[Double] = js.undefined
  var polygonOffset: js.UndefOr[Boolean] = js.undefined
  var polygonOffsetFactor: js.UndefOr[Double] = js.undefined
  var polygonOffsetUnits: js.UndefOr[Double] = js.undefined
  var precision: js.UndefOr[highp | mediump | lowp | Null] = js.undefined
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
  var shadowSide: js.UndefOr[Side] = js.undefined
  var side: js.UndefOr[Side] = js.undefined
  var stencilFail: js.UndefOr[StencilOp] = js.undefined
  var stencilFunc: js.UndefOr[StencilFunc] = js.undefined
  var stencilMask: js.UndefOr[Double] = js.undefined
  var stencilRef: js.UndefOr[Double] = js.undefined
  var stencilWrite: js.UndefOr[Boolean] = js.undefined
  var stencilZFail: js.UndefOr[StencilOp] = js.undefined
  var stencilZPass: js.UndefOr[StencilOp] = js.undefined
  var toneMapped: js.UndefOr[Boolean] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var vertexColors: js.UndefOr[Colors] = js.undefined
  var vertexTangents: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object MaterialParameters {
  @scala.inline
  def apply(
    alphaTest: Int | Double = null,
    blendDst: BlendingDstFactor = null,
    blendDstAlpha: Int | Double = null,
    blendEquation: BlendingEquation = null,
    blendEquationAlpha: Int | Double = null,
    blendSrc: BlendingSrcFactor | BlendingDstFactor = null,
    blendSrcAlpha: Int | Double = null,
    blending: Blending = null,
    clipIntersection: js.UndefOr[Boolean] = js.undefined,
    clipShadows: js.UndefOr[Boolean] = js.undefined,
    clippingPlanes: js.Array[Plane] = null,
    colorWrite: js.UndefOr[Boolean] = js.undefined,
    depthFunc: DepthModes = null,
    depthTest: js.UndefOr[Boolean] = js.undefined,
    depthWrite: js.UndefOr[Boolean] = js.undefined,
    dithering: js.UndefOr[Boolean] = js.undefined,
    flatShading: js.UndefOr[Boolean] = js.undefined,
    fog: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    opacity: Int | Double = null,
    overdraw: Int | Double = null,
    polygonOffset: js.UndefOr[Boolean] = js.undefined,
    polygonOffsetFactor: Int | Double = null,
    polygonOffsetUnits: Int | Double = null,
    precision: highp | mediump | lowp = null,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    shadowSide: Side = null,
    side: Side = null,
    stencilFail: StencilOp = null,
    stencilFunc: StencilFunc = null,
    stencilMask: Int | Double = null,
    stencilRef: Int | Double = null,
    stencilWrite: js.UndefOr[Boolean] = js.undefined,
    stencilZFail: StencilOp = null,
    stencilZPass: StencilOp = null,
    toneMapped: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    vertexColors: Colors = null,
    vertexTangents: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MaterialParameters = {
    val __obj = js.Dynamic.literal()
    if (alphaTest != null) __obj.updateDynamic("alphaTest")(alphaTest.asInstanceOf[js.Any])
    if (blendDst != null) __obj.updateDynamic("blendDst")(blendDst)
    if (blendDstAlpha != null) __obj.updateDynamic("blendDstAlpha")(blendDstAlpha.asInstanceOf[js.Any])
    if (blendEquation != null) __obj.updateDynamic("blendEquation")(blendEquation)
    if (blendEquationAlpha != null) __obj.updateDynamic("blendEquationAlpha")(blendEquationAlpha.asInstanceOf[js.Any])
    if (blendSrc != null) __obj.updateDynamic("blendSrc")(blendSrc.asInstanceOf[js.Any])
    if (blendSrcAlpha != null) __obj.updateDynamic("blendSrcAlpha")(blendSrcAlpha.asInstanceOf[js.Any])
    if (blending != null) __obj.updateDynamic("blending")(blending)
    if (!js.isUndefined(clipIntersection)) __obj.updateDynamic("clipIntersection")(clipIntersection)
    if (!js.isUndefined(clipShadows)) __obj.updateDynamic("clipShadows")(clipShadows)
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes)
    if (!js.isUndefined(colorWrite)) __obj.updateDynamic("colorWrite")(colorWrite)
    if (depthFunc != null) __obj.updateDynamic("depthFunc")(depthFunc)
    if (!js.isUndefined(depthTest)) __obj.updateDynamic("depthTest")(depthTest)
    if (!js.isUndefined(depthWrite)) __obj.updateDynamic("depthWrite")(depthWrite)
    if (!js.isUndefined(dithering)) __obj.updateDynamic("dithering")(dithering)
    if (!js.isUndefined(flatShading)) __obj.updateDynamic("flatShading")(flatShading)
    if (!js.isUndefined(fog)) __obj.updateDynamic("fog")(fog)
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overdraw != null) __obj.updateDynamic("overdraw")(overdraw.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffset)) __obj.updateDynamic("polygonOffset")(polygonOffset)
    if (polygonOffsetFactor != null) __obj.updateDynamic("polygonOffsetFactor")(polygonOffsetFactor.asInstanceOf[js.Any])
    if (polygonOffsetUnits != null) __obj.updateDynamic("polygonOffsetUnits")(polygonOffsetUnits.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (shadowSide != null) __obj.updateDynamic("shadowSide")(shadowSide)
    if (side != null) __obj.updateDynamic("side")(side)
    if (stencilFail != null) __obj.updateDynamic("stencilFail")(stencilFail)
    if (stencilFunc != null) __obj.updateDynamic("stencilFunc")(stencilFunc)
    if (stencilMask != null) __obj.updateDynamic("stencilMask")(stencilMask.asInstanceOf[js.Any])
    if (stencilRef != null) __obj.updateDynamic("stencilRef")(stencilRef.asInstanceOf[js.Any])
    if (!js.isUndefined(stencilWrite)) __obj.updateDynamic("stencilWrite")(stencilWrite)
    if (stencilZFail != null) __obj.updateDynamic("stencilZFail")(stencilZFail)
    if (stencilZPass != null) __obj.updateDynamic("stencilZPass")(stencilZPass)
    if (!js.isUndefined(toneMapped)) __obj.updateDynamic("toneMapped")(toneMapped)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (vertexColors != null) __obj.updateDynamic("vertexColors")(vertexColors)
    if (!js.isUndefined(vertexTangents)) __obj.updateDynamic("vertexTangents")(vertexTangents)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MaterialParameters]
  }
}

