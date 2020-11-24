package typings.twilsock

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/error/twilsockerror", JSImport.Namespace)
@js.native
object twilsockerrorMod extends js.Object {
  
  @js.native
  class TwilsockError protected () extends Error {
    def this(description: String) = this()
  }
}
