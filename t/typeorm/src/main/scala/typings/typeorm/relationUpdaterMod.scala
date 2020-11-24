package typings.typeorm

import typings.typeorm.queryBuilderMod.QueryBuilder
import typings.typeorm.queryExpressionMapMod.QueryExpressionMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/RelationUpdater", JSImport.Namespace)
@js.native
object relationUpdaterMod extends js.Object {
  
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
