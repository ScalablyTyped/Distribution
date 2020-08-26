package typings.sugar.sugarjs.RegExp

import typings.std.RegExpExecArray
import typings.sugar.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def addFlags(flags: String): SugarDefaultChainable[typings.sugar.RegExp] = js.native
  def exec(string: String): SugarDefaultChainable[RegExpExecArray | Null] = js.native
  def getFlags(): SugarDefaultChainable[String] = js.native
  def removeFlags(flags: String): SugarDefaultChainable[typings.sugar.RegExp] = js.native
  def setFlags(flags: String): SugarDefaultChainable[typings.sugar.RegExp] = js.native
  def test(string: String): SugarDefaultChainable[Boolean] = js.native
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    addFlags: String => SugarDefaultChainable[typings.sugar.RegExp],
    exec: String => SugarDefaultChainable[RegExpExecArray | Null],
    getFlags: () => SugarDefaultChainable[String],
    raw: RawValue,
    removeFlags: String => SugarDefaultChainable[typings.sugar.RegExp],
    setFlags: String => SugarDefaultChainable[typings.sugar.RegExp],
    test: String => SugarDefaultChainable[Boolean]
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(addFlags = js.Any.fromFunction1(addFlags), exec = js.Any.fromFunction1(exec), getFlags = js.Any.fromFunction0(getFlags), raw = raw.asInstanceOf[js.Any], removeFlags = js.Any.fromFunction1(removeFlags), setFlags = js.Any.fromFunction1(setFlags), test = js.Any.fromFunction1(test))
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
    def setAddFlags(value: String => SugarDefaultChainable[typings.sugar.RegExp]): Self = this.set("addFlags", js.Any.fromFunction1(value))
    @scala.inline
    def setExec(value: String => SugarDefaultChainable[RegExpExecArray | Null]): Self = this.set("exec", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFlags(value: () => SugarDefaultChainable[String]): Self = this.set("getFlags", js.Any.fromFunction0(value))
    @scala.inline
    def setRaw(value: RawValue): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveFlags(value: String => SugarDefaultChainable[typings.sugar.RegExp]): Self = this.set("removeFlags", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFlags(value: String => SugarDefaultChainable[typings.sugar.RegExp]): Self = this.set("setFlags", js.Any.fromFunction1(value))
    @scala.inline
    def setTest(value: String => SugarDefaultChainable[Boolean]): Self = this.set("test", js.Any.fromFunction1(value))
  }
  
}

