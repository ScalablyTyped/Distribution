package typings.typeorm

import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/query-builder/transformer/DocumentToEntityTransformer", JSImport.Namespace)
@js.native
object documentToEntityTransformerMod extends js.Object {
  
  @js.native
  class DocumentToEntityTransformer () extends js.Object {
    def this(// private selectionMap: AliasMap,
    enableRelationIdValues: Boolean) = this()
    
    var enableRelationIdValues: js.Any = js.native
    
    def transform(document: js.Any, metadata: EntityMetadata): js.Any = js.native
    
    def transformAll(documents: js.Array[ObjectLiteral], metadata: EntityMetadata): js.Array[_] = js.native
  }
}
