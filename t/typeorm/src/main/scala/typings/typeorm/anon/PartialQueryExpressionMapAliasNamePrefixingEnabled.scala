package typings.typeorm.anon

import typings.std.Date
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.findOptionsOrderByConditionMod.OrderByCondition
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.metadataRelationMetadataMod.RelationMetadata
import typings.typeorm.queryBuilderAliasMod.Alias
import typings.typeorm.queryBuilderJoinAttributeMod.JoinAttribute
import typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import typings.typeorm.queryBuilderSelectQueryBuilderOptionMod.SelectQueryBuilderOption
import typings.typeorm.queryBuilderSelectQueryMod.SelectQuery
import typings.typeorm.relationCountRelationCountAttributeMod.RelationCountAttribute
import typings.typeorm.relationIdRelationIdAttributeMod.RelationIdAttribute
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typeorm.typeorm/query-builder/QueryExpressionMap.QueryExpressionMap> */
trait PartialQueryExpressionMapAliasNamePrefixingEnabled extends StObject {
  
  var aliasNamePrefixingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var aliases: js.UndefOr[js.Array[Alias]] = js.undefined
  
  var allOrderBys: js.UndefOr[OrderByCondition] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var cacheDuration: js.UndefOr[Double] = js.undefined
  
  var cacheId: js.UndefOr[String] = js.undefined
  
  var callListeners: js.UndefOr[Boolean] = js.undefined
  
  @JSName("clone")
  var clone_FPartialQueryExpressionMapAliasNamePrefixingEnabled: js.UndefOr[js.Function0[QueryExpressionMap]] = js.undefined
  
  var comment: js.UndefOr[String] = js.undefined
  
  var connection: js.UndefOr[typings.typeorm.connectionConnectionMod.Connection] = js.undefined
  
  var constructor: js.UndefOr[
    js.Function1[/* connection */ typings.typeorm.connectionConnectionMod.Connection, js.Any]
  ] = js.undefined
  
  var createAlias: js.UndefOr[js.Function1[/* options */ SubQuery, Alias]] = js.undefined
  
  var disableEscaping: js.UndefOr[Boolean] = js.undefined
  
  var enableRelationIdValues: js.UndefOr[Boolean] = js.undefined
  
  var extraAppendedAndWhereCondition: js.UndefOr[String] = js.undefined
  
  var extraReturningColumns: js.UndefOr[js.Array[ColumnMetadata]] = js.undefined
  
  var findAliasByName: js.UndefOr[js.Function1[/* aliasName */ String, Alias]] = js.undefined
  
  var findColumnByAliasExpression: js.UndefOr[js.Function1[/* aliasExpression */ String, js.UndefOr[ColumnMetadata]]] = js.undefined
  
  var groupBys: js.UndefOr[js.Array[String]] = js.undefined
  
  var havings: js.UndefOr[js.Array[Condition]] = js.undefined
  
  var insertColumns: js.UndefOr[js.Array[String]] = js.undefined
  
  var joinAttributes: js.UndefOr[js.Array[JoinAttribute]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var lockMode: js.UndefOr[
    optimistic | pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail | for_no_key_update
  ] = js.undefined
  
  var lockVersion: js.UndefOr[Double | Date] = js.undefined
  
  var mainAlias: js.UndefOr[Alias] = js.undefined
  
  var nativeParameters: js.UndefOr[ObjectLiteral] = js.undefined
  
  var of: js.UndefOr[js.Any | js.Array[js.Any]] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var onConflict: js.UndefOr[String] = js.undefined
  
  var onIgnore: js.UndefOr[String | Boolean] = js.undefined
  
  var onUpdate: js.UndefOr[Conflict] = js.undefined
  
  var options: js.UndefOr[js.Array[SelectQueryBuilderOption]] = js.undefined
  
  var orderBys: js.UndefOr[OrderByCondition] = js.undefined
  
  var parameters: js.UndefOr[ObjectLiteral] = js.undefined
  
  var parentQueryBuilder: js.UndefOr[QueryBuilder[js.Any]] = js.undefined
  
  var queryEntity: js.UndefOr[Boolean] = js.undefined
  
  var queryType: js.UndefOr[select | update | delete | insert | relation | `soft-delete` | restore] = js.undefined
  
  var relationCountAttributes: js.UndefOr[js.Array[RelationCountAttribute]] = js.undefined
  
  var relationIdAttributes: js.UndefOr[js.Array[RelationIdAttribute]] = js.undefined
  
  var relationMetadata: js.UndefOr[RelationMetadata] = js.undefined
  
  var relationPropertyPath: js.UndefOr[String] = js.undefined
  
  var returning: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var selectDistinct: js.UndefOr[Boolean] = js.undefined
  
  var selectDistinctOn: js.UndefOr[js.Array[String]] = js.undefined
  
  var selects: js.UndefOr[js.Array[SelectQuery]] = js.undefined
  
  var setMainAlias: js.UndefOr[js.Function1[/* alias */ Alias, Alias]] = js.undefined
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var subQuery: js.UndefOr[Boolean] = js.undefined
  
  var take: js.UndefOr[Double] = js.undefined
  
  var updateEntity: js.UndefOr[Boolean] = js.undefined
  
  var useTransaction: js.UndefOr[Boolean] = js.undefined
  
  var valuesSet: js.UndefOr[ObjectLiteral | js.Array[ObjectLiteral]] = js.undefined
  
  var whereEntities: js.UndefOr[js.Array[ObjectLiteral]] = js.undefined
  
  var wheres: js.UndefOr[js.Array[Condition]] = js.undefined
  
  var withDeleted: js.UndefOr[Boolean] = js.undefined
}
object PartialQueryExpressionMapAliasNamePrefixingEnabled {
  
