package typings
package threeLib.srcMaterialsMeshMatcapMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshMatcapMaterialParameters
  extends threeLib.srcMaterialsMaterialMod.MaterialParameters {
  var alphaMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var bumpMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var bumpScale: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[threeLib.srcMathColorMod.Color | java.lang.String | scala.Double] = js.undefined
  var displacementBias: js.UndefOr[scala.Double] = js.undefined
  var displacementMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var displacementScale: js.UndefOr[scala.Double] = js.undefined
  var map: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var matMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var morphNormals: js.UndefOr[scala.Boolean] = js.undefined
  var morphTargets: js.UndefOr[scala.Boolean] = js.undefined
  var normalMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var normalMapType: js.UndefOr[threeLib.srcConstantsMod.NormalMapTypes] = js.undefined
  var normalScale: js.UndefOr[threeLib.srcMathVector2Mod.Vector2] = js.undefined
  var skinning: js.UndefOr[scala.Boolean] = js.undefined
}

object MeshMatcapMaterialParameters {
  @scala.inline
  def apply(
    alphaMap: threeLib.srcTexturesTextureMod.Texture = null,
    alphaTest: scala.Int | scala.Double = null,
    blendDst: threeLib.srcConstantsMod.BlendingDstFactor = null,
    blendDstAlpha: scala.Int | scala.Double = null,
    blendEquation: threeLib.srcConstantsMod.BlendingEquation = null,
    blendEquationAlpha: scala.Int | scala.Double = null,
    blendSrc: threeLib.srcConstantsMod.BlendingSrcFactor | threeLib.srcConstantsMod.BlendingDstFactor = null,
    blendSrcAlpha: scala.Int | scala.Double = null,
    blending: threeLib.srcConstantsMod.Blending = null,
    bumpMap: threeLib.srcTexturesTextureMod.Texture = null,
    bumpScale: scala.Int | scala.Double = null,
    clipIntersection: js.UndefOr[scala.Boolean] = js.undefined,
    clipShadows: js.UndefOr[scala.Boolean] = js.undefined,
    clippingPlanes: js.Array[threeLib.srcMathPlaneMod.Plane] = null,
    color: threeLib.srcMathColorMod.Color | java.lang.String | scala.Double = null,
    colorWrite: js.UndefOr[scala.Boolean] = js.undefined,
    depthFunc: threeLib.srcConstantsMod.DepthModes = null,
    depthTest: js.UndefOr[scala.Boolean] = js.undefined,
    depthWrite: js.UndefOr[scala.Boolean] = js.undefined,
    displacementBias: scala.Int | scala.Double = null,
    displacementMap: threeLib.srcTexturesTextureMod.Texture = null,
    displacementScale: scala.Int | scala.Double = null,
    dithering: js.UndefOr[scala.Boolean] = js.undefined,
    flatShading: js.UndefOr[scala.Boolean] = js.undefined,
    fog: js.UndefOr[scala.Boolean] = js.undefined,
    lights: js.UndefOr[scala.Boolean] = js.undefined,
    map: threeLib.srcTexturesTextureMod.Texture = null,
    matMap: threeLib.srcTexturesTextureMod.Texture = null,
    morphNormals: js.UndefOr[scala.Boolean] = js.undefined,
    morphTargets: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    normalMap: threeLib.srcTexturesTextureMod.Texture = null,
    normalMapType: threeLib.srcConstantsMod.NormalMapTypes = null,
    normalScale: threeLib.srcMathVector2Mod.Vector2 = null,
    opacity: scala.Int | scala.Double = null,
    overdraw: scala.Int | scala.Double = null,
    polygonOffset: js.UndefOr[scala.Boolean] = js.undefined,
    polygonOffsetFactor: scala.Int | scala.Double = null,
    polygonOffsetUnits: scala.Int | scala.Double = null,
    precision: threeLib.threeLibStrings.highp | threeLib.threeLibStrings.mediump | threeLib.threeLibStrings.lowp = null,
    premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    side: threeLib.srcConstantsMod.Side = null,
    skinning: js.UndefOr[scala.Boolean] = js.undefined,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    vertexColors: threeLib.srcConstantsMod.Colors = null,
    vertexTangents: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
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
    if (matMap != null) __obj.updateDynamic("matMap")(matMap)
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
    if (side != null) __obj.updateDynamic("side")(side)
    if (!js.isUndefined(skinning)) __obj.updateDynamic("skinning")(skinning)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (vertexColors != null) __obj.updateDynamic("vertexColors")(vertexColors)
    if (!js.isUndefined(vertexTangents)) __obj.updateDynamic("vertexTangents")(vertexTangents)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MeshMatcapMaterialParameters]
  }
}

