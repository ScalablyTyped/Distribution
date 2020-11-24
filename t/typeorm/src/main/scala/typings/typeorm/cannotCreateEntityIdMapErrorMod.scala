package typings.typeorm

import typings.std.Error
import typings.typeorm.entityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/CannotCreateEntityIdMapError", JSImport.Namespace)
@js.native
object cannotCreateEntityIdMapErrorMod extends js.Object {
  
  @js.native
  class CannotCreateEntityIdMapError protected () extends Error {
    def this(metadata: EntityMetadata, id: js.Any) = this()
  }
}
