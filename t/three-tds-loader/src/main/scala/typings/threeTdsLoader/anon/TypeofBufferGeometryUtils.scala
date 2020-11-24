package typings.threeTdsLoader.anon

import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.bufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBufferGeometryUtils extends js.Object {
  
  def computeTangents(geometry: BufferGeometry): Null = js.native
  
  def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = js.native
  
  def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = js.native
}
object TypeofBufferGeometryUtils {
  
  @scala.inline
  def apply(
    computeTangents: BufferGeometry => Null,
    mergeBufferAttributes: js.Array[BufferAttribute] => BufferAttribute,
    mergeBufferGeometries: js.Array[BufferGeometry] => BufferGeometry
  ): TypeofBufferGeometryUtils = {
    val __obj = js.Dynamic.literal(computeTangents = js.Any.fromFunction1(computeTangents), mergeBufferAttributes = js.Any.fromFunction1(mergeBufferAttributes), mergeBufferGeometries = js.Any.fromFunction1(mergeBufferGeometries))
    __obj.asInstanceOf[TypeofBufferGeometryUtils]
  }
  
  @scala.inline
  implicit class TypeofBufferGeometryUtilsOps[Self <: TypeofBufferGeometryUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComputeTangents(value: BufferGeometry => Null): Self = this.set("computeTangents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMergeBufferAttributes(value: js.Array[BufferAttribute] => BufferAttribute): Self = this.set("mergeBufferAttributes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMergeBufferGeometries(value: js.Array[BufferGeometry] => BufferGeometry): Self = this.set("mergeBufferGeometries", js.Any.fromFunction1(value))
  }
}
