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

