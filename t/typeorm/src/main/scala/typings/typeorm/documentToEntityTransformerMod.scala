package typings.typeorm

import typings.typeorm.entityMetadataMod.EntityMetadata
import typings.typeorm.objectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentToEntityTransformerMod {
  
  @JSImport("typeorm/browser/query-builder/transformer/DocumentToEntityTransformer", "DocumentToEntityTransformer")
  @js.native
  class DocumentToEntityTransformer () extends StObject {
    def this(// private selectionMap: AliasMap,
    enableRelationIdValues: Boolean) = this()
    
    var enableRelationIdValues: js.Any = js.native
    
    def transform(document: js.Any, metadata: EntityMetadata): js.Any = js.native
    
    def transformAll(documents: js.Array[ObjectLiteral], metadata: EntityMetadata): js.Array[_] = js.native
  }
}
