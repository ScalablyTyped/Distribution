package typings.typeorm

import typings.std.Error
import typings.typeorm.entityTargetMod.EntityTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityNotFoundErrorMod {
  
  @JSImport("typeorm/browser/error/EntityNotFoundError", "EntityNotFoundError")
  @js.native
  class EntityNotFoundError protected () extends Error {
    def this(entityClass: EntityTarget[_], criteria: js.Any) = this()
    
    var stringifyCriteria: js.Any = js.native
  }
}
