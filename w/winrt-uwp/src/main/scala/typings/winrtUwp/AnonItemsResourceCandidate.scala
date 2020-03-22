package typings.winrtUwp

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsResourceCandidate extends js.Object {
  /** The ResourceCandidate objects in the set that start at startIndex. */ var items: ResourceCandidate
  /** The number of ResourceCandidate objects returned. */ var returnValue: Double
}

object AnonItemsResourceCandidate {
  @scala.inline
  def apply(items: ResourceCandidate, returnValue: Double): AnonItemsResourceCandidate = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsResourceCandidate]
  }
}

