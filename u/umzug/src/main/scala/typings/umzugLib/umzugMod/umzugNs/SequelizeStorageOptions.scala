package typings
package umzugLib.umzugMod.umzugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequelizeStorageOptions extends Storage {
  /**
    * The name of table column holding migration name.
    * Defaults to 'name'.
    */
  var columnName: java.lang.String
  /**
    * The type of the column holding migration name.
    * Defaults to `Sequelize.STRING`
    */
  var columnType: sequelizeLib.sequelizeMod.sequelizeNs.DataTypeAbstract
  /**
    * The to be used Sequelize model.
    * Must have column name matching `columnName` option
    * Optional of `sequelize` is passed.
    */
  var model: js.UndefOr[sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _]] = js.undefined
  /**
    * The name of the to be used model.
    * Defaults to 'SequelizeMeta'
    */
  var modelName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The configured instance of Sequelize.
    * Optional if `model` is passed.
    */
  var sequelize: js.UndefOr[sequelizeLib.sequelizeMod.sequelizeNs.Sequelize] = js.undefined
  /**
    * The name of table to create if `model` option is not supplied
    * Defaults to `modelName`
    */
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object SequelizeStorageOptions {
  @scala.inline
  def apply(
    columnName: java.lang.String,
    columnType: sequelizeLib.sequelizeMod.sequelizeNs.DataTypeAbstract,
    executed: js.Function0[js.Promise[js.Array[nodeLib.String]]],
    logMigration: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    unlogMigration: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    model: sequelizeLib.sequelizeMod.sequelizeNs.Model[_, _] = null,
    modelName: java.lang.String = null,
    sequelize: sequelizeLib.sequelizeMod.sequelizeNs.Sequelize = null,
    tableName: java.lang.String = null
  ): SequelizeStorageOptions = {
    val __obj = js.Dynamic.literal(columnName = columnName, columnType = columnType, executed = executed, logMigration = logMigration, unlogMigration = unlogMigration)
    if (model != null) __obj.updateDynamic("model")(model)
    if (modelName != null) __obj.updateDynamic("modelName")(modelName)
    if (sequelize != null) __obj.updateDynamic("sequelize")(sequelize)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[SequelizeStorageOptions]
  }
}

