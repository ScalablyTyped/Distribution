package typings.winrtUwp

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsResourceQualifier extends js.Object {
  /** The objects in the view that start at startIndex. */ var items: ResourceQualifier
  /** The number of objects returned. */ var returnValue: Double
}

object AnonItemsResourceQualifier {
  @scala.inline
  def apply(items: ResourceQualifier, returnValue: Double): AnonItemsResourceQualifier = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsResourceQualifier]
  }
}

