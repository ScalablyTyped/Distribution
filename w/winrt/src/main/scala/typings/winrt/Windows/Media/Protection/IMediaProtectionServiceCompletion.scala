package typings.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaProtectionServiceCompletion extends js.Object {
  def complete(success: Boolean): Unit
}

object IMediaProtectionServiceCompletion {
  @scala.inline
  def apply(complete: Boolean => Unit): IMediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
  
    __obj.asInstanceOf[IMediaProtectionServiceCompletion]
  }
}

