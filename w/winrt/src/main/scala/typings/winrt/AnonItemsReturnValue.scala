package typings.winrt

import typings.winrt.Windows.Foundation.IWwwFormUrlDecoderEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValue extends js.Object {
  var items: js.Array[IWwwFormUrlDecoderEntry]
  var returnValue: Double
}

object AnonItemsReturnValue {
  @scala.inline
  def apply(items: js.Array[IWwwFormUrlDecoderEntry], returnValue: Double): AnonItemsReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValue]
  }
}

