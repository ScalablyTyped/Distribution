package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import typings.typeorm.queryRunnerQueryRunnerMod.QueryRunner
import typings.typeorm.resultInsertResultMod.InsertResult
import typings.typeorm.resultUpdateResultMod.UpdateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderReturningResultsEntityUpdatorMod {
  
  @JSImport("typeorm/query-builder/ReturningResultsEntityUpdator", "ReturningResultsEntityUpdator")
  @js.native
  class ReturningResultsEntityUpdator protected () extends StObject {
    def this(queryRunner: QueryRunner, expressionMap: QueryExpressionMap) = this()
    
    var expressionMap: QueryExpressionMap = js.native
    
    /**
      * Columns we need to be returned from the database when we insert entity.
      */
    def getInsertionReturningColumns(): js.Array[ColumnMetadata] = js.native
    
    /**
      * Columns we need to be returned from the database when we update entity.
      */
    def getUpdationReturningColumns(): js.Array[ColumnMetadata] = js.native
    
    /**
      * Updates entities with a special columns after insertion query execution.
      */
    def insert(insertResult: InsertResult, entities: js.Array[ObjectLiteral]): js.Promise[Unit] = js.native
    
    var queryRunner: QueryRunner = js.native
    
    /**
      * Updates entities with a special columns after updation query execution.
      */
    def update(updateResult: UpdateResult, entities: js.Array[ObjectLiteral]): js.Promise[Unit] = js.native
  }
}
