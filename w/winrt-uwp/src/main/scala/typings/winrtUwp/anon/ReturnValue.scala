package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.IWwwFormUrlDecoderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnValue extends js.Object {
  /** The name-value pairs. */ var items: IWwwFormUrlDecoderEntry
  /** The number of name-value pairs in items. */ var returnValue: Double
}

object ReturnValue {
  @scala.inline
  def apply(items: IWwwFormUrlDecoderEntry, returnValue: Double): ReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
}

