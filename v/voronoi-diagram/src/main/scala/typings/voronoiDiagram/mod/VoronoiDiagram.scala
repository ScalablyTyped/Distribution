package typings.voronoiDiagram.mod

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
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoronoiDiagram]
  }
}

