package typings.wouter.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var hook: LocationHook
  var matcher: MatcherFn
}

object RouterProps {
  @scala.inline
  def apply(hook: () => LocationTuple, matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): RouterProps = {
    val __obj = js.Dynamic.literal(hook = js.Any.fromFunction0(hook), matcher = js.Any.fromFunction2(matcher))
  
    __obj.asInstanceOf[RouterProps]
  }
}

