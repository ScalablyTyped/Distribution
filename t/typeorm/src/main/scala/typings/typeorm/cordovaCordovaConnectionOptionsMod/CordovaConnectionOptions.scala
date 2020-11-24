package typings.typeorm.cordovaCordovaConnectionOptionsMod

import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.cordova
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaConnectionOptions
  extends BaseConnectionOptions
     with ConnectionOptions {
  
  /**
    * Database name.
    */
  val database: String = js.native
  
  /**
    * Storage Location
    */
  val location: String = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_CordovaConnectionOptions: cordova = js.native
}
object CordovaConnectionOptions {
  
  @scala.inline
  def apply(database: String, location: String, `type`: cordova): CordovaConnectionOptions = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaConnectionOptions]
  }
  
  @scala.inline
  implicit class CordovaConnectionOptionsOps[Self <: CordovaConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: cordova): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
