package typings.three.srcMaterialsMeshDepthMaterialMod

import typings.three.srcConstantsMod.Blending
import typings.three.srcConstantsMod.BlendingDstFactor
import typings.three.srcConstantsMod.BlendingEquation
import typings.three.srcConstantsMod.BlendingSrcFactor
import typings.three.srcConstantsMod.Colors
import typings.three.srcConstantsMod.DepthModes
import typings.three.srcConstantsMod.DepthPackingStrategies
import typings.three.srcConstantsMod.Side
import typings.three.srcConstantsMod.StencilFunc
import typings.three.srcConstantsMod.StencilOp
import typings.three.srcMaterialsMaterialMod.MaterialParameters
import typings.three.srcMathPlaneMod.Plane
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeStrings.highp
import typings.three.threeStrings.lowp
import typings.three.threeStrings.mediump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshDepthMaterialParameters extends MaterialParameters {
  var depthPacking: js.UndefOr[DepthPackingStrategies] = js.undefined
  var displacementBias: js.UndefOr[Double] = js.undefined
  var displacementMap: js.UndefOr[Texture | Null] = js.undefined
  var displacementScale: js.UndefOr[Double] = js.undefined
  var wireframe: js.UndefOr[Boolean] = js.undefined
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}

object MeshDepthMaterialParameters {
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
    depthPacking: DepthPackingStrategies = null,
    depthTest: js.UndefOr[Boolean] = js.undefined,
    depthWrite: js.UndefOr[Boolean] = js.undefined,
    displacementBias: Int | Double = null,
    displacementMap: Texture = null,
    displacementScale: Int | Double = null,
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
    visible: js.UndefOr[Boolean] = js.undefined,
    wireframe: js.UndefOr[Boolean] = js.undefined,
    wireframeLinewidth: Int | Double = null
  ): MeshDepthMaterialParameters = {
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
    if (depthPacking != null) __obj.updateDynamic("depthPacking")(depthPacking)
    if (!js.isUndefined(depthTest)) __obj.updateDynamic("depthTest")(depthTest)
    if (!js.isUndefined(depthWrite)) __obj.updateDynamic("depthWrite")(depthWrite)
    if (displacementBias != null) __obj.updateDynamic("displacementBias")(displacementBias.asInstanceOf[js.Any])
    if (displacementMap != null) __obj.updateDynamic("displacementMap")(displacementMap)
    if (displacementScale != null) __obj.updateDynamic("displacementScale")(displacementScale.asInstanceOf[js.Any])
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
    if (!js.isUndefined(wireframe)) __obj.updateDynamic("wireframe")(wireframe)
    if (wireframeLinewidth != null) __obj.updateDynamic("wireframeLinewidth")(wireframeLinewidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshDepthMaterialParameters]
  }
}

