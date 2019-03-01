package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberResourceCandidate extends js.Object {
  /** The ResourceCandidate objects in the set that start at startIndex. */ var items: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceCandidate
  /** The number of ResourceCandidate objects returned. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueNumberResourceCandidate {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceCandidate,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueNumberResourceCandidate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberResourceCandidate]
  }
}

