package typings.table

import org.scalablytyped.runtime.NumberDictionary
import typings.table.tableStrings.center
import typings.table.tableStrings.left
import typings.table.tableStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(userConfig: TableUserConfig): TableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(userConfig.asInstanceOf[js.Any]).asInstanceOf[TableStream]
  
  inline def getBorderCharacters(templateName: TableBorderTemplate): TableBorder = ^.asInstanceOf[js.Dynamic].applyDynamic("getBorderCharacters")(templateName.asInstanceOf[js.Any]).asInstanceOf[TableBorder]
  
  inline def table(data: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def table(data: js.Array[js.Any], userConfig: TableUserConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(data.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait TableBorder extends StObject {
    
    var bodyJoin: js.UndefOr[String] = js.undefined
    
    var bodyLeft: js.UndefOr[String] = js.undefined
    
    var bodyRight: js.UndefOr[String] = js.undefined
    
    var bottomBody: js.UndefOr[String] = js.undefined
    
    var bottomJoin: js.UndefOr[String] = js.undefined
    
    var bottomLeft: js.UndefOr[String] = js.undefined
    
    var bottomRight: js.UndefOr[String] = js.undefined
    
    var joinBody: js.UndefOr[String] = js.undefined
    
    var joinJoin: js.UndefOr[String] = js.undefined
    
    var joinLeft: js.UndefOr[String] = js.undefined
    
    var joinRight: js.UndefOr[String] = js.undefined
    
    var topBody: js.UndefOr[String] = js.undefined
    
    var topJoin: js.UndefOr[String] = js.undefined
    
    var topLeft: js.UndefOr[String] = js.undefined
    
    var topRight: js.UndefOr[String] = js.undefined
  }
  object TableBorder {
    
    inline def apply(): TableBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableBorder]
    }
    
    extension [Self <: TableBorder](x: Self) {
      
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
      
      inline def setJoinBody(value: String): Self = StObject.set(x, "joinBody", value.asInstanceOf[js.Any])
      
      inline def setJoinBodyUndefined: Self = StObject.set(x, "joinBody", js.undefined)
      
      inline def setJoinJoin(value: String): Self = StObject.set(x, "joinJoin", value.asInstanceOf[js.Any])
      
      inline def setJoinJoinUndefined: Self = StObject.set(x, "joinJoin", js.undefined)
      
      inline def setJoinLeft(value: String): Self = StObject.set(x, "joinLeft", value.asInstanceOf[js.Any])
      
      inline def setJoinLeftUndefined: Self = StObject.set(x, "joinLeft", js.undefined)
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.table.tableStrings.honeywell
    - typings.table.tableStrings.norc
    - typings.table.tableStrings.ramac
    - typings.table.tableStrings.void
  */
  trait TableBorderTemplate extends StObject
  object TableBorderTemplate {
    
    inline def honeywell: typings.table.tableStrings.honeywell = "honeywell".asInstanceOf[typings.table.tableStrings.honeywell]
    
    inline def norc: typings.table.tableStrings.norc = "norc".asInstanceOf[typings.table.tableStrings.norc]
    
    inline def ramac: typings.table.tableStrings.ramac = "ramac".asInstanceOf[typings.table.tableStrings.ramac]
    
    inline def void: typings.table.tableStrings.void = "void".asInstanceOf[typings.table.tableStrings.void]
  }
  
  trait TableColumns extends StObject {
    
    var alignment: js.UndefOr[left | center | right] = js.undefined
    
    var paddingLeft: js.UndefOr[Double] = js.undefined
    
    var paddingRight: js.UndefOr[Double] = js.undefined
    
    var truncate: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var wrapWord: js.UndefOr[Boolean] = js.undefined
  }
  object TableColumns {
    
    inline def apply(): TableColumns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableColumns]
    }
    
    extension [Self <: TableColumns](x: Self) {
      
      inline def setAlignment(value: left | center | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapWord(value: Boolean): Self = StObject.set(x, "wrapWord", value.asInstanceOf[js.Any])
      
      inline def setWrapWordUndefined: Self = StObject.set(x, "wrapWord", js.undefined)
    }
  }
  
  type TableDrawHorizontalLine = js.Function2[/* index */ Double, /* size */ Double, Boolean]
  
  trait TableStream extends StObject {
    
    def write(row: js.Array[String]): Unit
  }
  object TableStream {
    
    inline def apply(write: js.Array[String] => Unit): TableStream = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[TableStream]
    }
    
    extension [Self <: TableStream](x: Self) {
      
      inline def setWrite(value: js.Array[String] => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait TableUserConfig extends StObject {
    
    var border: js.UndefOr[TableBorder] = js.undefined
    
    var columnCount: js.UndefOr[Double] = js.undefined
    
    var columnDefault: js.UndefOr[TableColumns] = js.undefined
    
    var columns: js.UndefOr[NumberDictionary[TableColumns]] = js.undefined
    
    var drawHorizontalLine: js.UndefOr[TableDrawHorizontalLine] = js.undefined
    
    var singleLine: js.UndefOr[Boolean] = js.undefined
  }
  object TableUserConfig {
    
    inline def apply(): TableUserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableUserConfig]
    }
    
    extension [Self <: TableUserConfig](x: Self) {
      
      inline def setBorder(value: TableBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setColumnDefault(value: TableColumns): Self = StObject.set(x, "columnDefault", value.asInstanceOf[js.Any])
      
      inline def setColumnDefaultUndefined: Self = StObject.set(x, "columnDefault", js.undefined)
      
      inline def setColumns(value: NumberDictionary[TableColumns]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDrawHorizontalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawHorizontalLine", js.Any.fromFunction2(value))
      
      inline def setDrawHorizontalLineUndefined: Self = StObject.set(x, "drawHorizontalLine", js.undefined)
      
      inline def setSingleLine(value: Boolean): Self = StObject.set(x, "singleLine", value.asInstanceOf[js.Any])
      
      inline def setSingleLineUndefined: Self = StObject.set(x, "singleLine", js.undefined)
    }
  }
}
