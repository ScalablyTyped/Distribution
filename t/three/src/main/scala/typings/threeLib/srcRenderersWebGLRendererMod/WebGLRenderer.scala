package typings
package threeLib.srcRenderersWebGLRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/WebGLRenderer", "WebGLRenderer")
@js.native
/**
  * parameters is an optional object with properties defining the renderer's behaviour. The constructor also accepts no parameters at all. In all cases, it will assume sane defaults when parameters are missing.
  */
class WebGLRenderer () extends Renderer {
  def this(parameters: WebGLRendererParameters) = this()
  /**
    * Defines whether the renderer should automatically clear its output before rendering.
    */
  var autoClear: scala.Boolean = js.native
  /**
    * If autoClear is true, defines whether the renderer should clear the color buffer. Default is true.
    */
  var autoClearColor: scala.Boolean = js.native
  /**
    * If autoClear is true, defines whether the renderer should clear the depth buffer. Default is true.
    */
  var autoClearDepth: scala.Boolean = js.native
  /**
    * If autoClear is true, defines whether the renderer should clear the stencil buffer. Default is true.
    */
  var autoClearStencil: scala.Boolean = js.native
  var capabilities: threeLib.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities = js.native
  var clippingPlanes: js.Array[_] = js.native
  /**
    * The HTML5 Canvas's 'webgl' context obtained from the canvas where the renderer will draw.
    */
  var context: stdLib.WebGLRenderingContext = js.native
  /**
    * Debug configurations.
    */
  var debug: WebGLDebug = js.native
  var extensions: threeLib.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions = js.native
  /**
    * @deprecated
    */
  var gammaFactor: scala.Double = js.native
  /**
    * Default is false.
    */
  var gammaInput: scala.Boolean = js.native
  /**
    * Default is false.
    */
  var gammaOutput: scala.Boolean = js.native
  var info: threeLib.srcRenderersWebglWebGLInfoMod.WebGLInfo = js.native
  var localClippingEnabled: scala.Boolean = js.native
  /**
    * Default is 4.
    */
  var maxMorphNormals: scala.Double = js.native
  /**
    * Default is 8.
    */
  var maxMorphTargets: scala.Double = js.native
  var physicallyCorrectLights: scala.Boolean = js.native
  var pixelRation: scala.Double = js.native
  var properties: threeLib.srcRenderersWebglWebGLPropertiesMod.WebGLProperties = js.native
  var renderLists: threeLib.srcRenderersWebglWebGLRenderListsMod.WebGLRenderLists = js.native
  var shadowMap: threeLib.srcRenderersWebglWebGLShadowMapMod.WebGLShadowMap = js.native
  /**
    * @deprecated Use {@link WebGLShadowMap#cullFace .shadowMap.cullFace} instead.
    */
  var shadowMapCullFace: threeLib.srcConstantsMod.CullFace = js.native
  /**
    * Default is false.
    */
  var shadowMapDebug: scala.Boolean = js.native
  /**
    * @deprecated Use {@link WebGLShadowMap#enabled .shadowMap.enabled} instead.
    */
  var shadowMapEnabled: scala.Boolean = js.native
  /**
    * @deprecated Use {@link WebGLShadowMap#type .shadowMap.type} instead.
    */
  var shadowMapType: threeLib.srcConstantsMod.ShadowMapType = js.native
  /**
    * Defines whether the renderer should sort objects. Default is true.
    */
  var sortObjects: scala.Boolean = js.native
  var state: threeLib.srcRenderersWebglWebGLStateMod.WebGLState = js.native
  var toneMapping: threeLib.srcConstantsMod.ToneMapping = js.native
  var toneMappingExposure: scala.Double = js.native
  var toneMappingWhitePoint: scala.Double = js.native
  var vr: threeLib.srcRenderersWebvrWebVRManagerMod.WebVRManager = js.native
  /**
    * @deprecated Use {@link WebGLRenderer#setAnimationLoop .setAnimationLoop()} instead.
    */
  def animate(callback: js.Function): scala.Unit = js.native
  /**
    * Tells the renderer to clear its color, depth or stencil drawing buffer(s).
    * Arguments default to true
    */
  def clear(): scala.Unit = js.native
  def clear(color: scala.Boolean): scala.Unit = js.native
  def clear(color: scala.Boolean, depth: scala.Boolean): scala.Unit = js.native
  def clear(color: scala.Boolean, depth: scala.Boolean, stencil: scala.Boolean): scala.Unit = js.native
  def clearColor(): scala.Unit = js.native
  def clearDepth(): scala.Unit = js.native
  def clearStencil(): scala.Unit = js.native
  def clearTarget(
    renderTarget: threeLib.srcRenderersWebGLRenderTargetMod.WebGLRenderTarget,
    color: scala.Boolean,
    depth: scala.Boolean,
    stencil: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Compiles all materials in the scene with the camera. This is useful to precompile shaders before the first rendering.
    */
  def compile(scene: threeLib.srcScenesSceneMod.Scene, camera: threeLib.srcCamerasCameraMod.Camera): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  /**
    * @deprecated Use {@link WebGLRenderer#setScissorTest .setScissorTest()} instead.
    */
  def enableScissorTest(boolean: js.Any): js.Any = js.native
  def forceContextLoss(): scala.Unit = js.native
  /**
    * Returns a float with the current clear alpha. Ranges from 0 to 1.
    */
  def getClearAlpha(): scala.Double = js.native
  /**
    * Returns a THREE.Color instance with the current clear color.
    */
  def getClearColor(): threeLib.srcMathColorMod.Color = js.native
  /**
    * Return the WebGL context.
    */
  def getContext(): stdLib.WebGLRenderingContext = js.native
  def getContextAttributes(): js.Any = js.native
  /**
    * @deprecated Use {@link WebGLRenderer#getRenderTarget .getRenderTarget()} instead.
    */
  def getCurrentRenderTarget(): threeLib.srcRenderersWebglWebGLRenderListsMod.RenderTarget | scala.Null = js.native
  def getCurrentViewport(target: threeLib.srcMathVector4Mod.Vector4): threeLib.srcMathVector4Mod.Vector4 = js.native
  def getDrawingBufferSize(target: threeLib.srcMathVector2Mod.Vector2): threeLib.srcMathVector2Mod.Vector2 = js.native
  /**
    * @deprecated Use {@link WebGLCapabilities#getMaxAnisotropy .capabilities.getMaxAnisotropy()} instead.
    */
  def getMaxAnisotropy(): scala.Double = js.native
  def getPixelRatio(): scala.Double = js.native
  /**
    * @deprecated Use {@link WebGLCapabilities#precision .capabilities.precision} instead.
    */
  def getPrecision(): java.lang.String = js.native
  /**
    * Returns the current render target. If no render target is set, null is returned.
    */
  def getRenderTarget(): threeLib.srcRenderersWebglWebGLRenderListsMod.RenderTarget | scala.Null = js.native
  /**
    * Copies the scissor area into target.
    */
  def getScissor(target: threeLib.srcMathVector4Mod.Vector4): threeLib.srcMathVector4Mod.Vector4 = js.native
  /**
    * Returns true if scissor test is enabled; returns false otherwise.
    */
  def getScissorTest(): scala.Boolean = js.native
  def getSize(target: threeLib.srcMathVector2Mod.Vector2): threeLib.srcMathVector2Mod.Vector2 = js.native
  /**
    * Copies the viewport into target.
    */
  def getViewport(target: threeLib.srcMathVector4Mod.Vector4): threeLib.srcMathVector4Mod.Vector4 = js.native
  def readRenderTargetPixels(
    renderTarget: threeLib.srcRenderersWebglWebGLRenderListsMod.RenderTarget,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    buffer: js.Any
  ): scala.Unit = js.native
  def renderBufferDirect(
    camera: threeLib.srcCamerasCameraMod.Camera,
    fog: threeLib.srcScenesFogMod.Fog,
    material: threeLib.srcMaterialsMaterialMod.Material,
    geometryGroup: js.Any,
    `object`: threeLib.srcCoreObject3DMod.Object3D
  ): scala.Unit = js.native
  /**
    * Tells the shadow map plugin to update using the passed scene and camera parameters.
    *
    * @param scene an instance of Scene
    * @param camera — an instance of Camera
    */
  def renderBufferImmediate(
    `object`: threeLib.srcCoreObject3DMod.Object3D,
    program: js.Object,
    material: threeLib.srcMaterialsMaterialMod.Material
  ): scala.Unit = js.native
  /**
    * @deprecated Use {@link WebGLState#reset .state.reset()} instead.
    */
  def resetGLState(): scala.Unit = js.native
  /**
    * A build in function that can be used instead of requestAnimationFrame. For WebVR projects this function must be used.
    * @param callback The function will be called every available frame. If `null` is passed it will stop any already ongoing animation.
    */
  def setAnimationLoop(callback: js.Function): scala.Unit = js.native
  def setClearAlpha(alpha: scala.Double): scala.Unit = js.native
  def setClearColor(color: java.lang.String): scala.Unit = js.native
  def setClearColor(color: java.lang.String, alpha: scala.Double): scala.Unit = js.native
  def setClearColor(color: scala.Double): scala.Unit = js.native
  def setClearColor(color: scala.Double, alpha: scala.Double): scala.Unit = js.native
  /**
    * Sets the clear color, using color for the color and alpha for the opacity.
    */
  def setClearColor(color: threeLib.srcMathColorMod.Color): scala.Unit = js.native
  def setClearColor(color: threeLib.srcMathColorMod.Color, alpha: scala.Double): scala.Unit = js.native
  def setDrawingBufferSize(width: scala.Double, height: scala.Double, pixelRatio: scala.Double): scala.Unit = js.native
  def setPixelRatio(value: scala.Double): scala.Unit = js.native
  def setRenderTarget(): scala.Unit = js.native
  def setRenderTarget(renderTarget: scala.Null, activeCubeFace: scala.Double): scala.Unit = js.native
  def setRenderTarget(renderTarget: scala.Null, activeCubeFace: scala.Double, activeMipMapLevel: scala.Double): scala.Unit = js.native
  /**
    * Sets the active render target.
    *
    * @param renderTarget The {@link WebGLRenderTarget renderTarget} that needs to be activated. When `null` is given, the canvas is set as the active render target instead.
  	 * @param activeCubeFace Specifies the active cube side (PX 0, NX 1, PY 2, NY 3, PZ 4, NZ 5) of {@link WebGLRenderTargetCube}.
  	 * @param activeMipMapLevel Specifies the active mipmap level.
    */
  def setRenderTarget(renderTarget: threeLib.srcRenderersWebglWebGLRenderListsMod.RenderTarget): scala.Unit = js.native
  def setRenderTarget(
    renderTarget: threeLib.srcRenderersWebglWebGLRenderListsMod.RenderTarget,
    activeCubeFace: scala.Double
  ): scala.Unit = js.native
  def setRenderTarget(
    renderTarget: threeLib.srcRenderersWebglWebGLRenderListsMod.RenderTarget,
    activeCubeFace: scala.Double,
    activeMipMapLevel: scala.Double
  ): scala.Unit = js.native
  def setScissor(x: scala.Double): scala.Unit = js.native
  def setScissor(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setScissor(x: scala.Double, y: scala.Double, width: scala.Double): scala.Unit = js.native
  def setScissor(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Sets the scissor area from (x, y) to (x + width, y + height).
    */
  def setScissor(x: threeLib.srcMathVector4Mod.Vector4): scala.Unit = js.native
  def setScissor(x: threeLib.srcMathVector4Mod.Vector4, y: scala.Double): scala.Unit = js.native
  def setScissor(x: threeLib.srcMathVector4Mod.Vector4, y: scala.Double, width: scala.Double): scala.Unit = js.native
  def setScissor(x: threeLib.srcMathVector4Mod.Vector4, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Enable the scissor test. When this is enabled, only the pixels within the defined scissor area will be affected by further renderer actions.
    */
  def setScissorTest(enable: scala.Boolean): scala.Unit = js.native
  def setViewport(x: scala.Double): scala.Unit = js.native
  def setViewport(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setViewport(x: scala.Double, y: scala.Double, width: scala.Double): scala.Unit = js.native
  def setViewport(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * Sets the viewport to render from (x, y) to (x + width, y + height).
    * (x, y) is the lower-left corner of the region.
    */
  def setViewport(x: threeLib.srcMathVector4Mod.Vector4): scala.Unit = js.native
  def setViewport(x: threeLib.srcMathVector4Mod.Vector4, y: scala.Double): scala.Unit = js.native
  def setViewport(x: threeLib.srcMathVector4Mod.Vector4, y: scala.Double, width: scala.Double): scala.Unit = js.native
  def setViewport(x: threeLib.srcMathVector4Mod.Vector4, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
    * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'EXT_blend_minmax' )} instead.
    */
  def supportsBlendMinMax(): js.Any = js.native
  /**
    * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'WEBGL_compressed_texture_pvrtc' )} instead.
    */
  def supportsCompressedTexturePVRTC(): js.Any = js.native
  /**
    * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'WEBGL_compressed_texture_s3tc' )} instead.
    */
  def supportsCompressedTextureS3TC(): js.Any = js.native
  /**
    * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'OES_texture_float' )} instead.
    */
  def supportsFloatTextures(): js.Any = js.native
  /**
    * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'OES_texture_half_float' )} instead.
    */
  def supportsHalfFloatTextures(): js.Any = js.native
  /**
    * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'ANGLE_instanced_arrays' )} instead.
    */
  def supportsInstancedArrays(): js.Any = js.native
  /**
    * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'OES_standard_derivatives' )} instead.
    */
  def supportsStandardDerivatives(): js.Any = js.native
  /**
    * @deprecated Use {@link WebGLCapabilities#vertexTextures .capabilities.vertexTextures} instead.
    */
  def supportsVertexTextures(): js.Any = js.native
}

