package typings.table

import typings.table.distSrcSpanningCellManagerMod.SpanningCellManager
import typings.table.tableStrings.border
import typings.table.tableStrings.cell
import typings.table.tableStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDrawContentMod {
  
  @JSImport("table/dist/src/drawContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawContent(parameters: DrawContentParameters): String = ^.asInstanceOf[js.Dynamic].applyDynamic("drawContent")(parameters.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Shared function to draw horizontal borders, rows or the entire table
    */
  trait DrawContentParameters extends StObject {
    
    var contents: js.Array[String]
    
    def drawSeparator(index: Double, size: Double): Boolean
    
    var elementType: js.UndefOr[border | cell | row] = js.undefined
    
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    def separatorGetter(index: Double, size: Double): String
    
    var spanningCellManager: js.UndefOr[SpanningCellManager] = js.undefined
  }
  object DrawContentParameters {
    
    inline def apply(
      contents: js.Array[String],
      drawSeparator: (Double, Double) => Boolean,
      separatorGetter: (Double, Double) => String
    ): DrawContentParameters = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], drawSeparator = js.Any.fromFunction2(drawSeparator), separatorGetter = js.Any.fromFunction2(separatorGetter))
      __obj.asInstanceOf[DrawContentParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawContentParameters] (val x: Self) extends AnyVal {
      
      inline def setContents(value: js.Array[String]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsVarargs(value: String*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setDrawSeparator(value: (Double, Double) => Boolean): Self = StObject.set(x, "drawSeparator", js.Any.fromFunction2(value))
      
      inline def setElementType(value: border | cell | row): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setSeparatorGetter(value: (Double, Double) => String): Self = StObject.set(x, "separatorGetter", js.Any.fromFunction2(value))
      
      inline def setSpanningCellManager(value: SpanningCellManager): Self = StObject.set(x, "spanningCellManager", value.asInstanceOf[js.Any])
      
      inline def setSpanningCellManagerUndefined: Self = StObject.set(x, "spanningCellManager", js.undefined)
    }
  }
}
