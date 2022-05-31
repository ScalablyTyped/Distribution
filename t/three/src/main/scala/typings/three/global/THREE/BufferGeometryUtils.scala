package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BufferGeometryUtils {
  
  @JSGlobal("THREE.BufferGeometryUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeTangents(geometry: typings.three.bufferGeometryMod.BufferGeometry): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTangents")(geometry.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def mergeBufferAttributes(attributes: js.Array[typings.three.bufferAttributeMod.BufferAttribute]): typings.three.bufferAttributeMod.BufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[typings.three.bufferAttributeMod.BufferAttribute]
  
  inline def mergeBufferGeometries(geometries: js.Array[typings.three.bufferGeometryMod.BufferGeometry]): typings.three.bufferGeometryMod.BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferGeometries")(geometries.asInstanceOf[js.Any]).asInstanceOf[typings.three.bufferGeometryMod.BufferGeometry]
}
