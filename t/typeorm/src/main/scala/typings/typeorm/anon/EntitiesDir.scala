package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitiesDir extends js.Object {
  
  /**
    * Directory where entities should be created by default.
    */
  val entitiesDir: js.UndefOr[String] = js.native
  
  /**
    * Directory where migrations should be created by default.
    */
  val migrationsDir: js.UndefOr[String] = js.native
  
  /**
    * Directory where subscribers should be created by default.
    */
  val subscribersDir: js.UndefOr[String] = js.native
}
object EntitiesDir {
  
  @scala.inline
  def apply(): EntitiesDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitiesDir]
  }
  
  @scala.inline
  implicit class EntitiesDirOps[Self <: EntitiesDir] (val x: Self) extends AnyVal {
    
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
    def setEntitiesDir(value: String): Self = this.set("entitiesDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntitiesDir: Self = this.set("entitiesDir", js.undefined)
    
    @scala.inline
    def setMigrationsDir(value: String): Self = this.set("migrationsDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationsDir: Self = this.set("migrationsDir", js.undefined)
    
    @scala.inline
    def setSubscribersDir(value: String): Self = this.set("subscribersDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribersDir: Self = this.set("subscribersDir", js.undefined)
  }
}
