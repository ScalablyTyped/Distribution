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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typeorm.typeorm/query-builder/QueryExpressionMap.QueryExpressionMap> */
@js.native
trait PartialQueryExpressionMapAliasNamePrefixingEnabled extends StObject {
  
  var aliasNamePrefixingEnabled: js.UndefOr[Boolean] = js.native
  
  var aliases: js.UndefOr[js.Array[Alias]] = js.native
  
  var allOrderBys: js.UndefOr[OrderByCondition] = js.native
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var cacheDuration: js.UndefOr[Double] = js.native
  
  var cacheId: js.UndefOr[String] = js.native
  
  var callListeners: js.UndefOr[Boolean] = js.native
  
  @JSName("clone")
  var clone_FPartialQueryExpressionMapAliasNamePrefixingEnabled: js.UndefOr[js.Function0[QueryExpressionMap]] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var connection: js.UndefOr[typings.typeorm.connectionConnectionMod.Connection] = js.native
  
  var constructor: js.UndefOr[
    js.Function1[/* connection */ typings.typeorm.connectionConnectionMod.Connection, js.Any]
  ] = js.native
  
  var createAlias: js.UndefOr[js.Function1[/* options */ SubQuery, Alias]] = js.native
  
  var disableEscaping: js.UndefOr[Boolean] = js.native
  
  var enableRelationIdValues: js.UndefOr[Boolean] = js.native
  
  var extraAppendedAndWhereCondition: js.UndefOr[String] = js.native
  
  var extraReturningColumns: js.UndefOr[js.Array[ColumnMetadata]] = js.native
  
  var findAliasByName: js.UndefOr[js.Function1[/* aliasName */ String, Alias]] = js.native
  
  var findColumnByAliasExpression: js.UndefOr[js.Function1[/* aliasExpression */ String, js.UndefOr[ColumnMetadata]]] = js.native
  
  var groupBys: js.UndefOr[js.Array[String]] = js.native
  
  var havings: js.UndefOr[js.Array[Condition]] = js.native
  
  var insertColumns: js.UndefOr[js.Array[String]] = js.native
  
  var joinAttributes: js.UndefOr[js.Array[JoinAttribute]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var lockMode: js.UndefOr[
    optimistic | pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail | for_no_key_update
  ] = js.native
  
  var lockVersion: js.UndefOr[Double | Date] = js.native
  
  var mainAlias: js.UndefOr[Alias] = js.native
  
  var nativeParameters: js.UndefOr[ObjectLiteral] = js.native
  
  var of: js.UndefOr[js.Any | js.Array[_]] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var onConflict: js.UndefOr[String] = js.native
  
  var onIgnore: js.UndefOr[String | Boolean] = js.native
  
  var onUpdate: js.UndefOr[Conflict] = js.native
  
  var options: js.UndefOr[js.Array[SelectQueryBuilderOption]] = js.native
  
  var orderBys: js.UndefOr[OrderByCondition] = js.native
  
  var parameters: js.UndefOr[ObjectLiteral] = js.native
  
  var parentQueryBuilder: js.UndefOr[QueryBuilder[_]] = js.native
  
  var queryEntity: js.UndefOr[Boolean] = js.native
  
  var queryType: js.UndefOr[select | update | delete | insert | relation | `soft-delete` | restore] = js.native
  
  var relationCountAttributes: js.UndefOr[js.Array[RelationCountAttribute]] = js.native
  
  var relationIdAttributes: js.UndefOr[js.Array[RelationIdAttribute]] = js.native
  
  var relationMetadata: js.UndefOr[RelationMetadata] = js.native
  
  var relationPropertyPath: js.UndefOr[String] = js.native
  
  var returning: js.UndefOr[String | js.Array[String]] = js.native
  
  var selectDistinct: js.UndefOr[Boolean] = js.native
  
  var selectDistinctOn: js.UndefOr[js.Array[String]] = js.native
  
  var selects: js.UndefOr[js.Array[SelectQuery]] = js.native
  
  var setMainAlias: js.UndefOr[js.Function1[/* alias */ Alias, Alias]] = js.native
  
  var skip: js.UndefOr[Double] = js.native
  
  var subQuery: js.UndefOr[Boolean] = js.native
  
  var take: js.UndefOr[Double] = js.native
  
  var updateEntity: js.UndefOr[Boolean] = js.native
  
  var useTransaction: js.UndefOr[Boolean] = js.native
  
  var valuesSet: js.UndefOr[ObjectLiteral | js.Array[ObjectLiteral]] = js.native
  
  var whereEntities: js.UndefOr[js.Array[ObjectLiteral]] = js.native
  
  var wheres: js.UndefOr[js.Array[Condition]] = js.native
  
  var withDeleted: js.UndefOr[Boolean] = js.native
}
object PartialQueryExpressionMapAliasNamePrefixingEnabled {
  
