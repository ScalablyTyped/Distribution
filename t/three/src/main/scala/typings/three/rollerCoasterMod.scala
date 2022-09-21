package typings.three

import typings.three.materialMod.Material
import typings.three.threeMod.BufferGeometry
import typings.three.threeMod.Curve
import typings.three.threeMod.Mesh
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rollerCoasterMod {
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "RollerCoasterGeometry")
  @js.native
  open class RollerCoasterGeometry protected () extends BufferGeometry {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "RollerCoasterLiftersGeometry")
  @js.native
  open class RollerCoasterLiftersGeometry protected () extends BufferGeometry {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "RollerCoasterShadowGeometry")
  @js.native
  open class RollerCoasterShadowGeometry protected () extends BufferGeometry {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "SkyGeometry")
  @js.native
  open class SkyGeometry protected () extends BufferGeometry {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "TreesGeometry")
  @js.native
  open class TreesGeometry protected () extends BufferGeometry {
    def this(landscape: Mesh[typings.three.bufferGeometryMod.BufferGeometry, Material | js.Array[Material]]) = this()
  }
}
