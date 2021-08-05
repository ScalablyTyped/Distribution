package typings.wixUiCore.anon

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var Columns: FC[PickPickHorizontalMenuCol]
  
  var Grid: FC[PickPickHorizontalMenuGri]
}
object Columns {
  
  inline def apply(Columns: FC[PickPickHorizontalMenuCol], Grid: FC[PickPickHorizontalMenuGri]): Columns = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Grid = Grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: FC[PickPickHorizontalMenuCol]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: FC[PickPickHorizontalMenuGri]): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
  }
}
