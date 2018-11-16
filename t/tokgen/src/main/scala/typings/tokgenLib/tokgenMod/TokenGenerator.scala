package typings
package tokgenLib.tokgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenGenerator extends js.Object {
  def generate(): java.lang.String = js.native
  def generate(callback: tokgenLib.tokgenMod.TokenGeneratorNs.Callback): scala.Unit = js.native
  def generate(length: scala.Double): java.lang.String = js.native
  def generate(length: scala.Double, callback: tokgenLib.tokgenMod.TokenGeneratorNs.Callback): scala.Unit = js.native
}

