package typings.typeorm

import typings.typeorm.anon.Conflicttarget
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityTargetMod.EntityTarget
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.queryBuilderMod.QueryBuilder
import typings.typeorm.queryPartialEntityMod.QueryDeepPartialEntity
import typings.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insertQueryBuilderMod {
  
  @JSImport("typeorm/browser/query-builder/InsertQueryBuilder", "InsertQueryBuilder")
  @js.native
  class InsertQueryBuilder[Entity] protected () extends QueryBuilder[Entity] {
    /**
      * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
      */
    def this(connection: Connection) = this()
    /**
      * QueryBuilder can be initialized from given Connection and QueryRunner objects or from given other QueryBuilder.
      */
    def this(queryBuilder: QueryBuilder[js.Any]) = this()
    def this(connection: Connection, queryRunner: QueryRunner) = this()
    
    /**
      * Creates a columns string where values must be inserted to for INSERT INTO expression.
      */
    /* protected */ def createColumnNamesExpression(): String = js.native
    
    /**
      * Creates INSERT express used to perform insert query.
      */
    /* protected */ def createInsertExpression(): String = js.native
    
    /**
      * Creates list of values needs to be inserted in the VALUES expression.
      */
    /* protected */ def createValuesExpression(): String = js.native
    
    /**
      * Gets list of columns where values must be inserted to.
      */
    /* protected */ def getInsertedColumns(): js.Array[ColumnMetadata] = js.native
    
    /**
      * Gets array of values need to be inserted into the target table.
      */
    /* protected */ def getValueSets(): js.Array[ObjectLiteral] = js.native
    
    /**
      * Specifies INTO which entity's table insertion will be executed.
      */
    def into[T](entityTarget: EntityTarget[T]): InsertQueryBuilder[T] = js.native
    def into[T](entityTarget: EntityTarget[T], columns: js.Array[String]): InsertQueryBuilder[T] = js.native
    
    /**
      * Adds additional ON CONFLICT statement supported in postgres and cockroach.
      */
    def onConflict(statement: String): this.type = js.native
    
    /**
      * Adds additional ignore statement supported in databases.
      */
    def orIgnore(): this.type = js.native
    def orIgnore(statement: String): this.type = js.native
    def orIgnore(statement: Boolean): this.type = js.native
    
    /**
      * Adds additional update statement supported in databases.
      */
    def orUpdate(): this.type = js.native
    def orUpdate(statement: Conflicttarget): this.type = js.native
    
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
      * Indicates if entity must be updated after insertion operations.
      * This may produce extra query or use RETURNING / OUTPUT statement (depend on database).
      * Enabled by default.
      */
    def updateEntity(enabled: Boolean): this.type = js.native
    
    def values(values: js.Array[QueryDeepPartialEntity[Entity]]): this.type = js.native
    /**
      * Values needs to be inserted into table.
      */
    def values(values: QueryDeepPartialEntity[Entity]): this.type = js.native
  }
}
