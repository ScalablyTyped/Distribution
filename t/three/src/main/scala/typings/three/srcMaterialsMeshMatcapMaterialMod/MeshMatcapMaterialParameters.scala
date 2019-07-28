package typings.three.srcMaterialsMeshMatcapMaterialMod

import typings.three.srcConstantsMod.Blending
import typings.three.srcConstantsMod.BlendingDstFactor
import typings.three.srcConstantsMod.BlendingEquation
import typings.three.srcConstantsMod.BlendingSrcFactor
import typings.three.srcConstantsMod.Colors
import typings.three.srcConstantsMod.DepthModes
import typings.three.srcConstantsMod.NormalMapTypes
import typings.three.srcConstantsMod.Side
import typings.three.srcMaterialsMaterialMod.MaterialParameters
import typings.three.srcMathColorMod.Color
import typings.three.srcMathPlaneMod.Plane
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeStrings.highp
import typings.three.threeStrings.lowp
import typings.three.threeStrings.mediump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshMatcapMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture] = js.undefined
  var bumpMap: js.UndefOr[Texture] = js.undefined
  var bumpScale: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Color | String | Double] = js.undefined
  var displacementBias: js.UndefOr[Double] = js.undefined
  var displacementMap: js.UndefOr[Texture] = js.undefined
  var displacementScale: js.UndefOr[Double] = js.undefined
  var map: js.UndefOr[Texture] = js.undefined
  var matcap: js.UndefOr[Texture] = js.undefined
  var morphNormals: js.UndefOr[Boolean] = js.undefined
  var morphTargets: js.UndefOr[Boolean] = js.undefined
  var normalMap: js.UndefOr[Texture] = js.undefined
  var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
  var normalScale: js.UndefOr[Vector2] = js.undefined
  var skinning: js.UndefOr[Boolean] = js.undefined
}

