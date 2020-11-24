package typings.three.extrudeBufferGeometryMod

import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UVGenerator extends js.Object {
  
  def generateSideWallUV(
    geometry: ExtrudeBufferGeometry,
    vertices: js.Array[Double],
    indexA: Double,
    indexB: Double,
    indexC: Double,
    indexD: Double
  ): js.Array[Vector2] = js.native
  
  def generateTopUV(
    geometry: ExtrudeBufferGeometry,
    vertices: js.Array[Double],
    indexA: Double,
    indexB: Double,
    indexC: Double
  ): js.Array[Vector2] = js.native
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
  
  @scala.inline
  implicit class UVGeneratorOps[Self <: UVGenerator] (val x: Self) extends AnyVal {
    
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
    def setGenerateSideWallUV(
      value: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double, Double) => js.Array[Vector2]
    ): Self = this.set("generateSideWallUV", js.Any.fromFunction6(value))
    
    @scala.inline
    def setGenerateTopUV(value: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double) => js.Array[Vector2]): Self = this.set("generateTopUV", js.Any.fromFunction5(value))
  }
}
