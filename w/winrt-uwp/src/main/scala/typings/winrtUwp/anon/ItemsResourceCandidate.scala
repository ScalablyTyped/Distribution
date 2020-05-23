package typings.winrtUwp.anon

import typings.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsResourceCandidate extends js.Object {
  /** The ResourceCandidate objects in the set that start at startIndex. */ var items: ResourceCandidate
  /** The number of ResourceCandidate objects returned. */ var returnValue: Double
}

object ItemsResourceCandidate {
  @scala.inline
  def apply(items: ResourceCandidate, returnValue: Double): ItemsResourceCandidate = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsResourceCandidate]
  }
}

