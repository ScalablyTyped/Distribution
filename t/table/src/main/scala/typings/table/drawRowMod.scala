package typings.table

import typings.table.apiMod.DrawVerticalLine
import typings.table.spanningCellManagerMod.SpanningCellManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawRowMod {
  
  @JSImport("table/dist/src/drawRow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawRow(
    row: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any,
    config: DrawRowConfig
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drawRow")(row.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait DrawRowConfig extends StObject {
    
    var border: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyBorderConfig */ Any
    
    def drawVerticalLine(index: Double, size: Double): Boolean
    @JSName("drawVerticalLine")
    var drawVerticalLine_Original: DrawVerticalLine
    
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    var spanningCellManager: js.UndefOr[SpanningCellManager] = js.undefined
  }
  object DrawRowConfig {
    
    inline def apply(
      border: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyBorderConfig */ Any,
      drawVerticalLine: (/* index */ Double, /* size */ Double) => Boolean
    ): DrawRowConfig = {
      val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], drawVerticalLine = js.Any.fromFunction2(drawVerticalLine))
      __obj.asInstanceOf[DrawRowConfig]
    }
    
    extension [Self <: DrawRowConfig](x: Self) {
      
      inline def setBorder(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyBorderConfig */ Any
      ): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setDrawVerticalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawVerticalLine", js.Any.fromFunction2(value))
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setSpanningCellManager(value: SpanningCellManager): Self = StObject.set(x, "spanningCellManager", value.asInstanceOf[js.Any])
      
      inline def setSpanningCellManagerUndefined: Self = StObject.set(x, "spanningCellManager", js.undefined)
    }
  }
}
