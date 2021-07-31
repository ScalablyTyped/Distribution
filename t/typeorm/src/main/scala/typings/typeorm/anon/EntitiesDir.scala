package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitiesDir extends StObject {
  
  /**
    * Directory where entities should be created by default.
    */
  val entitiesDir: js.UndefOr[String] = js.undefined
  
  /**
    * Directory where migrations should be created by default.
    */
  val migrationsDir: js.UndefOr[String] = js.undefined
  
  /**
    * Directory where subscribers should be created by default.
    */
  val subscribersDir: js.UndefOr[String] = js.undefined
}
object EntitiesDir {
  
  @scala.inline
  def apply(): EntitiesDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitiesDir]
  }
  
  @scala.inline
  implicit class EntitiesDirMutableBuilder[Self <: EntitiesDir] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitiesDir(value: String): Self = StObject.set(x, "entitiesDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesDirUndefined: Self = StObject.set(x, "entitiesDir", js.undefined)
    
    @scala.inline
    def setMigrationsDir(value: String): Self = StObject.set(x, "migrationsDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationsDirUndefined: Self = StObject.set(x, "migrationsDir", js.undefined)
    
    @scala.inline
    def setSubscribersDir(value: String): Self = StObject.set(x, "subscribersDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersDirUndefined: Self = StObject.set(x, "subscribersDir", js.undefined)
  }
}
