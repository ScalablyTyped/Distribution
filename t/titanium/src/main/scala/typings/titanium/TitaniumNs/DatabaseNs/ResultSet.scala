package typings.titanium.TitaniumNs.DatabaseNs

import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The ResultSet instance returned by <Titanium.Database.DB.execute>.
		 */
@js.native
trait ResultSet extends Proxy {
  /**
  			 * The number of columns in this result set.
  			 */
  val fieldCount: Double = js.native
  /**
  			 * The number of rows in this result set.
  			 */
  val rowCount: Double = js.native
  /**
  			 * Indicates whether the current row is valid.
  			 */
  val validRow: Boolean = js.native
  /**
  			 * Closes this result set and release resources. Once closed, the result set must no longer
  			 * be used.
  			 */
  def close(): Unit = js.native
  /**
  			 * Retrieves the value for the specified field in the current row,
  			 * and casts it to the specified type (String, Integer, Float or Double.)
  			 */
  def field(index: Double): String | Double | Blob = js.native
  def field(index: Double, `type`: Double): String | Double | Blob = js.native
  /**
  			 * Retrieves the value for the specified field in the current row,
  			 * and casts it to the specified type (String, Integer, Float or Double.)
  			 */
  def fieldByName(name: String): String | Double | Blob = js.native
  def fieldByName(name: String, `type`: Double): String | Double | Blob = js.native
  /**
  			 * Returns the field name for the specified field index.
  			 */
  def fieldName(index: Double): String = js.native
  /**
  			 * Gets the value of the <Titanium.Database.ResultSet.fieldCount> property.
  			 */
  def getFieldCount(): Double = js.native
  /**
  			 * Returns the field name for the specified field index.
  			 */
  def getFieldName(index: Double): String = js.native
  /**
  			 * Gets the value of the <Titanium.Database.ResultSet.rowCount> property.
  			 */
  def getRowCount(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Database.ResultSet.validRow> property.
  			 */
  def getValidRow(): Boolean = js.native
  /**
  			 * Returns whether the current row is valid.
  			 */
  def isValidRow(): Boolean = js.native
  /**
  			 * Advances to the next row in the result set and returns `true` if one exists,
  			 * or `false` otherwise.
  			 */
  def next(): Boolean = js.native
}

