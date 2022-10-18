package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BufferGeometryUtils {
  
  @JSImport("three/src/Three", "BufferGeometryUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeTangents(geometry: typings.three.srcCoreBufferGeometryMod.BufferGeometry): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTangents")(geometry.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def mergeBufferAttributes(attributes: js.Array[typings.three.srcCoreBufferAttributeMod.BufferAttribute]): typings.three.srcCoreBufferAttributeMod.BufferAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcCoreBufferAttributeMod.BufferAttribute]
  
  inline def mergeBufferGeometries(geometries: js.Array[typings.three.srcCoreBufferGeometryMod.BufferGeometry]): typings.three.srcCoreBufferGeometryMod.BufferGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeBufferGeometries")(geometries.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcCoreBufferGeometryMod.BufferGeometry]
}
