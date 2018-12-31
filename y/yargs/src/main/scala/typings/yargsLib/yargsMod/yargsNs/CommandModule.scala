package typings
package yargsLib.yargsMod.yargsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandModule[T, U] extends js.Object {
  var aliases: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var builder: js.UndefOr[CommandBuilder[T, U]] = js.undefined
  var command: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var describe: js.UndefOr[java.lang.String | yargsLib.yargsLibNumbers.`false`] = js.undefined
  def handler(args: Arguments[U]): scala.Unit
}

