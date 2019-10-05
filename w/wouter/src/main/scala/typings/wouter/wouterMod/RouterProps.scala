package typings.wouter.wouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var matcher: MatcherFn
  def hook(): LocationTuple
}

object RouterProps {
  @scala.inline
  def apply(hook: () => LocationTuple, matcher: (/* pattern */ String, /* path */ Path) => Match): RouterProps = {
    val __obj = js.Dynamic.literal(hook = js.Any.fromFunction0(hook), matcher = js.Any.fromFunction2(matcher))
  
    __obj.asInstanceOf[RouterProps]
  }
}

