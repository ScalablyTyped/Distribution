package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveContext extends Context {
  var pathname: java.lang.String
}

object ResolveContext {
  @scala.inline
  def apply(pathname: java.lang.String): ResolveContext = {
    val __obj = js.Dynamic.literal(pathname = pathname)
  
    __obj.asInstanceOf[ResolveContext]
  }
}

