package typings.typeorm.browserMod

import typings.typeorm.queryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "UpdateQueryBuilder")
@js.native
class UpdateQueryBuilder[Entity] protected ()
  extends typings.typeorm.updateQueryBuilderMod.UpdateQueryBuilder[Entity] {
  def this(connectionOrQueryBuilder: typings.typeorm.connectionMod.Connection) = this()
  def this(connectionOrQueryBuilder: typings.typeorm.queryBuilderMod.QueryBuilder[_]) = this()
  def this(connectionOrQueryBuilder: typings.typeorm.connectionMod.Connection, queryRunner: QueryRunner) = this()
  def this(
    connectionOrQueryBuilder: typings.typeorm.queryBuilderMod.QueryBuilder[_],
    queryRunner: QueryRunner
  ) = this()
}
