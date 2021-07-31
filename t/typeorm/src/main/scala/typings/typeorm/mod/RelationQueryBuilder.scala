package typings.typeorm.mod

import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "RelationQueryBuilder")
@js.native
class RelationQueryBuilder[Entity] protected ()
  extends typings.typeorm.queryBuilderRelationQueryBuilderMod.RelationQueryBuilder[Entity] {
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(connection: typings.typeorm.connectionConnectionMod.Connection) = this()
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(queryBuilder: typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder[js.Any]) = this()
  def this(connection: typings.typeorm.connectionConnectionMod.Connection, queryRunner: QueryRunner) = this()
}