  inline def apply(): PartialQueryExpressionMapAliasNamePrefixingEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialQueryExpressionMapAliasNamePrefixingEnabled]
  }
  
  extension [Self <: PartialQueryExpressionMapAliasNamePrefixingEnabled](x: Self) {
    
    inline def setAliasNamePrefixingEnabled(value: Boolean): Self = StObject.set(x, "aliasNamePrefixingEnabled", value.asInstanceOf[js.Any])
    
    inline def setAliasNamePrefixingEnabledUndefined: Self = StObject.set(x, "aliasNamePrefixingEnabled", js.undefined)
    
    inline def setAliases(value: js.Array[Alias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    inline def setAllOrderBys(value: OrderByCondition): Self = StObject.set(x, "allOrderBys", value.asInstanceOf[js.Any])
    
    inline def setAllOrderBysUndefined: Self = StObject.set(x, "allOrderBys", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheDuration(value: Double): Self = StObject.set(x, "cacheDuration", value.asInstanceOf[js.Any])
    
    inline def setCacheDurationUndefined: Self = StObject.set(x, "cacheDuration", js.undefined)
    
    inline def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
    
    inline def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCallListeners(value: Boolean): Self = StObject.set(x, "callListeners", value.asInstanceOf[js.Any])
    
    inline def setCallListenersUndefined: Self = StObject.set(x, "callListeners", js.undefined)
    
    inline def setClone_(value: () => QueryExpressionMap): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setConnection(value: typings.typeorm.connectionConnectionMod.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setConstructor(value: /* connection */ typings.typeorm.connectionConnectionMod.Connection => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setCreateAlias(value: /* options */ SubQuery => Alias): Self = StObject.set(x, "createAlias", js.Any.fromFunction1(value))
    
    inline def setCreateAliasUndefined: Self = StObject.set(x, "createAlias", js.undefined)
    
    inline def setDisableEscaping(value: Boolean): Self = StObject.set(x, "disableEscaping", value.asInstanceOf[js.Any])
    
    inline def setDisableEscapingUndefined: Self = StObject.set(x, "disableEscaping", js.undefined)
    
    inline def setEnableRelationIdValues(value: Boolean): Self = StObject.set(x, "enableRelationIdValues", value.asInstanceOf[js.Any])
    
    inline def setEnableRelationIdValuesUndefined: Self = StObject.set(x, "enableRelationIdValues", js.undefined)
    
    inline def setExtraAppendedAndWhereCondition(value: String): Self = StObject.set(x, "extraAppendedAndWhereCondition", value.asInstanceOf[js.Any])
    
    inline def setExtraAppendedAndWhereConditionUndefined: Self = StObject.set(x, "extraAppendedAndWhereCondition", js.undefined)
    
    inline def setExtraReturningColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "extraReturningColumns", value.asInstanceOf[js.Any])
    
    inline def setExtraReturningColumnsUndefined: Self = StObject.set(x, "extraReturningColumns", js.undefined)
    
    inline def setExtraReturningColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "extraReturningColumns", js.Array(value :_*))
    
    inline def setFindAliasByName(value: /* aliasName */ String => Alias): Self = StObject.set(x, "findAliasByName", js.Any.fromFunction1(value))
    
    inline def setFindAliasByNameUndefined: Self = StObject.set(x, "findAliasByName", js.undefined)
    
    inline def setFindColumnByAliasExpression(value: /* aliasExpression */ String => js.UndefOr[ColumnMetadata]): Self = StObject.set(x, "findColumnByAliasExpression", js.Any.fromFunction1(value))
    
    inline def setFindColumnByAliasExpressionUndefined: Self = StObject.set(x, "findColumnByAliasExpression", js.undefined)
    
    inline def setGroupBys(value: js.Array[String]): Self = StObject.set(x, "groupBys", value.asInstanceOf[js.Any])
    
    inline def setGroupBysUndefined: Self = StObject.set(x, "groupBys", js.undefined)
    
    inline def setGroupBysVarargs(value: String*): Self = StObject.set(x, "groupBys", js.Array(value :_*))
    
    inline def setHavings(value: js.Array[Condition]): Self = StObject.set(x, "havings", value.asInstanceOf[js.Any])
    
    inline def setHavingsUndefined: Self = StObject.set(x, "havings", js.undefined)
    
    inline def setHavingsVarargs(value: Condition*): Self = StObject.set(x, "havings", js.Array(value :_*))
    
    inline def setInsertColumns(value: js.Array[String]): Self = StObject.set(x, "insertColumns", value.asInstanceOf[js.Any])
    
    inline def setInsertColumnsUndefined: Self = StObject.set(x, "insertColumns", js.undefined)
    
    inline def setInsertColumnsVarargs(value: String*): Self = StObject.set(x, "insertColumns", js.Array(value :_*))
    
    inline def setJoinAttributes(value: js.Array[JoinAttribute]): Self = StObject.set(x, "joinAttributes", value.asInstanceOf[js.Any])
    
    inline def setJoinAttributesUndefined: Self = StObject.set(x, "joinAttributes", js.undefined)
    
    inline def setJoinAttributesVarargs(value: JoinAttribute*): Self = StObject.set(x, "joinAttributes", js.Array(value :_*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLockMode(
      value: optimistic | pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail | for_no_key_update
    ): Self = StObject.set(x, "lockMode", value.asInstanceOf[js.Any])
    
    inline def setLockModeUndefined: Self = StObject.set(x, "lockMode", js.undefined)
    
    inline def setLockVersion(value: Double | Date): Self = StObject.set(x, "lockVersion", value.asInstanceOf[js.Any])
    
    inline def setLockVersionUndefined: Self = StObject.set(x, "lockVersion", js.undefined)
    
    inline def setMainAlias(value: Alias): Self = StObject.set(x, "mainAlias", value.asInstanceOf[js.Any])
    
    inline def setMainAliasUndefined: Self = StObject.set(x, "mainAlias", js.undefined)
    
    inline def setNativeParameters(value: ObjectLiteral): Self = StObject.set(x, "nativeParameters", value.asInstanceOf[js.Any])
    
    inline def setNativeParametersUndefined: Self = StObject.set(x, "nativeParameters", js.undefined)
    
    inline def setOf(value: js.Any | js.Array[js.Any]): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    inline def setOfVarargs(value: js.Any*): Self = StObject.set(x, "of", js.Array(value :_*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnConflict(value: String): Self = StObject.set(x, "onConflict", value.asInstanceOf[js.Any])
    
    inline def setOnConflictUndefined: Self = StObject.set(x, "onConflict", js.undefined)
    
    inline def setOnIgnore(value: String | Boolean): Self = StObject.set(x, "onIgnore", value.asInstanceOf[js.Any])
    
    inline def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
    
    inline def setOnUpdate(value: Conflict): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    inline def setOptions(value: js.Array[SelectQueryBuilderOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: SelectQueryBuilderOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setOrderBys(value: OrderByCondition): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    inline def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    inline def setParameters(value: ObjectLiteral): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParentQueryBuilder(value: QueryBuilder[js.Any]): Self = StObject.set(x, "parentQueryBuilder", value.asInstanceOf[js.Any])
    
    inline def setParentQueryBuilderUndefined: Self = StObject.set(x, "parentQueryBuilder", js.undefined)
    
    inline def setQueryEntity(value: Boolean): Self = StObject.set(x, "queryEntity", value.asInstanceOf[js.Any])
    
    inline def setQueryEntityUndefined: Self = StObject.set(x, "queryEntity", js.undefined)
    
    inline def setQueryType(value: select | update | delete | insert | relation | `soft-delete` | restore): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setQueryTypeUndefined: Self = StObject.set(x, "queryType", js.undefined)
    
    inline def setRelationCountAttributes(value: js.Array[RelationCountAttribute]): Self = StObject.set(x, "relationCountAttributes", value.asInstanceOf[js.Any])
    
    inline def setRelationCountAttributesUndefined: Self = StObject.set(x, "relationCountAttributes", js.undefined)
    
    inline def setRelationCountAttributesVarargs(value: RelationCountAttribute*): Self = StObject.set(x, "relationCountAttributes", js.Array(value :_*))
    
    inline def setRelationIdAttributes(value: js.Array[RelationIdAttribute]): Self = StObject.set(x, "relationIdAttributes", value.asInstanceOf[js.Any])
    
    inline def setRelationIdAttributesUndefined: Self = StObject.set(x, "relationIdAttributes", js.undefined)
    
    inline def setRelationIdAttributesVarargs(value: RelationIdAttribute*): Self = StObject.set(x, "relationIdAttributes", js.Array(value :_*))
    
    inline def setRelationMetadata(value: RelationMetadata): Self = StObject.set(x, "relationMetadata", value.asInstanceOf[js.Any])
    
    inline def setRelationMetadataUndefined: Self = StObject.set(x, "relationMetadata", js.undefined)
    
    inline def setRelationPropertyPath(value: String): Self = StObject.set(x, "relationPropertyPath", value.asInstanceOf[js.Any])
    
    inline def setRelationPropertyPathUndefined: Self = StObject.set(x, "relationPropertyPath", js.undefined)
    
    inline def setReturning(value: String | js.Array[String]): Self = StObject.set(x, "returning", value.asInstanceOf[js.Any])
    
    inline def setReturningUndefined: Self = StObject.set(x, "returning", js.undefined)
    
    inline def setReturningVarargs(value: String*): Self = StObject.set(x, "returning", js.Array(value :_*))
    
    inline def setSelectDistinct(value: Boolean): Self = StObject.set(x, "selectDistinct", value.asInstanceOf[js.Any])
    
    inline def setSelectDistinctOn(value: js.Array[String]): Self = StObject.set(x, "selectDistinctOn", value.asInstanceOf[js.Any])
    
    inline def setSelectDistinctOnUndefined: Self = StObject.set(x, "selectDistinctOn", js.undefined)
    
    inline def setSelectDistinctOnVarargs(value: String*): Self = StObject.set(x, "selectDistinctOn", js.Array(value :_*))
    
    inline def setSelectDistinctUndefined: Self = StObject.set(x, "selectDistinct", js.undefined)
    
    inline def setSelects(value: js.Array[SelectQuery]): Self = StObject.set(x, "selects", value.asInstanceOf[js.Any])
    
    inline def setSelectsUndefined: Self = StObject.set(x, "selects", js.undefined)
    
    inline def setSelectsVarargs(value: SelectQuery*): Self = StObject.set(x, "selects", js.Array(value :_*))
    
    inline def setSetMainAlias(value: /* alias */ Alias => Alias): Self = StObject.set(x, "setMainAlias", js.Any.fromFunction1(value))
    
    inline def setSetMainAliasUndefined: Self = StObject.set(x, "setMainAlias", js.undefined)
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSubQuery(value: Boolean): Self = StObject.set(x, "subQuery", value.asInstanceOf[js.Any])
    
    inline def setSubQueryUndefined: Self = StObject.set(x, "subQuery", js.undefined)
    
    inline def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    inline def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
    
    inline def setUpdateEntity(value: Boolean): Self = StObject.set(x, "updateEntity", value.asInstanceOf[js.Any])
    
    inline def setUpdateEntityUndefined: Self = StObject.set(x, "updateEntity", js.undefined)
    
    inline def setUseTransaction(value: Boolean): Self = StObject.set(x, "useTransaction", value.asInstanceOf[js.Any])
    
    inline def setUseTransactionUndefined: Self = StObject.set(x, "useTransaction", js.undefined)
    
    inline def setValuesSet(value: ObjectLiteral | js.Array[ObjectLiteral]): Self = StObject.set(x, "valuesSet", value.asInstanceOf[js.Any])
    
    inline def setValuesSetUndefined: Self = StObject.set(x, "valuesSet", js.undefined)
    
    inline def setValuesSetVarargs(value: ObjectLiteral*): Self = StObject.set(x, "valuesSet", js.Array(value :_*))
    
    inline def setWhereEntities(value: js.Array[ObjectLiteral]): Self = StObject.set(x, "whereEntities", value.asInstanceOf[js.Any])
    
    inline def setWhereEntitiesUndefined: Self = StObject.set(x, "whereEntities", js.undefined)
    
    inline def setWhereEntitiesVarargs(value: ObjectLiteral*): Self = StObject.set(x, "whereEntities", js.Array(value :_*))
    
    inline def setWheres(value: js.Array[Condition]): Self = StObject.set(x, "wheres", value.asInstanceOf[js.Any])
    
    inline def setWheresUndefined: Self = StObject.set(x, "wheres", js.undefined)
    
    inline def setWheresVarargs(value: Condition*): Self = StObject.set(x, "wheres", js.Array(value :_*))
    
    inline def setWithDeleted(value: Boolean): Self = StObject.set(x, "withDeleted", value.asInstanceOf[js.Any])
    
    inline def setWithDeletedUndefined: Self = StObject.set(x, "withDeleted", js.undefined)
  }
}
