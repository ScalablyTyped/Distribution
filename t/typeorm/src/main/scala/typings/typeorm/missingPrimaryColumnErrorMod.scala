package typings.typeorm

import typings.std.Error
import typings.typeorm.entityMetadataMod.EntityMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/MissingPrimaryColumnError", JSImport.Namespace)
@js.native
object missingPrimaryColumnErrorMod extends js.Object {
  
  @js.native
  class MissingPrimaryColumnError protected () extends Error {
    def this(entityMetadata: EntityMetadata) = this()
  }
}
