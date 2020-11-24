package typings.typeorm

import typings.typeorm.queryExpressionMapMod.QueryExpressionMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/relation-id/RelationIdMetadataToAttributeTransformer", JSImport.Namespace)
@js.native
object relationIdMetadataToAttributeTransformerMod extends js.Object {
  
  @js.native
  class RelationIdMetadataToAttributeTransformer protected () extends js.Object {
    def this(expressionMap: QueryExpressionMap) = this()
    
    var expressionMap: QueryExpressionMap = js.native
    
    var metadataToAttribute: js.Any = js.native
    
    def transform(): Unit = js.native
  }
}
