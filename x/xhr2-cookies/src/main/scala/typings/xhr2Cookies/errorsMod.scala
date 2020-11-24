package typings.xhr2Cookies

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr2-cookies/dist/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class InvalidStateError () extends Error
  
  @js.native
  class NetworkError () extends Error
  
  @js.native
  class SecurityError () extends Error
  
  @js.native
  class SyntaxError () extends Error
}
