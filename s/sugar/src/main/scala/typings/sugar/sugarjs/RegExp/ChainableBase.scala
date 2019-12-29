package typings.sugar.sugarjs.RegExp

import typings.std.RegExpExecArray
import typings.sugar.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def addFlags(flags: String): SugarDefaultChainable[typings.sugar.RegExp]
  def exec(string: String): SugarDefaultChainable[RegExpExecArray | Null]
  def getFlags(): SugarDefaultChainable[String]
  def removeFlags(flags: String): SugarDefaultChainable[typings.sugar.RegExp]
  def setFlags(flags: String): SugarDefaultChainable[typings.sugar.RegExp]
  def test(string: String): SugarDefaultChainable[Boolean]
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
}

