package typings.table

import typings.table.anon.Mapped
import typings.table.apiMod.DrawHorizontalLine
import typings.table.apiMod.DrawVerticalLine
import typings.table.apiMod.SpanningCellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanningCellManagerMod {
  
  @JSImport("table/dist/src/spanningCellManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSpanningCellManager(parameters: SpanningCellParameters): SpanningCellManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpanningCellManager")(parameters.asInstanceOf[js.Any]).asInstanceOf[SpanningCellManager]
  
  trait SpanningCellContext
    extends StObject
       with SpanningCellParameters {
    
    var rowHeights: js.Array[Double]
  }
  object SpanningCellContext {
    
    inline def apply(
      columnsConfig: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnConfig */ Any
        ],
      drawHorizontalLine: (/* index */ Double, /* size */ Double) => Boolean,
      drawVerticalLine: (/* index */ Double, /* size */ Double) => Boolean,
      rowHeights: js.Array[Double],
      rows: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
        ],
      spanningCellConfigs: js.Array[SpanningCellConfig]
    ): SpanningCellContext = {
      val __obj = js.Dynamic.literal(columnsConfig = columnsConfig.asInstanceOf[js.Any], drawHorizontalLine = js.Any.fromFunction2(drawHorizontalLine), drawVerticalLine = js.Any.fromFunction2(drawVerticalLine), rowHeights = rowHeights.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], spanningCellConfigs = spanningCellConfigs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpanningCellContext]
    }
    
    extension [Self <: SpanningCellContext](x: Self) {
      
      inline def setRowHeights(value: js.Array[Double]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsVarargs(value: Double*): Self = StObject.set(x, "rowHeights", js.Array(value*))
    }
  }
  
  @js.native
  trait SpanningCellManager extends StObject {
    
    def getContainingRange(
      cell: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CellCoordinates */ Any
    ): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedRangeConfig */ Any
      ] = js.native
    def getContainingRange(
      cell: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CellCoordinates */ Any,
      options: Mapped
    ): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedRangeConfig */ Any
      ] = js.native
    
    def inSameRange(
      cell1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CellCoordinates */ Any,
      cell2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CellCoordinates */ Any
    ): Boolean = js.native
    
    var rowHeights: js.Array[Double] = js.native
    
    def setRowHeights(rowHeights: js.Array[Double]): Unit = js.native
  }
  
  trait SpanningCellParameters extends StObject {
    
    var columnsConfig: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnConfig */ Any
      ]
    
    def drawHorizontalLine(index: Double, size: Double): Boolean
    @JSName("drawHorizontalLine")
    var drawHorizontalLine_Original: DrawHorizontalLine
    
    def drawVerticalLine(index: Double, size: Double): Boolean
    @JSName("drawVerticalLine")
    var drawVerticalLine_Original: DrawVerticalLine
    
    var rows: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
      ]
    
    var spanningCellConfigs: js.Array[SpanningCellConfig]
  }
  object SpanningCellParameters {
    
    inline def apply(
      columnsConfig: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnConfig */ Any
        ],
      drawHorizontalLine: (/* index */ Double, /* size */ Double) => Boolean,
      drawVerticalLine: (/* index */ Double, /* size */ Double) => Boolean,
      rows: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
        ],
      spanningCellConfigs: js.Array[SpanningCellConfig]
    ): SpanningCellParameters = {
      val __obj = js.Dynamic.literal(columnsConfig = columnsConfig.asInstanceOf[js.Any], drawHorizontalLine = js.Any.fromFunction2(drawHorizontalLine), drawVerticalLine = js.Any.fromFunction2(drawVerticalLine), rows = rows.asInstanceOf[js.Any], spanningCellConfigs = spanningCellConfigs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpanningCellParameters]
    }
    
    extension [Self <: SpanningCellParameters](x: Self) {
      
      inline def setColumnsConfig(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnConfig */ Any
            ]
      ): Self = StObject.set(x, "columnsConfig", value.asInstanceOf[js.Any])
      
      inline def setColumnsConfigVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnConfig */ Any)*
      ): Self = StObject.set(x, "columnsConfig", js.Array(value*))
      
      inline def setDrawHorizontalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawHorizontalLine", js.Any.fromFunction2(value))
      
      inline def setDrawVerticalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawVerticalLine", js.Any.fromFunction2(value))
      
      inline def setRows(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
            ]
      ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any)*
      ): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setSpanningCellConfigs(value: js.Array[SpanningCellConfig]): Self = StObject.set(x, "spanningCellConfigs", value.asInstanceOf[js.Any])
      
      inline def setSpanningCellConfigsVarargs(value: SpanningCellConfig*): Self = StObject.set(x, "spanningCellConfigs", js.Array(value*))
    }
  }
}
