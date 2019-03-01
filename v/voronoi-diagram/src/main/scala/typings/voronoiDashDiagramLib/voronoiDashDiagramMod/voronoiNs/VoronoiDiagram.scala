package typings
package voronoiDashDiagramLib.voronoiDashDiagramMod.voronoiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiDiagram extends js.Object {
  var cells: js.Array[Cell]
  var positions: js.Array[Point]
}

object VoronoiDiagram {
  @scala.inline
  def apply(cells: js.Array[Cell], positions: js.Array[Point]): VoronoiDiagram = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cells")(cells)
    __obj.updateDynamic("positions")(positions)
    __obj.asInstanceOf[VoronoiDiagram]
  }
}

