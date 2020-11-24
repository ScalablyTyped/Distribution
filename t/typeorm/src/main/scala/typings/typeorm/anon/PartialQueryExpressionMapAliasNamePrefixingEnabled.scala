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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typeorm.typeorm/query-builder/QueryExpressionMap.QueryExpressionMap> */
@js.native
trait PartialQueryExpressionMapAliasNamePrefixingEnabled extends js.Object {
  
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
  implicit class PartialQueryExpressionMapAliasNamePrefixingEnabledOps[Self <: PartialQueryExpressionMapAliasNamePrefixingEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAliasNamePrefixingEnabled(value: Boolean): Self = this.set("aliasNamePrefixingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasNamePrefixingEnabled: Self = this.set("aliasNamePrefixingEnabled", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: Alias*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[Alias]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setAllOrderBys(value: OrderByCondition): Self = this.set("allOrderBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllOrderBys: Self = this.set("allOrderBys", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheDuration(value: Double): Self = this.set("cacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDuration: Self = this.set("cacheDuration", js.undefined)
    
    @scala.inline
    def setCacheId(value: String): Self = this.set("cacheId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheId: Self = this.set("cacheId", js.undefined)
    
    @scala.inline
    def setCallListeners(value: Boolean): Self = this.set("callListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallListeners: Self = this.set("callListeners", js.undefined)
    
    @scala.inline
    def setClone(value: () => QueryExpressionMap): Self = this.set("clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setConnection(value: typings.typeorm.connectionConnectionMod.Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setConstructor(value: /* connection */ typings.typeorm.connectionConnectionMod.Connection => js.Any): Self = this.set("constructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    
    @scala.inline
    def setCreateAlias(value: /* options */ SubQuery => Alias): Self = this.set("createAlias", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateAlias: Self = this.set("createAlias", js.undefined)
    
    @scala.inline
    def setDisableEscaping(value: Boolean): Self = this.set("disableEscaping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEscaping: Self = this.set("disableEscaping", js.undefined)
    
    @scala.inline
    def setEnableRelationIdValues(value: Boolean): Self = this.set("enableRelationIdValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRelationIdValues: Self = this.set("enableRelationIdValues", js.undefined)
    
    @scala.inline
    def setExtraAppendedAndWhereCondition(value: String): Self = this.set("extraAppendedAndWhereCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraAppendedAndWhereCondition: Self = this.set("extraAppendedAndWhereCondition", js.undefined)
    
    @scala.inline
    def setExtraReturningColumnsVarargs(value: ColumnMetadata*): Self = this.set("extraReturningColumns", js.Array(value :_*))
    
    @scala.inline
    def setExtraReturningColumns(value: js.Array[ColumnMetadata]): Self = this.set("extraReturningColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraReturningColumns: Self = this.set("extraReturningColumns", js.undefined)
    
    @scala.inline
    def setFindAliasByName(value: /* aliasName */ String => Alias): Self = this.set("findAliasByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFindAliasByName: Self = this.set("findAliasByName", js.undefined)
    
    @scala.inline
    def setFindColumnByAliasExpression(value: /* aliasExpression */ String => js.UndefOr[ColumnMetadata]): Self = this.set("findColumnByAliasExpression", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFindColumnByAliasExpression: Self = this.set("findColumnByAliasExpression", js.undefined)
    
    @scala.inline
    def setGroupBysVarargs(value: String*): Self = this.set("groupBys", js.Array(value :_*))
    
    @scala.inline
    def setGroupBys(value: js.Array[String]): Self = this.set("groupBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBys: Self = this.set("groupBys", js.undefined)
    
    @scala.inline
    def setHavingsVarargs(value: Condition*): Self = this.set("havings", js.Array(value :_*))
    
    @scala.inline
    def setHavings(value: js.Array[Condition]): Self = this.set("havings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHavings: Self = this.set("havings", js.undefined)
    
    @scala.inline
    def setInsertColumnsVarargs(value: String*): Self = this.set("insertColumns", js.Array(value :_*))
    
    @scala.inline
    def setInsertColumns(value: js.Array[String]): Self = this.set("insertColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertColumns: Self = this.set("insertColumns", js.undefined)
    
    @scala.inline
    def setJoinAttributesVarargs(value: JoinAttribute*): Self = this.set("joinAttributes", js.Array(value :_*))
    
    @scala.inline
    def setJoinAttributes(value: js.Array[JoinAttribute]): Self = this.set("joinAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinAttributes: Self = this.set("joinAttributes", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLockMode(
      value: optimistic | pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail | for_no_key_update
    ): Self = this.set("lockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockMode: Self = this.set("lockMode", js.undefined)
    
    @scala.inline
    def setLockVersion(value: Double | Date): Self = this.set("lockVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockVersion: Self = this.set("lockVersion", js.undefined)
    
    @scala.inline
    def setMainAlias(value: Alias): Self = this.set("mainAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainAlias: Self = this.set("mainAlias", js.undefined)
    
    @scala.inline
    def setNativeParameters(value: ObjectLiteral): Self = this.set("nativeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeParameters: Self = this.set("nativeParameters", js.undefined)
    
    @scala.inline
    def setOfVarargs(value: js.Any*): Self = this.set("of", js.Array(value :_*))
    
    @scala.inline
    def setOf(value: js.Any | js.Array[_]): Self = this.set("of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOf: Self = this.set("of", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnConflict(value: String): Self = this.set("onConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnConflict: Self = this.set("onConflict", js.undefined)
    
    @scala.inline
    def setOnIgnore(value: String | Boolean): Self = this.set("onIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnIgnore: Self = this.set("onIgnore", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: Conflict): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: SelectQueryBuilderOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[SelectQueryBuilderOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOrderBys(value: OrderByCondition): Self = this.set("orderBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBys: Self = this.set("orderBys", js.undefined)
    
    @scala.inline
    def setParameters(value: ObjectLiteral): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setParentQueryBuilder(value: QueryBuilder[_]): Self = this.set("parentQueryBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentQueryBuilder: Self = this.set("parentQueryBuilder", js.undefined)
    
    @scala.inline
    def setQueryEntity(value: Boolean): Self = this.set("queryEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryEntity: Self = this.set("queryEntity", js.undefined)
    
    @scala.inline
    def setQueryType(value: select | update | delete | insert | relation | `soft-delete` | restore): Self = this.set("queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryType: Self = this.set("queryType", js.undefined)
    
    @scala.inline
    def setRelationCountAttributesVarargs(value: RelationCountAttribute*): Self = this.set("relationCountAttributes", js.Array(value :_*))
    
    @scala.inline
    def setRelationCountAttributes(value: js.Array[RelationCountAttribute]): Self = this.set("relationCountAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationCountAttributes: Self = this.set("relationCountAttributes", js.undefined)
    
    @scala.inline
    def setRelationIdAttributesVarargs(value: RelationIdAttribute*): Self = this.set("relationIdAttributes", js.Array(value :_*))
    
    @scala.inline
    def setRelationIdAttributes(value: js.Array[RelationIdAttribute]): Self = this.set("relationIdAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationIdAttributes: Self = this.set("relationIdAttributes", js.undefined)
    
    @scala.inline
    def setRelationMetadata(value: RelationMetadata): Self = this.set("relationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationMetadata: Self = this.set("relationMetadata", js.undefined)
    
    @scala.inline
    def setRelationPropertyPath(value: String): Self = this.set("relationPropertyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationPropertyPath: Self = this.set("relationPropertyPath", js.undefined)
    
    @scala.inline
    def setReturningVarargs(value: String*): Self = this.set("returning", js.Array(value :_*))
    
    @scala.inline
    def setReturning(value: String | js.Array[String]): Self = this.set("returning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturning: Self = this.set("returning", js.undefined)
    
    @scala.inline
    def setSelectDistinct(value: Boolean): Self = this.set("selectDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectDistinct: Self = this.set("selectDistinct", js.undefined)
    
    @scala.inline
    def setSelectDistinctOnVarargs(value: String*): Self = this.set("selectDistinctOn", js.Array(value :_*))
    
    @scala.inline
    def setSelectDistinctOn(value: js.Array[String]): Self = this.set("selectDistinctOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectDistinctOn: Self = this.set("selectDistinctOn", js.undefined)
    
    @scala.inline
    def setSelectsVarargs(value: SelectQuery*): Self = this.set("selects", js.Array(value :_*))
    
    @scala.inline
    def setSelects(value: js.Array[SelectQuery]): Self = this.set("selects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelects: Self = this.set("selects", js.undefined)
    
    @scala.inline
    def setSetMainAlias(value: /* alias */ Alias => Alias): Self = this.set("setMainAlias", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMainAlias: Self = this.set("setMainAlias", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSubQuery(value: Boolean): Self = this.set("subQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubQuery: Self = this.set("subQuery", js.undefined)
    
    @scala.inline
    def setTake(value: Double): Self = this.set("take", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTake: Self = this.set("take", js.undefined)
    
    @scala.inline
    def setUpdateEntity(value: Boolean): Self = this.set("updateEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateEntity: Self = this.set("updateEntity", js.undefined)
    
    @scala.inline
    def setUseTransaction(value: Boolean): Self = this.set("useTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTransaction: Self = this.set("useTransaction", js.undefined)
    
    @scala.inline
    def setValuesSetVarargs(value: ObjectLiteral*): Self = this.set("valuesSet", js.Array(value :_*))
    
    @scala.inline
    def setValuesSet(value: ObjectLiteral | js.Array[ObjectLiteral]): Self = this.set("valuesSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuesSet: Self = this.set("valuesSet", js.undefined)
    
    @scala.inline
    def setWhereEntitiesVarargs(value: ObjectLiteral*): Self = this.set("whereEntities", js.Array(value :_*))
    
    @scala.inline
    def setWhereEntities(value: js.Array[ObjectLiteral]): Self = this.set("whereEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhereEntities: Self = this.set("whereEntities", js.undefined)
    
    @scala.inline
    def setWheresVarargs(value: Condition*): Self = this.set("wheres", js.Array(value :_*))
    
    @scala.inline
    def setWheres(value: js.Array[Condition]): Self = this.set("wheres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheres: Self = this.set("wheres", js.undefined)
    
    @scala.inline
    def setWithDeleted(value: Boolean): Self = this.set("withDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithDeleted: Self = this.set("withDeleted", js.undefined)
  }
}
