package typings.winrt

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayNumber extends js.Object {
  var items: js.Array[ResourceQualifier]
  var returnValue: Double
}

object Anon_ItemsReturnValueArrayNumber {
  @scala.inline
  def apply(items: js.Array[ResourceQualifier], returnValue: Double): Anon_ItemsReturnValueArrayNumber = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayNumber]
  }
}

