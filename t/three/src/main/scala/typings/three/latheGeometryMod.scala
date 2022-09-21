package typings.three

import typings.three.anon.PhiLength
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latheGeometryMod {
  
  @JSImport("three/src/geometries/LatheGeometry", "LatheGeometry")
  @js.native
  /**
    * @param points
    * @param [segments=12]
    * @param [phiStart=0]
    * @param [phiLength=Math.PI * 2]
    */
  open class LatheGeometry () extends BufferGeometry {
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
    
    var parameters: PhiLength = js.native
  }
  /* static members */
  object LatheGeometry {
    
    @JSImport("three/src/geometries/LatheGeometry", "LatheGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): LatheGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[LatheGeometry]
  }
}
