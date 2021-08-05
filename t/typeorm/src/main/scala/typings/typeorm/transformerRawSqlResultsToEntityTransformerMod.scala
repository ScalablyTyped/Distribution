package typings.typeorm

import typings.std.Map
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.driverDriverMod.Driver
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import typings.typeorm.queryBuilderAliasMod.Alias
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.relationCountRelationCountLoadResultMod.RelationCountLoadResult
import typings.typeorm.relationIdRelationIdLoadResultMod.RelationIdLoadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformerRawSqlResultsToEntityTransformerMod {
  
  @JSImport("typeorm/query-builder/transformer/RawSqlResultsToEntityTransformer", "RawSqlResultsToEntityTransformer")
  @js.native
  class RawSqlResultsToEntityTransformer protected () extends StObject {
    def this(
      expressionMap: QueryExpressionMap,
      driver: Driver,
      rawRelationIdResults: js.Array[RelationIdLoadResult],
      rawRelationCountResults: js.Array[RelationCountLoadResult]
    ) = this()
    def this(
      expressionMap: QueryExpressionMap,
      driver: Driver,
      rawRelationIdResults: js.Array[RelationIdLoadResult],
      rawRelationCountResults: js.Array[RelationCountLoadResult],
      queryRunner: QueryRunner
    ) = this()
    
    /* private */ var createValueMapFromJoinColumns: js.Any = js.native
    
    /* protected */ var driver: Driver = js.native
    
    /* protected */ var expressionMap: QueryExpressionMap = js.native
    
    /* private */ var extractEntityPrimaryIds: js.Any = js.native
    
    /**
      * Groups given raw results by ids of given alias.
      */
    /* protected */ def group(rawResults: js.Array[js.Any], alias: Alias): Map[String, js.Array[js.Any]] = js.native
    
    /* protected */ var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    /* protected */ var rawRelationCountResults: js.Array[RelationCountLoadResult] = js.native
    
    /* protected */ var rawRelationIdResults: js.Array[RelationIdLoadResult] = js.native
    
    /**
      * Since db returns a duplicated rows of the data where accuracies of the same object can be duplicated
      * we need to group our result and we must have some unique id (primary key in our case)
      */
    def transform(rawResults: js.Array[js.Any], alias: Alias): js.Array[js.Any] = js.native
    
    /* protected */ def transformColumns(rawResults: js.Array[js.Any], alias: Alias, entity: ObjectLiteral, metadata: EntityMetadata): Boolean = js.native
    
    /**
      * Transforms joined entities in the given raw results by a given alias and stores to the given (parent) entity
      */
    /* protected */ def transformJoins(rawResults: js.Array[js.Any], entity: ObjectLiteral, alias: Alias, metadata: EntityMetadata): Boolean = js.native
    
    /**
      * Transforms set of data results into single entity.
      */
    /* protected */ def transformRawResultsGroup(rawResults: js.Array[js.Any], alias: Alias): js.UndefOr[ObjectLiteral] = js.native
    
    /* protected */ def transformRelationCounts(rawSqlResults: js.Array[js.Any], alias: Alias, entity: ObjectLiteral): Boolean = js.native
    
    /* protected */ def transformRelationIds(rawSqlResults: js.Array[js.Any], alias: Alias, entity: ObjectLiteral, metadata: EntityMetadata): Boolean = js.native
  }
}
