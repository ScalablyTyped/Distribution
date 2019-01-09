package typings
package wonderDotJsLib.distEs2015ComponentGeometryGeometryUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/GeometryUtils", "GeometryUtils")
@js.native
class GeometryUtils () extends js.Object

@JSImport("wonder.js/dist/es2015/component/geometry/GeometryUtils", "GeometryUtils")
@js.native
object GeometryUtils extends js.Object {
  def convertToFaces(indices: js.Array[scala.Double]): js.Array[wonderDotJsLib.distEs2015StructureFace3Mod.Face3] = js.native
  def convertToFaces(indices: js.Array[scala.Double], normals: js.Array[scala.Double]): js.Array[wonderDotJsLib.distEs2015StructureFace3Mod.Face3] = js.native
  def getThreeComponent(sourceData: js.Array[scala.Double], index: scala.Double): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def hasData(data: js.Any): scala.Boolean = js.native
  def iterateThreeComponent(
    dataArr: js.Array[scala.Double],
    iterator: js.Function1[/* v */ wonderDotJsLib.distEs2015MathVector3Mod.Vector3, scala.Unit]
  ): scala.Unit = js.native
  def setThreeComponent(targetData: js.Array[scala.Double], sourceData: js.Array[scala.Double], index: scala.Double): js.Any = js.native
  def setThreeComponent(
    targetData: js.Array[scala.Double],
    sourceData: wonderDotJsLib.distEs2015MathVector3Mod.Vector3,
    index: scala.Double
  ): js.Any = js.native
}

