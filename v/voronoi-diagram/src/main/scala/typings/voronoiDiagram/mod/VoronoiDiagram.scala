package typings.voronoiDiagram.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoronoiDiagram extends js.Object {
  
  var cells: js.Array[Cell] = js.native
  
  var positions: js.Array[Point] = js.native
}
object VoronoiDiagram {
  
  @scala.inline
  def apply(cells: js.Array[Cell], positions: js.Array[Point]): VoronoiDiagram = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiDiagram]
  }
  
  @scala.inline
  implicit class VoronoiDiagramOps[Self <: VoronoiDiagram] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: Cell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[Cell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: Point*): Self = this.set("positions", js.Array(value :_*))
    
    @scala.inline
    def setPositions(value: js.Array[Point]): Self = this.set("positions", value.asInstanceOf[js.Any])
  }
}
