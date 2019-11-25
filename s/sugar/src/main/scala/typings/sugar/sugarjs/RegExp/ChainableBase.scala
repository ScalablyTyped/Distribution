package typings.sugar.sugarjs.RegExp

import typings.std.RegExpExecArray
import typings.sugar.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def addFlags(flags: java.lang.String): SugarDefaultChainable[typings.std.RegExp]
  def exec(string: java.lang.String): SugarDefaultChainable[RegExpExecArray | Null]
  def getFlags(): SugarDefaultChainable[java.lang.String]
  def removeFlags(flags: java.lang.String): SugarDefaultChainable[typings.std.RegExp]
  def setFlags(flags: java.lang.String): SugarDefaultChainable[typings.std.RegExp]
  def test(string: java.lang.String): SugarDefaultChainable[Boolean]
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    addFlags: java.lang.String => SugarDefaultChainable[typings.std.RegExp],
    exec: java.lang.String => SugarDefaultChainable[RegExpExecArray | Null],
    getFlags: () => SugarDefaultChainable[java.lang.String],
    raw: RawValue,
    removeFlags: java.lang.String => SugarDefaultChainable[typings.std.RegExp],
    setFlags: java.lang.String => SugarDefaultChainable[typings.std.RegExp],
    test: java.lang.String => SugarDefaultChainable[Boolean]
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(addFlags = js.Any.fromFunction1(addFlags), exec = js.Any.fromFunction1(exec), getFlags = js.Any.fromFunction0(getFlags), raw = raw.asInstanceOf[js.Any], removeFlags = js.Any.fromFunction1(removeFlags), setFlags = js.Any.fromFunction1(setFlags), test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

