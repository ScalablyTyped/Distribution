package typings.three

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Euler
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmGeometriesDecalGeometryMod {
  
  @JSImport("three/examples/jsm/geometries/DecalGeometry", "DecalGeometry")
  @js.native
  open class DecalGeometry protected () extends BufferGeometry[NormalBufferAttributes] {
    def this(
      mesh: Mesh[
            typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes], 
            Material | js.Array[Material]
          ],
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
