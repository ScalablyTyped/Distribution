package typings.typeorm.browserMod

import typings.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "MigrationExecutor")
@js.native
class MigrationExecutor protected ()
  extends typings.typeorm.migrationExecutorMod.MigrationExecutor {
  def this(connection: typings.typeorm.connectionMod.Connection) = this()
  def this(connection: typings.typeorm.connectionMod.Connection, queryRunner: QueryRunner) = this()
}
