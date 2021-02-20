package typings.typeorm

import typings.typeorm.queryExpressionMapMod.QueryExpressionMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationIdMetadataToAttributeTransformerMod {
  
  @JSImport("typeorm/browser/query-builder/relation-id/RelationIdMetadataToAttributeTransformer", "RelationIdMetadataToAttributeTransformer")
  @js.native
  class RelationIdMetadataToAttributeTransformer protected () extends StObject {
    def this(expressionMap: QueryExpressionMap) = this()
    
    var expressionMap: QueryExpressionMap = js.native
    
    var metadataToAttribute: js.Any = js.native
    
    def transform(): Unit = js.native
  }
}
