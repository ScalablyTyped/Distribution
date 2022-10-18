package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.InstancedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsInstanceNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/InstanceNode", JSImport.Default)
  @js.native
  open class default protected () extends InstanceNode {
    def this(instanceMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]]) = this()
  }
  
  @js.native
  trait InstanceNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var instanceMatrixNode: typings.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var instanceMesh: InstancedMesh[BufferGeometry, Material | js.Array[Material]] = js.native
  }
}
