package typings
package titaniumLib.TitaniumNs.DatabaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The `Database` instance returned by <Titanium.Database.open> or <Titanium.Database.install>.
		 */
@js.native
trait DB
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * A `File` object representing the file where this database is stored. Must only be used for
  			 * setting file properties.
  			 */
  val file: titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * The identifier of the last populated row.
  			 */
  var lastInsertRowId: scala.Double = js.native
  /**
  			 * The name of the database.
  			 */
  var name: java.lang.String = js.native
  /**
  			 * The number of rows affected by the last query.
  			 */
  var rowsAffected: scala.Double = js.native
  /**
  			 * Closes the database and releases resources from memory. Once closed, this instance is no
  			 * longer valid and should not be used. On iOS, also closes all <Titanium.Database.ResultSet>
  			 * instances that exist.
  			 */
  def close(): scala.Unit = js.native
  /**
  			 * Executes an SQL statement against the database and returns a `ResultSet`.
  			 */
  def execute(sql: java.lang.String): ResultSet = js.native
  /**
  			 * Executes an SQL statement against the database and returns a `ResultSet`.
  			 */
  def execute(sql: java.lang.String, vararg: java.lang.String): ResultSet = js.native
  /**
  			 * Executes an SQL statement against the database and returns a `ResultSet`.
  			 */
  def execute(sql: java.lang.String, vararg: js.Any): ResultSet = js.native
  /**
  			 * Executes an SQL statement against the database and returns a `ResultSet`.
  			 */
  def execute(sql: java.lang.String, vararg: js.Array[_ | java.lang.String]): ResultSet = js.native
  /**
  			 * Gets the value of the <Titanium.Database.DB.file> property.
  			 */
  def getFile(): titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Gets the value of the <Titanium.Database.DB.lastInsertRowId> property.
  			 */
  def getLastInsertRowId(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Database.DB.name> property.
  			 */
  def getName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Database.DB.rowsAffected> property.
  			 */
  def getRowsAffected(): scala.Double = js.native
  /**
  			 * Removes the database files for this instance from disk. WARNING: this is a destructive
  			 * operation and cannot be reversed. All data in the database will be lost; use with caution.
  			 */
  def remove(): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Database.DB.lastInsertRowId> property.
  			 */
  def setLastInsertRowId(lastInsertRowId: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Database.DB.name> property.
  			 */
  def setName(name: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Database.DB.rowsAffected> property.
  			 */
  def setRowsAffected(rowsAffected: scala.Double): scala.Unit = js.native
}

