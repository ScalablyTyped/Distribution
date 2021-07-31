package typings.typeorm

import typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderRelationUpdaterMod {
  
  @JSImport("typeorm/query-builder/RelationUpdater", "RelationUpdater")
  @js.native
  class RelationUpdater protected () extends StObject {
    def this(queryBuilder: QueryBuilder[js.Any], expressionMap: QueryExpressionMap) = this()
    
    var expressionMap: QueryExpressionMap = js.native
    
    var queryBuilder: QueryBuilder[js.Any] = js.native
    
    /**
      * Performs set or add operation on a relation.
      */
    def update(value: js.Any): js.Promise[Unit] = js.native
    def update(value: js.Array[js.Any]): js.Promise[Unit] = js.native
  }
}
