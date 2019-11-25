package typings.wouter.wouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var base: Path
  var hook: LocationHook
  var matcher: MatcherFn
}

object RouterProps {
  @scala.inline
  def apply(
    base: Path,
    hook: /* options */ js.UndefOr[LocationHookOptions] => LocationTuple,
    matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]
  ): RouterProps = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hook = js.Any.fromFunction1(hook), matcher = js.Any.fromFunction2(matcher))
  
    __obj.asInstanceOf[RouterProps]
  }
}

