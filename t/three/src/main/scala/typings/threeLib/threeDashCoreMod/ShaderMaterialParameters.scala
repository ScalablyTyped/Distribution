package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderMaterialParameters extends MaterialParameters {
  var clipping: js.UndefOr[scala.Boolean] = js.undefined
  var defines: js.UndefOr[js.Any] = js.undefined
  var fragmentShader: js.UndefOr[java.lang.String] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var morphNormals: js.UndefOr[scala.Boolean] = js.undefined
  var morphTargets: js.UndefOr[scala.Boolean] = js.undefined
  var skinning: js.UndefOr[scala.Boolean] = js.undefined
  var uniforms: js.UndefOr[js.Any] = js.undefined
  var vertexShader: js.UndefOr[java.lang.String] = js.undefined
  var wireframe: js.UndefOr[scala.Boolean] = js.undefined
  var wireframeLinewidth: js.UndefOr[scala.Double] = js.undefined
}

object ShaderMaterialParameters {
  @scala.inline
  def apply(
    alphaTest: scala.Int | scala.Double = null,
    blendDst: BlendingDstFactor = null,
    blendDstAlpha: scala.Int | scala.Double = null,
    blendEquation: BlendingEquation = null,
    blendEquationAlpha: scala.Int | scala.Double = null,
    blendSrc: BlendingSrcFactor | BlendingDstFactor = null,
    blendSrcAlpha: scala.Int | scala.Double = null,
    blending: Blending = null,
    clipIntersection: js.UndefOr[scala.Boolean] = js.undefined,
    clipShadows: js.UndefOr[scala.Boolean] = js.undefined,
    clipping: js.UndefOr[scala.Boolean] = js.undefined,
    clippingPlanes: js.Array[Plane] = null,
    colorWrite: js.UndefOr[scala.Boolean] = js.undefined,
    defines: js.Any = null,
    depthFunc: DepthModes = null,
    depthTest: js.UndefOr[scala.Boolean] = js.undefined,
    depthWrite: js.UndefOr[scala.Boolean] = js.undefined,
    dithering: js.UndefOr[scala.Boolean] = js.undefined,
    flatShading: js.UndefOr[scala.Boolean] = js.undefined,
    fog: js.UndefOr[scala.Boolean] = js.undefined,
    fragmentShader: java.lang.String = null,
    lights: js.UndefOr[scala.Boolean] = js.undefined,
    lineWidth: scala.Int | scala.Double = null,
    morphNormals: js.UndefOr[scala.Boolean] = js.undefined,
    morphTargets: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    overdraw: scala.Int | scala.Double = null,
    polygonOffset: js.UndefOr[scala.Boolean] = js.undefined,
    polygonOffsetFactor: scala.Int | scala.Double = null,
    polygonOffsetUnits: scala.Int | scala.Double = null,
    precision: threeLib.threeLibStrings.highp | threeLib.threeLibStrings.mediump | threeLib.threeLibStrings.lowp = null,
    premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    side: Side = null,
    skinning: js.UndefOr[scala.Boolean] = js.undefined,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    uniforms: js.Any = null,
    vertexColors: Colors = null,
    vertexShader: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    wireframe: js.UndefOr[scala.Boolean] = js.undefined,
    wireframeLinewidth: scala.Int | scala.Double = null
  ): ShaderMaterialParameters = {
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
    if (!js.isUndefined(clipping)) __obj.updateDynamic("clipping")(clipping)
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes)
    if (!js.isUndefined(colorWrite)) __obj.updateDynamic("colorWrite")(colorWrite)
    if (defines != null) __obj.updateDynamic("defines")(defines)
    if (depthFunc != null) __obj.updateDynamic("depthFunc")(depthFunc)
    if (!js.isUndefined(depthTest)) __obj.updateDynamic("depthTest")(depthTest)
    if (!js.isUndefined(depthWrite)) __obj.updateDynamic("depthWrite")(depthWrite)
    if (!js.isUndefined(dithering)) __obj.updateDynamic("dithering")(dithering)
    if (!js.isUndefined(flatShading)) __obj.updateDynamic("flatShading")(flatShading)
    if (!js.isUndefined(fog)) __obj.updateDynamic("fog")(fog)
    if (fragmentShader != null) __obj.updateDynamic("fragmentShader")(fragmentShader)
    if (!js.isUndefined(lights)) __obj.updateDynamic("lights")(lights)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(morphNormals)) __obj.updateDynamic("morphNormals")(morphNormals)
    if (!js.isUndefined(morphTargets)) __obj.updateDynamic("morphTargets")(morphTargets)
    if (name != null) __obj.updateDynamic("name")(name)
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
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms)
    if (vertexColors != null) __obj.updateDynamic("vertexColors")(vertexColors)
    if (vertexShader != null) __obj.updateDynamic("vertexShader")(vertexShader)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(wireframe)) __obj.updateDynamic("wireframe")(wireframe)
    if (wireframeLinewidth != null) __obj.updateDynamic("wireframeLinewidth")(wireframeLinewidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderMaterialParameters]
  }
}

