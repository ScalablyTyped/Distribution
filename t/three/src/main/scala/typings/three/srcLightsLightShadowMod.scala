package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcLightsLightMod.Light
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector4Mod.Vector4
import typings.three.srcRenderersWebGLRenderTargetMod.WebGLRenderTarget
import typings.three.srcThreeMod.Frustum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsLightShadowMod {
  
  @JSImport("three/src/lights/LightShadow", "LightShadow")
  @js.native
  open class LightShadow[TCamera /* <: Camera */] protected () extends StObject {
    /**
      * Create a new instance of {@link LightShadow}
      * @param camera The light's view of the world.
      */
    def this(camera: TCamera) = this()
    
    /**
      * Enables automatic updates of the light's shadow. If you do not require dynamic lighting / shadows, you may set this to `false`.
      * @defaultValue `true`
      */
    var autoUpdate: Boolean = js.native
    
    /**
      * Shadow map bias, how much to add or subtract from the normalized depth when deciding whether a surface is in shadow.
      * @remark The Very tiny adjustments here (in the order of 0.0001) may help reduce artifacts in shadows.
      * @remarks Expects a `Float`
      * @defaultValue `0`
      */
    var bias: Double = js.native
    
    /**
      * The amount of samples to use when blurring a VSM shadow map.
      * @remarks Expects a `Integer`
      * @defaultValue `8`
      */
    var blurSamples: Double = js.native
    
    /**
      * The light's view of the world.
      * @remark This is used to generate a depth map of the scene; objects behind other objects from the light's perspective will be in shadow.
      */
    var camera: TCamera = js.native
    
    def clone(recursive: Boolean): this.type = js.native
    
    /**
      * Copies value of all the properties from the {@link {@link LightShadow} | source} to this Light.
      * @param source
      */
    def copy(source: LightShadow[Camera]): this.type = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * Used internally by the renderer to extend the shadow map to contain all viewports
      */
    def getFrameExtents(): Vector2 = js.native
    
    /**
      * Gets the shadow cameras frustum
      * @remarks
      * Used internally by the renderer to cull objects.
      */
    def getFrustum(): Frustum = js.native
    
    def getViewport(viewportIndex: Double): Vector4 = js.native
    
    /**
      * Used internally by the renderer to get the number of viewports that need to be rendered for this shadow.
      */
    def getViewportCount(): Double = js.native
    
    /**
      * The depth map generated using the internal camera; a location beyond a pixel's depth is in shadow. Computed internally during rendering.
      * @defaultValue null
      */
    var map: WebGLRenderTarget | Null = js.native
    
    /**
      * The distribution map generated using the internal camera; an occlusion is calculated based on the distribution of depths. Computed internally during rendering.
      * @defaultValue null
      */
    var mapPass: WebGLRenderTarget | Null = js.native
    
    /**
      * A {@link THREE.Vector2 | Vector2} defining the width and height of the shadow map.
      * @remarks Higher values give better quality shadows at the cost of computation time.
      * @remarks Values must be powers of 2, up to the {@link THREE.WebGLRenderer.capabilities | WebGLRenderer.capabilities}.maxTextureSize for a given device,
      * although the width and height don't have to be the same (so, for example, (512, 1024) is valid).
      * @defaultValue `new THREE.Vector2(512, 512)`
      */
    var mapSize: Vector2 = js.native
    
    /**
      * Model to shadow camera space, to compute location and depth in shadow map.
      * Stored in a {@link Matrix4 | Matrix4}.
      * @remarks This is computed internally during rendering.
      * @defaultValue new THREE.Matrix4()
      */
    var matrix: Matrix4 = js.native
    
    /**
      * When set to `true`, shadow maps will be updated in the next `render` call.
      * If you have set {@link autoUpdate} to `false`, you will need to set this property to `true` and then make a render call to update the light's shadow.
      * @defaultValue `false`
      */
    var needsUpdate: Boolean = js.native
    
    /**
      * Defines how much the position used to query the shadow map is offset along the object normal.
      * @remark The Increasing this value can be used to reduce shadow acne especially in large scenes where light shines onto geometry at a shallow angle.
      * @remark The cost is that shadows may appear distorted.
      * @remarks Expects a `Float`
      * @defaultValue `0`
      */
    var normalBias: Double = js.native
    
    /**
      * Setting this to values greater than 1 will blur the edges of the shadow.toi
      * @remark High values will cause unwanted banding effects in the shadows - a greater {@link LightShadow.mapSize | mapSize
      *  will allow for a higher value to be used here before these effects become visible.
      * @remark If {@link THREE.WebGLRenderer.shadowMap.type | WebGLRenderer.shadowMap.type} is set to {@link Renderer | PCFSoftShadowMap},
      * radius has no effect and it is recommended to increase softness by decreasing {@link LightShadow.mapSize | mapSize} instead.
      * @remark Note that this has no effect if the {@link THREE.WebGLRenderer.shadowMap | WebGLRenderer.shadowMap}.{@link THREE.WebGLShadowMap.type | type}
      * is set to {@link THREE.BasicShadowMap | BasicShadowMap}.
      * @remarks Expects a `Float`
      * @defaultValue `1`
      */
    var radius: Double = js.native
    
    /**
      * Serialize this LightShadow.
      */
    def toJSON(): js.Object = js.native
    
    /**
      * Update the matrices for the camera and shadow, used internally by the renderer.
      * @param light The light for which the shadow is being rendered.
      */
    def updateMatrices(light: Light[js.UndefOr[LightShadow[Camera]]]): Unit = js.native
  }
}
