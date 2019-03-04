package typings
package winrtLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplicationUseCount extends js.Object {
  def decrementApplicationUseCount(): scala.Unit
  def incrementApplicationUseCount(): scala.Unit
}

object ICoreApplicationUseCount {
  @scala.inline
  def apply(
    decrementApplicationUseCount: js.Function0[scala.Unit],
    incrementApplicationUseCount: js.Function0[scala.Unit]
  ): ICoreApplicationUseCount = {
    val __obj = js.Dynamic.literal(decrementApplicationUseCount = decrementApplicationUseCount, incrementApplicationUseCount = incrementApplicationUseCount)
  
    __obj.asInstanceOf[ICoreApplicationUseCount]
  }
}

