package typings.three.materialMod

import typings.three.constantsMod.Blending
import typings.three.constantsMod.BlendingDstFactor
import typings.three.constantsMod.BlendingEquation
import typings.three.constantsMod.BlendingSrcFactor
import typings.three.constantsMod.DepthModes
import typings.three.constantsMod.Side
import typings.three.constantsMod.StencilFunc
import typings.three.constantsMod.StencilOp
import typings.three.eventDispatcherMod.EventDispatcher
import typings.three.shaderLibMod.Shader
import typings.three.threeBooleans.`true`
import typings.three.threeStrings.highp
import typings.three.threeStrings.lowp
import typings.three.threeStrings.mediump
import typings.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/Material", "Material")
@js.native
class Material () extends EventDispatcher {
  /**
  	 * Sets the alpha value to be used when running an alpha test. Default is 0.
  	 */
  var alphaTest: Double = js.native
  /**
  	 * Blending destination. It's one of the blending mode constants defined in Three.js. Default is {@link OneMinusSrcAlphaFactor}.
  	 */
  var blendDst: BlendingDstFactor = js.native
  /**
  	 * The tranparency of the .blendDst. Default is null.
  	 */
  var blendDstAlpha: Double | Null = js.native
  /**
  	 * Blending equation to use when applying blending. It's one of the constants defined in Three.js. Default is {@link AddEquation}.
  	 */
  var blendEquation: BlendingEquation = js.native
  /**
  	 * The tranparency of the .blendEquation. Default is null.
  	 */
  var blendEquationAlpha: Double | Null = js.native
  /**
  	 * Blending source. It's one of the blending mode constants defined in Three.js. Default is {@link SrcAlphaFactor}.
  	 */
  var blendSrc: BlendingSrcFactor | BlendingDstFactor = js.native
  /**
  	 * The tranparency of the .blendSrc. Default is null.
  	 */
  var blendSrcAlpha: Double | Null = js.native
  /**
  	 * Which blending to use when displaying objects with this material. Default is {@link NormalBlending}.
  	 */
  var blending: Blending = js.native
  /**
  	 * Changes the behavior of clipping planes so that only their intersection is clipped, rather than their union. Default is false.
  	 */
  var clipIntersection: Boolean = js.native
  /**
  	 * Defines whether to clip shadows according to the clipping planes specified on this material. Default is false.
  	 */
  var clipShadows: Boolean = js.native
  /**
  	 * User-defined clipping planes specified as THREE.Plane objects in world space. These planes apply to the objects this material is attached to. Points in space whose signed distance to the plane is negative are clipped (not rendered). See the WebGL / clipping /intersection example. Default is null.
  	 */
  var clippingPlanes: js.Any = js.native
  /**
  	 * Whether to render the material's color. This can be used in conjunction with a mesh's .renderOrder property to create invisible objects that occlude other objects. Default is true.
  	 */
  var colorWrite: Boolean = js.native
  /**
  	 * Custom defines to be injected into the shader. These are passed in form of an object literal, with key/value pairs. { MY_CUSTOM_DEFINE: '' , PI2: Math.PI * 2 }.
  	 * The pairs are defined in both vertex and fragment shaders. Default is undefined.
  	 */
  var defines: js.Any = js.native
  /**
  	 * Which depth function to use. Default is {@link LessEqualDepth}. See the depth mode constants for all possible values.
  	 */
  var depthFunc: DepthModes = js.native
  /**
  	 * Whether to have depth test enabled when rendering this material. Default is true.
  	 */
  var depthTest: Boolean = js.native
  /**
  	 * Whether rendering this material has any effect on the depth buffer. Default is true.
  	 * When drawing 2D overlays it can be useful to disable the depth writing in order to layer several things together without creating z-index artifacts.
  	 */
  var depthWrite: Boolean = js.native
  /**
  	 * Whether to apply dithering to the color to remove the appearance of banding. Default is false.
  	 */
  var dithering: Boolean = js.native
  /**
  	 * Define whether the material is rendered with flat shading. Default is false.
  	 */
  var flatShading: Boolean = js.native
  /**
  	 * Whether the material is affected by fog. Default is true.
  	 */
  var fog: Boolean = js.native
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
  	 */
  var name: String = js.native
  /**
  	 * Specifies that the material needs to be updated, WebGL wise. Set it to true if you made changes that need to be reflected in WebGL.
  	 * This property is automatically set to true when instancing a new material.
  	 */
  var needsUpdate: Boolean = js.native
  /**
  	 * Opacity. Default is 1.
  	 */
  var opacity: Double = js.native
  /**
  	 * Whether to use polygon offset. Default is false. This corresponds to the POLYGON_OFFSET_FILL WebGL feature.
  	 */
  var polygonOffset: Boolean = js.native
  /**
  	 * Sets the polygon offset factor. Default is 0.
  	 */
  var polygonOffsetFactor: Double = js.native
  /**
  	 * Sets the polygon offset units. Default is 0.
  	 */
  var polygonOffsetUnits: Double = js.native
  /**
  	 * Override the renderer's default precision for this material. Can be "highp", "mediump" or "lowp". Defaults is null.
  	 */
  var precision: highp | mediump | lowp | Null = js.native
  /**
  	 * Whether to premultiply the alpha (transparency) value. See WebGL / Materials / Transparency for an example of the difference. Default is false.
  	 */
  var premultipliedAlpha: Boolean = js.native
  /**
  	 * Defines which of the face sides will cast shadows. Default is *null*.
  	 * If *null*, the value is opposite that of side, above.
  	 */
  var shadowSide: Side = js.native
  /**
  	 * Defines which of the face sides will be rendered - front, back or both.
  	 * Default is THREE.FrontSide. Other options are THREE.BackSide and THREE.DoubleSide.
  	 */
  var side: Side = js.native
  /**
    * Which stencil operation to perform when the comparison function returns false. Default is {@link KeepStencilOp}. See the stencil operation constants for all possible values.
    */
  var stencilFail: StencilOp = js.native
  /**
    * The stencil comparison function to use. Default is {@link AlwaysStencilFunc}. See stencil operation constants for all possible values.
    */
  var stencilFunc: StencilFunc = js.native
  /**
    * The bit mask to use when comparing against or writing to the stencil buffer. Default is *0xFF*.
    */
  var stencilMask: Double = js.native
  /**
    * The value to use when performing stencil comparisons or stencil operations. Default is *0*.
    */
  var stencilRef: Double = js.native
  /**
    * Whether rendering this material has any effect on the stencil buffer. Default is *false*.
    */
  var stencilWrite: Boolean = js.native
  /**
    * Which stencil operation to perform when the comparison function returns true but the depth test fails. Default is {@link KeepStencilOp}. See the stencil operation constants for all possible values.
    */
  var stencilZFail: StencilOp = js.native
  /**
    * Which stencil operation to perform when the comparison function returns true and the depth test passes. Default is {@link KeepStencilOp}. See the stencil operation constants for all possible values.
    */
  var stencilZPass: StencilOp = js.native
  /**
  	 * Defines whether this material is tone mapped according to the renderer's toneMapping setting.
  	 * Default is true.
  	 */
  var toneMapped: Boolean = js.native
  /**
  	 * Defines whether this material is transparent. This has an effect on rendering as transparent objects need special treatment and are rendered after non-transparent objects.
  	 * When set to true, the extent to which the material is transparent is controlled by setting it's .opacity property.
  	 * Default is false.
  	 */
  var transparent: Boolean = js.native
  /**
  	 * Value is the string 'Material'. This shouldn't be changed, and can be used to find all objects of this type in a scene.
  	 */
  var `type`: String = js.native
  /**
  	 * An object that can be used to store custom data about the Material. It should not hold references to functions as these will not be cloned.
  	 */
  var userData: js.Any = js.native
  /**
  	 * UUID of this material instance. This gets automatically assigned, so this shouldn't be edited.
  	 */
  var uuid: String = js.native
  /**
  	 * This starts at 0 and counts how many times .needsUpdate is set to true.
  	 */
  var version: Double = js.native
  /**
  	 * Defines whether vertex coloring is used. Default is false.
  	 */
  var vertexColors: Boolean = js.native
  /**
  	 * Defines whether this material is visible. Default is true.
  	 */
  var visible: Boolean = js.native
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
  	 * This disposes the material. Textures of a material don't get disposed. These needs to be disposed by {@link Texture}.
  	 */
  def dispose(): Unit = js.native
  /**
  	 * An optional callback that is executed immediately before the shader program is compiled. This function is called with the shader source code as a parameter. Useful for the modification of built-in materials.
  	 * @param shader Source code of the shader
  	 * @param renderer WebGLRenderer Context that is initializing the material
  	 */
  def onBeforeCompile(shader: Shader, renderer: WebGLRenderer): Unit = js.native
  /**
  	 * Sets the properties based on the values.
  	 * @param values A container with parameters.
  	 */
  def setValues(values: MaterialParameters): Unit = js.native
  /**
  	 * Convert the material to three.js JSON format.
  	 * @param meta Object containing metadata such as textures or images for the material.
  	 */
  def toJSON(): js.Any = js.native
  def toJSON(meta: js.Any): js.Any = js.native
}

