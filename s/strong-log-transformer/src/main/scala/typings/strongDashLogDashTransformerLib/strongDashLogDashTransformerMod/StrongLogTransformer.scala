package typings
package strongDashLogDashTransformerLib.strongDashLogDashTransformerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrongLogTransformer extends js.Object {
  var DEFAULTS: Options = js.native
  def apply(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(options: stdLib.Partial[Options]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def cli(args: js.Array[java.lang.String]): scala.Unit = js.native
}

