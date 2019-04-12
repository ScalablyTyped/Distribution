package typings
package threeLib.srcGeometriesExtrudeGeometryMod

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
  ): js.Array[threeLib.srcMathVector2Mod.Vector2]
  def generateTopUV(
    geometry: ExtrudeBufferGeometry,
    vertices: js.Array[scala.Double],
    indexA: scala.Double,
    indexB: scala.Double,
    indexC: scala.Double
  ): js.Array[threeLib.srcMathVector2Mod.Vector2]
}

object UVGenerator {
  @scala.inline
  def apply(
    generateSideWallUV: (ExtrudeBufferGeometry, js.Array[scala.Double], scala.Double, scala.Double, scala.Double, scala.Double) => js.Array[threeLib.srcMathVector2Mod.Vector2],
    generateTopUV: (ExtrudeBufferGeometry, js.Array[scala.Double], scala.Double, scala.Double, scala.Double) => js.Array[threeLib.srcMathVector2Mod.Vector2]
  ): UVGenerator = {
    val __obj = js.Dynamic.literal(generateSideWallUV = js.Any.fromFunction6(generateSideWallUV), generateTopUV = js.Any.fromFunction5(generateTopUV))
  
    __obj.asInstanceOf[UVGenerator]
  }
}

