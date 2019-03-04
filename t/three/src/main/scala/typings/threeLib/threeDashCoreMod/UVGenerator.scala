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

object UVGenerator {
  @scala.inline
  def apply(
    generateSideWallUV: js.Function6[
      ExtrudeBufferGeometry, 
      js.Array[scala.Double], 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      js.Array[Vector2]
    ],
    generateTopUV: js.Function5[
      ExtrudeBufferGeometry, 
      js.Array[scala.Double], 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      js.Array[Vector2]
    ]
  ): UVGenerator = {
    val __obj = js.Dynamic.literal(generateSideWallUV = generateSideWallUV, generateTopUV = generateTopUV)
  
    __obj.asInstanceOf[UVGenerator]
  }
}

