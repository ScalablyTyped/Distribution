package typings.typeorm

import typings.std.Error
import typings.typeorm.commonEntityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/EntityMetadataNotFoundError", JSImport.Namespace)
@js.native
object errorEntityMetadataNotFoundErrorMod extends js.Object {
  
  @js.native
  class EntityMetadataNotFoundError protected () extends Error {
    def this(target: EntityTarget[_]) = this()
  }
}
