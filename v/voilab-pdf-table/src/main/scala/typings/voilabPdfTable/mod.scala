package typings.voilabPdfTable

import org.scalablytyped.runtime.StringDictionary
import typings.pdfkit.PDFKit.Mixins.TextOptions
import typings.pdfkit.PDFKit.PDFDocument
import typings.std.Omit
import typings.std.Partial
import typings.voilabPdfTable.anon.Align
import typings.voilabPdfTable.anon.Cancel
import typings.voilabPdfTable.anon.Header
import typings.voilabPdfTable.anon.HeaderBorder
import typings.voilabPdfTable.anon.X
import typings.voilabPdfTable.voilabPdfTableStrings.id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("voilab-pdf-table", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with VoilabPdfTable[T] {
    // tslint:disable-next-line:no-misused-new
    def this(pdf: PDFDocument) = this()
    def this(pdf: PDFDocument, conf: VoilabPdfTableConfig[T]) = this()
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends unknown ? std.Omit<T, K> : never
    }}}
    */
  type DistributiveOmit[T, K /* <: /* keyof T */ String */] = Omit[T, K]
  
  @js.native
  trait VoilabPdfTable[T] extends StObject {
    
    /** Add content to the table */
    def addBody(data: js.Array[T]): this.type = js.native
    
    /** Adds a column */
    def addColumn(column: VoilabPdfTableColumn[T]): this.type = js.native
    
    /** Add multiple columns */
    def addColumns(columns: js.Array[VoilabPdfTableColumn[T]]): this.type = js.native
    
    /** Add table headers */
    def addHeader(): this.type = js.native
    def addHeader(index: Double): this.type = js.native
    
    /** Add a plugin */
    def addPlugin(arg0: VoilabPdfTablePlugin[T]): this.type = js.native
    
    /** Get a definition for a column */
    def getColumn(columnId: /* keyof T */ String): VoilabPdfTableColumn[T] = js.native
    
    /** Get column param */
    def getColumnParam[K /* <: /* keyof voilab-pdf-table.voilab-pdf-table.VoilabPdfTableColumn<T> */ String */](columnId: /* keyof T */ String, param: K): /* import warning: importer.ImportType#apply Failed type conversion: voilab-pdf-table.voilab-pdf-table.VoilabPdfTableColumn<T>[K] */ js.Any = js.native
    
    /** Get column width */
    def getColumnWidth(columnId: /* keyof T */ String): Double = js.native
    
    /** Get width between two columns. Widths of these columns are included in the sum. */
    def getColumnWidthBetween(columnA: /* keyof T */ String, columnB: /* keyof T */ String): Double = js.native
    
    /** Get width from a column to the end of the table. Given column's width is added to the sum. */
    def getColumnWidthFrom(columnId: /* keyof T */ String): Double = js.native
    
    /** Get width from start to the given column. Given width's column is not included in the sum. */
    def getColumnWidthUntil(columnId: /* keyof T */ String): Double = js.native
    
    /** Get all table columns */
    def getColumns(): js.Array[VoilabPdfTableColumn[T]] = js.native
    def getColumns(withHidden: Boolean): js.Array[VoilabPdfTableColumn[T]] = js.native
    
    /** Get a plugin */
    def getPlugin(id: String): Any = js.native
    
    /** Get table width (sum of all columns) */
    def getWidth(): Double = js.native
    
    /** Add action before data rows are added */
    def onBodyAdd(cb: js.Function2[/* table */ this.type, /* data */ js.Array[T], Unit]): this.type = js.native
    
    /** Add action after data rows are added */
    def onBodyAdded(cb: js.Function2[/* table */ this.type, /* data */ js.Array[T], Unit]): this.type = js.native
    
    /** Add action before a cell background is added */
    def onCellBackgroundAdd(
      cb: js.Function5[
          /* table */ this.type, 
          /* column */ VoilabPdfTableColumn[T], 
          /* row */ T, 
          /* index */ Double, 
          /* isHeader */ Boolean, 
          Unit
        ]
    ): this.type = js.native
    
    /** Add action after a cell background is added */
    def onCellBackgroundAdded(
      cb: js.Function5[
          /* table */ this.type, 
          /* column */ VoilabPdfTableColumn[T], 
          /* row */ T, 
          /* index */ Double, 
          /* isHeader */ Boolean, 
          Unit
        ]
    ): this.type = js.native
    
    /** Add action before a cell border is added */
    def onCellBorderAdd(
      cb: js.Function4[
          /* table */ this.type, 
          /* column */ VoilabPdfTableColumn[T], 
          /* row */ T, 
          /* isHeader */ Boolean, 
          Unit
        ]
    ): this.type = js.native
    
    /** Add action after a cell border is added */
    def onCellBorderAdded(
      cb: js.Function4[
          /* table */ this.type, 
          /* column */ VoilabPdfTableColumn[T], 
          /* row */ T, 
          /* isHeader */ Boolean, 
          Unit
        ]
    ): this.type = js.native
    
    /** Add action after a column is added */
    def onColumnAdded(cb: js.Function2[/* table */ this.type, /* column */ VoilabPdfTableColumn[T], Unit]): this.type = js.native
    
    /** Add action after a column's property is changed */
    def onColumnPropertyChanged(
      cb: js.Function4[
          /* table */ this.type, 
          /* column */ VoilabPdfTableColumn[T], 
          /* prop */ String, 
          /* oldValue */ Any, 
          Unit
        ]
    ): this.type = js.native
    
    /** Add action before a header is added */
    def onHeaderAdd(cb: js.Function2[/* table */ this.type, /* header */ VoilabPdfTableHeader[T], Unit]): this.type = js.native
    
    /** Add action after a header is added */
    def onHeaderAdded(cb: js.Function2[/* table */ this.type, /* header */ VoilabPdfTableHeader[T], Unit]): this.type = js.native
    
    /** Add action before height is calculated for the header */
    def onHeaderHeightCalculate(cb: js.Function2[/* table */ this.type, /* header */ VoilabPdfTableHeader[T], Unit]): this.type = js.native
    
    /** Add action after height is calculated for the header */
    def onHeaderHeightCalculated(cb: js.Function2[/* table */ this.type, /* header */ VoilabPdfTableHeader[T], Unit]): this.type = js.native
    
    /** Add action before a page is added */
    def onPageAdd(cb: js.Function3[/* table */ this.type, /* row */ T, /* ev */ Cancel, Unit]): this.type = js.native
    
    /** Add action after a page is added */
    def onPageAdded(cb: js.Function2[/* table */ this.type, /* row */ T, Unit]): this.type = js.native
    
    /** Add action before a row is added */
    def onRowAdd(cb: js.Function3[/* table */ this.type, /* row */ T, /* rowIdx */ Double, Unit]): this.type = js.native
    
    /** Add action after a row is added */
    def onRowAdded(cb: js.Function3[/* table */ this.type, /* row */ T, /* rowIdx */ Double, Unit]): this.type = js.native
    
    /** Add action before height is calculated for every row */
    def onRowHeightCalculate(cb: js.Function2[/* table */ this.type, /* data */ js.Array[T], Unit]): this.type = js.native
    
    /** Add action after height is calculated for every row */
    def onRowHeightCalculated(cb: js.Function2[/* table */ this.type, /* data */ js.Array[T], Unit]): this.type = js.native
    
    var pdf: PDFDocument = js.native
    
    /** Remove a plugin and its events by the key */
    def removePlugin(id: String): this.type = js.native
    
    /** Set a specific definition for a column */
    def setColumnParam[K /* <: /* keyof voilab-pdf-table.voilab-pdf-table.VoilabPdfTableColumn<T> */ String */](
      columnId: /* keyof T */ String,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: voilab-pdf-table.voilab-pdf-table.VoilabPdfTableColumn<T>[K] */ js.Any
    ): this.type = js.native
    def setColumnParam[K /* <: /* keyof voilab-pdf-table.voilab-pdf-table.VoilabPdfTableColumn<T> */ String */](
      columnId: /* keyof T */ String,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: voilab-pdf-table.voilab-pdf-table.VoilabPdfTableColumn<T>[K] */ js.Any,
      silent: Boolean
    ): this.type = js.native
    
    /** Set column width */
    def setColumnWidth(columnId: /* keyof T */ String, width: Double): this.type = js.native
    def setColumnWidth(columnId: /* keyof T */ String, width: Double, silent: Boolean): this.type = js.native
    
    /** Set columns in one shot */
    def setColumns(columns: js.Array[VoilabPdfTableColumn[T]]): this.type = js.native
    def setColumns(columns: js.Array[VoilabPdfTableColumn[T]], add: Boolean): this.type = js.native
    
    /** Set defaults for all new columns to add */
    def setColumnsDefaults(defaults: Partial[VoilabPdfTableColumnDefaults[T]]): this.type = js.native
    
    /** Determine if headers need to be displayed or not when .addBody is called */
    def setShowHeaders(showHeaders: Boolean): this.type = js.native
  }
  
  type VoilabPdfTableColumn[T] = (Header[T] & Align[T] & TextOptions) | (HeaderBorder & Align[T] & TextOptions)
  
  type VoilabPdfTableColumnDefaults[T] = DistributiveOmit[VoilabPdfTableColumn[T], id]
  
  trait VoilabPdfTableConfig[T] extends StObject {
    
    var bottomMargin: js.UndefOr[Double] = js.undefined
    
    var columns: js.UndefOr[js.Array[VoilabPdfTableColumn[T]]] = js.undefined
    
    var columnsDefaults: js.UndefOr[VoilabPdfTableColumnDefaults[T]] = js.undefined
    
    var minRowHeight: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    var pos: js.UndefOr[X] = js.undefined
    
    var showHeaders: js.UndefOr[Boolean] = js.undefined
  }
  object VoilabPdfTableConfig {
    
    inline def apply[T](): VoilabPdfTableConfig[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoilabPdfTableConfig[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VoilabPdfTableConfig[?], T] (val x: Self & VoilabPdfTableConfig[T]) extends AnyVal {
      
      inline def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
      
      inline def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
      
      inline def setColumns(value: js.Array[VoilabPdfTableColumn[T]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsDefaults(value: VoilabPdfTableColumnDefaults[T]): Self = StObject.set(x, "columnsDefaults", value.asInstanceOf[js.Any])
      
      inline def setColumnsDefaultsUndefined: Self = StObject.set(x, "columnsDefaults", js.undefined)
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: VoilabPdfTableColumn[T]*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setMinRowHeight(value: Double): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
      
      inline def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
      
      inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPos(value: X): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
      
      inline def setShowHeaders(value: Boolean): Self = StObject.set(x, "showHeaders", value.asInstanceOf[js.Any])
      
      inline def setShowHeadersUndefined: Self = StObject.set(x, "showHeaders", js.undefined)
    }
  }
  
  type VoilabPdfTableDefaultType = StringDictionary[js.UndefOr[String | Double]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof T ]: string}
    }}}
    */
  @js.native
  trait VoilabPdfTableHeader[T] extends StObject
  
  trait VoilabPdfTablePlugin[T] extends StObject {
    
    def configure(table: VoilabPdfTable[T]): Unit
  }
  object VoilabPdfTablePlugin {
    
    inline def apply[T](configure: VoilabPdfTable[T] => Unit): VoilabPdfTablePlugin[T] = {
      val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
      __obj.asInstanceOf[VoilabPdfTablePlugin[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VoilabPdfTablePlugin[?], T] (val x: Self & VoilabPdfTablePlugin[T]) extends AnyVal {
      
      inline def setConfigure(value: VoilabPdfTable[T] => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    }
  }
}
