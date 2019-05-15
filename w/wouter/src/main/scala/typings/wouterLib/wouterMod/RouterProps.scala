package typings
package wouterLib.wouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var history: History
  def matcher(pattern: java.lang.String, path: Path): Match
}

object RouterProps {
  @scala.inline
  def apply(history: History, matcher: (java.lang.String, Path) => Match): RouterProps = {
    val __obj = js.Dynamic.literal(history = history, matcher = js.Any.fromFunction2(matcher))
  
    __obj.asInstanceOf[RouterProps]
  }
}

