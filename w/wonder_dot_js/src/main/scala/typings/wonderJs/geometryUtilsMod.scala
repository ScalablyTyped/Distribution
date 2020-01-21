package typings.wonderJs

import typings.wonderJs.face3Mod.Face3
import typings.wonderJs.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/GeometryUtils", JSImport.Namespace)
@js.native
object geometryUtilsMod extends js.Object {
  @js.native
  class GeometryUtils () extends js.Object
  
  /* static members */
  @js.native
  object GeometryUtils extends js.Object {
    def convertToFaces(indices: js.Array[Double]): js.Array[Face3] = js.native
    def convertToFaces(indices: js.Array[Double], normals: js.Array[Double]): js.Array[Face3] = js.native
    def getThreeComponent(sourceData: js.Array[Double], index: Double): Vector3 = js.native
    def hasData(data: js.Any): Boolean = js.native
    def iterateThreeComponent(dataArr: js.Array[Double], iterator: js.Function1[/* v */ Vector3, Unit]): Unit = js.native
    def setThreeComponent(targetData: js.Array[Double], sourceData: js.Array[Double], index: Double): js.Any = js.native
    def setThreeComponent(targetData: js.Array[Double], sourceData: Vector3, index: Double): js.Any = js.native
  }
  
}

