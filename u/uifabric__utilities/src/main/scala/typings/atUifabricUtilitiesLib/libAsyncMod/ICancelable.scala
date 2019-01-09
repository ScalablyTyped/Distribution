package typings
package atUifabricUtilitiesLib.libAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICancelable[T] extends js.Object {
  def cancel(): scala.Unit
  def flush(): T
  def pending(): scala.Boolean
}

