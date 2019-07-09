package typings
package threeLib.srcMaterialsMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterialParameters extends js.Object {
  var alphaTest: js.UndefOr[scala.Double] = js.undefined
  var blendDst: js.UndefOr[threeLib.srcConstantsMod.BlendingDstFactor] = js.undefined
  var blendDstAlpha: js.UndefOr[scala.Double] = js.undefined
  var blendEquation: js.UndefOr[threeLib.srcConstantsMod.BlendingEquation] = js.undefined
  var blendEquationAlpha: js.UndefOr[scala.Double] = js.undefined
  var blendSrc: js.UndefOr[
    threeLib.srcConstantsMod.BlendingSrcFactor | threeLib.srcConstantsMod.BlendingDstFactor
  ] = js.undefined
  var blendSrcAlpha: js.UndefOr[scala.Double] = js.undefined
  var blending: js.UndefOr[threeLib.srcConstantsMod.Blending] = js.undefined
  var clipIntersection: js.UndefOr[scala.Boolean] = js.undefined
  var clipShadows: js.UndefOr[scala.Boolean] = js.undefined
  var clippingPlanes: js.UndefOr[js.Array[threeLib.srcMathPlaneMod.Plane]] = js.undefined
  var colorWrite: js.UndefOr[scala.Boolean] = js.undefined
  var depthFunc: js.UndefOr[threeLib.srcConstantsMod.DepthModes] = js.undefined
  var depthTest: js.UndefOr[scala.Boolean] = js.undefined
  var depthWrite: js.UndefOr[scala.Boolean] = js.undefined
  var dithering: js.UndefOr[scala.Boolean] = js.undefined
  var flatShading: js.UndefOr[scala.Boolean] = js.undefined
  var fog: js.UndefOr[scala.Boolean] = js.undefined
  var lights: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var overdraw: js.UndefOr[scala.Double] = js.undefined
  var polygonOffset: js.UndefOr[scala.Boolean] = js.undefined
  var polygonOffsetFactor: js.UndefOr[scala.Double] = js.undefined
  var polygonOffsetUnits: js.UndefOr[scala.Double] = js.undefined
  var precision: js.UndefOr[
    threeLib.threeLibStrings.highp | threeLib.threeLibStrings.mediump | threeLib.threeLibStrings.lowp | scala.Null
  ] = js.undefined
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined
  var shadowSide: js.UndefOr[threeLib.srcConstantsMod.Side] = js.undefined
  var side: js.UndefOr[threeLib.srcConstantsMod.Side] = js.undefined
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  var vertexColors: js.UndefOr[threeLib.srcConstantsMod.Colors] = js.undefined
  var vertexTangents: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object MaterialParameters {
  @scala.inline
  def apply(
    alphaTest: scala.Int | scala.Double = null,
    blendDst: threeLib.srcConstantsMod.BlendingDstFactor = null,
    blendDstAlpha: scala.Int | scala.Double = null,
    blendEquation: threeLib.srcConstantsMod.BlendingEquation = null,
    blendEquationAlpha: scala.Int | scala.Double = null,
    blendSrc: threeLib.srcConstantsMod.BlendingSrcFactor | threeLib.srcConstantsMod.BlendingDstFactor = null,
    blendSrcAlpha: scala.Int | scala.Double = null,
    blending: threeLib.srcConstantsMod.Blending = null,
    clipIntersection: js.UndefOr[scala.Boolean] = js.undefined,
    clipShadows: js.UndefOr[scala.Boolean] = js.undefined,
    clippingPlanes: js.Array[threeLib.srcMathPlaneMod.Plane] = null,
    colorWrite: js.UndefOr[scala.Boolean] = js.undefined,
    depthFunc: threeLib.srcConstantsMod.DepthModes = null,
    depthTest: js.UndefOr[scala.Boolean] = js.undefined,
    depthWrite: js.UndefOr[scala.Boolean] = js.undefined,
    dithering: js.UndefOr[scala.Boolean] = js.undefined,
    flatShading: js.UndefOr[scala.Boolean] = js.undefined,
    fog: js.UndefOr[scala.Boolean] = js.undefined,
    lights: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    overdraw: scala.Int | scala.Double = null,
    polygonOffset: js.UndefOr[scala.Boolean] = js.undefined,
    polygonOffsetFactor: scala.Int | scala.Double = null,
    polygonOffsetUnits: scala.Int | scala.Double = null,
    precision: threeLib.threeLibStrings.highp | threeLib.threeLibStrings.mediump | threeLib.threeLibStrings.lowp = null,
    premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    shadowSide: threeLib.srcConstantsMod.Side = null,
    side: threeLib.srcConstantsMod.Side = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    vertexColors: threeLib.srcConstantsMod.Colors = null,
    vertexTangents: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
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
    if (!js.isUndefined(lights)) __obj.updateDynamic("lights")(lights)
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
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (vertexColors != null) __obj.updateDynamic("vertexColors")(vertexColors)
    if (!js.isUndefined(vertexTangents)) __obj.updateDynamic("vertexTangents")(vertexTangents)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MaterialParameters]
  }
}

