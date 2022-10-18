package typings.table

import typings.table.anon.OmitDrawBorderParametersb
import typings.table.distSrcSpanningCellManagerMod.SpanningCellManager
import typings.table.distSrcTypesApiMod.BorderConfig
import typings.table.distSrcTypesApiMod.DrawVerticalLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDrawBorderMod {
  
  @JSImport("table/dist/src/drawBorder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSeparatorGetter_1(
    dependencies: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(columnWidths : std.Array<number>, parameters : table.anon.OmitDrawBorderParametersb): string>[1] */ js.Any
  ): js.Function2[/* verticalBorderIndex */ Double, /* columnCount */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSeparatorGetter")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* verticalBorderIndex */ Double, /* columnCount */ Double, String]]
  
  inline def createTableBorderGetter(columnWidths: js.Array[Double], parameters: BorderGetterParameters): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createTableBorderGetter")(columnWidths.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def drawBorder(columnWidths: js.Array[Double], parameters: OmitDrawBorderParametersb): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBorder")(columnWidths.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def drawBorderBottom(columnWidths: js.Array[Double], parameters: DrawBorderParameters): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBorderBottom")(columnWidths.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def drawBorderJoin(columnWidths: js.Array[Double], parameters: DrawBorderParameters): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBorderJoin")(columnWidths.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def drawBorderSegments_1(
    columnWidths: js.Array[Double],
    parameters: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(columnWidths : std.Array<number>, parameters : table.anon.OmitDrawBorderParametersb): string>[1] */ js.Any
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBorderSegments")(columnWidths.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def drawBorderTop(columnWidths: js.Array[Double], parameters: DrawBorderParameters): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drawBorderTop")(columnWidths.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait BorderGetterParameters extends StObject {
    
    var border: BorderConfig
    
    def drawVerticalLine(index: Double, size: Double): Boolean
    @JSName("drawVerticalLine")
    var drawVerticalLine_Original: DrawVerticalLine
    
    var rowCount: js.UndefOr[Double] = js.undefined
    
    var spanningCellManager: js.UndefOr[SpanningCellManager] = js.undefined
  }
  object BorderGetterParameters {
    
    inline def apply(border: BorderConfig, drawVerticalLine: (/* index */ Double, /* size */ Double) => Boolean): BorderGetterParameters = {
      val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], drawVerticalLine = js.Any.fromFunction2(drawVerticalLine))
      __obj.asInstanceOf[BorderGetterParameters]
    }
    
    extension [Self <: BorderGetterParameters](x: Self) {
      
      inline def setBorder(value: BorderConfig): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setDrawVerticalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawVerticalLine", js.Any.fromFunction2(value))
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setSpanningCellManager(value: SpanningCellManager): Self = StObject.set(x, "spanningCellManager", value.asInstanceOf[js.Any])
      
      inline def setSpanningCellManagerUndefined: Self = StObject.set(x, "spanningCellManager", js.undefined)
    }
  }
  
  /* Inlined std.Omit<table.table/dist/src/drawBorder.BorderGetterParameters, 'outputColumnWidths'> & {  horizontalBorderIndex :number | undefined} */
  trait DrawBorderParameters extends StObject {
    
    var border: BorderConfig
    
    def drawVerticalLine(index: Double, size: Double): Boolean
    @JSName("drawVerticalLine")
    var drawVerticalLine_Original: DrawVerticalLine
    
    var horizontalBorderIndex: js.UndefOr[Double] = js.undefined
    
    var rowCount: js.UndefOr[Double] = js.undefined
    
    var spanningCellManager: js.UndefOr[SpanningCellManager] = js.undefined
  }
  object DrawBorderParameters {
    
    inline def apply(border: BorderConfig, drawVerticalLine: (/* index */ Double, /* size */ Double) => Boolean): DrawBorderParameters = {
      val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], drawVerticalLine = js.Any.fromFunction2(drawVerticalLine))
      __obj.asInstanceOf[DrawBorderParameters]
    }
    
    extension [Self <: DrawBorderParameters](x: Self) {
      
      inline def setBorder(value: BorderConfig): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setDrawVerticalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawVerticalLine", js.Any.fromFunction2(value))
      
      inline def setHorizontalBorderIndex(value: Double): Self = StObject.set(x, "horizontalBorderIndex", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBorderIndexUndefined: Self = StObject.set(x, "horizontalBorderIndex", js.undefined)
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setSpanningCellManager(value: SpanningCellManager): Self = StObject.set(x, "spanningCellManager", value.asInstanceOf[js.Any])
      
      inline def setSpanningCellManagerUndefined: Self = StObject.set(x, "spanningCellManager", js.undefined)
    }
  }
  
  trait Separator extends StObject {
    
    val body: String
    
    val bodyJoinInner: js.UndefOr[String] = js.undefined
    
    val bodyJoinOuter: js.UndefOr[String] = js.undefined
    
    val join: String
    
    val joinDown: js.UndefOr[String] = js.undefined
    
    val joinLeft: js.UndefOr[String] = js.undefined
    
    val joinRight: js.UndefOr[String] = js.undefined
    
    val joinUp: js.UndefOr[String] = js.undefined
    
    val left: String
    
    val right: String
  }
  object Separator {
    
    inline def apply(body: String, join: String, left: String, right: String): Separator = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Separator]
    }
    
    extension [Self <: Separator](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyJoinInner(value: String): Self = StObject.set(x, "bodyJoinInner", value.asInstanceOf[js.Any])
      
      inline def setBodyJoinInnerUndefined: Self = StObject.set(x, "bodyJoinInner", js.undefined)
      
      inline def setBodyJoinOuter(value: String): Self = StObject.set(x, "bodyJoinOuter", value.asInstanceOf[js.Any])
      
      inline def setBodyJoinOuterUndefined: Self = StObject.set(x, "bodyJoinOuter", js.undefined)
      
      inline def setJoin(value: String): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinDown(value: String): Self = StObject.set(x, "joinDown", value.asInstanceOf[js.Any])
      
      inline def setJoinDownUndefined: Self = StObject.set(x, "joinDown", js.undefined)
      
      inline def setJoinLeft(value: String): Self = StObject.set(x, "joinLeft", value.asInstanceOf[js.Any])
      
      inline def setJoinLeftUndefined: Self = StObject.set(x, "joinLeft", js.undefined)
      
      inline def setJoinRight(value: String): Self = StObject.set(x, "joinRight", value.asInstanceOf[js.Any])
      
      inline def setJoinRightUndefined: Self = StObject.set(x, "joinRight", js.undefined)
      
      inline def setJoinUp(value: String): Self = StObject.set(x, "joinUp", value.asInstanceOf[js.Any])
      
      inline def setJoinUpUndefined: Self = StObject.set(x, "joinUp", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
