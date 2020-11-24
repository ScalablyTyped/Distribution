package typings.typeorm

import typings.std.Error
import typings.typeorm.entityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/EntityMetadataNotFoundError", JSImport.Namespace)
@js.native
object entityMetadataNotFoundErrorMod extends js.Object {
  
  @js.native
  class EntityMetadataNotFoundError protected () extends Error {
    def this(target: EntityTarget[_]) = this()
  }
}
