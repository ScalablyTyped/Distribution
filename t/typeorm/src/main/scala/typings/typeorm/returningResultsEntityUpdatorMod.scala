package typings.typeorm

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.insertResultMod.InsertResult
import typings.typeorm.objectLiteralMod.ObjectLiteral
import typings.typeorm.queryExpressionMapMod.QueryExpressionMap
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.updateResultMod.UpdateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object returningResultsEntityUpdatorMod {
  
  @JSImport("typeorm/browser/query-builder/ReturningResultsEntityUpdator", "ReturningResultsEntityUpdator")
  @js.native
  class ReturningResultsEntityUpdator protected () extends StObject {
    def this(queryRunner: QueryRunner, expressionMap: QueryExpressionMap) = this()
    
    /* protected */ var expressionMap: QueryExpressionMap = js.native
    
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
    
    /* protected */ var queryRunner: QueryRunner = js.native
    
    /**
      * Updates entities with a special columns after updation query execution.
      */
    def update(updateResult: UpdateResult, entities: js.Array[ObjectLiteral]): js.Promise[Unit] = js.native
  }
}
