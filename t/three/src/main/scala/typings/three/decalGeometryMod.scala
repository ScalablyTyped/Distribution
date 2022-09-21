package typings.three

import typings.three.materialMod.Material
import typings.three.threeMod.BufferGeometry
import typings.three.threeMod.Euler
import typings.three.threeMod.Mesh
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decalGeometryMod {
  
  @JSImport("three/examples/jsm/geometries/DecalGeometry", "DecalGeometry")
  @js.native
  open class DecalGeometry protected () extends BufferGeometry {
    def this(
      mesh: Mesh[typings.three.bufferGeometryMod.BufferGeometry, Material | js.Array[Material]],
      position: Vector3,
      orientation: Euler,
      size: Vector3
    ) = this()
  }
  
  @JSImport("three/examples/jsm/geometries/DecalGeometry", "DecalVertex")
  @js.native
  open class DecalVertex protected () extends StObject {
    def this(position: Vector3, normal: Vector3) = this()
  }
}
