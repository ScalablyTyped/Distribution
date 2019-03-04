package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  def computeTangents(geometry: threeLib.threeDashCoreMod.BufferGeometry): scala.Null
  def mergeBufferAttributes(attributes: js.Array[threeLib.threeDashCoreMod.BufferAttribute]): threeLib.threeDashCoreMod.BufferAttribute
  def mergeBufferGeometries(geometries: js.Array[threeLib.threeDashCoreMod.BufferGeometry]): threeLib.threeDashCoreMod.BufferGeometry
}

object Anon_Attributes {
  @scala.inline
  def apply(
    computeTangents: js.Function1[threeLib.threeDashCoreMod.BufferGeometry, scala.Null],
    mergeBufferAttributes: js.Function1[
      js.Array[threeLib.threeDashCoreMod.BufferAttribute], 
      threeLib.threeDashCoreMod.BufferAttribute
    ],
    mergeBufferGeometries: js.Function1[
      js.Array[threeLib.threeDashCoreMod.BufferGeometry], 
      threeLib.threeDashCoreMod.BufferGeometry
    ]
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(computeTangents = computeTangents, mergeBufferAttributes = mergeBufferAttributes, mergeBufferGeometries = mergeBufferGeometries)
  
    __obj.asInstanceOf[Anon_Attributes]
  }
}

