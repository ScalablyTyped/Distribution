package typings
package wonderDotJsLib.distEs2015ComponentGeometryDataGeometryDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/data/GeometryData", "GeometryData")
@js.native
abstract class GeometryData protected () extends js.Object {
  def this(geometry: wonderDotJsLib.distEs2015ComponentGeometryGeometryMod.Geometry) = this()
  var faces: js.Array[wonderDotJsLib.distEs2015StructureFace3Mod.Face3] = js.native
  var geometry: wonderDotJsLib.distEs2015ComponentGeometryGeometryMod.Geometry = js.native
  val indices: js.Array[scala.Double] = js.native
  var vertices: js.Array[scala.Double] = js.native
  def dispose(): scala.Unit = js.native
  /* protected */ def onChangeFace(): scala.Unit = js.native
}

