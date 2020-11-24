package typings.typeorm

import typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/RelationUpdater", JSImport.Namespace)
@js.native
object queryBuilderRelationUpdaterMod extends js.Object {
  
  @js.native
  class RelationUpdater protected () extends js.Object {
    def this(queryBuilder: QueryBuilder[_], expressionMap: QueryExpressionMap) = this()
    
    var expressionMap: QueryExpressionMap = js.native
    
    var queryBuilder: QueryBuilder[_] = js.native
    
    /**
      * Performs set or add operation on a relation.
      */
    def update(value: js.Any): js.Promise[Unit] = js.native
    def update(value: js.Array[_]): js.Promise[Unit] = js.native
  }
}
