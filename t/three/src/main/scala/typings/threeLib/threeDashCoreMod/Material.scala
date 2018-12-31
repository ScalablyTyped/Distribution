package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Material")
@js.native
class Material () extends EventDispatcher {
  /**
    * Sets the alpha value to be used when running an alpha test. Default is 0.
    */
  var alphaTest: scala.Double = js.native
  /**
    * Blending destination. It's one of the blending mode constants defined in Three.js. Default is {@link OneMinusSrcAlphaFactor}.
    */
  var blendDst: BlendingDstFactor = js.native
  /**
    * The tranparency of the .blendDst. Default is null.
    */
  var blendDstAlpha: scala.Double | scala.Null = js.native
  /**
    * Blending equation to use when applying blending. It's one of the constants defined in Three.js. Default is {@link AddEquation}.
    */
  var blendEquation: BlendingEquation = js.native
  /**
    * The tranparency of the .blendEquation. Default is null.
    */
  var blendEquationAlpha: scala.Double | scala.Null = js.native
  /**
    * Blending source. It's one of the blending mode constants defined in Three.js. Default is {@link SrcAlphaFactor}.
    */
  var blendSrc: BlendingSrcFactor | BlendingDstFactor = js.native
  /**
    * The tranparency of the .blendSrc. Default is null.
    */
  var blendSrcAlpha: scala.Double | scala.Null = js.native
  /**
    * Which blending to use when displaying objects with this material. Default is {@link NormalBlending}.
    */
  var blending: Blending = js.native
  /**
    * Changes the behavior of clipping planes so that only their intersection is clipped, rather than their union. Default is false.
    */
  var clipIntersection: scala.Boolean = js.native
  /**
    * Defines whether to clip shadows according to the clipping planes specified on this material. Default is false.
    */
  var clipShadows: scala.Boolean = js.native
  /**
    * User-defined clipping planes specified as THREE.Plane objects in world space. These planes apply to the objects this material is attached to. Points in space whose signed distance to the plane is negative are clipped (not rendered). See the WebGL / clipping /intersection example. Default is null.
    */
  var clippingPlanes: js.Any = js.native
  /**
    * Whether to render the material's color. This can be used in conjunction with a mesh's .renderOrder property to create invisible objects that occlude other objects. Default is true.
    */
  var colorWrite: scala.Boolean = js.native
  /**
    * Which depth function to use. Default is {@link LessEqualDepth}. See the depth mode constants for all possible values.
    */
  var depthFunc: DepthModes = js.native
  /**
    * Whether to have depth test enabled when rendering this material. Default is true.
    */
  var depthTest: scala.Boolean = js.native
  /**
    * Whether rendering this material has any effect on the depth buffer. Default is true.
    * When drawing 2D overlays it can be useful to disable the depth writing in order to layer several things together without creating z-index artifacts.
    */
  var depthWrite: scala.Boolean = js.native
  /**
    * Whether to apply dithering to the color to remove the appearance of banding. Default is false.
    */
  var dithering: scala.Boolean = js.native
  /**
    * Define whether the material is rendered with flat shading. Default is false.
    */
  var flatShading: scala.Boolean = js.native
  /**
    * Whether the material is affected by fog. Default is true.
    */
  var fog: scala.Boolean = js.native
  /**
    * Unique number of this material instance.
    */
  var id: scala.Double = js.native
  /**
    * Used to check whether this or derived classes are materials. Default is true.
    * You should not change this, as it used internally for optimisation.
    */
  var isMaterial: scala.Boolean = js.native
  /**
    * Whether the material is affected by lights. Default is true.
    */
  var lights: scala.Boolean = js.native
  /**
    * Material name. Default is an empty string.
    */
  var name: java.lang.String = js.native
  /**
    * Specifies that the material needs to be updated, WebGL wise. Set it to true if you made changes that need to be reflected in WebGL.
    * This property is automatically set to true when instancing a new material.
    */
  var needsUpdate: scala.Boolean = js.native
  /**
    * Opacity. Default is 1.
    */
  var opacity: scala.Double = js.native
  /**
    * Enables/disables overdraw. If greater than zero, polygons are drawn slightly bigger in order to fix antialiasing gaps when using the CanvasRenderer. Default is 0.
    */
  var overdraw: scala.Double = js.native
  /**
    * Whether to use polygon offset. Default is false. This corresponds to the POLYGON_OFFSET_FILL WebGL feature.
    */
  var polygonOffset: scala.Boolean = js.native
  /**
    * Sets the polygon offset factor. Default is 0.
    */
  var polygonOffsetFactor: scala.Double = js.native
  /**
    * Sets the polygon offset units. Default is 0.
    */
  var polygonOffsetUnits: scala.Double = js.native
  /**
    * Override the renderer's default precision for this material. Can be "highp", "mediump" or "lowp". Defaults is null.
    */
  var precision: threeLib.threeLibStrings.highp | threeLib.threeLibStrings.mediump | threeLib.threeLibStrings.lowp | scala.Null = js.native
  /**
    * Whether to premultiply the alpha (transparency) value. See WebGL / Materials / Transparency for an example of the difference. Default is false.
    */
  var premultipliedAlpha: scala.Boolean = js.native
  /**
    * Defines which of the face sides will be rendered - front, back or both.
    * Default is THREE.FrontSide. Other options are THREE.BackSide and THREE.DoubleSide.
    */
  var side: Side = js.native
  /**
    * Defines whether this material is transparent. This has an effect on rendering as transparent objects need special treatment and are rendered after non-transparent objects.
    * When set to true, the extent to which the material is transparent is controlled by setting it's .opacity property.
    * Default is false.
    */
  var transparent: scala.Boolean = js.native
  /**
    * Value is the string 'Material'. This shouldn't be changed, and can be used to find all objects of this type in a scene.
    */
  var `type`: java.lang.String = js.native
  /**
    * An object that can be used to store custom data about the Material. It should not hold references to functions as these will not be cloned.
    */
  var userData: js.Any = js.native
  /**
    * UUID of this material instance. This gets automatically assigned, so this shouldn't be edited.
    */
  var uuid: java.lang.String = js.native
  /**
    * Defines whether vertex coloring is used. Default is THREE.NoColors. Other options are THREE.VertexColors and THREE.FaceColors.
    */
  var vertexColors: Colors = js.native
  /**
    * Defines whether this material is visible. Default is true.
    */
  var visible: scala.Boolean = js.native
  /**
    * Copy the parameters from the passed material into this material.
    * @param material
    */
  def copy(material: this.type): this.type = js.native
  /**
    * This disposes the material. Textures of a material don't get disposed. These needs to be disposed by {@link Texture}.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Sets the properties based on the values.
    * @param values A container with parameters.
    */
  def setValues(values: MaterialParameters): scala.Unit = js.native
  /**
    * Convert the material to three.js JSON format.
    * @param meta Object containing metadata such as textures or images for the material.
    */
  def toJSON(): js.Any = js.native
  def toJSON(meta: js.Any): js.Any = js.native
  /**
    * Call .dispatchEvent ( { type: 'update' }) on the material.
    */
  def update(): scala.Unit = js.native
}

