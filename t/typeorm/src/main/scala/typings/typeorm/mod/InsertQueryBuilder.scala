package typings.typeorm.mod

import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "InsertQueryBuilder")
@js.native
class InsertQueryBuilder[Entity] protected ()
  extends typings.typeorm.queryBuilderInsertQueryBuilderMod.InsertQueryBuilder[Entity] {
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(connection: typings.typeorm.connectionConnectionMod.Connection) = this()
  /**
    * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
    */
  def this(queryBuilder: typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder[_]) = this()
  def this(connection: typings.typeorm.connectionConnectionMod.Connection, queryRunner: QueryRunner) = this()
}
