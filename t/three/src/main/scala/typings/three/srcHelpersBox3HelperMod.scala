package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathBox3Mod.Box3
import typings.three.srcMathColorMod.Color
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersBox3HelperMod {
  
  @JSImport("three/src/helpers/Box3Helper", "Box3Helper")
  @js.native
  open class Box3Helper protected ()
    extends LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    /**
      * Creates a new wireframe box that represents the passed Box3.
      * @param box The Box3 to show.
      * @param color The box's color. Default `0xffff00`
      */
    def this(box: Box3) = this()
    def this(box: Box3, color: Color) = this()
    
    /**
      * The Box3 being visualized.
      */
    var box: Box3 = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `Box3Helper`
      */
    @JSName("type")
    val type_Box3Helper: String | typings.three.threeStrings.Box3Helper = js.native
  }
}
