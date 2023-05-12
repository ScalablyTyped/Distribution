package typings.three

import typings.three.anon.PhiLength
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesLatheGeometryMod {
  
  @JSImport("three/src/geometries/LatheGeometry", "LatheGeometry")
  @js.native
  /**
    * This creates a {@link LatheGeometry} based on the parameters.
    * @param points Array of Vector2s. The x-coordinate of each point must be greater than zero.
    *               Default `[new Vector2(0, -0.5), new Vector2(0.5, 0), new Vector2(0, 0.5)]` _which creates a simple diamond shape_.
    * @param segments The number of circumference segments to generate. Expects a `Integer`. Default `12`.
    * @param phiStart The starting angle in radians. Expects a `Float`. Default `0`.
    * @param phiLength The radian (0 to 2*PI) range of the lathed section 2*PI is a closed lathe, less than 2PI is a portion. Expects a `Float`. Default `Math.PI * 2`.
    */
  open class LatheGeometry () extends BufferGeometry[NormalBufferAttributes] {
    def this(points: js.Array[Vector2]) = this()
    def this(points: js.Array[Vector2], segments: Double) = this()
    def this(points: Unit, segments: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double) = this()
    def this(points: js.Array[Vector2], segments: Unit, phiStart: Double) = this()
    def this(points: Unit, segments: Double, phiStart: Double) = this()
    def this(points: Unit, segments: Unit, phiStart: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Double, phiLength: Double) = this()
    def this(points: js.Array[Vector2], segments: Double, phiStart: Unit, phiLength: Double) = this()
    def this(points: js.Array[Vector2], segments: Unit, phiStart: Double, phiLength: Double) = this()
    def this(points: js.Array[Vector2], segments: Unit, phiStart: Unit, phiLength: Double) = this()
    def this(points: Unit, segments: Double, phiStart: Double, phiLength: Double) = this()
    def this(points: Unit, segments: Double, phiStart: Unit, phiLength: Double) = this()
    def this(points: Unit, segments: Unit, phiStart: Double, phiLength: Double) = this()
    def this(points: Unit, segments: Unit, phiStart: Unit, phiLength: Double) = this()
    
    /**
      * An object with a property for each of the constructor parameters.
      * @remarks Any modification after instantiation does not change the geometry.
      */
    val parameters: PhiLength = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `LatheGeometry`
      */
    @JSName("type")
    val type_LatheGeometry: String | typings.three.threeStrings.LatheGeometry = js.native
  }
  /* static members */
  object LatheGeometry {
    
    @JSImport("three/src/geometries/LatheGeometry", "LatheGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromJSON(data: js.Object): LatheGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[LatheGeometry]
  }
}
