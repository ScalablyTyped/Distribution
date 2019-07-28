package typings.wonderDotJs.distEs2015ComponentGeometryDataGeometryDataMod

import typings.wonderDotJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typings.wonderDotJs.distEs2015StructureFace3Mod.Face3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/data/GeometryData", "GeometryData")
@js.native
abstract class GeometryData protected () extends js.Object {
  def this(geometry: Geometry) = this()
  var faces: js.Array[Face3] = js.native
  var geometry: Geometry = js.native
  val indices: js.Array[Double] = js.native
  var vertices: js.Array[Double] = js.native
  def dispose(): Unit = js.native
  /* protected */ def onChangeFace(): Unit = js.native
}

