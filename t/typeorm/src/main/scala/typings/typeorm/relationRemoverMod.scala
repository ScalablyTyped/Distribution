package typings.typeorm

import typings.typeorm.queryBuilderMod.QueryBuilder
import typings.typeorm.queryExpressionMapMod.QueryExpressionMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationRemoverMod {
  
  @JSImport("typeorm/browser/query-builder/RelationRemover", "RelationRemover")
  @js.native
  class RelationRemover protected () extends StObject {
    def this(queryBuilder: QueryBuilder[js.Any], expressionMap: QueryExpressionMap) = this()
    
    /* protected */ var expressionMap: QueryExpressionMap = js.native
    
    /* protected */ var queryBuilder: QueryBuilder[js.Any] = js.native
    
    /**
      * Performs remove operation on a relation.
      */
    def remove(value: js.Any): js.Promise[Unit] = js.native
    def remove(value: js.Array[js.Any]): js.Promise[Unit] = js.native
  }
}
