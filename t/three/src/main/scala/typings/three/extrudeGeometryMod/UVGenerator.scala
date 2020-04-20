package typings.three.extrudeGeometryMod

import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UVGenerator extends js.Object {
  def generateSideWallUV(
    geometry: ExtrudeBufferGeometry,
    vertices: js.Array[Double],
    indexA: Double,
    indexB: Double,
    indexC: Double,
    indexD: Double
  ): js.Array[Vector2]
  def generateTopUV(
    geometry: ExtrudeBufferGeometry,
    vertices: js.Array[Double],
    indexA: Double,
    indexB: Double,
    indexC: Double
  ): js.Array[Vector2]
}

object UVGenerator {
  @scala.inline
  def apply(
    generateSideWallUV: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double, Double) => js.Array[Vector2],
    generateTopUV: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double) => js.Array[Vector2]
  ): UVGenerator = {
    val __obj = js.Dynamic.literal(generateSideWallUV = js.Any.fromFunction6(generateSideWallUV), generateTopUV = js.Any.fromFunction5(generateTopUV))
    __obj.asInstanceOf[UVGenerator]
  }
}

