package typings.typeorm

import typings.typeorm.queryBuilderQueryBuilderMod.QueryBuilder
import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderRelationRemoverMod {
  
  @JSImport("typeorm/query-builder/RelationRemover", "RelationRemover")
  @js.native
  class RelationRemover protected () extends StObject {
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
