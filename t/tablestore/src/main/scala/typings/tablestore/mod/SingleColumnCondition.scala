package typings.tablestore.mod

import typings.tablestore.anon.EQUAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablestore", "SingleColumnCondition")
@js.native
open class SingleColumnCondition protected () extends ColumnCondition {
  def this(columnName: String, columnValue: CellValue, comparator: EnumValues[EQUAL]) = this()
  def this(columnName: String, columnValue: CellValue, comparator: EnumValues[EQUAL], passIfMissing: Boolean) = this()
  def this(
    columnName: String,
    columnValue: CellValue,
    comparator: EnumValues[EQUAL],
    passIfMissing: Boolean,
    latestVersionOnly: Boolean
  ) = this()
  def this(
    columnName: String,
    columnValue: CellValue,
    comparator: EnumValues[EQUAL],
    passIfMissing: Unit,
    latestVersionOnly: Boolean
  ) = this()
  
  var columnName: String = js.native
  
  var columnValue: CellValue = js.native
  
  var comparator: EnumValues[EQUAL] = js.native
  
  var latestVersionOnly: js.UndefOr[Boolean] = js.native
  
  var passIfMissing: js.UndefOr[Boolean] = js.native
}
