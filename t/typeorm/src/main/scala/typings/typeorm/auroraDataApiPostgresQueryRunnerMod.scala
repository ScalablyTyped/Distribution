package typings.typeorm

import typings.typeorm.auroraDataApiPostgresDriverMod.AuroraDataApiPostgresDriver
import typings.typeorm.postgresQueryRunnerMod.PostgresQueryRunner
import typings.typeorm.replicationModeMod.ReplicationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/aurora-data-api-pg/AuroraDataApiPostgresQueryRunner", JSImport.Namespace)
@js.native
object auroraDataApiPostgresQueryRunnerMod extends js.Object {
  
  @js.native
  class AuroraDataApiPostgresQueryRunner protected () extends PostgresQueryRunnerWrapper {
    def this(driver: AuroraDataApiPostgresDriver, mode: ReplicationMode) = this()
    
    /**
      * Database driver used by connection.
      */
    @JSName("driver")
    var driver_AuroraDataApiPostgresQueryRunner: AuroraDataApiPostgresDriver = js.native
  }
  
  @js.native
  trait PostgresQueryRunnerWrapper extends PostgresQueryRunner
}
