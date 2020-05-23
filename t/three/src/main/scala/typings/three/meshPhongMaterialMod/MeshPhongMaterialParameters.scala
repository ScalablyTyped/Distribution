package typings.three.meshPhongMaterialMod

import typings.three.colorMod.Color
import typings.three.constantsMod.Blending
import typings.three.constantsMod.BlendingDstFactor
import typings.three.constantsMod.BlendingEquation
import typings.three.constantsMod.BlendingSrcFactor
import typings.three.constantsMod.Combine
import typings.three.constantsMod.DepthModes
import typings.three.constantsMod.NormalMapTypes
import typings.three.constantsMod.Side
import typings.three.constantsMod.StencilFunc
import typings.three.constantsMod.StencilOp
import typings.three.materialMod.MaterialParameters
import typings.three.planeMod.Plane
import typings.three.textureMod.Texture
import typings.three.threeStrings.highp
import typings.three.threeStrings.lowp
import typings.three.threeStrings.mediump
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshPhongMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture | Null] = js.undefined
  var aoMap: js.UndefOr[Texture | Null] = js.undefined
  var aoMapIntensity: js.UndefOr[Double] = js.undefined
  var bumpMap: js.UndefOr[Texture | Null] = js.undefined
  var bumpScale: js.UndefOr[Double] = js.undefined
  /** geometry color in hexadecimal. Default is 0xffffff. */
  var color: js.UndefOr[Color | String | Double] = js.undefined
  var combine: js.UndefOr[Combine] = js.undefined
  var displacementBias: js.UndefOr[Double] = js.undefined
  var displacementMap: js.UndefOr[Texture | Null] = js.undefined
  var displacementScale: js.UndefOr[Double] = js.undefined
  var emissive: js.UndefOr[Color | String | Double] = js.undefined
  var emissiveIntensity: js.UndefOr[Double] = js.undefined
  var emissiveMap: js.UndefOr[Texture | Null] = js.undefined
  var envMap: js.UndefOr[Texture | Null] = js.undefined
  var lightMap: js.UndefOr[Texture | Null] = js.undefined
  var lightMapIntensity: js.UndefOr[Double] = js.undefined
  var map: js.UndefOr[Texture | Null] = js.undefined
  var morphNormals: js.UndefOr[Boolean] = js.undefined
  var morphTargets: js.UndefOr[Boolean] = js.undefined
  var normalMap: js.UndefOr[Texture | Null] = js.undefined
  var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
  var normalScale: js.UndefOr[Vector2] = js.undefined
  var reflectivity: js.UndefOr[Double] = js.undefined
  var refractionRatio: js.UndefOr[Double] = js.undefined
  var shininess: js.UndefOr[Double] = js.undefined
  var skinning: js.UndefOr[Boolean] = js.undefined
  var specular: js.UndefOr[Color | String | Double] = js.undefined
  var specularMap: js.UndefOr[Texture | Null] = js.undefined
  var wireframe: js.UndefOr[Boolean] = js.undefined
  var wireframeLinecap: js.UndefOr[String] = js.undefined
  var wireframeLinejoin: js.UndefOr[String] = js.undefined
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}