  @scala.inline
  def apply(): PartialQueryExpressionMapAliasNamePrefixingEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialQueryExpressionMapAliasNamePrefixingEnabled]
  }
  
  @scala.inline
  implicit class PartialQueryExpressionMapAliasNamePrefixingEnabledMutableBuilder[Self <: PartialQueryExpressionMapAliasNamePrefixingEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasNamePrefixingEnabled(value: Boolean): Self = StObject.set(x, "aliasNamePrefixingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNamePrefixingEnabledUndefined: Self = StObject.set(x, "aliasNamePrefixingEnabled", js.undefined)
    
    @scala.inline
    def setAliases(value: js.Array[Alias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setAllOrderBys(value: OrderByCondition): Self = StObject.set(x, "allOrderBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllOrderBysUndefined: Self = StObject.set(x, "allOrderBys", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheDuration(value: Double): Self = StObject.set(x, "cacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheDurationUndefined: Self = StObject.set(x, "cacheDuration", js.undefined)
    
    @scala.inline
    def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setCallListeners(value: Boolean): Self = StObject.set(x, "callListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallListenersUndefined: Self = StObject.set(x, "callListeners", js.undefined)
    
    @scala.inline
    def setClone_(value: () => QueryExpressionMap): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setConnection(value: typings.typeorm.connectionConnectionMod.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setConstructor(value: /* connection */ typings.typeorm.connectionConnectionMod.Connection => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    @scala.inline
    def setCreateAlias(value: /* options */ SubQuery => Alias): Self = StObject.set(x, "createAlias", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAliasUndefined: Self = StObject.set(x, "createAlias", js.undefined)
    
    @scala.inline
    def setDisableEscaping(value: Boolean): Self = StObject.set(x, "disableEscaping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableEscapingUndefined: Self = StObject.set(x, "disableEscaping", js.undefined)
    
    @scala.inline
    def setEnableRelationIdValues(value: Boolean): Self = StObject.set(x, "enableRelationIdValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRelationIdValuesUndefined: Self = StObject.set(x, "enableRelationIdValues", js.undefined)
    
    @scala.inline
    def setExtraAppendedAndWhereCondition(value: String): Self = StObject.set(x, "extraAppendedAndWhereCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraAppendedAndWhereConditionUndefined: Self = StObject.set(x, "extraAppendedAndWhereCondition", js.undefined)
    
    @scala.inline
    def setExtraReturningColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "extraReturningColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraReturningColumnsUndefined: Self = StObject.set(x, "extraReturningColumns", js.undefined)
    
    @scala.inline
    def setExtraReturningColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "extraReturningColumns", js.Array(value :_*))
    
    @scala.inline
    def setFindAliasByName(value: /* aliasName */ String => Alias): Self = StObject.set(x, "findAliasByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindAliasByNameUndefined: Self = StObject.set(x, "findAliasByName", js.undefined)
    
    @scala.inline
    def setFindColumnByAliasExpression(value: /* aliasExpression */ String => js.UndefOr[ColumnMetadata]): Self = StObject.set(x, "findColumnByAliasExpression", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindColumnByAliasExpressionUndefined: Self = StObject.set(x, "findColumnByAliasExpression", js.undefined)
    
    @scala.inline
    def setGroupBys(value: js.Array[String]): Self = StObject.set(x, "groupBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBysUndefined: Self = StObject.set(x, "groupBys", js.undefined)
    
    @scala.inline
    def setGroupBysVarargs(value: String*): Self = StObject.set(x, "groupBys", js.Array(value :_*))
    
    @scala.inline
    def setHavings(value: js.Array[Condition]): Self = StObject.set(x, "havings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHavingsUndefined: Self = StObject.set(x, "havings", js.undefined)
    
    @scala.inline
    def setHavingsVarargs(value: Condition*): Self = StObject.set(x, "havings", js.Array(value :_*))
    
    @scala.inline
    def setInsertColumns(value: js.Array[String]): Self = StObject.set(x, "insertColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertColumnsUndefined: Self = StObject.set(x, "insertColumns", js.undefined)
    
    @scala.inline
    def setInsertColumnsVarargs(value: String*): Self = StObject.set(x, "insertColumns", js.Array(value :_*))
    
    @scala.inline
    def setJoinAttributes(value: js.Array[JoinAttribute]): Self = StObject.set(x, "joinAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinAttributesUndefined: Self = StObject.set(x, "joinAttributes", js.undefined)
    
    @scala.inline
    def setJoinAttributesVarargs(value: JoinAttribute*): Self = StObject.set(x, "joinAttributes", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLockMode(
      value: optimistic | pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail | for_no_key_update
    ): Self = StObject.set(x, "lockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockModeUndefined: Self = StObject.set(x, "lockMode", js.undefined)
    
    @scala.inline
    def setLockVersion(value: Double | Date): Self = StObject.set(x, "lockVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockVersionUndefined: Self = StObject.set(x, "lockVersion", js.undefined)
    
    @scala.inline
    def setMainAlias(value: Alias): Self = StObject.set(x, "mainAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainAliasUndefined: Self = StObject.set(x, "mainAlias", js.undefined)
    
    @scala.inline
    def setNativeParameters(value: ObjectLiteral): Self = StObject.set(x, "nativeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeParametersUndefined: Self = StObject.set(x, "nativeParameters", js.undefined)
    
    @scala.inline
    def setOf(value: js.Any | js.Array[_]): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    @scala.inline
    def setOfVarargs(value: js.Any*): Self = StObject.set(x, "of", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnConflict(value: String): Self = StObject.set(x, "onConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnConflictUndefined: Self = StObject.set(x, "onConflict", js.undefined)
    
    @scala.inline
    def setOnIgnore(value: String | Boolean): Self = StObject.set(x, "onIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: Conflict): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[SelectQueryBuilderOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: SelectQueryBuilderOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setOrderBys(value: OrderByCondition): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    @scala.inline
    def setParameters(value: ObjectLiteral): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParentQueryBuilder(value: QueryBuilder[_]): Self = StObject.set(x, "parentQueryBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentQueryBuilderUndefined: Self = StObject.set(x, "parentQueryBuilder", js.undefined)
    
    @scala.inline
    def setQueryEntity(value: Boolean): Self = StObject.set(x, "queryEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryEntityUndefined: Self = StObject.set(x, "queryEntity", js.undefined)
    
    @scala.inline
    def setQueryType(value: select | update | delete | insert | relation | `soft-delete` | restore): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTypeUndefined: Self = StObject.set(x, "queryType", js.undefined)
    
    @scala.inline
    def setRelationCountAttributes(value: js.Array[RelationCountAttribute]): Self = StObject.set(x, "relationCountAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationCountAttributesUndefined: Self = StObject.set(x, "relationCountAttributes", js.undefined)
    
    @scala.inline
    def setRelationCountAttributesVarargs(value: RelationCountAttribute*): Self = StObject.set(x, "relationCountAttributes", js.Array(value :_*))
    
    @scala.inline
    def setRelationIdAttributes(value: js.Array[RelationIdAttribute]): Self = StObject.set(x, "relationIdAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationIdAttributesUndefined: Self = StObject.set(x, "relationIdAttributes", js.undefined)
    
    @scala.inline
    def setRelationIdAttributesVarargs(value: RelationIdAttribute*): Self = StObject.set(x, "relationIdAttributes", js.Array(value :_*))
    
    @scala.inline
    def setRelationMetadata(value: RelationMetadata): Self = StObject.set(x, "relationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationMetadataUndefined: Self = StObject.set(x, "relationMetadata", js.undefined)
    
    @scala.inline
    def setRelationPropertyPath(value: String): Self = StObject.set(x, "relationPropertyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationPropertyPathUndefined: Self = StObject.set(x, "relationPropertyPath", js.undefined)
    
    @scala.inline
    def setReturning(value: String | js.Array[String]): Self = StObject.set(x, "returning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturningUndefined: Self = StObject.set(x, "returning", js.undefined)
    
    @scala.inline
    def setReturningVarargs(value: String*): Self = StObject.set(x, "returning", js.Array(value :_*))
    
    @scala.inline
    def setSelectDistinct(value: Boolean): Self = StObject.set(x, "selectDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectDistinctOn(value: js.Array[String]): Self = StObject.set(x, "selectDistinctOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectDistinctOnUndefined: Self = StObject.set(x, "selectDistinctOn", js.undefined)
    
    @scala.inline
    def setSelectDistinctOnVarargs(value: String*): Self = StObject.set(x, "selectDistinctOn", js.Array(value :_*))
    
    @scala.inline
    def setSelectDistinctUndefined: Self = StObject.set(x, "selectDistinct", js.undefined)
    
    @scala.inline
    def setSelects(value: js.Array[SelectQuery]): Self = StObject.set(x, "selects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectsUndefined: Self = StObject.set(x, "selects", js.undefined)
    
    @scala.inline
    def setSelectsVarargs(value: SelectQuery*): Self = StObject.set(x, "selects", js.Array(value :_*))
    
    @scala.inline
    def setSetMainAlias(value: /* alias */ Alias => Alias): Self = StObject.set(x, "setMainAlias", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMainAliasUndefined: Self = StObject.set(x, "setMainAlias", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSubQuery(value: Boolean): Self = StObject.set(x, "subQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubQueryUndefined: Self = StObject.set(x, "subQuery", js.undefined)
    
    @scala.inline
    def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
    
    @scala.inline
    def setUpdateEntity(value: Boolean): Self = StObject.set(x, "updateEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEntityUndefined: Self = StObject.set(x, "updateEntity", js.undefined)
    
    @scala.inline
    def setUseTransaction(value: Boolean): Self = StObject.set(x, "useTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransactionUndefined: Self = StObject.set(x, "useTransaction", js.undefined)
    
    @scala.inline
    def setValuesSet(value: ObjectLiteral | js.Array[ObjectLiteral]): Self = StObject.set(x, "valuesSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesSetUndefined: Self = StObject.set(x, "valuesSet", js.undefined)
    
    @scala.inline
    def setValuesSetVarargs(value: ObjectLiteral*): Self = StObject.set(x, "valuesSet", js.Array(value :_*))
    
    @scala.inline
    def setWhereEntities(value: js.Array[ObjectLiteral]): Self = StObject.set(x, "whereEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereEntitiesUndefined: Self = StObject.set(x, "whereEntities", js.undefined)
    
    @scala.inline
    def setWhereEntitiesVarargs(value: ObjectLiteral*): Self = StObject.set(x, "whereEntities", js.Array(value :_*))
    
    @scala.inline
    def setWheres(value: js.Array[Condition]): Self = StObject.set(x, "wheres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheresUndefined: Self = StObject.set(x, "wheres", js.undefined)
    
    @scala.inline
    def setWheresVarargs(value: Condition*): Self = StObject.set(x, "wheres", js.Array(value :_*))
    
    @scala.inline
    def setWithDeleted(value: Boolean): Self = StObject.set(x, "withDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithDeletedUndefined: Self = StObject.set(x, "withDeleted", js.undefined)
  }
}
