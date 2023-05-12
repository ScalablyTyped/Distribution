package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathPlaneMod.Plane
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersPlaneHelperMod {
  
  @JSImport("three/src/helpers/PlaneHelper", "PlaneHelper")
  @js.native
  open class PlaneHelper protected ()
    extends LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    /**
      * Creates a new wireframe representation of the passed plane.
      * @param plane The plane to visualize.
      * @param size Side length of plane helper. Expects a `Float`. Default `1`
      * @param hex Color. Default `0xffff00`
      */
    def this(plane: Plane) = this()
    def this(plane: Plane, size: Double) = this()
    def this(plane: Plane, size: Double, hex: Double) = this()
    def this(plane: Plane, size: Unit, hex: Double) = this()
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * The {@link Plane | plane} being visualized.
      */
    var plane: Plane = js.native
    
    /**
      * The side lengths of plane helper.
      * @remarks Expects a `Float`
      * @defaultValue `1`
      */
    var size: Double = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `PlaneHelper`
      */
    @JSName("type")
    val type_PlaneHelper: String | typings.three.threeStrings.PlaneHelper = js.native
  }
}
