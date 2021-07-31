package typings.typeorm

import typings.typeorm.auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.postgresPostgresDriverMod.PostgresDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auroraDataApiPgAuroraDataApiPostgresDriverMod {
  
  @JSImport("typeorm/driver/aurora-data-api-pg/AuroraDataApiPostgresDriver", "AuroraDataApiPostgresDriver")
  @js.native
  class AuroraDataApiPostgresDriver protected () extends PostgresWrapper {
    def this(connection: Connection) = this()
    
    /**
      * Aurora Data API underlying library.
      */
    var DataApiDriver: js.Any = js.native
    
    var client: js.Any = js.native
    
    /**
      * Connection options.
      */
    @JSName("options")
    var options_AuroraDataApiPostgresDriver: AuroraDataApiPostgresConnectionOptions = js.native
  }
  
  @js.native
  trait PostgresWrapper extends PostgresDriver
}
