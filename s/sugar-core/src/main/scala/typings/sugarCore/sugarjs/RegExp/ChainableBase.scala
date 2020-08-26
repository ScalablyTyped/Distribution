package typings.sugarCore.sugarjs.RegExp

import typings.std.RegExpExecArray
import typings.sugarCore.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def exec(string: String): SugarDefaultChainable[RegExpExecArray | Null] = js.native
  def test(string: String): SugarDefaultChainable[Boolean] = js.native
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    exec: String => SugarDefaultChainable[RegExpExecArray | Null],
    raw: RawValue,
    test: String => SugarDefaultChainable[Boolean]
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), raw = raw.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
  @scala.inline
  implicit class ChainableBaseOps[Self <: ChainableBase[_], RawValue] (val x: Self with ChainableBase[RawValue]) extends AnyVal {
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
    def setExec(value: String => SugarDefaultChainable[RegExpExecArray | Null]): Self = this.set("exec", js.Any.fromFunction1(value))
    @scala.inline
    def setRaw(value: RawValue): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: String => SugarDefaultChainable[Boolean]): Self = this.set("test", js.Any.fromFunction1(value))
  }
  
}

