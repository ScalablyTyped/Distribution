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
  
  inline def apply(): EntitiesDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitiesDir]
  }
  
  extension [Self <: EntitiesDir](x: Self) {
    
    inline def setEntitiesDir(value: String): Self = StObject.set(x, "entitiesDir", value.asInstanceOf[js.Any])
    
    inline def setEntitiesDirUndefined: Self = StObject.set(x, "entitiesDir", js.undefined)
    
    inline def setMigrationsDir(value: String): Self = StObject.set(x, "migrationsDir", value.asInstanceOf[js.Any])
    
    inline def setMigrationsDirUndefined: Self = StObject.set(x, "migrationsDir", js.undefined)
    
    inline def setSubscribersDir(value: String): Self = StObject.set(x, "subscribersDir", value.asInstanceOf[js.Any])
    
    inline def setSubscribersDirUndefined: Self = StObject.set(x, "subscribersDir", js.undefined)
  }
}
