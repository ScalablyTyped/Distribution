package typings.typeorm

import typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/RelationRemover", JSImport.Namespace)
@js.native
object queryBuilderRelationRemoverMod extends js.Object {
  
  @js.native
  class RelationRemover protected () extends js.Object {
    def this(queryBuilder: QueryBuilder[_], expressionMap: QueryExpressionMap) = this()
    
    var expressionMap: QueryExpressionMap = js.native
    
    var queryBuilder: QueryBuilder[_] = js.native
    
    /**
      * Performs remove operation on a relation.
      */
    def remove(value: js.Any): js.Promise[Unit] = js.native
    def remove(value: js.Array[_]): js.Promise[Unit] = js.native
  }
}
