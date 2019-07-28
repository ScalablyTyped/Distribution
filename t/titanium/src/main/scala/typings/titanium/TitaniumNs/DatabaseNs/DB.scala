package typings.titanium.TitaniumNs.DatabaseNs

import typings.titanium.TitaniumNs.FilesystemNs.File
import typings.titanium.TitaniumNs.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The `Database` instance returned by <Titanium.Database.open> or <Titanium.Database.install>.
		 */
@js.native
trait DB extends Proxy {
  /**
  			 * A `File` object representing the file where this database is stored. Must only be used for
  			 * setting file properties.
  			 */
  val file: File = js.native
  /**
  			 * The identifier of the last populated row.
  			 */
  var lastInsertRowId: Double = js.native
  /**
  			 * The name of the database.
  			 */
  var name: String = js.native
  /**
  			 * The number of rows affected by the last query.
  			 */
  var rowsAffected: Double = js.native
  /**
  			 * Closes the database and releases resources from memory. Once closed, this instance is no
  			 * longer valid and should not be used. On iOS, also closes all <Titanium.Database.ResultSet>
  			 * instances that exist.
  			 */
  def close(): Unit = js.native
  /**
  			 * Executes an SQL statement against the database and returns a `ResultSet`.
  			 */
  def execute(sql: String): ResultSet = js.native
  def execute(sql: String, vararg: String): ResultSet = js.native
  def execute(sql: String, vararg: js.Any): ResultSet = js.native
  def execute(sql: String, vararg: js.Array[_ | String]): ResultSet = js.native
  /**
  			 * Gets the value of the <Titanium.Database.DB.file> property.
  			 */
  def getFile(): File = js.native
  /**
  			 * Gets the value of the <Titanium.Database.DB.lastInsertRowId> property.
  			 */
  def getLastInsertRowId(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Database.DB.name> property.
  			 */
  def getName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Database.DB.rowsAffected> property.
  			 */
  def getRowsAffected(): Double = js.native
  /**
  			 * Removes the database files for this instance from disk. WARNING: this is a destructive
  			 * operation and cannot be reversed. All data in the database will be lost; use with caution.
  			 */
  def remove(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Database.DB.lastInsertRowId> property.
  			 */
  def setLastInsertRowId(lastInsertRowId: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Database.DB.name> property.
  			 */
  def setName(name: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Database.DB.rowsAffected> property.
  			 */
  def setRowsAffected(rowsAffected: Double): Unit = js.native
}

