package typings
package wouterLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var matcher: MatcherFn
  def hook(): LocationTuple
}

object RouterProps {
  @scala.inline
  def apply(hook: () => LocationTuple, matcher: MatcherFn): RouterProps = {
    val __obj = js.Dynamic.literal(hook = js.Any.fromFunction0(hook), matcher = matcher)
  
    __obj.asInstanceOf[RouterProps]
  }
}

