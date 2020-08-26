package typings.ydnDb.global.ydn.db

import typings.ydnDb.DatabaseSchemaJson
import typings.ydnDb.StorageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.Storage")
@js.native
class Storage ()
  extends typings.ydnDb.ydn.db.Storage {
  def this(db_name: String) = this()
  def this(db_name: js.UndefOr[scala.Nothing], schema: DatabaseSchemaJson) = this()
  def this(db_name: String, schema: DatabaseSchemaJson) = this()
  def this(db_name: js.UndefOr[scala.Nothing], schema: js.UndefOr[scala.Nothing], options: StorageOptions) = this()
  def this(db_name: js.UndefOr[scala.Nothing], schema: DatabaseSchemaJson, options: StorageOptions) = this()
  def this(db_name: String, schema: js.UndefOr[scala.Nothing], options: StorageOptions) = this()
  def this(db_name: String, schema: DatabaseSchemaJson, options: StorageOptions) = this()
}

