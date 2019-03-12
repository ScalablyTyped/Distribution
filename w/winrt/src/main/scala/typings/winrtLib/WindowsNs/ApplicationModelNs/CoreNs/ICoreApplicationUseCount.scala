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
  def apply(decrementApplicationUseCount: () => scala.Unit, incrementApplicationUseCount: () => scala.Unit): ICoreApplicationUseCount = {
    val __obj = js.Dynamic.literal(decrementApplicationUseCount = js.Any.fromFunction0(decrementApplicationUseCount), incrementApplicationUseCount = js.Any.fromFunction0(incrementApplicationUseCount))
  
    __obj.asInstanceOf[ICoreApplicationUseCount]
  }
}

