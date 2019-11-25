package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberResourceCandidate extends js.Object {
  /** The ResourceCandidate objects in the set that start at startIndex. */ var items: ResourceCandidate
  /** The number of ResourceCandidate objects returned. */ var returnValue: Double
}

object Anon_ItemsReturnValueNumberResourceCandidate {
  @scala.inline
  def apply(items: ResourceCandidate, returnValue: Double): Anon_ItemsReturnValueNumberResourceCandidate = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberResourceCandidate]
  }
}

