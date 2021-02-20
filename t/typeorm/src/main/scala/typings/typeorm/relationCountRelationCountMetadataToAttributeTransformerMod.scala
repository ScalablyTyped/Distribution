package typings.typeorm

import typings.typeorm.queryBuilderQueryExpressionMapMod.QueryExpressionMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationCountRelationCountMetadataToAttributeTransformerMod {
  
  @JSImport("typeorm/query-builder/relation-count/RelationCountMetadataToAttributeTransformer", "RelationCountMetadataToAttributeTransformer")
  @js.native
  class RelationCountMetadataToAttributeTransformer protected () extends StObject {
    def this(expressionMap: QueryExpressionMap) = this()
    
    var expressionMap: QueryExpressionMap = js.native
    
    var metadataToAttribute: js.Any = js.native
    
    def transform(): Unit = js.native
  }
}
