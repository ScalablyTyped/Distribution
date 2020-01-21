package typings.useGlobalHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactInterface extends js.Object {
  def useEffect(args: js.Any*): js.Any
  def useMemo(args: js.Any*): js.Any
  def useState(args: js.Any*): js.Any
}

object ReactInterface {
  @scala.inline
  def apply(
    useEffect: /* repeated */ js.Any => js.Any,
    useMemo: /* repeated */ js.Any => js.Any,
    useState: /* repeated */ js.Any => js.Any
  ): ReactInterface = {
    val __obj = js.Dynamic.literal(useEffect = js.Any.fromFunction1(useEffect), useMemo = js.Any.fromFunction1(useMemo), useState = js.Any.fromFunction1(useState))
  
    __obj.asInstanceOf[ReactInterface]
  }
}

