package typings
package sugarLib.sugarjsNs.RegExpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def addFlags(flags: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp]
  def exec(string: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpExecArray | scala.Null]
  def getFlags(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String]
  def removeFlags(flags: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp]
  def setFlags(flags: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp]
  def test(string: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean]
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    addFlags: java.lang.String => sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp],
    exec: java.lang.String => sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpExecArray | scala.Null],
    getFlags: () => sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String],
    raw: RawValue,
    removeFlags: java.lang.String => sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp],
    setFlags: java.lang.String => sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExp],
    test: java.lang.String => sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean],
    toString: () => java.lang.String,
    valueOf: () => RawValue
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(addFlags = js.Any.fromFunction1(addFlags), exec = js.Any.fromFunction1(exec), getFlags = js.Any.fromFunction0(getFlags), raw = raw.asInstanceOf[js.Any], removeFlags = js.Any.fromFunction1(removeFlags), setFlags = js.Any.fromFunction1(setFlags), test = js.Any.fromFunction1(test), toString = js.Any.fromFunction0(toString), valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

