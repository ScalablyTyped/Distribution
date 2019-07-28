package typings.wonderDotJs.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "GeometryUtils")
@js.native
class GeometryUtils ()
  extends typings.wonderDotJs.distEs2015ComponentGeometryGeometryUtilsMod.GeometryUtils

/* static members */
@JSImport("wonder.js/dist/es2015", "GeometryUtils")
@js.native
object GeometryUtils extends js.Object {
  def convertToFaces(indices: js.Array[Double]): js.Array[typings.wonderDotJs.distEs2015StructureFace3Mod.Face3] = js.native
  def convertToFaces(indices: js.Array[Double], normals: js.Array[Double]): js.Array[typings.wonderDotJs.distEs2015StructureFace3Mod.Face3] = js.native
  def getThreeComponent(sourceData: js.Array[Double], index: Double): typings.wonderDotJs.distEs2015MathVector3Mod.Vector3 = js.native
  def hasData(data: js.Any): Boolean = js.native
  def iterateThreeComponent(
    dataArr: js.Array[Double],
    iterator: js.Function1[/* v */ typings.wonderDotJs.distEs2015MathVector3Mod.Vector3, Unit]
  ): Unit = js.native
  def setThreeComponent(targetData: js.Array[Double], sourceData: js.Array[Double], index: Double): js.Any = js.native
  def setThreeComponent(
    targetData: js.Array[Double],
    sourceData: typings.wonderDotJs.distEs2015MathVector3Mod.Vector3,
    index: Double
  ): js.Any = js.native
}

