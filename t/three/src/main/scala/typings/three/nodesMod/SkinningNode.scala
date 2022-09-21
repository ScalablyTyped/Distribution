package typings.three.nodesMod

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.skinningNodeMod.default
import typings.three.threeMod.SkinnedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "SkinningNode")
@js.native
open class SkinningNode protected () extends default {
  def this(skinnedMesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) = this()
}
