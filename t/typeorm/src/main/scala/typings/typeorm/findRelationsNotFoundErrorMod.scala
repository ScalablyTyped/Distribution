package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/FindRelationsNotFoundError", JSImport.Namespace)
@js.native
object findRelationsNotFoundErrorMod extends js.Object {
  
  @js.native
  class FindRelationsNotFoundError protected () extends Error {
    def this(notFoundRelations: js.Array[String]) = this()
  }
}
