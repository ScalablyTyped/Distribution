package typings.typeorm

import typings.typeorm.auroraDataApiAuroraDataApiQueryRunnerMod.AuroraDataApiQueryRunner
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auroraDataApiAuroraDataApiConnectionMod {
  
  @JSImport("typeorm/driver/aurora-data-api/AuroraDataApiConnection", "AuroraDataApiConnection")
  @js.native
  class AuroraDataApiConnection protected () extends Connection {
    def this(options: ConnectionOptions, queryRunner: AuroraDataApiQueryRunner) = this()
    
    var queryRunnter: AuroraDataApiQueryRunner = js.native
  }
}
