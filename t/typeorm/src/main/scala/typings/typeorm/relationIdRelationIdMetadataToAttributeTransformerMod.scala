package typings.typeorm

import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationIdRelationIdMetadataToAttributeTransformerMod {
  
  @JSImport("typeorm/query-builder/relation-id/RelationIdMetadataToAttributeTransformer", "RelationIdMetadataToAttributeTransformer")
  @js.native
  class RelationIdMetadataToAttributeTransformer protected () extends StObject {
    def this(expressionMap: QueryExpressionMap) = this()
    
    /* protected */ var expressionMap: QueryExpressionMap = js.native
    
    /* private */ var metadataToAttribute: js.Any = js.native
    
    def transform(): Unit = js.native
  }
}
