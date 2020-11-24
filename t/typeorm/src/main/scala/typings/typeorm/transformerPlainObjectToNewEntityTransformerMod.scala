package typings.typeorm

import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.metadataEntityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/query-builder/transformer/PlainObjectToNewEntityTransformer", JSImport.Namespace)
@js.native
object transformerPlainObjectToNewEntityTransformerMod extends js.Object {
  
  @js.native
  class PlainObjectToNewEntityTransformer () extends js.Object {
    
    /**
      * Since db returns a duplicated rows of the data where accuracies of the same object can be duplicated
      * we need to group our result and we must have some unique id (primary key in our case)
      */
    var groupAndTransform: js.Any = js.native
    
    def transform[T](newEntity: T, `object`: ObjectLiteral, metadata: EntityMetadata): T = js.native
    def transform[T](
      newEntity: T,
      `object`: ObjectLiteral,
      metadata: EntityMetadata,
      getLazyRelationsPromiseValue: Boolean
    ): T = js.native
  }
}
