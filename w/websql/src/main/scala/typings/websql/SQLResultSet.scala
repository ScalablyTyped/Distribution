package typings.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 4.5 Database query results
  * The insertId attribute must return the row ID of the row that the SQLResultSet
  * object's SQL statement inserted into the database, if the statement inserted a row.
  * If the statement inserted multiple rows, the ID of the last row must be the one returned.
  * If the statement did not insert a row, then the attribute must instead raise an INVALID_ACCESS_ERR exception.
  *
  * The rowsAffected attribute must return the number of rows that were changed by the SQL statement.
  * If the statement did not affected any rows, then the attribute must return zero.
  * For "SELECT" statements, this returns zero (querying the database doesn't affect any rows).
  *
  * The rows attribute must return a SQLResultSetRowList representing the rows returned,
  * in the order returned by the database. The same object must be returned each time.
  * If no rows were returned, then the object will be empty (its length will be zero)
  */
@js.native
trait SQLResultSet extends js.Object {
  var insertId: Double = js.native
  var rows: SQLResultSetRowList = js.native
  var rowsAffected: Double = js.native
}

object SQLResultSet {
  @scala.inline
  def apply(insertId: Double, rows: SQLResultSetRowList, rowsAffected: Double): SQLResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLResultSet]
  }
  @scala.inline
  implicit class SQLResultSetOps[Self <: SQLResultSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInsertId(value: Double): Self = this.set("insertId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: SQLResultSetRowList): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsAffected(value: Double): Self = this.set("rowsAffected", value.asInstanceOf[js.Any])
  }
  
}

