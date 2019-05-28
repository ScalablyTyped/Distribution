package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofBufferGeometryUtils extends js.Object {
  def computeTangents(geometry: threeLib.srcCoreBufferGeometryMod.BufferGeometry): scala.Null
  def mergeBufferAttributes(attributes: js.Array[threeLib.srcCoreBufferAttributeMod.BufferAttribute]): threeLib.srcCoreBufferAttributeMod.BufferAttribute
  def mergeBufferGeometries(geometries: js.Array[threeLib.srcCoreBufferGeometryMod.BufferGeometry]): threeLib.srcCoreBufferGeometryMod.BufferGeometry
}

object TypeofBufferGeometryUtils {
  @scala.inline
  def apply(
    computeTangents: threeLib.srcCoreBufferGeometryMod.BufferGeometry => scala.Null,
    mergeBufferAttributes: js.Array[threeLib.srcCoreBufferAttributeMod.BufferAttribute] => threeLib.srcCoreBufferAttributeMod.BufferAttribute,
    mergeBufferGeometries: js.Array[threeLib.srcCoreBufferGeometryMod.BufferGeometry] => threeLib.srcCoreBufferGeometryMod.BufferGeometry
  ): TypeofBufferGeometryUtils = {
    val __obj = js.Dynamic.literal(computeTangents = js.Any.fromFunction1(computeTangents), mergeBufferAttributes = js.Any.fromFunction1(mergeBufferAttributes), mergeBufferGeometries = js.Any.fromFunction1(mergeBufferGeometries))
  
    __obj.asInstanceOf[TypeofBufferGeometryUtils]
  }
}

