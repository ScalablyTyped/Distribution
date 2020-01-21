package typings.wonderJs.variableLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/variable/VariableLib", "VariableLib")
@js.native
class VariableLib () extends js.Object

/* static members */
@JSImport("wonder.js/dist/es2015/renderer/shader/variable/VariableLib", "VariableLib")
@js.native
object VariableLib extends js.Object {
  var a_color: ShaderVariable = js.native
  var a_currentFrameNormal: ShaderVariable = js.native
  var a_currentFramePosition: ShaderVariable = js.native
  var a_jointIndice: ShaderVariable = js.native
  var a_jointWeight: ShaderVariable = js.native
  var a_mVec4_0: ShaderVariable = js.native
  var a_mVec4_1: ShaderVariable = js.native
  var a_mVec4_2: ShaderVariable = js.native
  var a_mVec4_3: ShaderVariable = js.native
  var a_nextFrameNormal: ShaderVariable = js.native
  var a_nextFramePosition: ShaderVariable = js.native
  var a_normal: ShaderVariable = js.native
  var a_normalVec4_0: ShaderVariable = js.native
  var a_normalVec4_1: ShaderVariable = js.native
  var a_normalVec4_2: ShaderVariable = js.native
  var a_page: ShaderVariable = js.native
  var a_position: ShaderVariable = js.native
  var a_positionVec2: ShaderVariable = js.native
  var a_quadIndex: ShaderVariable = js.native
  var a_tangent: ShaderVariable = js.native
  var a_texCoord: ShaderVariable = js.native
  var a_vertexIndex: ShaderVariable = js.native
  var u_alphaThreshold: ShaderVariable = js.native
  var u_ambient: ShaderVariable = js.native
  var u_ampScale: ShaderVariable = js.native
  var u_amplitude: ShaderVariable = js.native
  var u_bitmapSampler: ShaderVariable = js.native
  var u_brickColor: ShaderVariable = js.native
  var u_bumpMap1Sampler: ShaderVariable = js.native
  var u_bumpMap2Sampler: ShaderVariable = js.native
  var u_bumpMap3Sampler: ShaderVariable = js.native
  var u_bumpMapSampler: ShaderVariable = js.native
  var u_cameraPos: ShaderVariable = js.native
  var u_cloudColor: ShaderVariable = js.native
  var u_color: ShaderVariable = js.native
  var u_combineMode: ShaderVariable = js.native
  var u_diffuse: ShaderVariable = js.native
  var u_diffuseMap1RepeatRegion: ShaderVariable = js.native
  var u_diffuseMap1Sampler: ShaderVariable = js.native
  var u_diffuseMap2RepeatRegion: ShaderVariable = js.native
  var u_diffuseMap2Sampler: ShaderVariable = js.native
  var u_diffuseMap3RepeatRegion: ShaderVariable = js.native
  var u_diffuseMap3Sampler: ShaderVariable = js.native
  var u_diffuseMapRepeatRegion: ShaderVariable = js.native
  var u_diffuseMapSampler: ShaderVariable = js.native
  var u_diffuseMapSourceRegion: ShaderVariable = js.native
  var u_directionLights: ShaderVariable = js.native
  var u_emission: ShaderVariable = js.native
  var u_emissionMapSampler: ShaderVariable = js.native
  var u_farPlane: ShaderVariable = js.native
  var u_fireColor: ShaderVariable = js.native
  var u_grassMapDatas: ShaderVariable = js.native
  var u_grassMapSampler: ShaderVariable = js.native
  var u_grassRangeHeight: ShaderVariable = js.native
  var u_grassRangeWidth: ShaderVariable = js.native
  var u_groundColor: ShaderVariable = js.native
  var u_heightMapSampler: ShaderVariable = js.native
  var u_herb1Color: ShaderVariable = js.native
  var u_herb2Color: ShaderVariable = js.native
  var u_herb3Color: ShaderVariable = js.native
  var u_interpolation: ShaderVariable = js.native
  var u_isBothSide: ShaderVariable = js.native
  var u_isReflectionRenderListEmpty: ShaderVariable = js.native
  var u_isRefractionRenderListEmpty: ShaderVariable = js.native
  var u_isRenderListEmpty: ShaderVariable = js.native
  var u_jointColor: ShaderVariable = js.native
  var u_jointMatrices: ShaderVariable = js.native
  var u_layerHeightDatas: ShaderVariable = js.native
  var u_layerSampler2Ds: ShaderVariable = js.native
  var u_levelData: ShaderVariable = js.native
  var u_lightColor: ShaderVariable = js.native
  var u_lightMapIntensity: ShaderVariable = js.native
  var u_lightMapSampler: ShaderVariable = js.native
  var u_lightModel: ShaderVariable = js.native
  var u_lightPos: ShaderVariable = js.native
  var u_mMatrix: ShaderVariable = js.native
  var u_map0RepeatRegion: ShaderVariable = js.native
  var u_map0SourceRegion: ShaderVariable = js.native
  var u_map1RepeatRegion: ShaderVariable = js.native
  var u_map1SourceRegion: ShaderVariable = js.native
  var u_mixMapSampler: ShaderVariable = js.native
  var u_mixRatio: ShaderVariable = js.native
  var u_mvpMatrix: ShaderVariable = js.native
  var u_normalMapSampler: ShaderVariable = js.native
  var u_normalMatrix: ShaderVariable = js.native
  var u_opacity: ShaderVariable = js.native
  var u_pMatrix: ShaderVariable = js.native
  var u_pageSampler2Ds: ShaderVariable = js.native
  var u_pointLights: ShaderVariable = js.native
  var u_reflectionMapSampler: ShaderVariable = js.native
  var u_reflectivity: ShaderVariable = js.native
  var u_refractionMapSampler: ShaderVariable = js.native
  var u_refractionRatio: ShaderVariable = js.native
  var u_roadColor: ShaderVariable = js.native
  var u_sampler2D0: ShaderVariable = js.native
  var u_sampler2D1: ShaderVariable = js.native
  var u_samplerCube0: ShaderVariable = js.native
  var u_shift: ShaderVariable = js.native
  var u_shininess: ShaderVariable = js.native
  var u_skyColor: ShaderVariable = js.native
  var u_specular: ShaderVariable = js.native
  var u_specularMapSampler: ShaderVariable = js.native
  var u_speed: ShaderVariable = js.native
  var u_terrainMaxHeight: ShaderVariable = js.native
  var u_terrainMinHeight: ShaderVariable = js.native
  var u_terrainPositionY: ShaderVariable = js.native
  var u_terrainRangeHeight: ShaderVariable = js.native
  var u_terrainRangeWidth: ShaderVariable = js.native
  var u_terrainScaleY: ShaderVariable = js.native
  var u_terrainSubdivisions: ShaderVariable = js.native
  var u_tilesHeightNumber: ShaderVariable = js.native
  var u_tilesWidthNumber: ShaderVariable = js.native
  var u_time: ShaderVariable = js.native
  var u_vMatrix: ShaderVariable = js.native
  var u_vpMatrix: ShaderVariable = js.native
  var u_vpMatrixFromLight: ShaderVariable = js.native
  var u_waveData: ShaderVariable = js.native
  var u_windData: ShaderVariable = js.native
  var u_windMatrix: ShaderVariable = js.native
  var u_woodColor: ShaderVariable = js.native
}

