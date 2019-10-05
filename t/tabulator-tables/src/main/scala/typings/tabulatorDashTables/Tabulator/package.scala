package typings.tabulatorDashTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Tabulator {
  import typings.std.HTMLElement
  import typings.std.Record
  import typings.tabulatorDashTables.tabulatorDashTablesNumbers.`false`
  import typings.tabulatorDashTables.tabulatorDashTablesStrings.clipboard
  import typings.tabulatorDashTables.tabulatorDashTablesStrings.data
  import typings.tabulatorDashTables.tabulatorDashTablesStrings.download
  import typings.tabulatorDashTables.tabulatorDashTablesStrings.edit

  type CellEditEventCallback = js.Function1[/* cell */ CellComponent, Unit]
  type CellEventCallback = js.Function2[/* e */ js.Any, /* cell */ CellComponent, Unit]
  type Color = String | js.Array[js.Any] | ValueStringCallback
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.avg
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.max
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.min
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.sum
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.concat
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.count
    - js.Function3[
  / * values * / js.Array[js.Any], 
  / * data * / js.Array[js.Any], 
  / * calcParams * / js.Object, 
  scala.Double]
  */
  type ColumnCalc = _ColumnCalc | (js.Function3[
    /* values */ js.Array[js.Any], 
    /* data */ js.Array[js.Any], 
    /* calcParams */ js.Object, 
    Double
  ])
  type ColumnCalcParams = js.Function2[/* values */ js.Any, /* data */ js.Any, js.Any]
  type ColumnEventCallback = js.Function2[/* e */ js.Any, /* column */ ColumnComponent, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorDashTables.Tabulator.ColumnComponent
    - typings.tabulatorDashTables.Tabulator.ColumnDefinition
    - typings.std.HTMLElement
    - java.lang.String
  */
  type ColumnLookup = _ColumnLookup | HTMLElement | String
  type ColumnSorterParamLookupFunction = js.Function2[/* column */ ColumnComponent, /* dir */ SortDirection, js.Object]
  type CustomAccessor = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ data | download | clipboard, 
    /* AccessorParams */ js.Any, 
    /* column */ js.UndefOr[ColumnComponent], 
    js.Any
  ]
  type CustomAccessorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ data | download | clipboard, 
    /* column */ js.UndefOr[ColumnComponent], 
    js.Any
  ])
  type CustomMutator = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ data | edit, 
    /* mutatorParams */ js.Any, 
    /* cell */ js.UndefOr[CellComponent], 
    js.Any
  ]
  type CustomMutatorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ data | edit, 
    /* cell */ js.UndefOr[CellComponent], 
    js.Any
  ])
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorDashTables.tabulatorDashTablesNumbers.`true`
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.input
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.textarea
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.number
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.range
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.tickCross
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.star
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.select
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.autocomplete
    - js.Function5[
  / * cell * / typings.tabulatorDashTables.Tabulator.CellComponent, 
  / * onRendered * / typings.tabulatorDashTables.Tabulator.EmptyCallback, 
  / * success * / typings.tabulatorDashTables.Tabulator.ValueBooleanCallback, 
  / * cancel * / typings.tabulatorDashTables.Tabulator.ValueVoidCallback, 
  / * editorParams * / js.Object, 
  typings.std.HTMLElement | typings.tabulatorDashTables.tabulatorDashTablesNumbers.`false`]
  */
  type Editor = _Editor | (js.Function5[
    /* cell */ CellComponent, 
    /* onRendered */ EmptyCallback, 
    /* success */ ValueBooleanCallback, 
    /* cancel */ ValueVoidCallback, 
    /* editorParams */ js.Object, 
    HTMLElement | `false`
  ])
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorDashTables.Tabulator.NumberParams
    - typings.tabulatorDashTables.Tabulator.CheckboxParams
    - typings.tabulatorDashTables.Tabulator.SelectParams
    - typings.tabulatorDashTables.Tabulator.AutoCompleteParams
    - typings.tabulatorDashTables.Tabulator.InputParams
    - js.Function1[/ * cell * / typings.tabulatorDashTables.Tabulator.CellComponent, js.Object]
  */
  type EditorParams = _EditorParams | (js.Function1[/* cell */ CellComponent, js.Object])
  type EmptyCallback = js.Function1[/* callback */ js.Function0[Unit], Unit]
  type FilterFunction = js.Function3[/* field */ String, /* type */ FilterType, /* value */ js.Any, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.plaintext
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.textarea
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.html
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.money
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.image
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.datetime
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.datetimediff
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.link
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.tickCross
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.color
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.star
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.traffic
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.progress
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.lookup
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.buttonTick
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.buttonCross
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.rownum
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.handle
    - typings.tabulatorDashTables.tabulatorDashTablesStrings.rowSelection
    - js.Function3[
  / * cell * / typings.tabulatorDashTables.Tabulator.CellComponent, 
  / * formatterParams * / js.Object, 
  / * onRendered * / typings.tabulatorDashTables.Tabulator.EmptyCallback, 
  java.lang.String | typings.std.HTMLElement]
  */
  type Formatter = _Formatter | (js.Function3[
    /* cell */ CellComponent, 
    /* formatterParams */ js.Object, 
    /* onRendered */ EmptyCallback, 
    String | HTMLElement
  ])
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorDashTables.Tabulator.MoneyParams
    - typings.tabulatorDashTables.Tabulator.ImageParams
    - typings.tabulatorDashTables.Tabulator.LinkParams
    - typings.tabulatorDashTables.Tabulator.DateTimeParams
    - typings.tabulatorDashTables.Tabulator.DateTimeDifferenceParams
    - typings.tabulatorDashTables.Tabulator.TickCrossParams
    - typings.tabulatorDashTables.Tabulator.TrafficParams
    - typings.tabulatorDashTables.Tabulator.StarRatingParams
    - typings.tabulatorDashTables.Tabulator.JSONRecord
    - js.Function1[/ * cell * / typings.tabulatorDashTables.Tabulator.CellComponent, js.Object]
  */
  type FormatterParams = _FormatterParams | (js.Function1[/* cell */ CellComponent, js.Object]) | JSONRecord
  type GlobalTooltipOption = Boolean | (js.Function1[/* cell */ CellComponent, String])
  type GroupEventCallback = js.Function2[/* e */ js.Any, /* group */ GroupComponent, Unit]
  type JSONRecord = Record[String, String | Double | Boolean]
  type RowChangedCallback = js.Function1[/* row */ RowComponent, Unit]
  type RowEventCallback = js.Function2[/* e */ js.Any, /* row */ RowComponent, Unit]
  type RowLookup = RowComponent | HTMLElement | String | Double
  type StandardStringParam = String | HTMLElement | (js.Function0[String | HTMLElement])
  type ValueBooleanCallback = js.Function1[/* value */ js.Any, Boolean]
  type ValueStringCallback = js.Function1[/* value */ js.Any, String]
  type ValueVoidCallback = js.Function1[/* value */ js.Any, Unit]
}
