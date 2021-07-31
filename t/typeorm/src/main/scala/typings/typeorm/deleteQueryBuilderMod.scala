package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityTargetMod.EntityTarget
import typings.typeorm.queryBuilderMod.QueryBuilder
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.whereExpressionMod.WhereExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteQueryBuilderMod {
  
  @JSImport("typeorm/browser/query-builder/DeleteQueryBuilder", "DeleteQueryBuilder")
  @js.native
  class DeleteQueryBuilder[Entity] protected ()
    extends QueryBuilder[Entity]
       with WhereExpression {
    def this(connectionOrQueryBuilder: Connection) = this()
    def this(connectionOrQueryBuilder: QueryBuilder[js.Any]) = this()
    def this(connectionOrQueryBuilder: Connection, queryRunner: QueryRunner) = this()
    def this(connectionOrQueryBuilder: QueryBuilder[js.Any], queryRunner: QueryRunner) = this()
    
    /**
      * Creates DELETE express used to perform query.
      */
    /* protected */ def createDeleteExpression(): String = js.native
    
    /**
      * Specifies FROM which entity's table select/update/delete will be executed.
      * Also sets a main string alias of the selection data.
      */
    def from[T](entityTarget: EntityTarget[T]): DeleteQueryBuilder[T] = js.native
    def from[T](entityTarget: EntityTarget[T], aliasName: String): DeleteQueryBuilder[T] = js.native
    
    /**
      * Optional returning/output clause.
      * This will return given column values.
      */
    def output(columns: js.Array[String]): this.type = js.native
    /**
      * Optional returning/output clause.
      * Returning is a SQL string containing returning statement.
      */
    def output(output: String): this.type = js.native
    
    /**
      * Optional returning/output clause.
      * This will return given column values.
      */
    def returning(columns: js.Array[String]): this.type = js.native
    /**
      * Optional returning/output clause.
      * Returning is a SQL string containing returning statement.
      */
    def returning(returning: String): this.type = js.native
  }
}
