package typings.threeTdsLoader.anon

import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBufferGeometryUtils extends StObject {
  
  def computeTangents(geometry: BufferGeometry): Null
  
  def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute
  
  def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry
}
object TypeofBufferGeometryUtils {
  
  inline def apply(
    computeTangents: BufferGeometry => Null,
    mergeBufferAttributes: js.Array[BufferAttribute] => BufferAttribute,
    mergeBufferGeometries: js.Array[BufferGeometry] => BufferGeometry
  ): TypeofBufferGeometryUtils = {
    val __obj = js.Dynamic.literal(computeTangents = js.Any.fromFunction1(computeTangents), mergeBufferAttributes = js.Any.fromFunction1(mergeBufferAttributes), mergeBufferGeometries = js.Any.fromFunction1(mergeBufferGeometries))
    __obj.asInstanceOf[TypeofBufferGeometryUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofBufferGeometryUtils] (val x: Self) extends AnyVal {
    
    inline def setComputeTangents(value: BufferGeometry => Null): Self = StObject.set(x, "computeTangents", js.Any.fromFunction1(value))
    
    inline def setMergeBufferAttributes(value: js.Array[BufferAttribute] => BufferAttribute): Self = StObject.set(x, "mergeBufferAttributes", js.Any.fromFunction1(value))
    
    inline def setMergeBufferGeometries(value: js.Array[BufferGeometry] => BufferGeometry): Self = StObject.set(x, "mergeBufferGeometries", js.Any.fromFunction1(value))
  }
}
