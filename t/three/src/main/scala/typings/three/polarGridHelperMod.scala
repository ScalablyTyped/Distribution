package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.colorMod.Color
import typings.three.geometryMod.Geometry
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polarGridHelperMod {
  
  @JSImport("three/src/helpers/PolarGridHelper", "PolarGridHelper")
  @js.native
  class PolarGridHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    /**
    	 * @param [radius=10]
    	 * @param [radials=16]
    	 * @param [circles=8]
    	 * @param [divisions=64]
    	 * @param [color1=0x444444]
    	 * @param [color2=0x888888]
    	 */
    def this(radius: Double, radials: Double, circles: Double, divisions: Double) = this()
    def this(radius: Double, radials: Double, circles: Double, divisions: Double, color1: String) = this()
    def this(radius: Double, radials: Double, circles: Double, divisions: Double, color1: Double) = this()
    def this(radius: Double, radials: Double, circles: Double, divisions: Double, color1: Color) = this()
    def this(
      radius: Double,
      radials: Double,
      circles: Double,
      divisions: Double,
      color1: js.UndefOr[scala.Nothing],
      color2: String
    ) = this()
    def this(
      radius: Double,
      radials: Double,
      circles: Double,
      divisions: Double,
      color1: js.UndefOr[scala.Nothing],
      color2: Double
    ) = this()
    def this(
      radius: Double,
      radials: Double,
      circles: Double,
      divisions: Double,
      color1: js.UndefOr[scala.Nothing],
      color2: Color
    ) = this()
    def this(
      radius: Double,
      radials: Double,
      circles: Double,
      divisions: Double,
      color1: String,
      color2: String
    ) = this()
    def this(
      radius: Double,
      radials: Double,
      circles: Double,
      divisions: Double,
      color1: String,
      color2: Double
    ) = this()
    def this(radius: Double, radials: Double, circles: Double, divisions: Double, color1: String, color2: Color) = this()
    def this(
      radius: Double,
      radials: Double,
      circles: Double,
      divisions: Double,
      color1: Double,
      color2: String
    ) = this()
    def this(
      radius: Double,
      radials: Double,
      circles: Double,
      divisions: Double,
      color1: Double,
      color2: Double
    ) = this()
    def this(radius: Double, radials: Double, circles: Double, divisions: Double, color1: Double, color2: Color) = this()
    def this(radius: Double, radials: Double, circles: Double, divisions: Double, color1: Color, color2: String) = this()
    def this(radius: Double, radials: Double, circles: Double, divisions: Double, color1: Color, color2: Double) = this()
    def this(radius: Double, radials: Double, circles: Double, divisions: Double, color1: Color, color2: Color) = this()
  }
}
