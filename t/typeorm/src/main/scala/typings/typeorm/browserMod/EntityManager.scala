package typings.typeorm.browserMod

import typings.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "EntityManager")
@js.native
class EntityManager protected ()
  extends typings.typeorm.entityManagerMod.EntityManager {
  def this(connection: typings.typeorm.connectionMod.Connection) = this()
  def this(connection: typings.typeorm.connectionMod.Connection, queryRunner: QueryRunner) = this()
}
