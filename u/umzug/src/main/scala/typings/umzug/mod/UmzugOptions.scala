package typings.umzug.mod

import typings.umzug.umzugStrings.json
import typings.umzug.umzugStrings.mongodb
import typings.umzug.umzugStrings.sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UmzugOptions extends js.Object {
  
  /**
    * The name of the negative method in migrations.
    */
  var downName: js.UndefOr[String] = js.native
  
  /**
    * The logging function.
    * A function that gets executed everytime migrations start and have ended.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * Options for defined migration
    */
  var migrations: js.UndefOr[MigrationOptions | js.Array[Migration]] = js.native
  
  /**
    * The storage.
    */
  var storage: js.UndefOr[json | sequelize | mongodb | Storage] = js.native
  
  /**
    * The options for the storage.
    */
  var storageOptions: js.UndefOr[JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object] = js.native
  
  /**
    * The name of the positive method in migrations.
    */
  var upName: js.UndefOr[String] = js.native
}
object UmzugOptions {
  
  @scala.inline
  def apply(): UmzugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UmzugOptions]
  }
  
  @scala.inline
  implicit class UmzugOptionsOps[Self <: UmzugOptions] (val x: Self) extends AnyVal {
    
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
    def setDownName(value: String): Self = this.set("downName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownName: Self = this.set("downName", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMigrationsVarargs(value: Migration*): Self = this.set("migrations", js.Array(value :_*))
    
    @scala.inline
    def setMigrations(value: MigrationOptions | js.Array[Migration]): Self = this.set("migrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrations: Self = this.set("migrations", js.undefined)
    
    @scala.inline
    def setStorage(value: json | sequelize | mongodb | Storage): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    
    @scala.inline
    def setStorageOptions(value: JSONStorageOptions | SequelizeStorageOptions | MongoDBStorageOptions | js.Object): Self = this.set("storageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageOptions: Self = this.set("storageOptions", js.undefined)
    
    @scala.inline
    def setUpName(value: String): Self = this.set("upName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpName: Self = this.set("upName", js.undefined)
  }
}
