package typings.typeorm

import typings.std.Error
import typings.typeorm.commonEntityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/RepositoryNotTreeError", JSImport.Namespace)
@js.native
object errorRepositoryNotTreeErrorMod extends js.Object {
  
  @js.native
  class RepositoryNotTreeError protected () extends Error {
    def this(entityClass: EntityTarget[_]) = this()
  }
}
