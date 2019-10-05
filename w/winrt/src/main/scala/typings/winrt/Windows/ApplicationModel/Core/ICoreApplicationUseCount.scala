package typings.winrt.Windows.ApplicationModel.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplicationUseCount extends js.Object {
  def decrementApplicationUseCount(): Unit
  def incrementApplicationUseCount(): Unit
}

object ICoreApplicationUseCount {
  @scala.inline
  def apply(decrementApplicationUseCount: () => Unit, incrementApplicationUseCount: () => Unit): ICoreApplicationUseCount = {
    val __obj = js.Dynamic.literal(decrementApplicationUseCount = js.Any.fromFunction0(decrementApplicationUseCount), incrementApplicationUseCount = js.Any.fromFunction0(incrementApplicationUseCount))
  
    __obj.asInstanceOf[ICoreApplicationUseCount]
  }
}

