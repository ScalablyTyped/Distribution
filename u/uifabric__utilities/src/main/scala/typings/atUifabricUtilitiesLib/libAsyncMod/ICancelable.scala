package typings
package atUifabricUtilitiesLib.libAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICancelable[T] extends js.Object {
  var cancel: js.Function0[scala.Unit]
  var flush: js.Function0[T]
  var pending: js.Function0[scala.Boolean]
}

