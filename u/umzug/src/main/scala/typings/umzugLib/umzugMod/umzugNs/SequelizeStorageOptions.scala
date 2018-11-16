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

