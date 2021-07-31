package typings.wixUiCore.anon

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFC extends StObject {
  
  var Columns: FC[PickPickHorizontalMenuColColumnGap]
  
  var Grid: FC[PickPickHorizontalMenuGriClassName]
}
object GridFC {
  
  @scala.inline
  def apply(Columns: FC[PickPickHorizontalMenuColColumnGap], Grid: FC[PickPickHorizontalMenuGriClassName]): GridFC = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Grid = Grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFC]
  }
  
  @scala.inline
  implicit class GridFCMutableBuilder[Self <: GridFC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: FC[PickPickHorizontalMenuColColumnGap]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrid(value: FC[PickPickHorizontalMenuGriClassName]): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
  }
}
