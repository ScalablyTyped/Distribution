package typings.umzug.mod

import typings.sequelize.mod.DataTypeAbstract
import typings.sequelize.mod.Model
import typings.sequelize.mod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequelizeStorageOptions extends Storage {
  
  /**
    * The name of table column holding migration name.
    * Defaults to 'name'.
    */
  var columnName: String = js.native
  
  /**
    * The type of the column holding migration name.
    * Defaults to `Sequelize.STRING`
    */
  var columnType: DataTypeAbstract = js.native
  
  /**
    * The to be used Sequelize model.
    * Must have column name matching `columnName` option
    * Optional of `sequelize` is passed.
    */
  var model: js.UndefOr[Model[_, _, _]] = js.native
  
  /**
    * The name of the to be used model.
    * Defaults to 'SequelizeMeta'
    */
  var modelName: js.UndefOr[String] = js.native
  
  /**
    * The configured instance of Sequelize.
    * Optional if `model` is passed.
    */
  var sequelize: js.UndefOr[Sequelize] = js.native
  
  /**
    * The name of table to create if `model` option is not supplied
    * Defaults to `modelName`
    */
  var tableName: js.UndefOr[String] = js.native
}
object SequelizeStorageOptions {
  
  @scala.inline
  def apply(
    columnName: String,
    columnType: DataTypeAbstract,
    executed: () => js.Promise[js.Array[String]],
    logMigration: String => js.Promise[Unit],
    unlogMigration: String => js.Promise[Unit]
  ): SequelizeStorageOptions = {
    val __obj = js.Dynamic.literal(columnName = columnName.asInstanceOf[js.Any], columnType = columnType.asInstanceOf[js.Any], executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
    __obj.asInstanceOf[SequelizeStorageOptions]
  }
  
  @scala.inline
  implicit class SequelizeStorageOptionsOps[Self <: SequelizeStorageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnType(value: DataTypeAbstract): Self = this.set("columnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: Model[_, _, _]): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelName: Self = this.set("modelName", js.undefined)
    
    @scala.inline
    def setSequelize(value: Sequelize): Self = this.set("sequelize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequelize: Self = this.set("sequelize", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
  }
}
