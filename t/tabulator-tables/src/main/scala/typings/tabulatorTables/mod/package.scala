package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Record
import typings.std.UIEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.clipboard
import typings.tabulatorTables.tabulatorTablesStrings.data
import typings.tabulatorTables.tabulatorTablesStrings.download
import typings.tabulatorTables.tabulatorTablesStrings.edit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CellEditEventCallback = js.Function1[/* cell */ CellComponent, Unit]

type CellEventCallback = js.Function2[/* e */ UIEvent, /* cell */ CellComponent, Unit]

type Color = String | js.Array[Any] | ValueStringCallback

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorTables.tabulatorTablesStrings.avg
  - typings.tabulatorTables.tabulatorTablesStrings.max
  - typings.tabulatorTables.tabulatorTablesStrings.min
  - typings.tabulatorTables.tabulatorTablesStrings.sum
  - typings.tabulatorTables.tabulatorTablesStrings.concat
  - typings.tabulatorTables.tabulatorTablesStrings.count
  - js.Function3[
/ * values * / js.Array[scala.Any], 
/ * data * / js.Array[scala.Any], 
/ * calcParams * / js.Object, 
scala.Any]
*/
type ColumnCalc = _ColumnCalc | (js.Function3[/* values */ js.Array[Any], /* data */ js.Array[Any], /* calcParams */ js.Object, Any])

type ColumnCalcParams = js.Function2[/* values */ Any, /* data */ Any, Any]

type ColumnEventCallback = js.Function2[/* e */ UIEvent, /* column */ ColumnComponent, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorTables.mod.ColumnComponent
  - typings.tabulatorTables.mod.ColumnDefinition
  - typings.std.HTMLElement
  - java.lang.String
*/
type ColumnLookup = _ColumnLookup | HTMLElement | String

type ColumnSorterParamLookupFunction = js.Function2[/* column */ ColumnComponent, /* dir */ SortDirection, js.Object]

type CustomAccessor = js.Function6[
/* value */ Any, 
/* data */ Any, 
/* type */ data | download | clipboard, 
/* AccessorParams */ Any, 
/* column */ js.UndefOr[ColumnComponent], 
/* row */ js.UndefOr[RowComponent], 
Any]

type CustomAccessorParams = js.Object | (js.Function5[
/* value */ Any, 
/* data */ Any, 
/* type */ data | download | clipboard, 
/* column */ js.UndefOr[ColumnComponent], 
/* row */ js.UndefOr[RowComponent], 
Any])

type CustomMutator = js.Function5[
/* value */ Any, 
/* data */ Any, 
/* type */ data | edit, 
/* mutatorParams */ Any, 
/* cell */ js.UndefOr[CellComponent], 
Any]

type CustomMutatorParams = js.Object | (js.Function4[
/* value */ Any, 
/* data */ Any, 
/* type */ data | edit, 
/* cell */ js.UndefOr[CellComponent], 
Any])

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorTables.tabulatorTablesBooleans.`true`
  - typings.tabulatorTables.tabulatorTablesStrings.input
  - typings.tabulatorTables.tabulatorTablesStrings.textarea
  - typings.tabulatorTables.tabulatorTablesStrings.number
  - typings.tabulatorTables.tabulatorTablesStrings.range
  - typings.tabulatorTables.tabulatorTablesStrings.tickCross
  - typings.tabulatorTables.tabulatorTablesStrings.star
  - typings.tabulatorTables.tabulatorTablesStrings.list
  - typings.tabulatorTables.tabulatorTablesStrings.date
  - typings.tabulatorTables.tabulatorTablesStrings.time
  - typings.tabulatorTables.tabulatorTablesStrings.datetime
  - js.Function5[
/ * cell * / typings.tabulatorTables.mod.CellComponent, 
/ * onRendered * / typings.tabulatorTables.mod.EmptyCallback, 
/ * success * / typings.tabulatorTables.mod.ValueBooleanCallback, 
/ * cancel * / typings.tabulatorTables.mod.ValueVoidCallback, 
/ * editorParams * / js.Object, 
typings.std.HTMLElement | typings.tabulatorTables.tabulatorTablesBooleans.`false`]
*/
type Editor = _Editor | (js.Function5[
/* cell */ CellComponent, 
/* onRendered */ EmptyCallback, 
/* success */ ValueBooleanCallback, 
/* cancel */ ValueVoidCallback, 
/* editorParams */ js.Object, 
HTMLElement | `false`])

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorTables.mod.NumberParams
  - typings.tabulatorTables.mod.CheckboxParams
  - typings.tabulatorTables.mod.ListEditorParams
  - typings.tabulatorTables.mod.InputParams
  - typings.tabulatorTables.mod.TextAreaParams
  - typings.tabulatorTables.mod.DateParams
  - typings.tabulatorTables.mod.TimeParams
  - typings.tabulatorTables.mod.DateTimeEditorParams
  - js.Function1[/ * cell * / typings.tabulatorTables.mod.CellComponent, js.Object]
*/
type EditorParams = _EditorParams | (js.Function1[/* cell */ CellComponent, js.Object])

type EmptyCallback = js.Function1[/* callback */ js.Function0[Unit], Unit]

type FilterFunction = js.Function4[
/* field */ String, 
/* type */ FilterType, 
/* value */ Any, 
/* filterParams */ js.UndefOr[FilterParams], 
Unit]

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
/ * cell * / typings.tabulatorTables.mod.CellComponent, 
/ * formatterParams * / js.Object, 
/ * onRendered * / typings.tabulatorTables.mod.EmptyCallback, 
java.lang.String | typings.std.HTMLElement]
*/
type Formatter = _Formatter | (js.Function3[
/* cell */ CellComponent, 
/* formatterParams */ js.Object, 
/* onRendered */ EmptyCallback, 
String | HTMLElement])

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorTables.mod.MoneyParams
  - typings.tabulatorTables.mod.ImageParams
  - typings.tabulatorTables.mod.LinkParams
  - typings.tabulatorTables.mod.DateTimeParams
  - typings.tabulatorTables.mod.DateTimeDifferenceParams
  - typings.tabulatorTables.mod.TickCrossParams
  - typings.tabulatorTables.mod.TrafficParams
  - typings.tabulatorTables.mod.ProgressBarParams
  - typings.tabulatorTables.mod.StarRatingParams
  - typings.tabulatorTables.mod.RowSelectionParams
  - typings.tabulatorTables.mod.JSONRecord
  - js.Function1[/ * cell * / typings.tabulatorTables.mod.CellComponent, js.Object]
