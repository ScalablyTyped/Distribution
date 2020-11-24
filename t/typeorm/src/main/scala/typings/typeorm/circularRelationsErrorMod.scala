package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/error/CircularRelationsError", JSImport.Namespace)
@js.native
object circularRelationsErrorMod extends js.Object {
  
  @js.native
  class CircularRelationsError protected () extends Error {
    def this(path: String) = this()
  }
}
