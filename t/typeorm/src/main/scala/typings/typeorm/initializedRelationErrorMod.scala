package typings.typeorm

import typings.std.Error
import typings.typeorm.relationMetadataMod.RelationMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/InitializedRelationError", JSImport.Namespace)
@js.native
object initializedRelationErrorMod extends js.Object {
  
  @js.native
  class InitializedRelationError protected () extends Error {
    def this(relation: RelationMetadata) = this()
  }
}
