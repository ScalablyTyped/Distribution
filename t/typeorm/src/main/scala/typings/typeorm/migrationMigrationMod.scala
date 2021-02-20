package typings.typeorm

import typings.typeorm.migrationMigrationInterfaceMod.MigrationInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrationMigrationMod {
  
  @JSImport("typeorm/migration/Migration", "Migration")
  @js.native
  class Migration protected () extends StObject {
    def this(id: js.UndefOr[scala.Nothing], timestamp: Double, name: String) = this()
    def this(id: Double, timestamp: Double, name: String) = this()
    def this(id: js.UndefOr[scala.Nothing], timestamp: Double, name: String, instance: MigrationInterface) = this()
    def this(id: Double, timestamp: Double, name: String, instance: MigrationInterface) = this()
    
    /**
      * Migration id.
      * Indicates order of the executed migrations.
      */
    var id: js.UndefOr[Double] = js.native
    
    /**
      * Migration instance that needs to be run.
      */
    var instance: js.UndefOr[MigrationInterface] = js.native
    
    /**
      * Name of the migration (class name).
      */
    var name: String = js.native
    
    /**
      * Timestamp of the migration.
      */
    var timestamp: Double = js.native
  }
}
