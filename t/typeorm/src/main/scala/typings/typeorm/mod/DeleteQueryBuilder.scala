package typings.typeorm.mod

import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "DeleteQueryBuilder")
@js.native
class DeleteQueryBuilder[Entity] protected ()
  extends typings.typeorm.queryBuilderDeleteQueryBuilderMod.DeleteQueryBuilder[Entity] {
  def this(connectionOrQueryBuilder: typings.typeorm.connectionConnectionMod.Connection) = this()
  def this(connectionOrQueryBuilder: typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder[js.Any]) = this()
  def this(
    connectionOrQueryBuilder: typings.typeorm.connectionConnectionMod.Connection,
    queryRunner: QueryRunner
  ) = this()
  def this(
    connectionOrQueryBuilder: typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder[js.Any],
    queryRunner: QueryRunner
  ) = this()
}
