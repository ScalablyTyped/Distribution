package typings.typeorm

import typings.std.Date
import typings.typeorm.aliasMod.Alias
import typings.typeorm.anon.Condition
import typings.typeorm.anon.Conflict
import typings.typeorm.anon.Metadata
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.connectionMod.Connection
import typings.typeorm.joinAttributeMod.JoinAttribute
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.orderByConditionMod.OrderByCondition
import typings.typeorm.queryBuilderMod.QueryBuilder
import typings.typeorm.relationCountAttributeMod.RelationCountAttribute
import typings.typeorm.relationIdAttributeMod.RelationIdAttribute
import typings.typeorm.relationMetadataMod.RelationMetadata
import typings.typeorm.selectQueryBuilderOptionMod.SelectQueryBuilderOption
import typings.typeorm.selectQueryMod.SelectQuery
import typings.typeorm.typeormStrings.`soft-delete`
import typings.typeorm.typeormStrings.delete
import typings.typeorm.typeormStrings.dirty_read
import typings.typeorm.typeormStrings.for_no_key_update
import typings.typeorm.typeormStrings.insert
import typings.typeorm.typeormStrings.optimistic
import typings.typeorm.typeormStrings.pessimistic_partial_write
import typings.typeorm.typeormStrings.pessimistic_read
import typings.typeorm.typeormStrings.pessimistic_write
import typings.typeorm.typeormStrings.pessimistic_write_or_fail
import typings.typeorm.typeormStrings.relation
import typings.typeorm.typeormStrings.restore
import typings.typeorm.typeormStrings.select
import typings.typeorm.typeormStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/QueryExpressionMap", JSImport.Namespace)
@js.native
object queryExpressionMapMod extends js.Object {
  
  @js.native
  class QueryExpressionMap protected () extends js.Object {
    def this(connection: Connection) = this()
    
    /**
      * Indicates if property names are prefixed with alias names during property replacement.
      * By default this is enabled, however we need this because aliases are not supported in UPDATE and DELETE queries,
      * but user can use them in WHERE expressions.
      */
    var aliasNamePrefixingEnabled: Boolean = js.native
    
    /**
      * All aliases (including main alias) used in the query.
      */
    var aliases: js.Array[Alias] = js.native
    
    /**
      * Get all ORDER BY queries - if order by is specified by user then it uses them,
      * otherwise it uses default entity order by if it was set.
      */
    val allOrderBys: OrderByCondition = js.native
    
    /**
      * Indicates if query result cache is enabled or not.
      */
    var cache: Boolean = js.native
    
    /**
      * Time in milliseconds in which cache will expire.
      * If not set then global caching time will be used.
      */
    var cacheDuration: Double = js.native
    
    /**
      * Cache id.
      * Used to identifier your cache queries.
      */
    var cacheId: String = js.native
    
    /**
      * Indicates if listeners and subscribers must be called before and after query execution.
      */
    var callListeners: Boolean = js.native
    
    /**
      * Query Comment to include extra information for debugging or other purposes.
      */
    var comment: js.UndefOr[String] = js.native
    
    var connection: Connection = js.native
    
    /**
      * Creates a new alias and adds it to the current expression map.
      */
    def createAlias(options: Metadata): Alias = js.native
    
    /**
      * Indicates if alias, table names and column names will be ecaped by driver, or not.
      *
      * todo: rename to isQuotingDisabled, also think if it should be named "escaping"
      */
    var disableEscaping: Boolean = js.native
    
    /**
      * Indicates if virtual columns should be included in entity result.
      *
      * todo: what to do with it? is it properly used? what about persistence?
      */
    var enableRelationIdValues: Boolean = js.native
    
    /**
      * Extra where condition appended to the end of original where conditions with AND keyword.
      * Original condition will be wrapped into brackets.
      */
    var extraAppendedAndWhereCondition: String = js.native
    
    /**
      * Extra returning columns to be added to the returning statement if driver supports it.
      */
    var extraReturningColumns: js.Array[ColumnMetadata] = js.native
    
    /**
      * Finds alias with the given name.
      * If alias was not found it throw an exception.
      */
    def findAliasByName(aliasName: String): Alias = js.native
    
    def findColumnByAliasExpression(aliasExpression: String): js.UndefOr[ColumnMetadata] = js.native
    
    /**
      * GROUP BY queries.
      */
    var groupBys: js.Array[String] = js.native
    
    /**
      * HAVING queries.
      */
    var havings: js.Array[Condition] = js.native
    
    /**
      * List of columns where data should be inserted.
      * Used in INSERT query.
      */
    var insertColumns: js.Array[String] = js.native
    
    /**
      * JOIN queries.
      */
    var joinAttributes: js.Array[JoinAttribute] = js.native
    
