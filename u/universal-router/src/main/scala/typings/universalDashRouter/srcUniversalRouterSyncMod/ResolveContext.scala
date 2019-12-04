package typings.universalDashRouter.srcUniversalRouterSyncMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveContext extends Context {
  var pathname: String
}

object ResolveContext {
  @scala.inline
  def apply(pathname: String, StringDictionary: StringDictionary[js.Any] = null): ResolveContext = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResolveContext]
  }
}

