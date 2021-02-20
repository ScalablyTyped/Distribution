package typings.table

import org.scalablytyped.runtime.NumberDictionary
import typings.table.tableStrings.center
import typings.table.tableStrings.left
import typings.table.tableStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("table", "createStream")
  @js.native
  def createStream(userConfig: TableUserConfig): TableStream = js.native
  
  @JSImport("table", "getBorderCharacters")
  @js.native
  def getBorderCharacters(templateName: TableBorderTemplate): TableBorder = js.native
  
  @JSImport("table", "table")
  @js.native
  def table(data: js.Array[_]): String = js.native
  @JSImport("table", "table")
  @js.native
  def table(data: js.Array[_], userConfig: TableUserConfig): String = js.native
  
  @js.native
  trait TableBorder extends StObject {
    
    var bodyJoin: js.UndefOr[String] = js.native
    
    var bodyLeft: js.UndefOr[String] = js.native
    
    var bodyRight: js.UndefOr[String] = js.native
    
    var bottomBody: js.UndefOr[String] = js.native
    
    var bottomJoin: js.UndefOr[String] = js.native
    
    var bottomLeft: js.UndefOr[String] = js.native
    
    var bottomRight: js.UndefOr[String] = js.native
    
    var joinBody: js.UndefOr[String] = js.native
    
    var joinJoin: js.UndefOr[String] = js.native
    
    var joinLeft: js.UndefOr[String] = js.native
    
    var joinRight: js.UndefOr[String] = js.native
    
    var topBody: js.UndefOr[String] = js.native
    
    var topJoin: js.UndefOr[String] = js.native
    
    var topLeft: js.UndefOr[String] = js.native
    
    var topRight: js.UndefOr[String] = js.native
  }
  object TableBorder {
    
    @scala.inline
    def apply(): TableBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableBorder]
    }
    
    @scala.inline
    implicit class TableBorderMutableBuilder[Self <: TableBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyJoin(value: String): Self = StObject.set(x, "bodyJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyJoinUndefined: Self = StObject.set(x, "bodyJoin", js.undefined)
      
      @scala.inline
      def setBodyLeft(value: String): Self = StObject.set(x, "bodyLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyLeftUndefined: Self = StObject.set(x, "bodyLeft", js.undefined)
      
      @scala.inline
      def setBodyRight(value: String): Self = StObject.set(x, "bodyRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyRightUndefined: Self = StObject.set(x, "bodyRight", js.undefined)
      
      @scala.inline
      def setBottomBody(value: String): Self = StObject.set(x, "bottomBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomBodyUndefined: Self = StObject.set(x, "bottomBody", js.undefined)
      
      @scala.inline
      def setBottomJoin(value: String): Self = StObject.set(x, "bottomJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomJoinUndefined: Self = StObject.set(x, "bottomJoin", js.undefined)
      
      @scala.inline
      def setBottomLeft(value: String): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      @scala.inline
      def setBottomRight(value: String): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      @scala.inline
      def setJoinBody(value: String): Self = StObject.set(x, "joinBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinBodyUndefined: Self = StObject.set(x, "joinBody", js.undefined)
      
      @scala.inline
      def setJoinJoin(value: String): Self = StObject.set(x, "joinJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinJoinUndefined: Self = StObject.set(x, "joinJoin", js.undefined)
      
      @scala.inline
      def setJoinLeft(value: String): Self = StObject.set(x, "joinLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinLeftUndefined: Self = StObject.set(x, "joinLeft", js.undefined)
      
      @scala.inline
      def setJoinRight(value: String): Self = StObject.set(x, "joinRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinRightUndefined: Self = StObject.set(x, "joinRight", js.undefined)
      
      @scala.inline
      def setTopBody(value: String): Self = StObject.set(x, "topBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopBodyUndefined: Self = StObject.set(x, "topBody", js.undefined)
      
      @scala.inline
      def setTopJoin(value: String): Self = StObject.set(x, "topJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopJoinUndefined: Self = StObject.set(x, "topJoin", js.undefined)
      
      @scala.inline
      def setTopLeft(value: String): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      @scala.inline
      def setTopRight(value: String): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.table.tableStrings.honeywell
    - typings.table.tableStrings.norc
    - typings.table.tableStrings.ramac
    - typings.table.tableStrings.void
  */
  trait TableBorderTemplate extends StObject
  object TableBorderTemplate {
    
    @scala.inline
    def honeywell: typings.table.tableStrings.honeywell = "honeywell".asInstanceOf[typings.table.tableStrings.honeywell]
    
    @scala.inline
    def norc: typings.table.tableStrings.norc = "norc".asInstanceOf[typings.table.tableStrings.norc]
    
    @scala.inline
    def ramac: typings.table.tableStrings.ramac = "ramac".asInstanceOf[typings.table.tableStrings.ramac]
    
    @scala.inline
    def void: typings.table.tableStrings.void = "void".asInstanceOf[typings.table.tableStrings.void]
  }
  
  @js.native
  trait TableColumns extends StObject {
    
    var alignment: js.UndefOr[left | center | right] = js.native
    
    var paddingLeft: js.UndefOr[Double] = js.native
    
    var paddingRight: js.UndefOr[Double] = js.native
    
    var truncate: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var wrapWord: js.UndefOr[Boolean] = js.native
  }
  object TableColumns {
    
    @scala.inline
    def apply(): TableColumns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableColumns]
    }
    
    @scala.inline
    implicit class TableColumnsMutableBuilder[Self <: TableColumns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: left | center | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapWord(value: Boolean): Self = StObject.set(x, "wrapWord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapWordUndefined: Self = StObject.set(x, "wrapWord", js.undefined)
    }
  }
  
  type TableDrawHorizontalLine = js.Function2[/* index */ Double, /* size */ Double, Boolean]
  
  @js.native
  trait TableStream extends StObject {
    
    def write(row: js.Array[String]): Unit = js.native
  }
  object TableStream {
    
    @scala.inline
    def apply(write: js.Array[String] => Unit): TableStream = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[TableStream]
    }
    
    @scala.inline
    implicit class TableStreamMutableBuilder[Self <: TableStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrite(value: js.Array[String] => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TableUserConfig extends StObject {
    
    var border: js.UndefOr[TableBorder] = js.native
    
    var columnCount: js.UndefOr[Double] = js.native
    
    var columnDefault: js.UndefOr[TableColumns] = js.native
    
    var columns: js.UndefOr[NumberDictionary[TableColumns]] = js.native
    
    var drawHorizontalLine: js.UndefOr[TableDrawHorizontalLine] = js.native
    
    var singleLine: js.UndefOr[Boolean] = js.native
  }
  object TableUserConfig {
    
    @scala.inline
    def apply(): TableUserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableUserConfig]
    }
    
    @scala.inline
    implicit class TableUserConfigMutableBuilder[Self <: TableUserConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: TableBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      @scala.inline
      def setColumnDefault(value: TableColumns): Self = StObject.set(x, "columnDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnDefaultUndefined: Self = StObject.set(x, "columnDefault", js.undefined)
      
      @scala.inline
      def setColumns(value: NumberDictionary[TableColumns]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setDrawHorizontalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawHorizontalLine", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrawHorizontalLineUndefined: Self = StObject.set(x, "drawHorizontalLine", js.undefined)
      
      @scala.inline
      def setSingleLine(value: Boolean): Self = StObject.set(x, "singleLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleLineUndefined: Self = StObject.set(x, "singleLine", js.undefined)
    }
  }
}