*/
type FormatterParams = _FormatterParams | (js.Function1[/* cell */ CellComponent, js.Object]) | JSONRecord

type GlobalTooltipOption = Boolean | (js.Function3[
/* event */ MouseEvent, 
/* cell */ CellComponent, 
/* onRender */ js.Function0[Unit], 
String])

type GroupArg = String | js.Array[String] | (js.Function1[/* data */ Any, Any])

type GroupContextMenuSignature = (js.Array[MenuObject[GroupComponent] | MenuSeparator]) | (js.Function2[
/* component */ GroupComponent, 
/* e */ MouseEvent, 
MenuObject[GroupComponent] | `false` | js.Array[Any]])

type GroupEventCallback = js.Function2[/* e */ UIEvent, /* group */ GroupComponent, Unit]

type GroupValuesArg = js.Array[js.Array[Any]]

type JSONRecord = Record[String, String | Double | Boolean]

type RowChangedCallback = js.Function1[/* row */ RowComponent, Unit]

type RowContextMenuSignature = (js.Array[MenuObject[RowComponent] | MenuSeparator]) | (js.Function2[
/* e */ MouseEvent, 
/* component */ RowComponent, 
MenuObject[RowComponent] | `false` | js.Array[Any]])

type RowEventCallback = js.Function2[/* e */ UIEvent, /* row */ RowComponent, Unit]

type RowLookup = RowComponent | HTMLElement | String | Double | (js.Array[Double | String])

type StandardStringParam = String | HTMLElement | (js.Function0[String | HTMLElement])

type ValueBooleanCallback = js.Function1[/* value */ Any, Boolean]

type ValueStringCallback = js.Function1[/* value */ Any, String]

type ValueVoidCallback = js.Function1[/* value */ Any, Unit]
