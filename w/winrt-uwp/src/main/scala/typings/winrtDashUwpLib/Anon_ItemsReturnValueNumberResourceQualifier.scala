package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberResourceQualifier extends js.Object {
  /** The objects in the view that start at startIndex. */ var items: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifier
  /** The number of objects returned. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueNumberResourceQualifier {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifier,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueNumberResourceQualifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberResourceQualifier]
  }
}

