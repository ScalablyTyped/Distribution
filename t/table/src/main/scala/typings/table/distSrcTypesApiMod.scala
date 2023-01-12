package typings.table

import org.scalablytyped.runtime.NumberDictionary
import typings.table.anon.ColumnUserConfigreadonlyw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesApiMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.table.tableStrings.center
    - typings.table.tableStrings.justify
    - typings.table.tableStrings.left
    - typings.table.tableStrings.right
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def center: typings.table.tableStrings.center = "center".asInstanceOf[typings.table.tableStrings.center]
    
    inline def justify: typings.table.tableStrings.justify = "justify".asInstanceOf[typings.table.tableStrings.justify]
    
    inline def left: typings.table.tableStrings.left = "left".asInstanceOf[typings.table.tableStrings.left]
    
    inline def right: typings.table.tableStrings.right = "right".asInstanceOf[typings.table.tableStrings.right]
  }
  
  trait BaseUserConfig extends StObject {
    
    /**
      * Custom border
      */
    val border: js.UndefOr[BorderUserConfig] = js.undefined
    
    /**
      * Default values for all columns. Column specific settings overwrite the default values.
      */
    val columnDefault: js.UndefOr[ColumnUserConfig] = js.undefined
    
    /**
      * Column specific configuration.
      */
    val columns: js.UndefOr[Indexable[ColumnUserConfig]] = js.undefined
    
    /**
      * Used to tell whether to draw a vertical line.
      * This callback is called for each non-content line of the table.
      * The default behavior is to always return true.
      */
    val drawVerticalLine: js.UndefOr[DrawVerticalLine] = js.undefined
  }
  object BaseUserConfig {
    
    inline def apply(): BaseUserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseUserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseUserConfig] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: BorderUserConfig): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColumnDefault(value: ColumnUserConfig): Self = StObject.set(x, "columnDefault", value.asInstanceOf[js.Any])
      
      inline def setColumnDefaultUndefined: Self = StObject.set(x, "columnDefault", js.undefined)
      
      inline def setColumns(value: Indexable[ColumnUserConfig]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDrawVerticalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawVerticalLine", js.Any.fromFunction2(value))
      
      inline def setDrawVerticalLineUndefined: Self = StObject.set(x, "drawVerticalLine", js.undefined)
    }
  }
  
  /* Inlined std.Required<table.table/dist/src/types/api.BorderUserConfig> */
  trait BorderConfig extends StObject {
    
    var bodyJoin: String
    
    var bodyLeft: String
    
    var bodyRight: String
    
    var bottomBody: String
    
    var bottomJoin: String
    
    var bottomLeft: String
    
    var bottomRight: String
    
    var headerJoin: String
    
    var joinBody: String
    
    var joinJoin: String
    
    var joinLeft: String
    
    var joinMiddleDown: String
    
    var joinMiddleLeft: String
    
    var joinMiddleRight: String
    
    var joinMiddleUp: String
    
    var joinRight: String
    
    var topBody: String
    
    var topJoin: String
    
    var topLeft: String
    
    var topRight: String
  }
  object BorderConfig {
    
    inline def apply(
      bodyJoin: String,
      bodyLeft: String,
      bodyRight: String,
      bottomBody: String,
      bottomJoin: String,
      bottomLeft: String,
      bottomRight: String,
      headerJoin: String,
      joinBody: String,
      joinJoin: String,
      joinLeft: String,
      joinMiddleDown: String,
      joinMiddleLeft: String,
      joinMiddleRight: String,
      joinMiddleUp: String,
      joinRight: String,
      topBody: String,
      topJoin: String,
      topLeft: String,
      topRight: String
    ): BorderConfig = {
      val __obj = js.Dynamic.literal(bodyJoin = bodyJoin.asInstanceOf[js.Any], bodyLeft = bodyLeft.asInstanceOf[js.Any], bodyRight = bodyRight.asInstanceOf[js.Any], bottomBody = bottomBody.asInstanceOf[js.Any], bottomJoin = bottomJoin.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], headerJoin = headerJoin.asInstanceOf[js.Any], joinBody = joinBody.asInstanceOf[js.Any], joinJoin = joinJoin.asInstanceOf[js.Any], joinLeft = joinLeft.asInstanceOf[js.Any], joinMiddleDown = joinMiddleDown.asInstanceOf[js.Any], joinMiddleLeft = joinMiddleLeft.asInstanceOf[js.Any], joinMiddleRight = joinMiddleRight.asInstanceOf[js.Any], joinMiddleUp = joinMiddleUp.asInstanceOf[js.Any], joinRight = joinRight.asInstanceOf[js.Any], topBody = topBody.asInstanceOf[js.Any], topJoin = topJoin.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BorderConfig] (val x: Self) extends AnyVal {
      
      inline def setBodyJoin(value: String): Self = StObject.set(x, "bodyJoin", value.asInstanceOf[js.Any])
      
      inline def setBodyLeft(value: String): Self = StObject.set(x, "bodyLeft", value.asInstanceOf[js.Any])
      
      inline def setBodyRight(value: String): Self = StObject.set(x, "bodyRight", value.asInstanceOf[js.Any])
      
      inline def setBottomBody(value: String): Self = StObject.set(x, "bottomBody", value.asInstanceOf[js.Any])
      
      inline def setBottomJoin(value: String): Self = StObject.set(x, "bottomJoin", value.asInstanceOf[js.Any])
      
      inline def setBottomLeft(value: String): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomRight(value: String): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setHeaderJoin(value: String): Self = StObject.set(x, "headerJoin", value.asInstanceOf[js.Any])
      
      inline def setJoinBody(value: String): Self = StObject.set(x, "joinBody", value.asInstanceOf[js.Any])
      
      inline def setJoinJoin(value: String): Self = StObject.set(x, "joinJoin", value.asInstanceOf[js.Any])
      
      inline def setJoinLeft(value: String): Self = StObject.set(x, "joinLeft", value.asInstanceOf[js.Any])
      
      inline def setJoinMiddleDown(value: String): Self = StObject.set(x, "joinMiddleDown", value.asInstanceOf[js.Any])
      
      inline def setJoinMiddleLeft(value: String): Self = StObject.set(x, "joinMiddleLeft", value.asInstanceOf[js.Any])
      
      inline def setJoinMiddleRight(value: String): Self = StObject.set(x, "joinMiddleRight", value.asInstanceOf[js.Any])
      
      inline def setJoinMiddleUp(value: String): Self = StObject.set(x, "joinMiddleUp", value.asInstanceOf[js.Any])
      
      inline def setJoinRight(value: String): Self = StObject.set(x, "joinRight", value.asInstanceOf[js.Any])
      
      inline def setTopBody(value: String): Self = StObject.set(x, "topBody", value.asInstanceOf[js.Any])
      
      inline def setTopJoin(value: String): Self = StObject.set(x, "topJoin", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: String): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopRight(value: String): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  trait BorderUserConfig extends StObject {
    
    val bodyJoin: js.UndefOr[String] = js.undefined
    
    val bodyLeft: js.UndefOr[String] = js.undefined
    
    val bodyRight: js.UndefOr[String] = js.undefined
    
    val bottomBody: js.UndefOr[String] = js.undefined
    
    val bottomJoin: js.UndefOr[String] = js.undefined
    
    val bottomLeft: js.UndefOr[String] = js.undefined
    
    val bottomRight: js.UndefOr[String] = js.undefined
    
    val headerJoin: js.UndefOr[String] = js.undefined
    
    val joinBody: js.UndefOr[String] = js.undefined
    
    val joinJoin: js.UndefOr[String] = js.undefined
    
    val joinLeft: js.UndefOr[String] = js.undefined
    
    val joinMiddleDown: js.UndefOr[String] = js.undefined
    
    val joinMiddleLeft: js.UndefOr[String] = js.undefined
    
    val joinMiddleRight: js.UndefOr[String] = js.undefined
    
    val joinMiddleUp: js.UndefOr[String] = js.undefined
    
    val joinRight: js.UndefOr[String] = js.undefined
    
    val topBody: js.UndefOr[String] = js.undefined
    
    val topJoin: js.UndefOr[String] = js.undefined
    
    val topLeft: js.UndefOr[String] = js.undefined
    
    val topRight: js.UndefOr[String] = js.undefined
  }
  object BorderUserConfig {
    
    inline def apply(): BorderUserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderUserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BorderUserConfig] (val x: Self) extends AnyVal {
      
      inline def setBodyJoin(value: String): Self = StObject.set(x, "bodyJoin", value.asInstanceOf[js.Any])
      
      inline def setBodyJoinUndefined: Self = StObject.set(x, "bodyJoin", js.undefined)
      
      inline def setBodyLeft(value: String): Self = StObject.set(x, "bodyLeft", value.asInstanceOf[js.Any])
      
      inline def setBodyLeftUndefined: Self = StObject.set(x, "bodyLeft", js.undefined)
      
      inline def setBodyRight(value: String): Self = StObject.set(x, "bodyRight", value.asInstanceOf[js.Any])
      
      inline def setBodyRightUndefined: Self = StObject.set(x, "bodyRight", js.undefined)
      
      inline def setBottomBody(value: String): Self = StObject.set(x, "bottomBody", value.asInstanceOf[js.Any])
      
      inline def setBottomBodyUndefined: Self = StObject.set(x, "bottomBody", js.undefined)
      
      inline def setBottomJoin(value: String): Self = StObject.set(x, "bottomJoin", value.asInstanceOf[js.Any])
      
      inline def setBottomJoinUndefined: Self = StObject.set(x, "bottomJoin", js.undefined)
      
      inline def setBottomLeft(value: String): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      inline def setBottomRight(value: String): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      inline def setHeaderJoin(value: String): Self = StObject.set(x, "headerJoin", value.asInstanceOf[js.Any])
      
      inline def setHeaderJoinUndefined: Self = StObject.set(x, "headerJoin", js.undefined)
      
      inline def setJoinBody(value: String): Self = StObject.set(x, "joinBody", value.asInstanceOf[js.Any])
      
      inline def setJoinBodyUndefined: Self = StObject.set(x, "joinBody", js.undefined)
      
      inline def setJoinJoin(value: String): Self = StObject.set(x, "joinJoin", value.asInstanceOf[js.Any])
      
      inline def setJoinJoinUndefined: Self = StObject.set(x, "joinJoin", js.undefined)
      
      inline def setJoinLeft(value: String): Self = StObject.set(x, "joinLeft", value.asInstanceOf[js.Any])
      
      inline def setJoinLeftUndefined: Self = StObject.set(x, "joinLeft", js.undefined)
      
      inline def setJoinMiddleDown(value: String): Self = StObject.set(x, "joinMiddleDown", value.asInstanceOf[js.Any])
      
      inline def setJoinMiddleDownUndefined: Self = StObject.set(x, "joinMiddleDown", js.undefined)
      
      inline def setJoinMiddleLeft(value: String): Self = StObject.set(x, "joinMiddleLeft", value.asInstanceOf[js.Any])
      
      inline def setJoinMiddleLeftUndefined: Self = StObject.set(x, "joinMiddleLeft", js.undefined)
      
      inline def setJoinMiddleRight(value: String): Self = StObject.set(x, "joinMiddleRight", value.asInstanceOf[js.Any])
      
      inline def setJoinMiddleRightUndefined: Self = StObject.set(x, "joinMiddleRight", js.undefined)
      
      inline def setJoinMiddleUp(value: String): Self = StObject.set(x, "joinMiddleUp", value.asInstanceOf[js.Any])
      
      inline def setJoinMiddleUpUndefined: Self = StObject.set(x, "joinMiddleUp", js.undefined)
      
      inline def setJoinRight(value: String): Self = StObject.set(x, "joinRight", value.asInstanceOf[js.Any])
      
      inline def setJoinRightUndefined: Self = StObject.set(x, "joinRight", js.undefined)
      
      inline def setTopBody(value: String): Self = StObject.set(x, "topBody", value.asInstanceOf[js.Any])
      
      inline def setTopBodyUndefined: Self = StObject.set(x, "topBody", js.undefined)
      
      inline def setTopJoin(value: String): Self = StObject.set(x, "topJoin", value.asInstanceOf[js.Any])
      
      inline def setTopJoinUndefined: Self = StObject.set(x, "topJoin", js.undefined)
      
      inline def setTopLeft(value: String): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      inline def setTopRight(value: String): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    }
  }
  
  trait CellUserConfig extends StObject {
    
    /**
      * Cell content horizontal alignment (default: left)
      */
    val alignment: js.UndefOr[Alignment] = js.undefined
    
    /**
      * Cell content padding width left (default: 1)
      */
    val paddingLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Cell content padding width right (default: 1)
      */
    val paddingRight: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of characters are which the content will be truncated (default: Infinity)
      */
    val truncate: js.UndefOr[Double] = js.undefined
    
    /**
      * Cell content vertical alignment (default: top)
      */
    val verticalAlignment: js.UndefOr[VerticalAlignment] = js.undefined
    
    /**
      * If true, the text is broken at the nearest space or one of the special characters: "\|/_.,;-"
      */
    val wrapWord: js.UndefOr[Boolean] = js.undefined
  }
  object CellUserConfig {
    
    inline def apply(): CellUserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellUserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellUserConfig] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setVerticalAlignment(value: VerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      inline def setWrapWord(value: Boolean): Self = StObject.set(x, "wrapWord", value.asInstanceOf[js.Any])
      
      inline def setWrapWordUndefined: Self = StObject.set(x, "wrapWord", js.undefined)
    }
  }
  
  trait ColumnUserConfig
    extends StObject
       with CellUserConfig {
    
    /**
      * Column width (default: auto calculation based on the cell content)
      */
    val width: js.UndefOr[Double] = js.undefined
  }
  object ColumnUserConfig {
    
    inline def apply(): ColumnUserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnUserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnUserConfig] (val x: Self) extends AnyVal {
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type DrawHorizontalLine = DrawLinePredicate
  
  type DrawLinePredicate = js.Function2[/* index */ Double, /* size */ Double, Boolean]
  
  type DrawVerticalLine = DrawLinePredicate
  
  /* Inlined std.Omit<table.table/dist/src/types/api.ColumnUserConfig, 'verticalAlignment' | 'width'> & { readonly content :string} */
  trait HeaderUserConfig extends StObject {
    
    var alignment: js.UndefOr[Alignment] = js.undefined
    
    val content: String
    
    var paddingLeft: js.UndefOr[Double] = js.undefined
    
    var paddingRight: js.UndefOr[Double] = js.undefined
    
    var truncate: js.UndefOr[Double] = js.undefined
    
    var wrapWord: js.UndefOr[Boolean] = js.undefined
  }
  object HeaderUserConfig {
    
    inline def apply(content: String): HeaderUserConfig = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderUserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderUserConfig] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setWrapWord(value: Boolean): Self = StObject.set(x, "wrapWord", value.asInstanceOf[js.Any])
      
      inline def setWrapWordUndefined: Self = StObject.set(x, "wrapWord", js.undefined)
    }
  }
  
  type Indexable[T] = NumberDictionary[T]
  
  trait SpanningCellConfig
    extends StObject
       with CellUserConfig {
    
    val col: Double
    
    val colSpan: js.UndefOr[Double] = js.undefined
    
    val row: Double
    
    val rowSpan: js.UndefOr[Double] = js.undefined
  }
  object SpanningCellConfig {
    
    inline def apply(col: Double, row: Double): SpanningCellConfig = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpanningCellConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpanningCellConfig] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    }
  }
  
  trait StreamUserConfig
    extends StObject
       with BaseUserConfig {
    
    /**
      * The number of columns
      */
    val columnCount: Double
    
    /**
      * Default values for all columns. Column specific settings overwrite the default values.
      */
    @JSName("columnDefault")
    val columnDefault_StreamUserConfig: ColumnUserConfigreadonlyw
  }
  object StreamUserConfig {
    
    inline def apply(columnCount: Double, columnDefault: ColumnUserConfigreadonlyw): StreamUserConfig = {
      val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnDefault = columnDefault.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamUserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamUserConfig] (val x: Self) extends AnyVal {
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnDefault(value: ColumnUserConfigreadonlyw): Self = StObject.set(x, "columnDefault", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableUserConfig
    extends StObject
       with BaseUserConfig {
    
    /**
      * Used to tell whether to draw a horizontal line.
      * This callback is called for each non-content line of the table.
      * The default behavior is to always return true.
      */
    val drawHorizontalLine: js.UndefOr[DrawHorizontalLine] = js.undefined
    
    /**
      * The header configuration
      */
    val header: js.UndefOr[HeaderUserConfig] = js.undefined
    
    /**
      * Horizontal lines inside the table are not drawn.
      */
    val singleLine: js.UndefOr[Boolean] = js.undefined
    
    val spanningCells: js.UndefOr[js.Array[SpanningCellConfig]] = js.undefined
  }
  object TableUserConfig {
    
    inline def apply(): TableUserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableUserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableUserConfig] (val x: Self) extends AnyVal {
      
      inline def setDrawHorizontalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawHorizontalLine", js.Any.fromFunction2(value))
      
      inline def setDrawHorizontalLineUndefined: Self = StObject.set(x, "drawHorizontalLine", js.undefined)
      
      inline def setHeader(value: HeaderUserConfig): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setSingleLine(value: Boolean): Self = StObject.set(x, "singleLine", value.asInstanceOf[js.Any])
      
      inline def setSingleLineUndefined: Self = StObject.set(x, "singleLine", js.undefined)
      
      inline def setSpanningCells(value: js.Array[SpanningCellConfig]): Self = StObject.set(x, "spanningCells", value.asInstanceOf[js.Any])
      
      inline def setSpanningCellsUndefined: Self = StObject.set(x, "spanningCells", js.undefined)
      
      inline def setSpanningCellsVarargs(value: SpanningCellConfig*): Self = StObject.set(x, "spanningCells", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.table.tableStrings.bottom
    - typings.table.tableStrings.middle
    - typings.table.tableStrings.top
  */
  trait VerticalAlignment extends StObject
  object VerticalAlignment {
    
    inline def bottom: typings.table.tableStrings.bottom = "bottom".asInstanceOf[typings.table.tableStrings.bottom]
    
    inline def middle: typings.table.tableStrings.middle = "middle".asInstanceOf[typings.table.tableStrings.middle]
    
    inline def top: typings.table.tableStrings.top = "top".asInstanceOf[typings.table.tableStrings.top]
  }
  
  trait WritableStream extends StObject {
    
    def write(rows: js.Array[String]): Unit
  }
  object WritableStream {
    
    inline def apply(write: js.Array[String] => Unit): WritableStream = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[WritableStream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WritableStream] (val x: Self) extends AnyVal {
      
      inline def setWrite(value: js.Array[String] => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
