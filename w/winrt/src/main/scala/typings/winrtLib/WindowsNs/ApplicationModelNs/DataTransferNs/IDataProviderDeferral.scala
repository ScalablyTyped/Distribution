package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProviderDeferral extends js.Object {
  def complete(): scala.Unit
}

object IDataProviderDeferral {
  @scala.inline
  def apply(complete: js.Function0[scala.Unit]): IDataProviderDeferral = {
    val __obj = js.Dynamic.literal(complete = complete)
  
    __obj.asInstanceOf[IDataProviderDeferral]
  }
}

