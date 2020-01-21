package typings.umzug.mod

import typings.umzug.umzugStrings.json
import typings.umzug.umzugStrings.mongodb
import typings.umzug.umzugStrings.sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UmzugOptions extends js.Object {
  /**
    * The name of the negative method in migrations.
    */
  var downName: js.UndefOr[String] = js.undefined
  /**
    * The logging function.
    * A function that gets executed everytime migrations start and have ended.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  /**
    * Options for defined migration
    */
  var migrations: js.UndefOr[MigrationOptions] = js.undefined
  /**
    * The storage.
    */
  var storage: js.UndefOr[json | sequelize | mongodb | Storage] = js.undefined
  /**
    * The options for the storage.
    */
  var storageOptions: js.UndefOr[JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object] = js.undefined
  /**
    * The name of the positive method in migrations.
    */
  var upName: js.UndefOr[String] = js.undefined
}

object UmzugOptions {
  @scala.inline
  def apply(
    downName: String = null,
    logging: Boolean | js.Function = null,
    migrations: MigrationOptions = null,
    storage: json | sequelize | mongodb | Storage = null,
    storageOptions: JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object = null,
    upName: String = null
  ): UmzugOptions = {
    val __obj = js.Dynamic.literal()
    if (downName != null) __obj.updateDynamic("downName")(downName.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (migrations != null) __obj.updateDynamic("migrations")(migrations.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (storageOptions != null) __obj.updateDynamic("storageOptions")(storageOptions.asInstanceOf[js.Any])
    if (upName != null) __obj.updateDynamic("upName")(upName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UmzugOptions]
  }
}

