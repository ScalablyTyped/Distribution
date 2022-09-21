package typings.three.ifcloaderMod

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfcMesh
  extends Mesh[BufferGeometry, Material | js.Array[Material]] {
  
  var modelID: Double = js.native
}
