package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrText2DMod {
  
  @JSImport("three/examples/jsm/webxr/Text2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createText(message: String, height: Double): Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createText")(message.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]]
}
