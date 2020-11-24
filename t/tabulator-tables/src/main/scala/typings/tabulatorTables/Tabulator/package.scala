package typings.tabulatorTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Tabulator {
  
  type CellEditEventCallback = js.Function1[/* cell */ typings.tabulatorTables.Tabulator.CellComponent, scala.Unit]
  
  type CellEventCallback = js.Function2[
    /* e */ typings.std.UIEvent, 
    /* cell */ typings.tabulatorTables.Tabulator.CellComponent, 
    scala.Unit
  ]
  
  type Color = java.lang.String | js.Array[js.Any] | typings.tabulatorTables.Tabulator.ValueStringCallback
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.avg
    - typings.tabulatorTables.tabulatorTablesStrings.max
    - typings.tabulatorTables.tabulatorTablesStrings.min
    - typings.tabulatorTables.tabulatorTablesStrings.sum
    - typings.tabulatorTables.tabulatorTablesStrings.concat
    - typings.tabulatorTables.tabulatorTablesStrings.count
    - js.Function3[
  / * values * / js.Array[js.Any], 
  / * data * / js.Array[js.Any], 
  / * calcParams * / js.Object, 
  js.Any]
  */
  type ColumnCalc = typings.tabulatorTables.Tabulator._ColumnCalc | (js.Function3[
    /* values */ js.Array[js.Any], 
    /* data */ js.Array[js.Any], 
    /* calcParams */ js.Object, 
    js.Any
  ])
  
  type ColumnCalcParams = js.Function2[/* values */ js.Any, /* data */ js.Any, js.Any]
  
  type ColumnEventCallback = js.Function2[
    /* e */ typings.std.UIEvent, 
    /* column */ typings.tabulatorTables.Tabulator.ColumnComponent, 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.Tabulator.ColumnComponent
    - typings.tabulatorTables.Tabulator.ColumnDefinition
    - typings.std.HTMLElement
    - java.lang.String
  */
  type ColumnLookup = typings.tabulatorTables.Tabulator._ColumnLookup | typings.std.HTMLElement | java.lang.String
  
  type ColumnSorterParamLookupFunction = js.Function2[
    /* column */ typings.tabulatorTables.Tabulator.ColumnComponent, 
    /* dir */ typings.tabulatorTables.Tabulator.SortDirection, 
    js.Object
  ]
  
  type CustomAccessor = js.Function6[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typings.tabulatorTables.tabulatorTablesStrings.data | typings.tabulatorTables.tabulatorTablesStrings.download | typings.tabulatorTables.tabulatorTablesStrings.clipboard, 
    /* AccessorParams */ js.Any, 
    /* column */ js.UndefOr[typings.tabulatorTables.Tabulator.ColumnComponent], 
    /* row */ js.UndefOr[typings.tabulatorTables.Tabulator.RowComponent], 
    js.Any
  ]
  
  type CustomAccessorParams = js.Object | (js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typings.tabulatorTables.tabulatorTablesStrings.data | typings.tabulatorTables.tabulatorTablesStrings.download | typings.tabulatorTables.tabulatorTablesStrings.clipboard, 
    /* column */ js.UndefOr[typings.tabulatorTables.Tabulator.ColumnComponent], 
    /* row */ js.UndefOr[typings.tabulatorTables.Tabulator.RowComponent], 
    js.Any
  ])
  
  type CustomMutator = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typings.tabulatorTables.tabulatorTablesStrings.data | typings.tabulatorTables.tabulatorTablesStrings.edit, 
    /* mutatorParams */ js.Any, 
    /* cell */ js.UndefOr[typings.tabulatorTables.Tabulator.CellComponent], 
    js.Any
  ]
  
  type CustomMutatorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ typings.tabulatorTables.tabulatorTablesStrings.data | typings.tabulatorTables.tabulatorTablesStrings.edit, 
    /* cell */ js.UndefOr[typings.tabulatorTables.Tabulator.CellComponent], 
    js.Any
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesBooleans.`true`
    - typings.tabulatorTables.tabulatorTablesStrings.input
    - typings.tabulatorTables.tabulatorTablesStrings.textarea
    - typings.tabulatorTables.tabulatorTablesStrings.number
    - typings.tabulatorTables.tabulatorTablesStrings.range
    - typings.tabulatorTables.tabulatorTablesStrings.tickCross
    - typings.tabulatorTables.tabulatorTablesStrings.star
    - typings.tabulatorTables.tabulatorTablesStrings.select
    - typings.tabulatorTables.tabulatorTablesStrings.autocomplete
    - js.Function5[
  / * cell * / typings.tabulatorTables.Tabulator.CellComponent, 
  / * onRendered * / typings.tabulatorTables.Tabulator.EmptyCallback, 
  / * success * / typings.tabulatorTables.Tabulator.ValueBooleanCallback, 
  / * cancel * / typings.tabulatorTables.Tabulator.ValueVoidCallback, 
  / * editorParams * / js.Object, 
  typings.std.HTMLElement | typings.tabulatorTables.tabulatorTablesBooleans.`false`]
  */
  type Editor = typings.tabulatorTables.Tabulator._Editor | (js.Function5[
    /* cell */ typings.tabulatorTables.Tabulator.CellComponent, 
    /* onRendered */ typings.tabulatorTables.Tabulator.EmptyCallback, 
    /* success */ typings.tabulatorTables.Tabulator.ValueBooleanCallback, 
    /* cancel */ typings.tabulatorTables.Tabulator.ValueVoidCallback, 
    /* editorParams */ js.Object, 
    typings.std.HTMLElement | typings.tabulatorTables.tabulatorTablesBooleans.`false`
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.Tabulator.NumberParams
    - typings.tabulatorTables.Tabulator.CheckboxParams
    - typings.tabulatorTables.Tabulator.SelectParams
    - typings.tabulatorTables.Tabulator.AutoCompleteParams
    - typings.tabulatorTables.Tabulator.InputParams
    - typings.tabulatorTables.Tabulator.TextAreaParams
    - js.Function1[/ * cell * / typings.tabulatorTables.Tabulator.CellComponent, js.Object]
  */
  type EditorParams = typings.tabulatorTables.Tabulator._EditorParams | (js.Function1[/* cell */ typings.tabulatorTables.Tabulator.CellComponent, js.Object])
  
  type EmptyCallback = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  
  type FilterFunction = js.Function4[
    /* field */ java.lang.String, 
    /* type */ typings.tabulatorTables.Tabulator.FilterType, 
    /* value */ js.Any, 
    /* filterParams */ js.UndefOr[typings.tabulatorTables.Tabulator.FilterParams], 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.plaintext
    - typings.tabulatorTables.tabulatorTablesStrings.textarea
    - typings.tabulatorTables.tabulatorTablesStrings.html
    - typings.tabulatorTables.tabulatorTablesStrings.money
    - typings.tabulatorTables.tabulatorTablesStrings.image
    - typings.tabulatorTables.tabulatorTablesStrings.datetime
    - typings.tabulatorTables.tabulatorTablesStrings.datetimediff
    - typings.tabulatorTables.tabulatorTablesStrings.link
    - typings.tabulatorTables.tabulatorTablesStrings.tickCross
    - typings.tabulatorTables.tabulatorTablesStrings.color
    - typings.tabulatorTables.tabulatorTablesStrings.star
    - typings.tabulatorTables.tabulatorTablesStrings.traffic
    - typings.tabulatorTables.tabulatorTablesStrings.progress
    - typings.tabulatorTables.tabulatorTablesStrings.lookup
    - typings.tabulatorTables.tabulatorTablesStrings.buttonTick
    - typings.tabulatorTables.tabulatorTablesStrings.buttonCross
    - typings.tabulatorTables.tabulatorTablesStrings.rownum
    - typings.tabulatorTables.tabulatorTablesStrings.handle
    - typings.tabulatorTables.tabulatorTablesStrings.rowSelection
    - typings.tabulatorTables.tabulatorTablesStrings.responsiveCollapse
    - js.Function3[
  / * cell * / typings.tabulatorTables.Tabulator.CellComponent, 
  / * formatterParams * / js.Object, 
  / * onRendered * / typings.tabulatorTables.Tabulator.EmptyCallback, 
  java.lang.String | typings.std.HTMLElement]
  */
  type Formatter = typings.tabulatorTables.Tabulator._Formatter | (js.Function3[
    /* cell */ typings.tabulatorTables.Tabulator.CellComponent, 
    /* formatterParams */ js.Object, 
    /* onRendered */ typings.tabulatorTables.Tabulator.EmptyCallback, 
    java.lang.String | typings.std.HTMLElement
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.Tabulator.MoneyParams
    - typings.tabulatorTables.Tabulator.ImageParams
    - typings.tabulatorTables.Tabulator.LinkParams
    - typings.tabulatorTables.Tabulator.DateTimeParams
    - typings.tabulatorTables.Tabulator.DateTimeDifferenceParams
    - typings.tabulatorTables.Tabulator.TickCrossParams
    - typings.tabulatorTables.Tabulator.TrafficParams
    - typings.tabulatorTables.Tabulator.StarRatingParams
    - typings.tabulatorTables.Tabulator.RowSelectionParams
    - typings.tabulatorTables.Tabulator.JSONRecord
    - js.Function1[/ * cell * / typings.tabulatorTables.Tabulator.CellComponent, js.Object]
  */
  type FormatterParams = typings.tabulatorTables.Tabulator._FormatterParams | (js.Function1[/* cell */ typings.tabulatorTables.Tabulator.CellComponent, js.Object]) | typings.tabulatorTables.Tabulator.JSONRecord
  
  type GlobalTooltipOption = scala.Boolean | (js.Function1[/* cell */ typings.tabulatorTables.Tabulator.CellComponent, java.lang.String])
  
  type GroupContextMenuSignature = (js.Array[
    typings.tabulatorTables.Tabulator.MenuObject[typings.tabulatorTables.Tabulator.GroupComponent] | typings.tabulatorTables.Tabulator.MenuSeparator
  ]) | (js.Function2[
    /* component */ typings.tabulatorTables.Tabulator.GroupComponent, 
    /* e */ typings.std.MouseEvent, 
    typings.tabulatorTables.Tabulator.MenuObject[typings.tabulatorTables.Tabulator.GroupComponent] | typings.tabulatorTables.tabulatorTablesBooleans.`false` | js.Array[js.Any]
  ])
  
  type GroupEventCallback = js.Function2[
    /* e */ typings.std.UIEvent, 
    /* group */ typings.tabulatorTables.Tabulator.GroupComponent, 
    scala.Unit
  ]
  
  type GroupValuesArg = js.Array[js.Array[js.Any]]
  
  type JSONRecord = typings.std.Record[java.lang.String, java.lang.String | scala.Double | scala.Boolean]
  
  type RowChangedCallback = js.Function1[/* row */ typings.tabulatorTables.Tabulator.RowComponent, scala.Unit]
  
  type RowContextMenuSignature = (js.Array[
    typings.tabulatorTables.Tabulator.MenuObject[typings.tabulatorTables.Tabulator.RowComponent] | typings.tabulatorTables.Tabulator.MenuSeparator
  ]) | (js.Function2[
    /* component */ typings.tabulatorTables.Tabulator.RowComponent, 
    /* e */ typings.std.MouseEvent, 
    typings.tabulatorTables.Tabulator.MenuObject[typings.tabulatorTables.Tabulator.RowComponent] | typings.tabulatorTables.tabulatorTablesBooleans.`false` | js.Array[js.Any]
  ])
  
  type RowEventCallback = js.Function2[
    /* e */ typings.std.UIEvent, 
    /* row */ typings.tabulatorTables.Tabulator.RowComponent, 
    scala.Unit
  ]
  
  type RowLookup = typings.tabulatorTables.Tabulator.RowComponent | typings.std.HTMLElement | java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String])
  
  type StandardStringParam = java.lang.String | typings.std.HTMLElement | (js.Function0[java.lang.String | typings.std.HTMLElement])
  
  type ValueBooleanCallback = js.Function1[/* value */ js.Any, scala.Boolean]
  
  type ValueStringCallback = js.Function1[/* value */ js.Any, java.lang.String]
  
  type ValueVoidCallback = js.Function1[/* value */ js.Any, scala.Unit]
}
