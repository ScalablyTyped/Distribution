package typings.umzug.umzugMod

import typings.sequelize.sequelizeMod.DataTypeAbstract
import typings.sequelize.sequelizeMod.Model
import typings.sequelize.sequelizeMod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequelizeStorageOptions extends Storage {
  /**
    * The name of table column holding migration name.
    * Defaults to 'name'.
    */
  var columnName: String
  /**
    * The type of the column holding migration name.
    * Defaults to `Sequelize.STRING`
    */
  var columnType: DataTypeAbstract
  /**
    * The to be used Sequelize model.
    * Must have column name matching `columnName` option
    * Optional of `sequelize` is passed.
    */
  var model: js.UndefOr[Model[_, _, _]] = js.undefined
  /**
    * The name of the to be used model.
    * Defaults to 'SequelizeMeta'
    */
  var modelName: js.UndefOr[String] = js.undefined
  /**
    * The configured instance of Sequelize.
    * Optional if `model` is passed.
    */
  var sequelize: js.UndefOr[Sequelize] = js.undefined
  /**
    * The name of table to create if `model` option is not supplied
    * Defaults to `modelName`
    */
  var tableName: js.UndefOr[String] = js.undefined
}

object SequelizeStorageOptions {
  @scala.inline
  def apply(
    columnName: String,
    columnType: DataTypeAbstract,
    executed: () => js.Promise[js.Array[String]],
    logMigration: String => js.Promise[Unit],
    unlogMigration: String => js.Promise[Unit],
    model: Model[_, _, _] = null,
    modelName: String = null,
    sequelize: Sequelize = null,
    tableName: String = null
  ): SequelizeStorageOptions = {
    val __obj = js.Dynamic.literal(columnName = columnName.asInstanceOf[js.Any], columnType = columnType.asInstanceOf[js.Any], executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (sequelize != null) __obj.updateDynamic("sequelize")(sequelize.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequelizeStorageOptions]
  }
}

