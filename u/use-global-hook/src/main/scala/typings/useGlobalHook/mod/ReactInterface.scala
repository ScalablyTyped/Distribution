package typings.useGlobalHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactInterface extends js.Object {
  def useEffect(args: js.Any*): js.Any = js.native
  def useMemo(args: js.Any*): js.Any = js.native
  def useState(args: js.Any*): js.Any = js.native
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
  @scala.inline
  implicit class ReactInterfaceOps[Self <: ReactInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUseEffect(value: /* repeated */ js.Any => js.Any): Self = this.set("useEffect", js.Any.fromFunction1(value))
    @scala.inline
    def setUseMemo(value: /* repeated */ js.Any => js.Any): Self = this.set("useMemo", js.Any.fromFunction1(value))
    @scala.inline
    def setUseState(value: /* repeated */ js.Any => js.Any): Self = this.set("useState", js.Any.fromFunction1(value))
  }
  
}

