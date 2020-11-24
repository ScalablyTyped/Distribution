package typings.typeorm

import typings.std.Error
import typings.typeorm.commonEntityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/EntityNotFoundError", JSImport.Namespace)
@js.native
object errorEntityNotFoundErrorMod extends js.Object {
  
  @js.native
  class EntityNotFoundError protected () extends Error {
    def this(entityClass: EntityTarget[_], criteria: js.Any) = this()
    
    var stringifyCriteria: js.Any = js.native
  }
}
