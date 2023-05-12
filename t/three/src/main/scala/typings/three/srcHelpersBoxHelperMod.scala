package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersBoxHelperMod {
  
  @JSImport("three/src/helpers/BoxHelper", "BoxHelper")
  @js.native
  open class BoxHelper protected ()
    extends LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    /**
      * Creates a new wireframe box that bounds the passed object
      * @remarks
      * Internally this uses {@link THREE.Box3.setFromObject | Box3.setFromObject} to calculate the dimensions
      * Note that this includes any children.
      * @param object The object3D to show the world-axis-aligned bounding box.
      * @param color Hexadecimal value that defines the box's color. Default `0xffff00`
      */
    def this(`object`: Object3D[Event]) = this()
    def this(`object`: Object3D[Event], color: ColorRepresentation) = this()
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * Updates the wireframe box for the passed object.
      * @param object {@link THREE.Object3D | Object3D} to create the helper of.
      */
    def setFromObject(`object`: Object3D[Event]): this.type = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `BoxHelper`
      */
    @JSName("type")
    val type_BoxHelper: String | typings.three.threeStrings.BoxHelper = js.native
    
    /**
      * Updates the helper's geometry to match the dimensions of the object, including any children
      * @remarks
      * See {@link THREE.Box3.setFromObject | Box3.setFromObject}.
      */
    def update(): Unit = js.native
    def update(`object`: Object3D[Event]): Unit = js.native
  }
}
