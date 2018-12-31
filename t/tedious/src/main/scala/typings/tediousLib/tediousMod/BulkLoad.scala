package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkLoad extends js.Object {
  /**
    * Adds a column to the bulk load. The column definitions should match the table you are trying to insert into. Attempting to call addColumn after the first row has been added will throw an exception.
    * @param name	The name of the column.
    * @param type	One of the supported data types.
    * @param options	Additional column type information. At a minimum, nullable must be set to true or false.
    */
  def addColumn(name: java.lang.String, `type`: TediousType, options: BulkLoadColumnOpts): scala.Unit = js.native
  /**
    * Adds a row to the bulk insert. This method accepts arguments in three different formats:
    * @param args If there are at least two columns, values can be passed as multiple arguments instead of an array. They must be in the same order the columns were added in.
    */
  def addRow(args: js.Any*): scala.Unit = js.native
  /**
    * Adds a row to the bulk insert. This method accepts arguments in three different formats:
    * @param columnArray	An array representing the values of each column in the same order which they were added to the bulkLoad object.
    */
  def addRow(columnArray: js.Array[_]): scala.Unit = js.native
  /**
    * Adds a row to the bulk insert. This method accepts arguments in three different formats:
    * @param rowObj An object of key/value pairs representing column name (or objName) and value.
    */
  def addRow(row: js.Object): scala.Unit = js.native
  /**
    * This is simply a helper utility function which returns a CREATE TABLE SQL statement based on the columns added to the bulkLoad object. This may be particularly handy when you want to insert into a temporary table (a table which starts with #). A side note on bulk inserting into temporary tables: if you want to access a local temporary table after executing the bulk load, you'll need to use the same connection and execute your requests using connection.execSqlBatch instead of .execSql.
    */
  def getTableCreationSql(): java.lang.String = js.native
}

