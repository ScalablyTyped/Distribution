package typings
package umzugLib.umzugMod.umzugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UmzugOptions extends js.Object {
  /**
    * The name of the negative method in migrations.
    */
  var downName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The logging function.
    * A function that gets executed everytime migrations start and have ended.
    */
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  /**
    * Options for defined migration
    */
  var migrations: js.UndefOr[MigrationOptions] = js.undefined
  /**
    * The storage.
    */
  var storage: js.UndefOr[
    umzugLib.umzugLibStrings.json | umzugLib.umzugLibStrings.sequelize | umzugLib.umzugLibStrings.mongodb | Storage
  ] = js.undefined
  /**
    * The options for the storage.
    */
  var storageOptions: js.UndefOr[JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object] = js.undefined
  /**
    * The name of the positive method in migrations.
    */
  var upName: js.UndefOr[java.lang.String] = js.undefined
}

object UmzugOptions {
  @scala.inline
  def apply(
    downName: java.lang.String = null,
    logging: scala.Boolean | js.Function = null,
    migrations: MigrationOptions = null,
    storage: umzugLib.umzugLibStrings.json | umzugLib.umzugLibStrings.sequelize | umzugLib.umzugLibStrings.mongodb | Storage = null,
    storageOptions: JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object = null,
    upName: java.lang.String = null
  ): UmzugOptions = {
    val __obj = js.Dynamic.literal()
    if (downName != null) __obj.updateDynamic("downName")(downName)
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (migrations != null) __obj.updateDynamic("migrations")(migrations)
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (storageOptions != null) __obj.updateDynamic("storageOptions")(storageOptions.asInstanceOf[js.Any])
    if (upName != null) __obj.updateDynamic("upName")(upName)
    __obj.asInstanceOf[UmzugOptions]
  }
}

