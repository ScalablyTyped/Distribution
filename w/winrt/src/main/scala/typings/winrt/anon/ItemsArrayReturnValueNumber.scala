package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsArrayReturnValueNumber extends js.Object {
  var items: js.Array[ResourceCandidate]
  var returnValue: Double
}

object ItemsArrayReturnValueNumber {
  @scala.inline
  def apply(items: js.Array[ResourceCandidate], returnValue: Double): ItemsArrayReturnValueNumber = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsArrayReturnValueNumber]
  }
}

