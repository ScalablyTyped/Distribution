package typings.typeorm.mod

import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "UpdateQueryBuilder")
@js.native
class UpdateQueryBuilder[Entity] protected ()
  extends typings.typeorm.queryBuilderUpdateQueryBuilderMod.UpdateQueryBuilder[Entity] {
  def this(connectionOrQueryBuilder: typings.typeorm.connectionConnectionMod.Connection) = this()
  def this(connectionOrQueryBuilder: typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder[_]) = this()
  def this(
    connectionOrQueryBuilder: typings.typeorm.connectionConnectionMod.Connection,
    queryRunner: QueryRunner
  ) = this()
  def this(
    connectionOrQueryBuilder: typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder[_],
    queryRunner: QueryRunner
  ) = this()
}