object MeshPhongMaterialParameters {
  @scala.inline
  def apply(
    alphaMap: js.UndefOr[Null | Texture] = js.undefined,
    alphaTest: js.UndefOr[Double] = js.undefined,
    aoMap: js.UndefOr[Null | Texture] = js.undefined,
    aoMapIntensity: js.UndefOr[Double] = js.undefined,
    blendDst: BlendingDstFactor = null,
    blendDstAlpha: js.UndefOr[Double] = js.undefined,
    blendEquation: BlendingEquation = null,
    blendEquationAlpha: js.UndefOr[Double] = js.undefined,
    blendSrc: BlendingSrcFactor | BlendingDstFactor = null,
    blendSrcAlpha: js.UndefOr[Double] = js.undefined,
    blending: Blending = null,
    bumpMap: js.UndefOr[Null | Texture] = js.undefined,
    bumpScale: js.UndefOr[Double] = js.undefined,
    clipIntersection: js.UndefOr[Boolean] = js.undefined,
    clipShadows: js.UndefOr[Boolean] = js.undefined,
    clippingPlanes: js.Array[Plane] = null,
    color: Color | String | Double = null,
    colorWrite: js.UndefOr[Boolean] = js.undefined,
    combine: Combine = null,
    defines: js.Any = null,
    depthFunc: DepthModes = null,
    depthTest: js.UndefOr[Boolean] = js.undefined,
    depthWrite: js.UndefOr[Boolean] = js.undefined,
    displacementBias: js.UndefOr[Double] = js.undefined,
    displacementMap: js.UndefOr[Null | Texture] = js.undefined,
    displacementScale: js.UndefOr[Double] = js.undefined,
    dithering: js.UndefOr[Boolean] = js.undefined,
    emissive: Color | String | Double = null,
    emissiveIntensity: js.UndefOr[Double] = js.undefined,
    emissiveMap: js.UndefOr[Null | Texture] = js.undefined,
    envMap: js.UndefOr[Null | Texture] = js.undefined,
    flatShading: js.UndefOr[Boolean] = js.undefined,
    fog: js.UndefOr[Boolean] = js.undefined,
    lightMap: js.UndefOr[Null | Texture] = js.undefined,
    lightMapIntensity: js.UndefOr[Double] = js.undefined,
    map: js.UndefOr[Null | Texture] = js.undefined,
    morphNormals: js.UndefOr[Boolean] = js.undefined,
    morphTargets: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    normalMap: js.UndefOr[Null | Texture] = js.undefined,
    normalMapType: NormalMapTypes = null,
    normalScale: Vector2 = null,
    opacity: js.UndefOr[Double] = js.undefined,
    polygonOffset: js.UndefOr[Boolean] = js.undefined,
    polygonOffsetFactor: js.UndefOr[Double] = js.undefined,
    polygonOffsetUnits: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Null | highp | mediump | lowp] = js.undefined,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    reflectivity: js.UndefOr[Double] = js.undefined,
    refractionRatio: js.UndefOr[Double] = js.undefined,
    shadowSide: Side = null,
    shininess: js.UndefOr[Double] = js.undefined,
    side: Side = null,
    skinning: js.UndefOr[Boolean] = js.undefined,
    specular: Color | String | Double = null,
    specularMap: js.UndefOr[Null | Texture] = js.undefined,
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
    visible: js.UndefOr[Boolean] = js.undefined,
    wireframe: js.UndefOr[Boolean] = js.undefined,
    wireframeLinecap: String = null,
    wireframeLinejoin: String = null,
    wireframeLinewidth: js.UndefOr[Double] = js.undefined
  ): MeshPhongMaterialParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alphaMap)) __obj.updateDynamic("alphaMap")(alphaMap.asInstanceOf[js.Any])
    if (!js.isUndefined(alphaTest)) __obj.updateDynamic("alphaTest")(alphaTest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(aoMap)) __obj.updateDynamic("aoMap")(aoMap.asInstanceOf[js.Any])
    if (!js.isUndefined(aoMapIntensity)) __obj.updateDynamic("aoMapIntensity")(aoMapIntensity.get.asInstanceOf[js.Any])
    if (blendDst != null) __obj.updateDynamic("blendDst")(blendDst.asInstanceOf[js.Any])
    if (!js.isUndefined(blendDstAlpha)) __obj.updateDynamic("blendDstAlpha")(blendDstAlpha.get.asInstanceOf[js.Any])
    if (blendEquation != null) __obj.updateDynamic("blendEquation")(blendEquation.asInstanceOf[js.Any])
    if (!js.isUndefined(blendEquationAlpha)) __obj.updateDynamic("blendEquationAlpha")(blendEquationAlpha.get.asInstanceOf[js.Any])
    if (blendSrc != null) __obj.updateDynamic("blendSrc")(blendSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(blendSrcAlpha)) __obj.updateDynamic("blendSrcAlpha")(blendSrcAlpha.get.asInstanceOf[js.Any])
    if (blending != null) __obj.updateDynamic("blending")(blending.asInstanceOf[js.Any])
    if (!js.isUndefined(bumpMap)) __obj.updateDynamic("bumpMap")(bumpMap.asInstanceOf[js.Any])
    if (!js.isUndefined(bumpScale)) __obj.updateDynamic("bumpScale")(bumpScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clipIntersection)) __obj.updateDynamic("clipIntersection")(clipIntersection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clipShadows)) __obj.updateDynamic("clipShadows")(clipShadows.get.asInstanceOf[js.Any])
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWrite)) __obj.updateDynamic("colorWrite")(colorWrite.get.asInstanceOf[js.Any])
    if (combine != null) __obj.updateDynamic("combine")(combine.asInstanceOf[js.Any])
    if (defines != null) __obj.updateDynamic("defines")(defines.asInstanceOf[js.Any])
    if (depthFunc != null) __obj.updateDynamic("depthFunc")(depthFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(depthTest)) __obj.updateDynamic("depthTest")(depthTest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depthWrite)) __obj.updateDynamic("depthWrite")(depthWrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displacementBias)) __obj.updateDynamic("displacementBias")(displacementBias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displacementMap)) __obj.updateDynamic("displacementMap")(displacementMap.asInstanceOf[js.Any])
    if (!js.isUndefined(displacementScale)) __obj.updateDynamic("displacementScale")(displacementScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dithering)) __obj.updateDynamic("dithering")(dithering.get.asInstanceOf[js.Any])
    if (emissive != null) __obj.updateDynamic("emissive")(emissive.asInstanceOf[js.Any])
    if (!js.isUndefined(emissiveIntensity)) __obj.updateDynamic("emissiveIntensity")(emissiveIntensity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emissiveMap)) __obj.updateDynamic("emissiveMap")(emissiveMap.asInstanceOf[js.Any])
    if (!js.isUndefined(envMap)) __obj.updateDynamic("envMap")(envMap.asInstanceOf[js.Any])
    if (!js.isUndefined(flatShading)) __obj.updateDynamic("flatShading")(flatShading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fog)) __obj.updateDynamic("fog")(fog.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lightMap)) __obj.updateDynamic("lightMap")(lightMap.asInstanceOf[js.Any])
    if (!js.isUndefined(lightMapIntensity)) __obj.updateDynamic("lightMapIntensity")(lightMapIntensity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(morphNormals)) __obj.updateDynamic("morphNormals")(morphNormals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(morphTargets)) __obj.updateDynamic("morphTargets")(morphTargets.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(normalMap)) __obj.updateDynamic("normalMap")(normalMap.asInstanceOf[js.Any])
    if (normalMapType != null) __obj.updateDynamic("normalMapType")(normalMapType.asInstanceOf[js.Any])
    if (normalScale != null) __obj.updateDynamic("normalScale")(normalScale.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffset)) __obj.updateDynamic("polygonOffset")(polygonOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffsetFactor)) __obj.updateDynamic("polygonOffsetFactor")(polygonOffsetFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffsetUnits)) __obj.updateDynamic("polygonOffsetUnits")(polygonOffsetUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reflectivity)) __obj.updateDynamic("reflectivity")(reflectivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refractionRatio)) __obj.updateDynamic("refractionRatio")(refractionRatio.get.asInstanceOf[js.Any])
    if (shadowSide != null) __obj.updateDynamic("shadowSide")(shadowSide.asInstanceOf[js.Any])
    if (!js.isUndefined(shininess)) __obj.updateDynamic("shininess")(shininess.get.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(skinning)) __obj.updateDynamic("skinning")(skinning.get.asInstanceOf[js.Any])
    if (specular != null) __obj.updateDynamic("specular")(specular.asInstanceOf[js.Any])
    if (!js.isUndefined(specularMap)) __obj.updateDynamic("specularMap")(specularMap.asInstanceOf[js.Any])
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
    if (!js.isUndefined(wireframe)) __obj.updateDynamic("wireframe")(wireframe.get.asInstanceOf[js.Any])
    if (wireframeLinecap != null) __obj.updateDynamic("wireframeLinecap")(wireframeLinecap.asInstanceOf[js.Any])
    if (wireframeLinejoin != null) __obj.updateDynamic("wireframeLinejoin")(wireframeLinejoin.asInstanceOf[js.Any])
    if (!js.isUndefined(wireframeLinewidth)) __obj.updateDynamic("wireframeLinewidth")(wireframeLinewidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshPhongMaterialParameters]
  }
}

