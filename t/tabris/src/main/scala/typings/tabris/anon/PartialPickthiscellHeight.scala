package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<this, 'cellHeight' | 'cellType' | 'createCell'>> */
trait PartialPickthiscellHeight extends StObject {
  
  var cellHeight: js.UndefOr[js.Any] = js.undefined
  
  var cellType: js.UndefOr[js.Any] = js.undefined
  
  var createCell: js.UndefOr[js.Any] = js.undefined
}
object PartialPickthiscellHeight {
  
  inline def apply(): PartialPickthiscellHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickthiscellHeight]
  }
  
  extension [Self <: PartialPickthiscellHeight](x: Self) {
    
    inline def setCellHeight(value: js.Any): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    inline def setCellType(value: js.Any): Self = StObject.set(x, "cellType", value.asInstanceOf[js.Any])
    
    inline def setCellTypeUndefined: Self = StObject.set(x, "cellType", js.undefined)
    
    inline def setCreateCell(value: js.Any): Self = StObject.set(x, "createCell", value.asInstanceOf[js.Any])
    
    inline def setCreateCellUndefined: Self = StObject.set(x, "createCell", js.undefined)
  }
}
