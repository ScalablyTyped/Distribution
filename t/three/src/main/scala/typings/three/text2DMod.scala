package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object text2DMod {
  
  @JSImport("three/examples/jsm/webxr/Text2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createText(message: String, height: Double): Mesh[BufferGeometry, Material | js.Array[Material]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createText")(message.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Mesh[BufferGeometry, Material | js.Array[Material]]]
}
