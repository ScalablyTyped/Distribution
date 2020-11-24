package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/transformer/DocumentToEntityTransformer", JSImport.Namespace)
@js.native
object transformerDocumentToEntityTransformerMod extends js.Object {
  
  @js.native
  class DocumentToEntityTransformer () extends js.Object {
    def this(// private selectionMap: AliasMap,
    enableRelationIdValues: Boolean) = this()
    
    var enableRelationIdValues: js.Any = js.native
    
    def transform(document: js.Any, metadata: EntityMetadata): js.Any = js.native
    
    def transformAll(documents: js.Array[ObjectLiteral], metadata: EntityMetadata): js.Array[_] = js.native
  }
}
