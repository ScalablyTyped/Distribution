package typings
package titaniumLib.TitaniumNs.DatabaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The ResultSet instance returned by <Titanium.Database.DB.execute>.
		 */
@js.native
trait ResultSet
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The number of columns in this result set.
  			 */
  val fieldCount: scala.Double = js.native
  /**
  			 * The number of rows in this result set.
  			 */
  val rowCount: scala.Double = js.native
  /**
  			 * Indicates whether the current row is valid.
  			 */
  val validRow: scala.Boolean = js.native
  /**
  			 * Closes this result set and release resources. Once closed, the result set must no longer
  			 * be used.
  			 */
  def close(): scala.Unit = js.native
  /**
  			 * Retrieves the value for the specified field in the current row,
  			 * and casts it to the specified type (String, Integer, Float or Double.)
  			 */
  def field(index: scala.Double): java.lang.String | scala.Double | titaniumLib.TitaniumNs.Blob = js.native
  def field(index: scala.Double, `type`: scala.Double): java.lang.String | scala.Double | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Retrieves the value for the specified field in the current row,
  			 * and casts it to the specified type (String, Integer, Float or Double.)
  			 */
  def fieldByName(name: java.lang.String): java.lang.String | scala.Double | titaniumLib.TitaniumNs.Blob = js.native
  def fieldByName(name: java.lang.String, `type`: scala.Double): java.lang.String | scala.Double | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Returns the field name for the specified field index.
  			 */
  def fieldName(index: scala.Double): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Database.ResultSet.fieldCount> property.
  			 */
  def getFieldCount(): scala.Double = js.native
  /**
  			 * Returns the field name for the specified field index.
  			 */
  def getFieldName(index: scala.Double): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Database.ResultSet.rowCount> property.
  			 */
  def getRowCount(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Database.ResultSet.validRow> property.
  			 */
  def getValidRow(): scala.Boolean = js.native
  /**
  			 * Returns whether the current row is valid.
  			 */
  def isValidRow(): scala.Boolean = js.native
  /**
  			 * Advances to the next row in the result set and returns `true` if one exists,
  			 * or `false` otherwise.
  			 */
  def next(): scala.Boolean = js.native
}

