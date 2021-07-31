package typings.typeorm

import typings.std.Date
import typings.typeorm.anon.DisableMixedMap
import typings.typeorm.anon.Entities
import typings.typeorm.anon.PartialQueryExpressionMap
import typings.typeorm.anon.Raw
import typings.typeorm.anon.`4`
import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.entityTargetMod.EntityTarget
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.orderByConditionMod.OrderByCondition
import typings.typeorm.platformToolsMod.ReadStream
import typings.typeorm.queryBuilderMod.QueryBuilder
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.selectQueryBuilderOptionMod.SelectQueryBuilderOption
import typings.typeorm.selectQueryMod.SelectQuery
import typings.typeorm.typeormStrings.ASC
import typings.typeorm.typeormStrings.DESC
import typings.typeorm.typeormStrings.INNER
import typings.typeorm.typeormStrings.LEFT
import typings.typeorm.typeormStrings.`NULLS FIRST`
import typings.typeorm.typeormStrings.`NULLS LAST`
import typings.typeorm.typeormStrings.dirty_read
import typings.typeorm.typeormStrings.for_no_key_update
import typings.typeorm.typeormStrings.optimistic
import typings.typeorm.typeormStrings.pessimistic_partial_write
import typings.typeorm.typeormStrings.pessimistic_read
import typings.typeorm.typeormStrings.pessimistic_write
import typings.typeorm.typeormStrings.pessimistic_write_or_fail
import typings.typeorm.whereExpressionMod.WhereExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectQueryBuilderMod {
  
  @JSImport("typeorm/browser/query-builder/SelectQueryBuilder", "SelectQueryBuilder")
  @js.native
  class SelectQueryBuilder[Entity] protected ()
    extends QueryBuilder[Entity]
       with WhereExpression {
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
      * Specifies FROM which entity's table select/update/delete will be executed.
      * Also sets a main string alias of the selection data.
      */
    def addFrom[T](
      entityTarget: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      aliasName: String
    ): SelectQueryBuilder[T] = js.native
    /**
      * Specifies FROM which entity's table select/update/delete will be executed.
      * Also sets a main string alias of the selection data.
      */
    def addFrom[T](entityTarget: EntityTarget[T], aliasName: String): SelectQueryBuilder[T] = js.native
    
    /**
      * Adds GROUP BY condition in the query builder.
      */
    def addGroupBy(groupBy: String): this.type = js.native
    
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
      * Adds new selection to the SELECT query.
      */
    def addSelect(selection: String): this.type = js.native
    def addSelect(selection: String, selectionAliasName: String): this.type = js.native
    /**
      * Adds new selection to the SELECT query.
      */
    def addSelect(selection: js.Array[String]): this.type = js.native
    /**
      * Adds new selection to the SELECT query.
      */
    def addSelect(selection: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]): this.type = js.native
    def addSelect(
      selection: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      selectionAliasName: String
    ): this.type = js.native
    
    /**
      * Adds new AND HAVING condition in the query builder.
      * Additionally you can add parameters used in where expression.
      */
    def andHaving(having: String): this.type = js.native
    def andHaving(having: String, parameters: ObjectLiteral): this.type = js.native
    
    /* protected */ def buildEscapedEntityColumnSelects(aliasName: String, metadata: EntityMetadata): js.Array[SelectQuery] = js.native
    
    /**
      * Enables or disables query result caching.
      */
    def cache(enabled: Boolean): this.type = js.native
    /**
      * Enables query result caching and sets cache id and milliseconds in which cache will expire.
      */
    def cache(id: js.Any): this.type = js.native
    def cache(id: js.Any, milliseconds: Double): this.type = js.native
    /**
      * Enables query result caching and sets in milliseconds in which cache will expire.
      * If not set then global caching time will be used.
      */
    def cache(milliseconds: Double): this.type = js.native
    
    var computeCountExpression: js.Any = js.native
    
    /**
      * Creates "GROUP BY" part of SQL query.
      */
    /* protected */ def createGroupByExpression(): String = js.native
    
    /**
      * Creates "HAVING" part of SQL query.
      */
    /* protected */ def createHavingExpression(): String = js.native
    
    /**
      * Creates "JOIN" part of SQL query.
      */
    /* protected */ def createJoinExpression(): String = js.native
    
    /**
      * Creates "LIMIT" and "OFFSET" parts of SQL query.
      */
    /* protected */ def createLimitOffsetExpression(): String = js.native
    
    /**
      * Creates "LOCK" part of SQL query.
      */
    /* protected */ def createLockExpression(): String = js.native
    
    /* protected */ def createOrderByCombinedWithSelectExpression(parentAlias: String): js.Tuple2[String, OrderByCondition] = js.native
    
    /**
      * Creates "ORDER BY" part of SQL query.
      */
    /* protected */ def createOrderByExpression(): String = js.native
    
    /**
      * Creates select | select distinct part of SQL query.
      */
    /* protected */ def createSelectDistinctExpression(): String = js.native
    
    /**
      * Creates "SELECT FROM" part of SQL query.
      */
    /* protected */ def createSelectExpression(): String = js.native
    
    /**
      * Sets whether the selection is DISTINCT.
      */
    def distinct(): this.type = js.native
    def distinct(distinct: Boolean): this.type = js.native
    
    /**
      * Sets the distinct on clause for Postgres.
      */
    def distinctOn(distinctOn: js.Array[String]): this.type = js.native
    
    /* protected */ def executeCountQuery(queryRunner: QueryRunner): js.Promise[Double] = js.native
    
    /**
      * Executes sql generated by query builder and returns object with raw results and entities created from them.
      */
    /* protected */ def executeEntitiesAndRawResults(queryRunner: QueryRunner): js.Promise[Raw[Entity]] = js.native
    
    /* protected */ def findEntityColumnSelects(aliasName: String, metadata: EntityMetadata): js.Array[SelectQuery] = js.native
    
    /**
      * Specifies FROM which entity's table select/update/delete will be executed.
      * Also sets a main string alias of the selection data.
      * Removes all previously set from-s.
      */
    def from[T](
      entityTarget: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      aliasName: String
    ): SelectQueryBuilder[T] = js.native
    /**
      * Specifies FROM which entity's table select/update/delete will be executed.
      * Also sets a main string alias of the selection data.
      * Removes all previously set from-s.
      */
    def from[T](entityTarget: EntityTarget[T], aliasName: String): SelectQueryBuilder[T] = js.native
    
    /**
      * Gets count - number of entities selected by sql generated by this query builder.
      * Count excludes all limitations set by setFirstResult and setMaxResults methods call.
      */
    def getCount(): js.Promise[Double] = js.native
    
    /**
      * Gets entities returned by execution of generated query builder sql.
      */
    def getMany(): js.Promise[js.Array[Entity]] = js.native
    
    /**
      * Executes built SQL query and returns entities and overall entities count (without limitation).
      * This method is useful to build pagination.
      */
    def getManyAndCount(): js.Promise[js.Tuple2[js.Array[Entity], Double]] = js.native
    
    /**
      * Gets single entity returned by execution of generated query builder sql.
      */
    def getOne(): js.Promise[js.UndefOr[Entity]] = js.native
    
    /**
      * Gets the first entity returned by execution of generated query builder sql or rejects the returned promise on error.
      */
    def getOneOrFail(): js.Promise[Entity] = js.native
    
    /**
      * Executes sql generated by query builder and returns object with raw results and entities created from them.
      */
    def getRawAndEntities[T](): js.Promise[Entities[Entity, T]] = js.native
    
    /**
      * Gets all raw results returned by execution of generated query builder sql.
      */
    def getRawMany[T](): js.Promise[js.Array[T]] = js.native
    
    /**
      * Gets first raw result returned by execution of generated query builder sql.
      */
    def getRawOne[T](): js.Promise[T] = js.native
    
    /**
      * Sets GROUP BY condition in the query builder.
      * If you had previously GROUP BY expression defined,
      * calling this function will override previously set GROUP BY conditions.
      */
    def groupBy(): this.type = js.native
    /**
      * Sets GROUP BY condition in the query builder.
      * If you had previously GROUP BY expression defined,
      * calling this function will override previously set GROUP BY conditions.
      */
    def groupBy(groupBy: String): this.type = js.native
    
    /**
      * Sets HAVING condition in the query builder.
      * If you had previously HAVING expression defined,
      * calling this function will override previously set HAVING conditions.
      * Additionally you can add parameters used in where expression.
      */
    def having(having: String): this.type = js.native
    def having(having: String, parameters: ObjectLiteral): this.type = js.native
    
    /**
      * INNER JOINs (without selection) given entity's table.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoin(entity: js.Function, alias: String): this.type = js.native
    def innerJoin(entity: js.Function, alias: String, condition: String): this.type = js.native
    def innerJoin(entity: js.Function, alias: String, condition: String, parameters: ObjectLiteral): this.type = js.native
    def innerJoin(entity: js.Function, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * INNER JOINs (without selection) entity's property.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoin(property: String, alias: String): this.type = js.native
    def innerJoin(property: String, alias: String, condition: String): this.type = js.native
    def innerJoin(property: String, alias: String, condition: String, parameters: ObjectLiteral): this.type = js.native
    def innerJoin(property: String, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * INNER JOINs (without selection) given subquery.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoin(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String
    ): this.type = js.native
    def innerJoin(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String
    ): this.type = js.native
    def innerJoin(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def innerJoin(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: Unit,
      parameters: ObjectLiteral
    ): this.type = js.native
    
    /**
      * INNER JOINs entity's table, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there are multiple rows of selecting data, and mapped result will be an array.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndMapMany(mapToProperty: String, entity: js.Function, alias: String, condition: String): this.type = js.native
    def innerJoinAndMapMany(
      mapToProperty: String,
      entity: js.Function,
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    /**
      * INNER JOINs entity's property, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there are multiple rows of selecting data, and mapped result will be an array.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndMapMany(mapToProperty: String, property: String, alias: String): this.type = js.native
    /**
      * INNER JOINs table, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there are multiple rows of selecting data, and mapped result will be an array.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndMapMany(mapToProperty: String, property: String, alias: String, condition: String): this.type = js.native
    def innerJoinAndMapMany(
      mapToProperty: String,
      property: String,
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def innerJoinAndMapMany(mapToProperty: String, property: String, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * INNER JOINs given subquery, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there are multiple rows of selecting data, and mapped result will be an array.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndMapMany(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String
    ): this.type = js.native
    def innerJoinAndMapMany(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String
    ): this.type = js.native
    def innerJoinAndMapMany(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def innerJoinAndMapMany(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: Unit,
      parameters: ObjectLiteral
    ): this.type = js.native
    
    /**
      * INNER JOINs entity's table, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there is a single row of selecting data, and mapped result will be a single selected value.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndMapOne(mapToProperty: String, entity: js.Function, alias: String, condition: String): this.type = js.native
    def innerJoinAndMapOne(
      mapToProperty: String,
      entity: js.Function,
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    /**
      * INNER JOINs entity's property, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there is a single row of selecting data, and mapped result will be a single selected value.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndMapOne(mapToProperty: String, property: String, alias: String): this.type = js.native
    /**
      * INNER JOINs table, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there is a single row of selecting data, and mapped result will be a single selected value.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndMapOne(mapToProperty: String, property: String, alias: String, condition: String): this.type = js.native
    def innerJoinAndMapOne(
      mapToProperty: String,
      property: String,
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def innerJoinAndMapOne(mapToProperty: String, property: String, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * INNER JOINs given subquery, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there is a single row of selecting data, and mapped result will be a single selected value.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndMapOne(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String
    ): this.type = js.native
    def innerJoinAndMapOne(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String
    ): this.type = js.native
    def innerJoinAndMapOne(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def innerJoinAndMapOne(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: Unit,
      parameters: ObjectLiteral
    ): this.type = js.native
    
    /**
      * INNER JOINs entity and adds all selection properties to SELECT.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndSelect(entity: js.Function, alias: String): this.type = js.native
    def innerJoinAndSelect(entity: js.Function, alias: String, condition: String): this.type = js.native
    def innerJoinAndSelect(entity: js.Function, alias: String, condition: String, parameters: ObjectLiteral): this.type = js.native
    def innerJoinAndSelect(entity: js.Function, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * INNER JOINs entity's property and adds all selection properties to SELECT.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndSelect(property: String, alias: String): this.type = js.native
    def innerJoinAndSelect(property: String, alias: String, condition: String): this.type = js.native
    def innerJoinAndSelect(property: String, alias: String, condition: String, parameters: ObjectLiteral): this.type = js.native
    def innerJoinAndSelect(property: String, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * INNER JOINs given subquery and adds all selection properties to SELECT..
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def innerJoinAndSelect(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String
    ): this.type = js.native
    def innerJoinAndSelect(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String
    ): this.type = js.native
    def innerJoinAndSelect(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def innerJoinAndSelect(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: Unit,
      parameters: ObjectLiteral
    ): this.type = js.native
    
    /* protected */ def join(
      direction: INNER | LEFT,
      entityOrProperty: js.Function | String | (js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]),
      aliasName: String,
      condition: js.UndefOr[String],
      parameters: js.UndefOr[ObjectLiteral],
      mapToProperty: js.UndefOr[String],
      isMappingMany: js.UndefOr[Boolean]
    ): Unit = js.native
    
    /**
      * LEFT JOINs (without selection) entity's table.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoin(entity: js.Function, alias: String): this.type = js.native
    def leftJoin(entity: js.Function, alias: String, condition: String): this.type = js.native
    def leftJoin(entity: js.Function, alias: String, condition: String, parameters: ObjectLiteral): this.type = js.native
    def leftJoin(entity: js.Function, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * LEFT JOINs (without selection) entity's property.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoin(property: String, alias: String): this.type = js.native
    def leftJoin(property: String, alias: String, condition: String): this.type = js.native
    def leftJoin(property: String, alias: String, condition: String, parameters: ObjectLiteral): this.type = js.native
    def leftJoin(property: String, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * LEFT JOINs (without selection) given subquery.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoin(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String
    ): this.type = js.native
    def leftJoin(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String
    ): this.type = js.native
    def leftJoin(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def leftJoin(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: Unit,
      parameters: ObjectLiteral
    ): this.type = js.native
    
    /**
      * LEFT JOINs entity's table, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there are multiple rows of selecting data, and mapped result will be an array.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndMapMany(mapToProperty: String, entity: js.Function, alias: String, condition: String): this.type = js.native
    def leftJoinAndMapMany(
      mapToProperty: String,
      entity: js.Function,
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    /**
      * LEFT JOINs entity's property, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there are multiple rows of selecting data, and mapped result will be an array.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndMapMany(mapToProperty: String, property: String, alias: String): this.type = js.native
    /**
      * LEFT JOINs table, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there are multiple rows of selecting data, and mapped result will be an array.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndMapMany(mapToProperty: String, property: String, alias: String, condition: String): this.type = js.native
    def leftJoinAndMapMany(
      mapToProperty: String,
      property: String,
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def leftJoinAndMapMany(mapToProperty: String, property: String, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * LEFT JOINs given subquery, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there are multiple rows of selecting data, and mapped result will be an array.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndMapMany(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String
    ): this.type = js.native
    def leftJoinAndMapMany(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String
    ): this.type = js.native
    def leftJoinAndMapMany(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def leftJoinAndMapMany(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: Unit,
      parameters: ObjectLiteral
    ): this.type = js.native
    
    /**
      * LEFT JOINs entity's table, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there is a single row of selecting data, and mapped result will be a single selected value.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndMapOne(mapToProperty: String, entity: js.Function, alias: String, condition: String): this.type = js.native
    def leftJoinAndMapOne(
      mapToProperty: String,
      entity: js.Function,
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    /**
      * LEFT JOINs entity's property, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there is a single row of selecting data, and mapped result will be a single selected value.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndMapOne(mapToProperty: String, property: String, alias: String): this.type = js.native
    /**
      * LEFT JOINs table, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there is a single row of selecting data, and mapped result will be a single selected value.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndMapOne(mapToProperty: String, property: String, alias: String, condition: String): this.type = js.native
    def leftJoinAndMapOne(
      mapToProperty: String,
      property: String,
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def leftJoinAndMapOne(mapToProperty: String, property: String, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * LEFT JOINs given subquery, SELECTs the data returned by a join and MAPs all that data to some entity's property.
      * This is extremely useful when you want to select some data and map it to some virtual property.
      * It will assume that there is a single row of selecting data, and mapped result will be a single selected value.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndMapOne(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String
    ): this.type = js.native
    def leftJoinAndMapOne(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String
    ): this.type = js.native
    def leftJoinAndMapOne(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def leftJoinAndMapOne(
      mapToProperty: String,
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: Unit,
      parameters: ObjectLiteral
    ): this.type = js.native
    
    /**
      * LEFT JOINs entity and adds all selection properties to SELECT.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndSelect(entity: js.Function, alias: String, condition: String): this.type = js.native
    def leftJoinAndSelect(entity: js.Function, alias: String, condition: String, parameters: ObjectLiteral): this.type = js.native
    /**
      * LEFT JOINs entity's property and adds all selection properties to SELECT.
      * Given entity property should be a relation.
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndSelect(property: String, alias: String): this.type = js.native
    def leftJoinAndSelect(property: String, alias: String, condition: String): this.type = js.native
    def leftJoinAndSelect(property: String, alias: String, condition: String, parameters: ObjectLiteral): this.type = js.native
    def leftJoinAndSelect(property: String, alias: String, condition: Unit, parameters: ObjectLiteral): this.type = js.native
    /**
      * LEFT JOINs given subquery and adds all selection properties to SELECT..
      * You also need to specify an alias of the joined data.
      * Optionally, you can add condition and parameters used in condition.
      */
    def leftJoinAndSelect(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String
    ): this.type = js.native
    def leftJoinAndSelect(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String
    ): this.type = js.native
    def leftJoinAndSelect(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: String,
      parameters: ObjectLiteral
    ): this.type = js.native
    def leftJoinAndSelect(
      subQueryFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      alias: String,
      condition: Unit,
      parameters: ObjectLiteral
    ): this.type = js.native
    
    /**
      * Set's LIMIT - maximum number of rows to be selected.
      * NOTE that it may not work as you expect if you are using joins.
      * If you want to implement pagination, and you are having join in your query,
      * then use instead take method instead.
      */
    def limit(): this.type = js.native
    def limit(limit: Double): this.type = js.native
    
    /**
      * Loads all relation ids for all relations of the selected entity.
      * All relation ids will be mapped to relation property themself.
      * If array of strings is given then loads only relation ids of the given properties.
      */
    def loadAllRelationIds(): this.type = js.native
    def loadAllRelationIds(options: DisableMixedMap): this.type = js.native
    
    /**
      * Loads raw results from the database.
      */
    /* protected */ def loadRawResults(queryRunner: QueryRunner): js.Promise[js.Any] = js.native
    
    /**
      * Counts number of entities of entity's relation and maps the value into some entity's property.
      * Optionally, you can add condition and parameters used in condition.
      */
    def loadRelationCountAndMap(mapToProperty: String, relationName: String): this.type = js.native
    def loadRelationCountAndMap(mapToProperty: String, relationName: String, aliasName: String): this.type = js.native
    def loadRelationCountAndMap(
      mapToProperty: String,
      relationName: String,
      aliasName: String,
      queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
    ): this.type = js.native
    def loadRelationCountAndMap(
      mapToProperty: String,
      relationName: String,
      aliasName: Unit,
      queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
    ): this.type = js.native
    
    /**
      */
    /**
      */
    /**
      */
    /**
      */
    /**
      * LEFT JOINs relation id and maps it into some entity's property.
      * Optionally, you can add condition and parameters used in condition.
      */
    def loadRelationIdAndMap(mapToProperty: String, relationName: String): this.type = js.native
    /**
      * LEFT JOINs relation id and maps it into some entity's property.
      * Optionally, you can add condition and parameters used in condition.
      */
    def loadRelationIdAndMap(
      mapToProperty: String,
      relationName: String,
      alias: String,
      queryBuilderFactory: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]
    ): this.type = js.native
    def loadRelationIdAndMap(mapToProperty: String, relationName: String, options: `4`): this.type = js.native
    
    /**
      * Merges into expression map given expression map properties.
      */
    /* protected */ def mergeExpressionMap(expressionMap: PartialQueryExpressionMap): this.type = js.native
    
    /**
      * Normalizes a give number - converts to int if possible.
      */
    /* protected */ def normalizeNumber(num: js.Any): js.Any = js.native
    
    /**
      * Set's OFFSET - selection offset.
      * NOTE that it may not work as you expect if you are using joins.
      * If you want to implement pagination, and you are having join in your query,
      * then use instead skip method instead.
      */
    def offset(): this.type = js.native
    def offset(offset: Double): this.type = js.native
    
    /**
      * Adds new OR HAVING condition in the query builder.
      * Additionally you can add parameters used in where expression.
      */
    def orHaving(having: String): this.type = js.native
    def orHaving(having: String, parameters: ObjectLiteral): this.type = js.native
    
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
      * Creates SELECT query.
      * Replaces all previous selections if they exist.
      */
    def select(selection: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]]): this.type = js.native
    def select(
      selection: js.Function1[/* qb */ SelectQueryBuilder[js.Any], SelectQueryBuilder[js.Any]],
      selectionAliasName: String
    ): this.type = js.native
    
    @JSName("setLock")
    def setLock_dirtyread(lockMode: dirty_read): this.type = js.native
    @JSName("setLock")
    def setLock_fornokeyupdate(lockMode: for_no_key_update): this.type = js.native
    /**
      * Sets locking mode.
      */
    @JSName("setLock")
    def setLock_optimistic(lockMode: optimistic, lockVersion: Double): this.type = js.native
    /**
      * Sets locking mode.
      */
    @JSName("setLock")
    def setLock_optimistic(lockMode: optimistic, lockVersion: Date): this.type = js.native
    @JSName("setLock")
    def setLock_pessimisticpartialwrite(lockMode: pessimistic_partial_write): this.type = js.native
    /**
      * Sets locking mode.
      */
    @JSName("setLock")
    def setLock_pessimisticread(lockMode: pessimistic_read): this.type = js.native
    @JSName("setLock")
    def setLock_pessimisticwrite(lockMode: pessimistic_write): this.type = js.native
    @JSName("setLock")
    def setLock_pessimisticwriteorfail(lockMode: pessimistic_write_or_fail): this.type = js.native
    
    /**
      * Sets extra options that can be used to configure how query builder works.
      */
    def setOption(option: SelectQueryBuilderOption): this.type = js.native
    
    /**
      * Sets number of entities to skip.
      */
    def skip(): this.type = js.native
    def skip(skip: Double): this.type = js.native
    
    /**
      * Executes built SQL query and returns raw data stream.
      */
    def stream(): js.Promise[ReadStream] = js.native
    
    /**
      * Creates a subquery - query that can be used inside other queries.
      */
    def subQuery(): SelectQueryBuilder[js.Any] = js.native
    
    /**
      * Sets maximal number of entities to take.
      */
    def take(): this.type = js.native
    def take(take: Double): this.type = js.native
    
    /**
      * Disables the global condition of "non-deleted" for the entity with delete date columns.
      */
    def withDeleted(): this.type = js.native
  }
}
