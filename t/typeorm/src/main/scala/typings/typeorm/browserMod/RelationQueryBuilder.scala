package typings.typeorm.browserMod

import typings.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "RelationQueryBuilder")
@js.native
class RelationQueryBuilder[Entity] protected ()
  extends typings.typeorm.relationQueryBuilderMod.RelationQueryBuilder[Entity] {
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(connection: typings.typeorm.connectionMod.Connection) = this()
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(queryBuilder: typings.typeorm.queryBuilderMod.QueryBuilder[js.Any]) = this()
  def this(connection: typings.typeorm.connectionMod.Connection, queryRunner: QueryRunner) = this()
}
