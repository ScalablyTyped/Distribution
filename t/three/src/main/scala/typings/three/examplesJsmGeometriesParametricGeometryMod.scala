package typings.three

import typings.three.anon.Func
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmGeometriesParametricGeometryMod {
  
  @JSImport("three/examples/jsm/geometries/ParametricGeometry", "ParametricBufferGeometry")
  @js.native
  open class ParametricBufferGeometry () extends ParametricGeometry {
    def this(func: js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Unit]) = this()
    def this(func: js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Unit], slices: Double) = this()
    def this(func: Unit, slices: Double) = this()
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Unit],
      slices: Double,
      stacks: Double
    ) = this()
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Unit],
      slices: Unit,
      stacks: Double
    ) = this()
    def this(func: Unit, slices: Double, stacks: Double) = this()
    def this(func: Unit, slices: Unit, stacks: Double) = this()
  }
  
  @JSImport("three/examples/jsm/geometries/ParametricGeometry", "ParametricGeometry")
  @js.native
  open class ParametricGeometry () extends BufferGeometry {
    def this(func: js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Unit]) = this()
    def this(func: js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Unit], slices: Double) = this()
    def this(func: Unit, slices: Double) = this()
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Unit],
      slices: Double,
      stacks: Double
    ) = this()
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* target */ Vector3, Unit],
      slices: Unit,
      stacks: Double
    ) = this()
    def this(func: Unit, slices: Double, stacks: Double) = this()
    def this(func: Unit, slices: Unit, stacks: Double) = this()
    
    var parameters: Func = js.native
  }
}