object MeshMatcapMaterialParameters {
  @scala.inline
  def apply(
    alphaMap: Texture = null,
    alphaTest: Int | Double = null,
    blendDst: BlendingDstFactor = null,
    blendDstAlpha: Int | Double = null,
    blendEquation: BlendingEquation = null,
    blendEquationAlpha: Int | Double = null,
    blendSrc: BlendingSrcFactor | BlendingDstFactor = null,
    blendSrcAlpha: Int | Double = null,
    blending: Blending = null,
    bumpMap: Texture = null,
    bumpScale: Int | Double = null,
    clipIntersection: js.UndefOr[Boolean] = js.undefined,
    clipShadows: js.UndefOr[Boolean] = js.undefined,
    clippingPlanes: js.Array[Plane] = null,
    color: Color | String | Double = null,
    colorWrite: js.UndefOr[Boolean] = js.undefined,
    depthFunc: DepthModes = null,
    depthTest: js.UndefOr[Boolean] = js.undefined,
    depthWrite: js.UndefOr[Boolean] = js.undefined,
    displacementBias: Int | Double = null,
    displacementMap: Texture = null,
    displacementScale: Int | Double = null,
    dithering: js.UndefOr[Boolean] = js.undefined,
    flatShading: js.UndefOr[Boolean] = js.undefined,
    fog: js.UndefOr[Boolean] = js.undefined,
    lights: js.UndefOr[Boolean] = js.undefined,
    map: Texture = null,
    matcap: Texture = null,
    morphNormals: js.UndefOr[Boolean] = js.undefined,
    morphTargets: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    normalMap: Texture = null,
    normalMapType: NormalMapTypes = null,
    normalScale: Vector2 = null,
    opacity: Int | Double = null,
    overdraw: Int | Double = null,
    polygonOffset: js.UndefOr[Boolean] = js.undefined,
    polygonOffsetFactor: Int | Double = null,
    polygonOffsetUnits: Int | Double = null,
    precision: highp | mediump | lowp = null,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    shadowSide: Side = null,
    side: Side = null,
    skinning: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    vertexColors: Colors = null,
    vertexTangents: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MeshMatcapMaterialParameters = {
    val __obj = js.Dynamic.literal()
    if (alphaMap != null) __obj.updateDynamic("alphaMap")(alphaMap)
    if (alphaTest != null) __obj.updateDynamic("alphaTest")(alphaTest.asInstanceOf[js.Any])
    if (blendDst != null) __obj.updateDynamic("blendDst")(blendDst)
    if (blendDstAlpha != null) __obj.updateDynamic("blendDstAlpha")(blendDstAlpha.asInstanceOf[js.Any])
    if (blendEquation != null) __obj.updateDynamic("blendEquation")(blendEquation)
    if (blendEquationAlpha != null) __obj.updateDynamic("blendEquationAlpha")(blendEquationAlpha.asInstanceOf[js.Any])
    if (blendSrc != null) __obj.updateDynamic("blendSrc")(blendSrc.asInstanceOf[js.Any])
    if (blendSrcAlpha != null) __obj.updateDynamic("blendSrcAlpha")(blendSrcAlpha.asInstanceOf[js.Any])
    if (blending != null) __obj.updateDynamic("blending")(blending)
    if (bumpMap != null) __obj.updateDynamic("bumpMap")(bumpMap)
    if (bumpScale != null) __obj.updateDynamic("bumpScale")(bumpScale.asInstanceOf[js.Any])
    if (!js.isUndefined(clipIntersection)) __obj.updateDynamic("clipIntersection")(clipIntersection)
    if (!js.isUndefined(clipShadows)) __obj.updateDynamic("clipShadows")(clipShadows)
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWrite)) __obj.updateDynamic("colorWrite")(colorWrite)
    if (depthFunc != null) __obj.updateDynamic("depthFunc")(depthFunc)
    if (!js.isUndefined(depthTest)) __obj.updateDynamic("depthTest")(depthTest)
    if (!js.isUndefined(depthWrite)) __obj.updateDynamic("depthWrite")(depthWrite)
    if (displacementBias != null) __obj.updateDynamic("displacementBias")(displacementBias.asInstanceOf[js.Any])
    if (displacementMap != null) __obj.updateDynamic("displacementMap")(displacementMap)
    if (displacementScale != null) __obj.updateDynamic("displacementScale")(displacementScale.asInstanceOf[js.Any])
    if (!js.isUndefined(dithering)) __obj.updateDynamic("dithering")(dithering)
    if (!js.isUndefined(flatShading)) __obj.updateDynamic("flatShading")(flatShading)
    if (!js.isUndefined(fog)) __obj.updateDynamic("fog")(fog)
    if (!js.isUndefined(lights)) __obj.updateDynamic("lights")(lights)
    if (map != null) __obj.updateDynamic("map")(map)
    if (matcap != null) __obj.updateDynamic("matcap")(matcap)
    if (!js.isUndefined(morphNormals)) __obj.updateDynamic("morphNormals")(morphNormals)
    if (!js.isUndefined(morphTargets)) __obj.updateDynamic("morphTargets")(morphTargets)
    if (name != null) __obj.updateDynamic("name")(name)
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap)
    if (normalMapType != null) __obj.updateDynamic("normalMapType")(normalMapType)
    if (normalScale != null) __obj.updateDynamic("normalScale")(normalScale)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overdraw != null) __obj.updateDynamic("overdraw")(overdraw.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffset)) __obj.updateDynamic("polygonOffset")(polygonOffset)
    if (polygonOffsetFactor != null) __obj.updateDynamic("polygonOffsetFactor")(polygonOffsetFactor.asInstanceOf[js.Any])
    if (polygonOffsetUnits != null) __obj.updateDynamic("polygonOffsetUnits")(polygonOffsetUnits.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (shadowSide != null) __obj.updateDynamic("shadowSide")(shadowSide)
    if (side != null) __obj.updateDynamic("side")(side)
    if (!js.isUndefined(skinning)) __obj.updateDynamic("skinning")(skinning)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (vertexColors != null) __obj.updateDynamic("vertexColors")(vertexColors)
    if (!js.isUndefined(vertexTangents)) __obj.updateDynamic("vertexTangents")(vertexTangents)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MeshMatcapMaterialParameters]
  }
}

