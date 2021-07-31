package typings.wixUiCore.anon

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnsGrid extends StObject {
  
  var Columns: FC[PickPickHorizontalMenuColClassName]
  
  var Grid: FC[PickPickHorizontalMenuGri]
}
object ColumnsGrid {
  
  @scala.inline
  def apply(Columns: FC[PickPickHorizontalMenuColClassName], Grid: FC[PickPickHorizontalMenuGri]): ColumnsGrid = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Grid = Grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsGrid]
  }
  
  @scala.inline
  implicit class ColumnsGridMutableBuilder[Self <: ColumnsGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: FC[PickPickHorizontalMenuColClassName]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrid(value: FC[PickPickHorizontalMenuGri]): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
  }
}
