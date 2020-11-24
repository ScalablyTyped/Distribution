package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/ConnectionIsNotSetError", JSImport.Namespace)
@js.native
object connectionIsNotSetErrorMod extends js.Object {
  
  @js.native
  class ConnectionIsNotSetError protected () extends Error {
    def this(dbType: String) = this()
  }
}
