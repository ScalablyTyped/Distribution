package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostCancellationToken extends js.Object {
  def isCancellationRequested(): scala.Boolean
}

object HostCancellationToken {
  @scala.inline
  def apply(isCancellationRequested: js.Function0[scala.Boolean]): HostCancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested)
  
    __obj.asInstanceOf[HostCancellationToken]
  }
}

