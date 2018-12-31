package typings
package sugarDashCoreLib.sugarjsNs.RegExpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def exec(string: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpExecArray | scala.Null]
  def test(string: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean]
}

