package typings
package tabulatorDashTablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TabulatorNs {
  type CellEditEventCallback = js.Function1[/* cell */ CellComponent, scala.Unit]
  type CellEventCallback = js.Function2[/* e */ js.Any, /* cell */ CellComponent, scala.Unit]
  type Color = java.lang.String | js.Array[js.Any] | ValueStringCallback
  /* Rewritten from type alias, can be one of: 
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.avg
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.max
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.min
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.sum
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.concat
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.count
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
    scala.Double
  ])
  type ColumnCalcParams = js.Function2[/* values */ js.Any, /* data */ js.Any, js.Any]
  type ColumnEventCallback = js.Function2[/* e */ js.Any, /* column */ ColumnComponent, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - ColumnComponent
    - ColumnDefinition
    - stdLib.HTMLElement
    - java.lang.String
  */
  type ColumnLookup = _ColumnLookup | stdLib.HTMLElement | java.lang.String
  type ColumnSorterParamLookupFunction = js.Function2[/* column */ ColumnComponent, /* dir */ SortDirection, js.Object]
  type CustomAccessor = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ tabulatorDashTablesLib.tabulatorDashTablesLibStrings.data | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.download | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.clipboard, 
    /* AccessorParams */ js.Any, 
    /* column */ js.UndefOr[ColumnComponent], 
    js.Any
  ]
  type CustomAccessorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ tabulatorDashTablesLib.tabulatorDashTablesLibStrings.data | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.download | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.clipboard, 
    /* column */ js.UndefOr[ColumnComponent], 
    js.Any
  ])
  type CustomMutator = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ tabulatorDashTablesLib.tabulatorDashTablesLibStrings.data | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.edit, 
    /* mutatorParams */ js.Any, 
    /* cell */ js.UndefOr[CellComponent], 
    js.Any
  ]
  type CustomMutatorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ tabulatorDashTablesLib.tabulatorDashTablesLibStrings.data | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.edit, 
    /* cell */ js.UndefOr[CellComponent], 
    js.Any
  ])
  /* Rewritten from type alias, can be one of: 
    - tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true`
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.input
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.textarea
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.number
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.range
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.tickCross
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.star
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.select
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.autocomplete
    - js.Function5[
  / * cell * / CellComponent, 
  / * onRendered * / EmptyCallback, 
  / * success * / ValueVoidCallback, 
  / * cancel * / ValueVoidCallback, 
  / * editorParams * / js.Object, 
  stdLib.HTMLElement | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false`]
  */
  type Editor = _Editor | (js.Function5[
    /* cell */ CellComponent, 
    /* onRendered */ EmptyCallback, 
    /* success */ ValueVoidCallback, 
    /* cancel */ ValueVoidCallback, 
    /* editorParams */ js.Object, 
    stdLib.HTMLElement | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false`
  ])
  /* Rewritten from type alias, can be one of: 
    - NumberParams
    - CheckboxParams
    - SelectParams
    - AutoCompleteParams
    - InputParams
    - js.Function1[/ * cell * / CellComponent, js.Object]
  */
  type EditorParams = _EditorParams | (js.Function1[/* cell */ CellComponent, js.Object])
  type EmptyCallback = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
  type FilterFunction = js.Function3[/* field */ java.lang.String, /* type */ FilterType, /* value */ js.Any, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.plaintext
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.textarea
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.html
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.money
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.image
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.datetime
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.datetimediff
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.link
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.tickCross
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.color
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.star
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.traffic
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.progress
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.lookup
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.buttonTick
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.buttonCross
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.rownum
    - tabulatorDashTablesLib.tabulatorDashTablesLibStrings.handle
    - js.Function3[
  / * cell * / CellComponent, 
  / * formatterParams * / js.Object, 
  / * onRendered * / EmptyCallback, 
  java.lang.String | stdLib.HTMLElement]
  */
  type Formatter = _Formatter | (js.Function3[
    /* cell */ CellComponent, 
    /* formatterParams */ js.Object, 
    /* onRendered */ EmptyCallback, 
    java.lang.String | stdLib.HTMLElement
  ])
  /* Rewritten from type alias, can be one of: 
    - MoneyParams
    - ImageParams
    - LinkParams
    - DateTimeParams
    - DateTimeDifferenceParams
    - TickCrossParams
    - TrafficParams
    - StarRatingParams
    - JSONRecord
    - js.Function1[/ * cell * / CellComponent, js.Object]
  */
  type FormatterParams = _FormatterParams | (js.Function1[/* cell */ CellComponent, js.Object]) | JSONRecord
  type GlobalTooltipOption = scala.Boolean | (js.Function1[/* cell */ CellComponent, java.lang.String])
  type GroupEventCallback = js.Function2[/* e */ js.Any, /* group */ GroupComponent, scala.Unit]
  type JSONRecord = stdLib.Record[java.lang.String, java.lang.String | scala.Double | scala.Boolean]
  type RowChangedCallback = js.Function1[/* row */ RowComponent, scala.Unit]
  type RowEventCallback = js.Function2[/* e */ js.Any, /* row */ RowComponent, scala.Unit]
  type RowLookup = RowComponent | stdLib.HTMLElement | java.lang.String | scala.Double
  type StandardStringParam = java.lang.String | stdLib.HTMLElement | (js.Function0[java.lang.String | stdLib.HTMLElement])
  type ValueBooleanCallback = js.Function1[/* value */ js.Any, scala.Boolean]
  type ValueStringCallback = js.Function1[/* value */ js.Any, java.lang.String]
  type ValueVoidCallback = js.Function1[/* value */ js.Any, scala.Unit]
}
