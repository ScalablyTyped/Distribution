package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.connectionConnectionMod.Connection
import typings.typeorm.findOptionsOrderByConditionMod.OrderByCondition
import typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder
import typings.typeorm.queryBuilderQueryPartialEntityMod.QueryDeepPartialEntity
import typings.typeorm.queryBuilderWhereExpressionMod.WhereExpression
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.typeormStrings.ASC
import typings.typeorm.typeormStrings.DESC
import typings.typeorm.typeormStrings.`NULLS FIRST`
import typings.typeorm.typeormStrings.`NULLS LAST`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderUpdateQueryBuilderMod {
  
  @JSImport("typeorm/query-builder/UpdateQueryBuilder", "UpdateQueryBuilder")
  @js.native
  class UpdateQueryBuilder[Entity] protected ()
    extends QueryBuilder[Entity]
       with WhereExpression {
    def this(connectionOrQueryBuilder: Connection) = this()
    def this(connectionOrQueryBuilder: QueryBuilder[js.Any]) = this()
    def this(connectionOrQueryBuilder: Connection, queryRunner: QueryRunner) = this()
    def this(connectionOrQueryBuilder: QueryBuilder[js.Any], queryRunner: QueryRunner) = this()
    
    /**
      * Adds ORDER BY condition in the query builder.
      */
    def addOrderBy(sort: String): this.type = js.native
    def addOrderBy(sort: String, order: ASC, nulls: `NULLS FIRST`): this.type = js.native
    def addOrderBy(sort: String, order: ASC, nulls: `NULLS LAST`): this.type = js.native
    def addOrderBy(sort: String, order: DESC, nulls: `NULLS FIRST`): this.type = js.native
    def addOrderBy(sort: String, order: DESC, nulls: `NULLS LAST`): this.type = js.native
    @JSName("addOrderBy")
    def addOrderBy_ASC(sort: String, order: ASC): this.type = js.native
    @JSName("addOrderBy")
    def addOrderBy_DESC(sort: String, order: DESC): this.type = js.native
    @JSName("addOrderBy")
    def addOrderBy_NULLSFIRST(sort: String, order: Unit, nulls: `NULLS FIRST`): this.type = js.native
    @JSName("addOrderBy")
    def addOrderBy_NULLSLAST(sort: String, order: Unit, nulls: `NULLS LAST`): this.type = js.native
    
    /**
      * Creates "LIMIT" parts of SQL query.
      */
    /* protected */ def createLimitExpression(): String = js.native
    
    /**
      * Creates "ORDER BY" part of SQL query.
      */
    /* protected */ def createOrderByExpression(): String = js.native
    
    /**
      * Creates UPDATE express used to perform insert query.
      */
    /* protected */ def createUpdateExpression(): String = js.native
    
    /**
      * Gets array of values need to be inserted into the target table.
      */
    /* protected */ def getValueSet(): ObjectLiteral = js.native
    
    /**
      * Sets LIMIT - maximum number of rows to be selected.
      */
    def limit(): this.type = js.native
    def limit(limit: Double): this.type = js.native
    
    /**
      * Sets ORDER BY condition in the query builder.
      * If you had previously ORDER BY expression defined,
      * calling this function will override previously set ORDER BY conditions.
      *
      * Calling order by without order set will remove all previously set order bys.
      */
    def orderBy(): this.type = js.native
    /**
      * Sets ORDER BY condition in the query builder.
      * If you had previously ORDER BY expression defined,
      * calling this function will override previously set ORDER BY conditions.
      */
    def orderBy(order: OrderByCondition): this.type = js.native
    /**
      * Sets ORDER BY condition in the query builder.
      * If you had previously ORDER BY expression defined,
      * calling this function will override previously set ORDER BY conditions.
      */
    def orderBy(sort: String): this.type = js.native
    def orderBy(sort: String, order: ASC, nulls: `NULLS FIRST`): this.type = js.native
    def orderBy(sort: String, order: ASC, nulls: `NULLS LAST`): this.type = js.native
    def orderBy(sort: String, order: DESC, nulls: `NULLS FIRST`): this.type = js.native
    def orderBy(sort: String, order: DESC, nulls: `NULLS LAST`): this.type = js.native
    @JSName("orderBy")
    def orderBy_ASC(sort: String, order: ASC): this.type = js.native
    @JSName("orderBy")
    def orderBy_DESC(sort: String, order: DESC): this.type = js.native
    @JSName("orderBy")
    def orderBy_NULLSFIRST(sort: String, order: Unit, nulls: `NULLS FIRST`): this.type = js.native
    @JSName("orderBy")
    def orderBy_NULLSLAST(sort: String, order: Unit, nulls: `NULLS LAST`): this.type = js.native
    
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
    
    /**
      * Values needs to be updated.
      */
    def set(values: QueryDeepPartialEntity[Entity]): this.type = js.native
    
    /**
      * Indicates if entity must be updated after update operation.
      * This may produce extra query or use RETURNING / OUTPUT statement (depend on database).
      * Enabled by default.
      */
    def updateEntity(enabled: Boolean): this.type = js.native
    
    /**
      * Indicates if entity must be updated after update operation.
      * This may produce extra query or use RETURNING / OUTPUT statement (depend on database).
      * Enabled by default.
      */
    def whereEntity(entity: Entity): this.type = js.native
    def whereEntity(entity: js.Array[Entity]): this.type = js.native
  }
}
