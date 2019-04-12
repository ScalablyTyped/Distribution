package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  def computeTangents(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry): scala.Null
  def mergeBufferAttributes(attributes: js.Array[threeLib.srcCoreBufferAttributeMod.BufferAttribute]): threeLib.srcCoreBufferAttributeMod.BufferAttribute
  def mergeBufferGeometries(geometries: js.Array[threeLib.srcCoreBufferGeometryMod.BufferGeometry]): threeLib.srcCoreBufferGeometryMod.BufferGeometry
}

object Anon_Attributes {
  @scala.inline
  def apply(
    computeTangents: threeLib.srcCoreBufferGeometryMod.BufferGeometry => scala.Null,
    mergeBufferAttributes: js.Array[threeLib.srcCoreBufferAttributeMod.BufferAttribute] => threeLib.srcCoreBufferAttributeMod.BufferAttribute,
    mergeBufferGeometries: js.Array[threeLib.srcCoreBufferGeometryMod.BufferGeometry] => threeLib.srcCoreBufferGeometryMod.BufferGeometry
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(computeTangents = js.Any.fromFunction1(computeTangents), mergeBufferAttributes = js.Any.fromFunction1(mergeBufferAttributes), mergeBufferGeometries = js.Any.fromFunction1(mergeBufferGeometries))
  
    __obj.asInstanceOf[Anon_Attributes]
  }
}

