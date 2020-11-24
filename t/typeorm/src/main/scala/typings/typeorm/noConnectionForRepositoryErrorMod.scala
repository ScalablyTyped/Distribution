package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/NoConnectionForRepositoryError", JSImport.Namespace)
@js.native
object noConnectionForRepositoryErrorMod extends js.Object {
  
  @js.native
  class NoConnectionForRepositoryError protected () extends Error {
    def this(connectionName: String) = this()
  }
}
