package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UVGenerator extends js.Object {
  def generateSideWallUV(
    geometry: ExtrudeBufferGeometry,
    vertices: js.Array[scala.Double],
    indexA: scala.Double,
    indexB: scala.Double,
    indexC: scala.Double,
    indexD: scala.Double
  ): js.Array[Vector2]
  def generateTopUV(
    geometry: ExtrudeBufferGeometry,
    vertices: js.Array[scala.Double],
    indexA: scala.Double,
    indexB: scala.Double,
    indexC: scala.Double
  ): js.Array[Vector2]
}

