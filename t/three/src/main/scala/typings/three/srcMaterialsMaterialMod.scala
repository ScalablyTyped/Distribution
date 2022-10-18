package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcConstantsMod.Blending
import typings.three.srcConstantsMod.BlendingDstFactor
import typings.three.srcConstantsMod.BlendingEquation
import typings.three.srcConstantsMod.BlendingSrcFactor
import typings.three.srcConstantsMod.DepthModes
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.Side
import typings.three.srcConstantsMod.StencilFunc
import typings.three.srcConstantsMod.StencilOp
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcMathPlaneMod.Plane
import typings.three.srcRenderersShadersShaderLibMod.Shader
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.threeBooleans.`true`
import typings.three.threeStrings.highp
import typings.three.threeStrings.lowp
import typings.three.threeStrings.mediump
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMaterialsMaterialMod {
  
  @JSImport("three/src/materials/Material", "Material")
  @js.native
  open class Material () extends EventDispatcher[Event] {
    
    /**
      * Sets the alpha value to be used when running an alpha test. Default is 0.
      * @default 0
      */
    var alphaTest: Double = js.native
    
    /**
      * Enables alpha to coverage. Can only be used with MSAA-enabled rendering contexts.
      * @default false
      */
    var alphaToCoverage: Boolean = js.native
    
    /**
      * Blending destination. It's one of the blending mode constants defined in Three.js. Default is {@link OneMinusSrcAlphaFactor}.
      * @default THREE.OneMinusSrcAlphaFactor
      */
    var blendDst: BlendingDstFactor = js.native
    
    /**
      * The tranparency of the .blendDst. Default is null.
      * @default null
      */
    var blendDstAlpha: Double | Null = js.native
    
    /**
      * Blending equation to use when applying blending. It's one of the constants defined in Three.js. Default is {@link AddEquation}.
      * @default THREE.AddEquation
      */
    var blendEquation: BlendingEquation = js.native
    
    /**
      * The tranparency of the .blendEquation. Default is null.
      * @default null
      */
    var blendEquationAlpha: Double | Null = js.native
    
    /**
      * Blending source. It's one of the blending mode constants defined in Three.js. Default is {@link SrcAlphaFactor}.
      * @default THREE.SrcAlphaFactor
      */
    var blendSrc: BlendingSrcFactor | BlendingDstFactor = js.native
    
    /**
      * The tranparency of the .blendSrc. Default is null.
      * @default null
      */
    var blendSrcAlpha: Double | Null = js.native
    
    /**
      * Which blending to use when displaying objects with this material. Default is {@link NormalBlending}.
      * @default THREE.NormalBlending
      */
    var blending: Blending = js.native
    
    /**
      * Changes the behavior of clipping planes so that only their intersection is clipped, rather than their union. Default is false.
      * @default false
      */
    var clipIntersection: Boolean = js.native
    
    /**
      * Defines whether to clip shadows according to the clipping planes specified on this material. Default is false.
      * @default false
      */
    var clipShadows: Boolean = js.native
    
    /**
      * User-defined clipping planes specified as THREE.Plane objects in world space.
      * These planes apply to the objects this material is attached to.
      * Points in space whose signed distance to the plane is negative are clipped (not rendered).
      * See the WebGL / clipping /intersection example. Default is null.
      * @default null
      */
    var clippingPlanes: Any = js.native
    
    /**
      * Whether to render the material's color. This can be used in conjunction with a mesh's .renderOrder property to create invisible objects that occlude other objects. Default is true.
      * @default true
      */
    var colorWrite: Boolean = js.native
    
    /**
      * Copy the parameters from the passed material into this material.
      * @param material
      */
    def copy(material: Material): this.type = js.native
    
    /**
      * In case onBeforeCompile is used, this callback can be used to identify values of settings used in onBeforeCompile, so three.js can reuse a cached shader or recompile the shader as needed.
      */
    def customProgramCacheKey(): String = js.native
    
    /**
      * Custom defines to be injected into the shader. These are passed in form of an object literal, with key/value pairs. { MY_CUSTOM_DEFINE: '' , PI2: Math.PI * 2 }.
      * The pairs are defined in both vertex and fragment shaders. Default is undefined.
      * @default undefined
      */
    var defines: js.UndefOr[StringDictionary[Any]] = js.native
    
    /**
      * Which depth function to use. Default is {@link LessEqualDepth}. See the depth mode constants for all possible values.
      * @default THREE.LessEqualDepth
      */
    var depthFunc: DepthModes = js.native
    
    /**
      * Whether to have depth test enabled when rendering this material. Default is true.
      * @default true
      */
    var depthTest: Boolean = js.native
    
    /**
      * Whether rendering this material has any effect on the depth buffer. Default is true.
      * When drawing 2D overlays it can be useful to disable the depth writing in order to layer several things together without creating z-index artifacts.
      * @default true
      */
    var depthWrite: Boolean = js.native
    
    /**
      * This disposes the material. Textures of a material don't get disposed. These needs to be disposed by {@link Texture}.
      */
    def dispose(): Unit = js.native
    
    /**
      * Whether to apply dithering to the color to remove the appearance of banding. Default is false.
      * @default false
      */
    var dithering: Boolean = js.native
    
    /**
      * Unique number of this material instance.
      */
    var id: Double = js.native
    
    /**
      * Used to check whether this or derived classes are materials. Default is true.
      * You should not change this, as it used internally for optimisation.
      */
    val isMaterial: `true` = js.native
    
    /**
      * Material name. Default is an empty string.
      * @default ''
      */
    var name: String = js.native
    
    /**
      * Specifies that the material needs to be updated, WebGL wise. Set it to true if you made changes that need to be reflected in WebGL.
      * This property is automatically set to true when instancing a new material.
      * @default false
      */
    var needsUpdate: Boolean = js.native
    
    /**
      * An optional callback that is executed immediately before the shader program is compiled.
      * This function is called with the shader source code as a parameter.
      * Useful for the modification of built-in materials.
      * @param shader Source code of the shader
      * @param renderer WebGLRenderer Context that is initializing the material
      */
    def onBeforeCompile(shader: Shader, renderer: WebGLRenderer): Unit = js.native
    
    /**
      * Opacity. Default is 1.
      * @default 1
      */
    var opacity: Double = js.native
    
    /**
      * Whether to use polygon offset. Default is false. This corresponds to the POLYGON_OFFSET_FILL WebGL feature.
      * @default false
      */
    var polygonOffset: Boolean = js.native
    
    /**
      * Sets the polygon offset factor. Default is 0.
      * @default 0
      */
    var polygonOffsetFactor: Double = js.native
    
    /**
      * Sets the polygon offset units. Default is 0.
      * @default 0
      */
    var polygonOffsetUnits: Double = js.native
    
    /**
      * Override the renderer's default precision for this material. Can be "highp", "mediump" or "lowp". Defaults is null.
      * @default null
      */
    var precision: highp | mediump | lowp | Null = js.native
    
    /**
      * Whether to premultiply the alpha (transparency) value. See WebGL / Materials / Transparency for an example of the difference. Default is false.
      * @default false
      */
    var premultipliedAlpha: Boolean = js.native
    
    /**
      * Sets the properties based on the values.
      * @param values A container with parameters.
      */
    def setValues(values: MaterialParameters): Unit = js.native
    
    /**
      * Defines which of the face sides will cast shadows. Default is *null*.
      * If *null*, the value is opposite that of side, above.
      * @default null
      */
    var shadowSide: Side | Null = js.native
    
    /**
      * Defines which of the face sides will be rendered - front, back or both.
      * Default is THREE.FrontSide. Other options are THREE.BackSide and THREE.DoubleSide.
      * @default THREE.FrontSide
      */
    var side: Side = js.native
    
    /**
      * Which stencil operation to perform when the comparison function returns false. Default is {@link KeepStencilOp}. See the stencil operation constants for all possible values.
      * @default THREE.KeepStencilOp
      */
    var stencilFail: StencilOp = js.native
    
    /**
      * The stencil comparison function to use. Default is {@link AlwaysStencilFunc}. See stencil operation constants for all possible values.
      * @default THREE.AlwaysStencilFunc
      */
    var stencilFunc: StencilFunc = js.native
    
    /**
      * The bit mask to use when comparing against the stencil buffer. Default is *0xFF*.
      * @default 0xff
      */
    var stencilFuncMask: Double = js.native
    
    /**
      * The value to use when performing stencil comparisons or stencil operations. Default is *0*.
      * @default 0
      */
    var stencilRef: Double = js.native
    
    /**
      * Whether rendering this material has any effect on the stencil buffer. Default is *false*.
      * @default false
      */
    var stencilWrite: Boolean = js.native
    
    /**
      * The bit mask to use when writing to the stencil buffer. Default is *0xFF*.
      * @default 0xff
      */
    var stencilWriteMask: Double = js.native
    
    /**
      * Which stencil operation to perform when the comparison function returns true but the depth test fails.
      * Default is {@link KeepStencilOp}.
      * See the stencil operation constants for all possible values.
      * @default THREE.KeepStencilOp
      */
    var stencilZFail: StencilOp = js.native
    
    /**
      * Which stencil operation to perform when the comparison function returns true and the depth test passes.
      * Default is {@link KeepStencilOp}.
      * See the stencil operation constants for all possible values.
      * @default THREE.KeepStencilOp
      */
    var stencilZPass: StencilOp = js.native
    
    /**
      * Convert the material to three.js JSON format.
      * @param meta Object containing metadata such as textures or images for the material.
      */
    def toJSON(): Any = js.native
    def toJSON(meta: Any): Any = js.native
    
    /**
      * Defines whether this material is tone mapped according to the renderer's toneMapping setting.
      * Default is true.
      * @default true
      */
    var toneMapped: Boolean = js.native
    
    /**
      * Defines whether this material is transparent. This has an effect on rendering as transparent objects need special treatment and are rendered after non-transparent objects.
      * When set to true, the extent to which the material is transparent is controlled by setting it's .opacity property.
      * Default is false.
      * @default false
      */
    var transparent: Boolean = js.native
    
    /**
      * Value is the string 'Material'. This shouldn't be changed, and can be used to find all objects of this type in a scene.
      * @default 'Material'
      */
    var `type`: String = js.native
    
    /**
      * An object that can be used to store custom data about the Material. It should not hold references to functions as these will not be cloned.
      * @default {}
      */
    var userData: Any = js.native
    
    /**
      * UUID of this material instance. This gets automatically assigned, so this shouldn't be edited.
      */
    var uuid: String = js.native
    
    /**
      * This starts at 0 and counts how many times .needsUpdate is set to true.
      * @default 0
      */
    var version: Double = js.native
    
    /**
      * Defines whether vertex coloring is used. Default is false.
      * @default false
      */
    var vertexColors: Boolean = js.native
    
    /**
      * Defines whether this material is visible. Default is true.
      * @default true
      */
    var visible: Boolean = js.native
  }
  
  trait MaterialParameters extends StObject {
    
    var alphaTest: js.UndefOr[Double] = js.undefined
    
    var alphaToCoverage: js.UndefOr[Boolean] = js.undefined
    
    var blendDst: js.UndefOr[BlendingDstFactor] = js.undefined
    
    var blendDstAlpha: js.UndefOr[Double] = js.undefined
    
    var blendEquation: js.UndefOr[BlendingEquation] = js.undefined
    
    var blendEquationAlpha: js.UndefOr[Double] = js.undefined
    
    var blendSrc: js.UndefOr[BlendingSrcFactor | BlendingDstFactor] = js.undefined
    
    var blendSrcAlpha: js.UndefOr[Double] = js.undefined
    
    var blending: js.UndefOr[Blending] = js.undefined
    
    var clipIntersection: js.UndefOr[Boolean] = js.undefined
    
    var clipShadows: js.UndefOr[Boolean] = js.undefined
    
    var clippingPlanes: js.UndefOr[js.Array[Plane]] = js.undefined
    
    var colorWrite: js.UndefOr[Boolean] = js.undefined
    
    var defines: js.UndefOr[Any] = js.undefined
    
    var depthFunc: js.UndefOr[DepthModes] = js.undefined
    
    var depthTest: js.UndefOr[Boolean] = js.undefined
    
    var depthWrite: js.UndefOr[Boolean] = js.undefined
    
    var dithering: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[PixelFormat] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var polygonOffset: js.UndefOr[Boolean] = js.undefined
    
    var polygonOffsetFactor: js.UndefOr[Double] = js.undefined
    
    var polygonOffsetUnits: js.UndefOr[Double] = js.undefined
    
    var precision: js.UndefOr[highp | mediump | lowp | Null] = js.undefined
    
    var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
    
    var shadowSide: js.UndefOr[Side] = js.undefined
    
    var side: js.UndefOr[Side] = js.undefined
    
    var stencilFail: js.UndefOr[StencilOp] = js.undefined
    
    var stencilFunc: js.UndefOr[StencilFunc] = js.undefined
    
    var stencilFuncMask: js.UndefOr[Double] = js.undefined
    
    var stencilRef: js.UndefOr[Double] = js.undefined
    
    var stencilWrite: js.UndefOr[Boolean] = js.undefined
    
    var stencilWriteMask: js.UndefOr[Double] = js.undefined
    
    var stencilZFail: js.UndefOr[StencilOp] = js.undefined
    
    var stencilZPass: js.UndefOr[StencilOp] = js.undefined
    
    var toneMapped: js.UndefOr[Boolean] = js.undefined
    
    var transparent: js.UndefOr[Boolean] = js.undefined
    
    var userData: js.UndefOr[Any] = js.undefined
    
    var vertexColors: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object MaterialParameters {
    
    inline def apply(): MaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialParameters]
    }
    
    extension [Self <: MaterialParameters](x: Self) {
      
      inline def setAlphaTest(value: Double): Self = StObject.set(x, "alphaTest", value.asInstanceOf[js.Any])
      
      inline def setAlphaTestUndefined: Self = StObject.set(x, "alphaTest", js.undefined)
      
      inline def setAlphaToCoverage(value: Boolean): Self = StObject.set(x, "alphaToCoverage", value.asInstanceOf[js.Any])
      
      inline def setAlphaToCoverageUndefined: Self = StObject.set(x, "alphaToCoverage", js.undefined)
      
      inline def setBlendDst(value: BlendingDstFactor): Self = StObject.set(x, "blendDst", value.asInstanceOf[js.Any])
      
      inline def setBlendDstAlpha(value: Double): Self = StObject.set(x, "blendDstAlpha", value.asInstanceOf[js.Any])
      
      inline def setBlendDstAlphaUndefined: Self = StObject.set(x, "blendDstAlpha", js.undefined)
      
      inline def setBlendDstUndefined: Self = StObject.set(x, "blendDst", js.undefined)
      
      inline def setBlendEquation(value: BlendingEquation): Self = StObject.set(x, "blendEquation", value.asInstanceOf[js.Any])
      
      inline def setBlendEquationAlpha(value: Double): Self = StObject.set(x, "blendEquationAlpha", value.asInstanceOf[js.Any])
      
      inline def setBlendEquationAlphaUndefined: Self = StObject.set(x, "blendEquationAlpha", js.undefined)
      
      inline def setBlendEquationUndefined: Self = StObject.set(x, "blendEquation", js.undefined)
      
      inline def setBlendSrc(value: BlendingSrcFactor | BlendingDstFactor): Self = StObject.set(x, "blendSrc", value.asInstanceOf[js.Any])
      
      inline def setBlendSrcAlpha(value: Double): Self = StObject.set(x, "blendSrcAlpha", value.asInstanceOf[js.Any])
      
      inline def setBlendSrcAlphaUndefined: Self = StObject.set(x, "blendSrcAlpha", js.undefined)
      
      inline def setBlendSrcUndefined: Self = StObject.set(x, "blendSrc", js.undefined)
      
      inline def setBlending(value: Blending): Self = StObject.set(x, "blending", value.asInstanceOf[js.Any])
      
      inline def setBlendingUndefined: Self = StObject.set(x, "blending", js.undefined)
      
      inline def setClipIntersection(value: Boolean): Self = StObject.set(x, "clipIntersection", value.asInstanceOf[js.Any])
      
      inline def setClipIntersectionUndefined: Self = StObject.set(x, "clipIntersection", js.undefined)
      
      inline def setClipShadows(value: Boolean): Self = StObject.set(x, "clipShadows", value.asInstanceOf[js.Any])
      
      inline def setClipShadowsUndefined: Self = StObject.set(x, "clipShadows", js.undefined)
      
      inline def setClippingPlanes(value: js.Array[Plane]): Self = StObject.set(x, "clippingPlanes", value.asInstanceOf[js.Any])
      
      inline def setClippingPlanesUndefined: Self = StObject.set(x, "clippingPlanes", js.undefined)
      
      inline def setClippingPlanesVarargs(value: Plane*): Self = StObject.set(x, "clippingPlanes", js.Array(value*))
      
      inline def setColorWrite(value: Boolean): Self = StObject.set(x, "colorWrite", value.asInstanceOf[js.Any])
      
      inline def setColorWriteUndefined: Self = StObject.set(x, "colorWrite", js.undefined)
      
      inline def setDefines(value: Any): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
      
      inline def setDepthFunc(value: DepthModes): Self = StObject.set(x, "depthFunc", value.asInstanceOf[js.Any])
      
      inline def setDepthFuncUndefined: Self = StObject.set(x, "depthFunc", js.undefined)
      
      inline def setDepthTest(value: Boolean): Self = StObject.set(x, "depthTest", value.asInstanceOf[js.Any])
      
      inline def setDepthTestUndefined: Self = StObject.set(x, "depthTest", js.undefined)
      
      inline def setDepthWrite(value: Boolean): Self = StObject.set(x, "depthWrite", value.asInstanceOf[js.Any])
      
      inline def setDepthWriteUndefined: Self = StObject.set(x, "depthWrite", js.undefined)
      
      inline def setDithering(value: Boolean): Self = StObject.set(x, "dithering", value.asInstanceOf[js.Any])
      
      inline def setDitheringUndefined: Self = StObject.set(x, "dithering", js.undefined)
      
      inline def setFormat(value: PixelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPolygonOffset(value: Boolean): Self = StObject.set(x, "polygonOffset", value.asInstanceOf[js.Any])
      
      inline def setPolygonOffsetFactor(value: Double): Self = StObject.set(x, "polygonOffsetFactor", value.asInstanceOf[js.Any])
      
      inline def setPolygonOffsetFactorUndefined: Self = StObject.set(x, "polygonOffsetFactor", js.undefined)
      
      inline def setPolygonOffsetUndefined: Self = StObject.set(x, "polygonOffset", js.undefined)
      
      inline def setPolygonOffsetUnits(value: Double): Self = StObject.set(x, "polygonOffsetUnits", value.asInstanceOf[js.Any])
      
      inline def setPolygonOffsetUnitsUndefined: Self = StObject.set(x, "polygonOffsetUnits", js.undefined)
      
      inline def setPrecision(value: highp | mediump | lowp): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
      
      inline def setShadowSide(value: Side): Self = StObject.set(x, "shadowSide", value.asInstanceOf[js.Any])
      
      inline def setShadowSideUndefined: Self = StObject.set(x, "shadowSide", js.undefined)
      
      inline def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setStencilFail(value: StencilOp): Self = StObject.set(x, "stencilFail", value.asInstanceOf[js.Any])
      
      inline def setStencilFailUndefined: Self = StObject.set(x, "stencilFail", js.undefined)
      
      inline def setStencilFunc(value: StencilFunc): Self = StObject.set(x, "stencilFunc", value.asInstanceOf[js.Any])
      
      inline def setStencilFuncMask(value: Double): Self = StObject.set(x, "stencilFuncMask", value.asInstanceOf[js.Any])
      
      inline def setStencilFuncMaskUndefined: Self = StObject.set(x, "stencilFuncMask", js.undefined)
      
      inline def setStencilFuncUndefined: Self = StObject.set(x, "stencilFunc", js.undefined)
      
      inline def setStencilRef(value: Double): Self = StObject.set(x, "stencilRef", value.asInstanceOf[js.Any])
      
      inline def setStencilRefUndefined: Self = StObject.set(x, "stencilRef", js.undefined)
      
      inline def setStencilWrite(value: Boolean): Self = StObject.set(x, "stencilWrite", value.asInstanceOf[js.Any])
      
      inline def setStencilWriteMask(value: Double): Self = StObject.set(x, "stencilWriteMask", value.asInstanceOf[js.Any])
      
      inline def setStencilWriteMaskUndefined: Self = StObject.set(x, "stencilWriteMask", js.undefined)
      
      inline def setStencilWriteUndefined: Self = StObject.set(x, "stencilWrite", js.undefined)
      
      inline def setStencilZFail(value: StencilOp): Self = StObject.set(x, "stencilZFail", value.asInstanceOf[js.Any])
      
      inline def setStencilZFailUndefined: Self = StObject.set(x, "stencilZFail", js.undefined)
      
      inline def setStencilZPass(value: StencilOp): Self = StObject.set(x, "stencilZPass", value.asInstanceOf[js.Any])
      
      inline def setStencilZPassUndefined: Self = StObject.set(x, "stencilZPass", js.undefined)
      
      inline def setToneMapped(value: Boolean): Self = StObject.set(x, "toneMapped", value.asInstanceOf[js.Any])
      
      inline def setToneMappedUndefined: Self = StObject.set(x, "toneMapped", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      inline def setUserData(value: Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      inline def setVertexColors(value: Boolean): Self = StObject.set(x, "vertexColors", value.asInstanceOf[js.Any])
      
      inline def setVertexColorsUndefined: Self = StObject.set(x, "vertexColors", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