    /**
      * LIMIT query.
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * Locking mode.
      */
    var lockMode: js.UndefOr[
        optimistic | pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail | for_no_key_update
      ] = js.native
    
    /**
      * Current version of the entity, used for locking.
      */
    var lockVersion: js.UndefOr[Double | Date] = js.native
    
    /**
      * Main alias is a main selection object selected by QueryBuilder.
      */
    var mainAlias: js.UndefOr[Alias] = js.native
    
    /**
      * Extra parameters.
      * Used in InsertQueryBuilder to avoid default parameters mechanizm and execute high performance insertions.
      */
    var nativeParameters: ObjectLiteral = js.native
    
    /**
      * Entity (target) which relations will be updated.
      */
    var of: js.Any | js.Array[_] = js.native
    
    /**
      * OFFSET query.
      */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * Optional on conflict statement used in insertion query in postgres.
      */
    var onConflict: String = js.native
    
    /**
      * Optional on ignore statement used in insertion query in databases.
      */
    var onIgnore: String | Boolean = js.native
    
    /**
      * Optional on update statement used in insertion query in databases.
      */
    var onUpdate: Conflict = js.native
    
    /**
      * Options that define QueryBuilder behaviour.
      */
    var options: js.Array[SelectQueryBuilderOption] = js.native
    
    /**
      * ORDER BY queries.
      */
    var orderBys: OrderByCondition = js.native
    
    /**
      * Parameters used to be escaped in final query.
      */
    var parameters: ObjectLiteral = js.native
    
    /**
      * If QueryBuilder was created in a subquery mode then its parent QueryBuilder (who created subquery) will be stored here.
      */
    var parentQueryBuilder: QueryBuilder[_] = js.native
    
    /**
      * Indicates if QueryBuilder used to select entities and not a raw results.
      */
    var queryEntity: Boolean = js.native
    
    /**
      * Represents query type. QueryBuilder is able to build SELECT, UPDATE and DELETE queries.
      */
    var queryType: select | update | delete | insert | relation | `soft-delete` | restore = js.native
    
    /**
      * Relation count queries.
      */
    var relationCountAttributes: js.Array[RelationCountAttribute] = js.native
    
    /**
      * RelationId queries.
      */
    var relationIdAttributes: js.Array[RelationIdAttribute] = js.native
    
    /**
      * Gets relation metadata of the relation this query builder works with.
      *
      * todo: add proper exceptions
      */
    val relationMetadata: RelationMetadata = js.native
    
    /**
      * Property path of relation to work with.
      * Used in relational query builder.
      */
    var relationPropertyPath: String = js.native
    
    /**
      * Optional returning (or output) clause for insert, update or delete queries.
      */
    var returning: String | js.Array[String] = js.native
    
    /**
      * Whether SELECT is DISTINCT.
      */
    var selectDistinct: Boolean = js.native
    
    /**
      * SELECT DISTINCT ON query (postgres).
      */
    var selectDistinctOn: js.Array[String] = js.native
    
    /**
      * Data needs to be SELECT-ed.
      */
    var selects: js.Array[SelectQuery] = js.native
    
    /**
      * Creates a main alias and adds it to the current expression map.
      */
    def setMainAlias(alias: Alias): Alias = js.native
    
    /**
      * Number of rows to skip of result using pagination.
      */
    var skip: js.UndefOr[Double] = js.native
    
    /**
      * Indicates if query builder creates a subquery.
      */
    var subQuery: Boolean = js.native
    
    /**
      * Number of rows to take using pagination.
      */
    var take: js.UndefOr[Double] = js.native
    
    /**
      * Indicates if entity must be updated after insertion / updation.
      * This may produce extra query or use RETURNING / OUTPUT statement (depend on database).
      */
    var updateEntity: Boolean = js.native
    
    /**
      * Indicates if query must be wrapped into transaction.
      */
    var useTransaction: Boolean = js.native
    
    /**
      * FROM-s to be selected.
      */
    /**
      * If update query was used, it needs "update set" - properties which will be updated by this query.
      * If insert query was used, it needs "insert set" - values that needs to be inserted.
      */
    var valuesSet: js.UndefOr[ObjectLiteral | js.Array[ObjectLiteral]] = js.native
    
    /**
      * Used if user wants to update or delete a specific entities.
      */
    var whereEntities: js.Array[ObjectLiteral] = js.native
    
    /**
      * WHERE queries.
      */
    var wheres: js.Array[Condition] = js.native
    
    /**
      * Indicates if soft-deleted rows should be included in entity result.
      * By default the soft-deleted rows are not included.
      */
    var withDeleted: Boolean = js.native
  }
}
