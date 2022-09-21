package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.InstancedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/InstanceNode", JSImport.Default)
  @js.native
  open class default protected () extends InstanceNode {
    def this(instanceMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]]) = this()
  }
  
  @js.native
  trait InstanceNode
    extends typings.three.nodeMod.default {
    
    var instanceMatrixNode: typings.three.nodeMod.default = js.native
    
    var instanceMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]] = js.native
  }
}
