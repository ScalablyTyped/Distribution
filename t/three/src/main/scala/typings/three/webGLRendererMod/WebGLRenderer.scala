package typings.three.webGLRendererMod

import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderingContext
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.cameraMod.Camera
import typings.three.colorMod.Color
import typings.three.constantsMod.CullFace
import typings.three.constantsMod.ShadowMapType
import typings.three.constantsMod.TextureEncoding
import typings.three.constantsMod.ToneMapping
import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.sceneMod.Scene
import typings.three.textureMod.Texture
import typings.three.vector2Mod.Vector2
import typings.three.vector4Mod.Vector4
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLExtensionsMod.WebGLExtensions
import typings.three.webGLInfoMod.WebGLInfo
import typings.three.webGLProgramMod.WebGLProgram
import typings.three.webGLPropertiesMod.WebGLProperties
import typings.three.webGLRenderListsMod.RenderTarget
import typings.three.webGLRenderListsMod.WebGLRenderLists
import typings.three.webGLRenderTargetMod.WebGLRenderTarget
import typings.three.webGLShadowMapMod.WebGLShadowMap
import typings.three.webGLStateMod.WebGLState
import typings.three.webXRManagerMod.WebXRManager
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
  var autoClear: Boolean = js.native
  /**
  	 * If autoClear is true, defines whether the renderer should clear the color buffer. Default is true.
  	 */
  var autoClearColor: Boolean = js.native
  /**
  	 * If autoClear is true, defines whether the renderer should clear the depth buffer. Default is true.
  	 */
  var autoClearDepth: Boolean = js.native
  /**
  	 * If autoClear is true, defines whether the renderer should clear the stencil buffer. Default is true.
  	 */
  var autoClearStencil: Boolean = js.native
  var capabilities: WebGLCapabilities = js.native
  var clippingPlanes: js.Array[_] = js.native
  /**
  	 * The HTML5 Canvas's 'webgl' context obtained from the canvas where the renderer will draw.
  	 */
  var context: WebGLRenderingContext = js.native
  /**
  	 * Debug configurations.
  	 */
  var debug: WebGLDebug = js.native
  var extensions: WebGLExtensions = js.native
  /**
  	 * @deprecated
  	 */
  var gammaFactor: Double = js.native
  var info: WebGLInfo = js.native
  var localClippingEnabled: Boolean = js.native
  /**
  	 * Default is 4.
  	 */
  var maxMorphNormals: Double = js.native
  /**
  	 * Default is 8.
  	 */
  var maxMorphTargets: Double = js.native
  /**
  	 * Default is LinearEncoding.
  	 */
  var outputEncoding: TextureEncoding = js.native
  var physicallyCorrectLights: Boolean = js.native
  var pixelRatio: Double = js.native
  var properties: WebGLProperties = js.native
  var renderLists: WebGLRenderLists = js.native
  var shadowMap: WebGLShadowMap = js.native
  /**
  	 * @deprecated Use {@link WebGLShadowMap#cullFace .shadowMap.cullFace} instead.
  	 */
  var shadowMapCullFace: CullFace = js.native
  /**
  	 * Default is false.
  	 */
  var shadowMapDebug: Boolean = js.native
  /**
  	 * @deprecated Use {@link WebGLShadowMap#enabled .shadowMap.enabled} instead.
  	 */
  var shadowMapEnabled: Boolean = js.native
  /**
  	 * @deprecated Use {@link WebGLShadowMap#type .shadowMap.type} instead.
  	 */
  var shadowMapType: ShadowMapType = js.native
  /**
  	 * Defines whether the renderer should sort objects. Default is true.
  	 */
  var sortObjects: Boolean = js.native
  var state: WebGLState = js.native
  var toneMapping: ToneMapping = js.native
  var toneMappingExposure: Double = js.native
  /**
  	 * @deprecated Use {@link WebGLRenderer#xr .xr} instead.
  	 */
  var vr: Boolean = js.native
  var xr: WebXRManager = js.native
  /**
  	 * @deprecated Use {@link WebGLRenderer#setAnimationLoop .setAnimationLoop()} instead.
  	 */
  def animate(callback: js.Function): Unit = js.native
  /**
  	 * Tells the renderer to clear its color, depth or stencil drawing buffer(s).
  	 * Arguments default to true
  	 */
  def clear(): Unit = js.native
  def clear(color: js.UndefOr[scala.Nothing], depth: js.UndefOr[scala.Nothing], stencil: Boolean): Unit = js.native
  def clear(color: js.UndefOr[scala.Nothing], depth: Boolean): Unit = js.native
  def clear(color: js.UndefOr[scala.Nothing], depth: Boolean, stencil: Boolean): Unit = js.native
  def clear(color: Boolean): Unit = js.native
  def clear(color: Boolean, depth: js.UndefOr[scala.Nothing], stencil: Boolean): Unit = js.native
  def clear(color: Boolean, depth: Boolean): Unit = js.native
  def clear(color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
  def clearColor(): Unit = js.native
  def clearDepth(): Unit = js.native
  def clearStencil(): Unit = js.native
  def clearTarget(renderTarget: WebGLRenderTarget, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
  /**
  	 * Compiles all materials in the scene with the camera. This is useful to precompile shaders before the first rendering.
  	 */
  def compile(scene: Object3D, camera: Camera): Unit = js.native
  /**
  	 * Copies a region of the currently bound framebuffer into the selected mipmap level of the selected texture.
  	 * This region is defined by the size of the destination texture's mip level, offset by the input position.
  	 *
  	 * @param position Specifies the pixel offset from which to copy out of the framebuffer.
  	 * @param texture Specifies the destination texture.
  	 * @param level Specifies the destination mipmap level of the texture.
  	 */
  def copyFramebufferToTexture(position: Vector2, texture: Texture): Unit = js.native
  def copyFramebufferToTexture(position: Vector2, texture: Texture, level: Double): Unit = js.native
  /**
  	 * Copies srcTexture to the specified level of dstTexture, offset by the input position.
  	 *
  	 * @param position Specifies the pixel offset into the dstTexture where the copy will occur.
  	 * @param srcTexture Specifies the source texture.
  	 * @param dstTexture Specifies the destination texture.
  	 * @param level Specifies the destination mipmap level of the texture.
  	 */
  def copyTextureToTexture(position: Vector2, srcTexture: Texture, dstTexture: Texture): Unit = js.native
  def copyTextureToTexture(position: Vector2, srcTexture: Texture, dstTexture: Texture, level: Double): Unit = js.native
  def dispose(): Unit = js.native
  /**
  	 * @deprecated Use {@link WebGLRenderer#setScissorTest .setScissorTest()} instead.
  	 */
  def enableScissorTest(boolean: js.Any): js.Any = js.native
  def forceContextLoss(): Unit = js.native
  /**
  	 * Returns the current active cube face.
  	 */
  def getActiveCubeFace(): Double = js.native
  /**
  	 * Returns the current active mipmap level.
  	 */
  def getActiveMipmapLevel(): Double = js.native
  /**
  	 * Returns a float with the current clear alpha. Ranges from 0 to 1.
  	 */
  def getClearAlpha(): Double = js.native
  /**
  	 * Returns a THREE.Color instance with the current clear color.
  	 */
  def getClearColor(): Color = js.native
  /**
  	 * Return the WebGL context.
  	 */
  def getContext(): WebGLRenderingContext = js.native
  def getContextAttributes(): js.Any = js.native
  /**
  	 * @deprecated Use {@link WebGLRenderer#getRenderTarget .getRenderTarget()} instead.
  	 */
  def getCurrentRenderTarget(): RenderTarget | Null = js.native
  def getCurrentViewport(target: Vector4): Vector4 = js.native
  def getDrawingBufferSize(target: Vector2): Vector2 = js.native
  /**
  	 * @deprecated Use {@link WebGLCapabilities#getMaxAnisotropy .capabilities.getMaxAnisotropy()} instead.
  	 */
  def getMaxAnisotropy(): Double = js.native
  def getPixelRatio(): Double = js.native
  /**
  	 * @deprecated Use {@link WebGLCapabilities#precision .capabilities.precision} instead.
  	 */
  def getPrecision(): String = js.native
  /**
  	 * Returns the current render target. If no render target is set, null is returned.
  	 */
  def getRenderTarget(): RenderTarget | Null = js.native
  /**
  	 * Copies the scissor area into target.
  	 */
  def getScissor(target: Vector4): Vector4 = js.native
  /**
  	 * Returns true if scissor test is enabled; returns false otherwise.
  	 */
  def getScissorTest(): Boolean = js.native
  def getSize(target: Vector2): Vector2 = js.native
  /**
  	 * Copies the viewport into target.
  	 */
  def getViewport(target: Vector4): Vector4 = js.native
  /**
  	 * Initializes the given texture. Can be used to preload a texture rather than waiting until first render (which can cause noticeable lags due to decode and GPU upload overhead).
  	 *
  	 * @param texture The texture to Initialize.
  	 */
  def initTexture(texture: Texture): Unit = js.native
  def readRenderTargetPixels(renderTarget: RenderTarget, x: Double, y: Double, width: Double, height: Double, buffer: js.Any): Unit = js.native
  def readRenderTargetPixels(
    renderTarget: RenderTarget,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    buffer: js.Any,
    activeCubeFaceIndex: Double
  ): Unit = js.native
  def renderBufferDirect(
    camera: Camera,
    scene: Scene,
    geometry: BufferGeometry,
    material: Material,
    `object`: Object3D,
    geometryGroup: js.Any
  ): Unit = js.native
  def renderBufferDirect(
    camera: Camera,
    scene: Scene,
    geometry: Geometry,
    material: Material,
    `object`: Object3D,
    geometryGroup: js.Any
  ): Unit = js.native
  def renderBufferImmediate(`object`: Object3D, program: WebGLProgram): Unit = js.native
  /**
  	 * @deprecated Use {@link WebGLState#reset .state.reset()} instead.
  	 */
  def resetGLState(): Unit = js.native
  /**
  	 * A build in function that can be used instead of requestAnimationFrame. For WebXR projects this function must be used.
  	 * @param callback The function will be called every available frame. If `null` is passed it will stop any already ongoing animation.
  	 */
  def setAnimationLoop(): Unit = js.native
  def setAnimationLoop(callback: js.Function): Unit = js.native
  def setClearAlpha(alpha: Double): Unit = js.native
  def setClearColor(color: String): Unit = js.native
  def setClearColor(color: String, alpha: Double): Unit = js.native
  def setClearColor(color: Double): Unit = js.native
  def setClearColor(color: Double, alpha: Double): Unit = js.native
  /**
  	 * Sets the clear color, using color for the color and alpha for the opacity.
  	 */
  def setClearColor(color: Color): Unit = js.native
  def setClearColor(color: Color, alpha: Double): Unit = js.native
  def setDrawingBufferSize(width: Double, height: Double, pixelRatio: Double): Unit = js.native
  /**
  	 * Sets the given WebGLFramebuffer. This method can only be used if no render target is set via
  	 * {@link WebGLRenderer#setRenderTarget .setRenderTarget}.
  	 *
  	 * @param value The WebGLFramebuffer.
  	 */
  def setFramebuffer(value: WebGLFramebuffer): Unit = js.native
  /**
  	 * Sets the custom opaque sort function for the WebGLRenderLists. Pass null to use the default painterSortStable function.
  	 */
  def setOpaqueSort(method: js.Function): Unit = js.native
  def setPixelRatio(value: Double): Unit = js.native
  /**
  	 * Sets the active render target.
  	 *
  	 * @param renderTarget The {@link WebGLRenderTarget renderTarget} that needs to be activated. When `null` is given, the canvas is set as the active render target instead.
  	 * @param activeCubeFace Specifies the active cube side (PX 0, NX 1, PY 2, NY 3, PZ 4, NZ 5) of {@link WebGLCubeRenderTarget}.
  	 * @param activeMipmapLevel Specifies the active mipmap level.
  	 */
  def setRenderTarget(): Unit = js.native
  def setRenderTarget(renderTarget: Null, activeCubeFace: js.UndefOr[scala.Nothing], activeMipmapLevel: Double): Unit = js.native
  def setRenderTarget(renderTarget: Null, activeCubeFace: Double): Unit = js.native
  def setRenderTarget(renderTarget: Null, activeCubeFace: Double, activeMipmapLevel: Double): Unit = js.native
  def setRenderTarget(renderTarget: RenderTarget): Unit = js.native
  def setRenderTarget(renderTarget: RenderTarget, activeCubeFace: js.UndefOr[scala.Nothing], activeMipmapLevel: Double): Unit = js.native
  def setRenderTarget(renderTarget: RenderTarget, activeCubeFace: Double): Unit = js.native
  def setRenderTarget(renderTarget: RenderTarget, activeCubeFace: Double, activeMipmapLevel: Double): Unit = js.native
  def setScissor(x: Double): Unit = js.native
  def setScissor(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setScissor(x: Double, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def setScissor(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def setScissor(x: Double, y: Double): Unit = js.native
  def setScissor(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setScissor(x: Double, y: Double, width: Double): Unit = js.native
  def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
  	 * Sets the scissor area from (x, y) to (x + width, y + height).
  	 */
  def setScissor(x: Vector4): Unit = js.native
  def setScissor(x: Vector4, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setScissor(x: Vector4, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def setScissor(x: Vector4, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def setScissor(x: Vector4, y: Double): Unit = js.native
  def setScissor(x: Vector4, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setScissor(x: Vector4, y: Double, width: Double): Unit = js.native
  def setScissor(x: Vector4, y: Double, width: Double, height: Double): Unit = js.native
  /**
  	 * Enable the scissor test. When this is enabled, only the pixels within the defined scissor area will be affected by further renderer actions.
  	 */
  def setScissorTest(enable: Boolean): Unit = js.native
  /**
  	 * Sets the custom transparent sort function for the WebGLRenderLists. Pass null to use the default reversePainterSortStable function.
  	 */
  def setTransparentSort(method: js.Function): Unit = js.native
  def setViewport(x: Double): Unit = js.native
  def setViewport(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setViewport(x: Double, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def setViewport(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def setViewport(x: Double, y: Double): Unit = js.native
  def setViewport(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setViewport(x: Double, y: Double, width: Double): Unit = js.native
  def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
  	 * Sets the viewport to render from (x, y) to (x + width, y + height).
  	 * (x, y) is the lower-left corner of the region.
  	 */
  def setViewport(x: Vector4): Unit = js.native
  def setViewport(x: Vector4, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setViewport(x: Vector4, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
  def setViewport(x: Vector4, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
  def setViewport(x: Vector4, y: Double): Unit = js.native
  def setViewport(x: Vector4, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setViewport(x: Vector4, y: Double, width: Double): Unit = js.native
  def setViewport(x: Vector4, y: Double, width: Double, height: Double): Unit = js.native
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

