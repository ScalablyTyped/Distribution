package typings.three

import typings.std.EventTarget
import typings.std.HTMLCanvasElement
import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcConstantsMod.CullFace
import typings.three.srcConstantsMod.ShadowMapType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.ToneMapping
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathBox3Mod.Box3
import typings.three.srcMathColorMod.Color
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcMathVector4Mod.Vector4
import typings.three.srcRenderersWebGLMultipleRenderTargetsMod.WebGLMultipleRenderTargets
import typings.three.srcRenderersWebGLRenderTargetMod.WebGLRenderTarget
import typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import typings.three.srcRenderersWebglWebGLInfoMod.WebGLInfo
import typings.three.srcRenderersWebglWebGLPropertiesMod.WebGLProperties
import typings.three.srcRenderersWebglWebGLRenderListsMod.WebGLRenderLists
import typings.three.srcRenderersWebglWebGLShadowMapMod.WebGLShadowMap
import typings.three.srcRenderersWebglWebGLStateMod.WebGLState
import typings.three.srcRenderersWebxrWebXRManagerMod.WebXRManager
import typings.three.srcScenesSceneMod.Scene
import typings.three.srcTexturesData3DTextureMod.Data3DTexture
import typings.three.srcTexturesDataArrayTextureMod.DataArrayTexture
import typings.three.srcTexturesTextureMod.Texture
import typings.three.srcUtilsMod.ColorRepresentation
import typings.webxr.XRFrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebGLRendererMod {
  
  @JSImport("three/src/renderers/WebGLRenderer", "WebGLRenderer")
  @js.native
  /**
    * parameters is an optional object with properties defining the renderer's behaviour.
    * The constructor also accepts no parameters at all.
    * In all cases, it will assume sane defaults when parameters are missing.
    */
  open class WebGLRenderer ()
    extends StObject
       with Renderer {
    def this(parameters: WebGLRendererParameters) = this()
    
    /**
      * @deprecated Use {@link WebGLRenderer#setAnimationLoop .setAnimationLoop()} instead.
      */
    def animate(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Defines whether the renderer should automatically clear its output before rendering.
      * @default true
      */
    var autoClear: Boolean = js.native
    
    /**
      * If autoClear is true, defines whether the renderer should clear the color buffer. Default is true.
      * @default true
      */
    var autoClearColor: Boolean = js.native
    
    /**
      * If autoClear is true, defines whether the renderer should clear the depth buffer. Default is true.
      * @default true
      */
    var autoClearDepth: Boolean = js.native
    
    /**
      * If autoClear is true, defines whether the renderer should clear the stencil buffer. Default is true.
      * @default true
      */
    var autoClearStencil: Boolean = js.native
    
    var capabilities: WebGLCapabilities = js.native
    
    /**
      * Tells the renderer to clear its color, depth or stencil drawing buffer(s).
      * Arguments default to true
      */
    def clear(): Unit = js.native
    def clear(color: Boolean): Unit = js.native
    def clear(color: Boolean, depth: Boolean): Unit = js.native
    def clear(color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    def clear(color: Boolean, depth: Unit, stencil: Boolean): Unit = js.native
    def clear(color: Unit, depth: Boolean): Unit = js.native
    def clear(color: Unit, depth: Boolean, stencil: Boolean): Unit = js.native
    def clear(color: Unit, depth: Unit, stencil: Boolean): Unit = js.native
    
    def clearColor(): Unit = js.native
    
    def clearDepth(): Unit = js.native
    
    def clearStencil(): Unit = js.native
    
    def clearTarget(renderTarget: WebGLRenderTarget, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    
    /**
      * @default []
      */
    var clippingPlanes: js.Array[Any] = js.native
    
    /**
      * Compiles all materials in the scene with the camera. This is useful to precompile shaders before the first rendering.
      */
    def compile(scene: Object3D[Event], camera: Camera): Unit = js.native
    
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
    
    /**
      * Copies the pixels of a texture in the bounds sourceBox in the desination texture starting from the given position.
      * @param sourceBox Specifies the bounds
      * @param position Specifies the pixel offset into the dstTexture where the copy will occur.
      * @param srcTexture Specifies the source texture.
      * @param dstTexture Specifies the destination texture.
      * @param level Specifies the destination mipmap level of the texture.
      */
    def copyTextureToTexture3D(sourceBox: Box3, position: Vector3, srcTexture: Texture, dstTexture: Data3DTexture): Unit = js.native
    def copyTextureToTexture3D(sourceBox: Box3, position: Vector3, srcTexture: Texture, dstTexture: Data3DTexture, level: Double): Unit = js.native
    def copyTextureToTexture3D(sourceBox: Box3, position: Vector3, srcTexture: Texture, dstTexture: DataArrayTexture): Unit = js.native
    def copyTextureToTexture3D(
      sourceBox: Box3,
      position: Vector3,
      srcTexture: Texture,
      dstTexture: DataArrayTexture,
      level: Double
    ): Unit = js.native
    
    /**
      * Debug configurations.
      * @default { checkShaderErrors: true }
      */
    var debug: WebGLDebug = js.native
    
    def dispose(): Unit = js.native
    
    /**
      * @deprecated Use {@link WebGLRenderer#setScissorTest .setScissorTest()} instead.
      */
    def enableScissorTest(boolean: Any): Any = js.native
    
    var extensions: WebGLExtensions = js.native
    
    def forceContextLoss(): Unit = js.native
    
    def forceContextRestore(): Unit = js.native
    
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
    def getClearColor(target: Color): Color = js.native
    
    /**
      * Return the WebGL context.
      */
    def getContext(): WebGLRenderingContext | WebGL2RenderingContext = js.native
    
    def getContextAttributes(): Any = js.native
    
    /**
      * @deprecated Use {@link WebGLRenderer#getRenderTarget .getRenderTarget()} instead.
      */
    def getCurrentRenderTarget(): WebGLRenderTarget | Null = js.native
    
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
    def getRenderTarget(): WebGLRenderTarget | Null = js.native
    
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
    
    var info: WebGLInfo = js.native
    
    /**
      * Initializes the given texture. Can be used to preload a texture rather than waiting until first render (which can cause noticeable lags due to decode and GPU upload overhead).
      *
      * @param texture The texture to Initialize.
      */
    def initTexture(texture: Texture): Unit = js.native
    
    /**
      * @default false
      */
    var localClippingEnabled: Boolean = js.native
    
    /**
      * Default is LinearEncoding.
      * @default THREE.LinearEncoding
      */
    var outputEncoding: TextureEncoding = js.native
    
    /**
      * @default false
      */
    var physicallyCorrectLights: Boolean = js.native
    
    var pixelRatio: Double = js.native
    
    var properties: WebGLProperties = js.native
    
    def readRenderTargetPixels(
      renderTarget: WebGLMultipleRenderTargets,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      buffer: Any
    ): Unit = js.native
    def readRenderTargetPixels(
      renderTarget: WebGLMultipleRenderTargets,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      buffer: Any,
      activeCubeFaceIndex: Double
    ): Unit = js.native
    def readRenderTargetPixels(renderTarget: WebGLRenderTarget, x: Double, y: Double, width: Double, height: Double, buffer: Any): Unit = js.native
    def readRenderTargetPixels(
      renderTarget: WebGLRenderTarget,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      buffer: Any,
      activeCubeFaceIndex: Double
    ): Unit = js.native
    
    def renderBufferDirect(
      camera: Camera,
      scene: Scene,
      geometry: BufferGeometry,
      material: Material,
      `object`: Object3D[Event],
      geometryGroup: Any
    ): Unit = js.native
    
    var renderLists: WebGLRenderLists = js.native
    
    /**
      * @deprecated Use {@link WebGLState#reset .state.reset()} instead.
      */
    def resetGLState(): Unit = js.native
    
    /**
      * Can be used to reset the internal WebGL state.
      */
    def resetState(): Unit = js.native
    
    /**
      * A build in function that can be used instead of requestAnimationFrame. For WebXR projects this function must be used.
      * @param callback The function will be called every available frame. If `null` is passed it will stop any already ongoing animation.
      */
    def setAnimationLoop(): Unit = js.native
    def setAnimationLoop(callback: XRFrameRequestCallback): Unit = js.native
    
    def setClearAlpha(alpha: Double): Unit = js.native
    
    /**
      * Sets the clear color, using color for the color and alpha for the opacity.
      */
    def setClearColor(color: ColorRepresentation): Unit = js.native
    def setClearColor(color: ColorRepresentation, alpha: Double): Unit = js.native
    
    def setDrawingBufferSize(width: Double, height: Double, pixelRatio: Double): Unit = js.native
    
    /**
      * Sets the custom opaque sort function for the WebGLRenderLists. Pass null to use the default painterSortStable function.
      */
    def setOpaqueSort(method: js.Function2[/* a */ Any, /* b */ Any, Double]): Unit = js.native
    
    def setPixelRatio(value: Double): Unit = js.native
    
    /**
      * Sets the active render target.
      *
      * @param renderTarget The {@link WebGLRenderTarget renderTarget} that needs to be activated. When `null` is given, the canvas is set as the active render target instead.
      * @param activeCubeFace Specifies the active cube side (PX 0, NX 1, PY 2, NY 3, PZ 4, NZ 5) of {@link WebGLCubeRenderTarget}.
      * @param activeMipmapLevel Specifies the active mipmap level.
      */
    def setRenderTarget(): Unit = js.native
    def setRenderTarget(renderTarget: Null, activeCubeFace: Double): Unit = js.native
    def setRenderTarget(renderTarget: Null, activeCubeFace: Double, activeMipmapLevel: Double): Unit = js.native
    def setRenderTarget(renderTarget: Null, activeCubeFace: Unit, activeMipmapLevel: Double): Unit = js.native
    def setRenderTarget(renderTarget: WebGLMultipleRenderTargets): Unit = js.native
    def setRenderTarget(renderTarget: WebGLMultipleRenderTargets, activeCubeFace: Double): Unit = js.native
    def setRenderTarget(renderTarget: WebGLMultipleRenderTargets, activeCubeFace: Double, activeMipmapLevel: Double): Unit = js.native
    def setRenderTarget(renderTarget: WebGLMultipleRenderTargets, activeCubeFace: Unit, activeMipmapLevel: Double): Unit = js.native
    def setRenderTarget(renderTarget: WebGLRenderTarget): Unit = js.native
    def setRenderTarget(renderTarget: WebGLRenderTarget, activeCubeFace: Double): Unit = js.native
    def setRenderTarget(renderTarget: WebGLRenderTarget, activeCubeFace: Double, activeMipmapLevel: Double): Unit = js.native
    def setRenderTarget(renderTarget: WebGLRenderTarget, activeCubeFace: Unit, activeMipmapLevel: Double): Unit = js.native
    
    def setScissor(x: Double): Unit = js.native
    def setScissor(x: Double, y: Double): Unit = js.native
    def setScissor(x: Double, y: Double, width: Double): Unit = js.native
    def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    def setScissor(x: Double, y: Double, width: Unit, height: Double): Unit = js.native
    def setScissor(x: Double, y: Unit, width: Double): Unit = js.native
    def setScissor(x: Double, y: Unit, width: Double, height: Double): Unit = js.native
    def setScissor(x: Double, y: Unit, width: Unit, height: Double): Unit = js.native
    /**
      * Sets the scissor area from (x, y) to (x + width, y + height).
      */
    def setScissor(x: Vector4): Unit = js.native
    def setScissor(x: Vector4, y: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double, width: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double, width: Double, height: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double, width: Unit, height: Double): Unit = js.native
    def setScissor(x: Vector4, y: Unit, width: Double): Unit = js.native
    def setScissor(x: Vector4, y: Unit, width: Double, height: Double): Unit = js.native
    def setScissor(x: Vector4, y: Unit, width: Unit, height: Double): Unit = js.native
    
    /**
      * Enable the scissor test. When this is enabled, only the pixels within the defined scissor area will be affected by further renderer actions.
      */
    def setScissorTest(enable: Boolean): Unit = js.native
    
    /**
      * Sets the custom transparent sort function for the WebGLRenderLists. Pass null to use the default reversePainterSortStable function.
      */
    def setTransparentSort(method: js.Function2[/* a */ Any, /* b */ Any, Double]): Unit = js.native
    
    def setViewport(x: Double): Unit = js.native
    def setViewport(x: Double, y: Double): Unit = js.native
    def setViewport(x: Double, y: Double, width: Double): Unit = js.native
    def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    def setViewport(x: Double, y: Double, width: Unit, height: Double): Unit = js.native
    def setViewport(x: Double, y: Unit, width: Double): Unit = js.native
    def setViewport(x: Double, y: Unit, width: Double, height: Double): Unit = js.native
    def setViewport(x: Double, y: Unit, width: Unit, height: Double): Unit = js.native
    /**
      * Sets the viewport to render from (x, y) to (x + width, y + height).
      * (x, y) is the lower-left corner of the region.
      */
    def setViewport(x: Vector4): Unit = js.native
    def setViewport(x: Vector4, y: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double, width: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double, width: Double, height: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double, width: Unit, height: Double): Unit = js.native
    def setViewport(x: Vector4, y: Unit, width: Double): Unit = js.native
    def setViewport(x: Vector4, y: Unit, width: Double, height: Double): Unit = js.native
    def setViewport(x: Vector4, y: Unit, width: Unit, height: Double): Unit = js.native
    
    var shadowMap: WebGLShadowMap = js.native
    
    /**
      * @deprecated Use {@link WebGLShadowMap#cullFace .shadowMap.cullFace} instead.
      */
    var shadowMapCullFace: CullFace = js.native
    
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
      * @default true
      */
    var sortObjects: Boolean = js.native
    
    var state: WebGLState = js.native
    
    /**
      * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'EXT_blend_minmax' )} instead.
      */
    def supportsBlendMinMax(): Any = js.native
    
    /**
      * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'WEBGL_compressed_texture_pvrtc' )} instead.
      */
    def supportsCompressedTexturePVRTC(): Any = js.native
    
    /**
      * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'WEBGL_compressed_texture_s3tc' )} instead.
      */
    def supportsCompressedTextureS3TC(): Any = js.native
    
    /**
      * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'OES_texture_float' )} instead.
      */
    def supportsFloatTextures(): Any = js.native
    
    /**
      * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'OES_texture_half_float' )} instead.
      */
    def supportsHalfFloatTextures(): Any = js.native
    
    /**
      * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'ANGLE_instanced_arrays' )} instead.
      */
    def supportsInstancedArrays(): Any = js.native
    
    /**
      * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'OES_standard_derivatives' )} instead.
      */
    def supportsStandardDerivatives(): Any = js.native
    
    /**
      * @deprecated Use {@link WebGLCapabilities#vertexTextures .capabilities.vertexTextures} instead.
      */
    def supportsVertexTextures(): Any = js.native
    
    /**
      * @default THREE.NoToneMapping
      */
    var toneMapping: ToneMapping = js.native
    
    /**
      * @default 1
      */
    var toneMappingExposure: Double = js.native
    
    /**
      * @deprecated Use {@link WebGLRenderer#xr .xr} instead.
      */
    var vr: Boolean = js.native
    
    var xr: WebXRManager = js.native
  }
  
  type OffscreenCanvas = EventTarget
  
  @js.native
  trait Renderer extends StObject {
    
    var domElement: HTMLCanvasElement = js.native
    
    def render(scene: Object3D[Event], camera: Camera): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Boolean): Unit = js.native
  }
  
  trait WebGLDebug extends StObject {
    
    /**
      * Enables error checking and reporting when shader programs are being compiled.
      */
    var checkShaderErrors: Boolean
  }
  object WebGLDebug {
    
    inline def apply(checkShaderErrors: Boolean): WebGLDebug = {
      val __obj = js.Dynamic.literal(checkShaderErrors = checkShaderErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLDebug]
    }
    
    extension [Self <: WebGLDebug](x: Self) {
      
      inline def setCheckShaderErrors(value: Boolean): Self = StObject.set(x, "checkShaderErrors", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebGLRendererParameters extends StObject {
    
    /**
      * default is false.
      */
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default is false.
      */
    var antialias: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Canvas where the renderer draws its output.
      */
    var canvas: js.UndefOr[HTMLCanvasElement | OffscreenCanvas] = js.undefined
    
    /**
      * A WebGL Rendering Context.
      * (https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext)
      * Default is null
      */
    var context: js.UndefOr[WebGLRenderingContext] = js.undefined
    
    /**
      * default is true.
      */
    var depth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default is false.
      */
    var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default is false.
      */
    var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can be "high-performance", "low-power" or "default"
      */
    var powerPreference: js.UndefOr[String] = js.undefined
    
    /**
      * shader precision. Can be "highp", "mediump" or "lowp".
      */
    var precision: js.UndefOr[String] = js.undefined
    
    /**
      * default is true.
      */
    var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default is false.
      */
    var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default is true.
      */
    var stencil: js.UndefOr[Boolean] = js.undefined
  }
  object WebGLRendererParameters {
    
    inline def apply(): WebGLRendererParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebGLRendererParameters]
    }
    
    extension [Self <: WebGLRendererParameters](x: Self) {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
      
      inline def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setContext(value: WebGLRenderingContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
      
      inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
      
      inline def setLogarithmicDepthBuffer(value: Boolean): Self = StObject.set(x, "logarithmicDepthBuffer", value.asInstanceOf[js.Any])
      
      inline def setLogarithmicDepthBufferUndefined: Self = StObject.set(x, "logarithmicDepthBuffer", js.undefined)
      
      inline def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
      
      inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
      
      inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
      
      inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
      
      inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
      
      inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    }
  }
}
