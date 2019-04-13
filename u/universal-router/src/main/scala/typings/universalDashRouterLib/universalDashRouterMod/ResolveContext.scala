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
  def apply(
    pathname: java.lang.String,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ResolveContext = {
    val __obj = js.Dynamic.literal(pathname = pathname)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResolveContext]
  }
}

