package typings.typeorm

import typings.std.Error
import typings.typeorm.commonEntityTargetMod.EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorEntityNotFoundErrorMod {
  
  @JSImport("typeorm/error/EntityNotFoundError", "EntityNotFoundError")
  @js.native
  class EntityNotFoundError protected () extends Error {
    def this(entityClass: EntityTarget[_], criteria: js.Any) = this()
    
    var stringifyCriteria: js.Any = js.native
  }
}
