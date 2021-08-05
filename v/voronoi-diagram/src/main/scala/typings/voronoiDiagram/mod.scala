package typings.voronoiDiagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(points: js.Array[Point]): VoronoiDiagram = ^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any]).asInstanceOf[VoronoiDiagram]
  
  @JSImport("voronoi-diagram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Cell = js.Array[Double]
  
  type Point = js.Array[Double]
  
  trait VoronoiDiagram extends StObject {
    
    var cells: js.Array[Cell]
    
    var positions: js.Array[Point]
  }
  object VoronoiDiagram {
    
    inline def apply(cells: js.Array[Cell], positions: js.Array[Point]): VoronoiDiagram = {
      val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoronoiDiagram]
    }
    
    extension [Self <: VoronoiDiagram](x: Self) {
      
      inline def setCells(value: js.Array[Cell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: Cell*): Self = StObject.set(x, "cells", js.Array(value :_*))
      
      inline def setPositions(value: js.Array[Point]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsVarargs(value: Point*): Self = StObject.set(x, "positions", js.Array(value :_*))
    }
  }
}
