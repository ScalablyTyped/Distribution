package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetVersionDeferral extends js.Object {
  def complete(): scala.Unit
}

object ISetVersionDeferral {
  @scala.inline
  def apply(complete: js.Function0[scala.Unit]): ISetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = complete)
  
    __obj.asInstanceOf[ISetVersionDeferral]
  }
}

