package typings.typeorm.expoExpoConnectionOptionsMod

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.expo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpoConnectionOptions
  extends BaseConnectionOptions
     with ConnectionOptions {
  
  /**
    * Database name.
    */
  val database: String = js.native
  
  /**
    * Driver module
    */
  val driver: js.Any = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_ExpoConnectionOptions: expo = js.native
}
object ExpoConnectionOptions {
  
  @scala.inline
  def apply(database: String, driver: js.Any, `type`: expo): ExpoConnectionOptions = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpoConnectionOptions]
  }
  
  @scala.inline
  implicit class ExpoConnectionOptionsOps[Self <: ExpoConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: js.Any): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: expo): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
