package typings.typeorm

import typings.typeorm.migrationInterfaceMod.MigrationInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/migration/Migration", JSImport.Namespace)
@js.native
object migrationMod extends js.Object {
  
  @js.native
  class Migration protected () extends js.Object {
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
