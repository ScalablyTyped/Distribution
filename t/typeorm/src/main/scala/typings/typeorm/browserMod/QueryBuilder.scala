package typings.typeorm.browserMod

import typings.typeorm.queryRunnerMod.QueryRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "QueryBuilder")
@js.native
abstract class QueryBuilder[Entity] protected ()
  extends typings.typeorm.queryBuilderMod.QueryBuilder[Entity] {
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(connection: typings.typeorm.connectionMod.Connection) = this()
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(queryBuilder: typings.typeorm.queryBuilderMod.QueryBuilder[_]) = this()
  def this(connection: typings.typeorm.connectionMod.Connection, queryRunner: QueryRunner) = this()
}
