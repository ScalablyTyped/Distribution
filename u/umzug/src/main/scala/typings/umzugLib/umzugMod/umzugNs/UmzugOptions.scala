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

