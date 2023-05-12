package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcObjectsLineMod.Line
import typings.three.srcObjectsMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersArrowHelperMod {
  
  @JSImport("three/src/helpers/ArrowHelper", "ArrowHelper")
  @js.native
  open class ArrowHelper protected () extends Object3D[Event] {
    /**
      * Create a new instance of {@link ArrowHelper}
      * @param dir Direction from origin. Must be a unit vector. Default `new THREE.Vector3(0, 0, 1)`
      * @param origin Point at which the arrow starts. Default `new THREE.Vector3(0, 0, 0)`
      * @param length Length of the arrow. Default `1`
      * @param hex Hexadecimal value to define color. Default `0xffff00`
      * @param headLength The length of the head of the arrow. Default `0.2 * length`
      * @param headWidth The width of the head of the arrow. Default `0.2 * headLength`
      */
    def this(
      dir: js.UndefOr[Vector3],
      origin: js.UndefOr[Vector3],
      length: js.UndefOr[Double],
      color: js.UndefOr[ColorRepresentation],
      headLength: js.UndefOr[Double],
      headWidth: js.UndefOr[Double]
    ) = this()
    
    /**
      * Contains the cone part of the arrowHelper.
      */
    var cone: Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * Contains the line part of the arrowHelper.
      */
    var line: Line[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] = js.native
    
    /**
      * Sets the color of the arrowHelper.
      * @param color The desired color.
      */
    def setColor(color: ColorRepresentation): Unit = js.native
    
    /**
      * @param dir The desired direction. Must be a unit vector.
      */
    def setDirection(dir: Vector3): Unit = js.native
    
    /**
      * Sets the length of the arrowhelper.
      * @param length The desired length.
      * @param headLength The length of the head of the arrow. Default `0.2 * length`
      * @param headWidth The width of the head of the arrow. Default `0.2 * headLength`
      */
    def setLength(length: Double): Unit = js.native
    def setLength(length: Double, headLength: Double): Unit = js.native
    def setLength(length: Double, headLength: Double, headWidth: Double): Unit = js.native
    def setLength(length: Double, headLength: Unit, headWidth: Double): Unit = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `ArrowHelper`
      */
    @JSName("type")
    val type_ArrowHelper: String | typings.three.threeStrings.ArrowHelper = js.native
  }
}
