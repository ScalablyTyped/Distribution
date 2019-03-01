package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueLanguage extends js.Object {
  /** An array of Language items that start at startIndex in the HttpLanguageHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.GlobalizationNs.Language
  /** The number of items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueLanguage {
  @scala.inline
  def apply(items: winrtDashUwpLib.WindowsNs.GlobalizationNs.Language, returnValue: scala.Double): Anon_ItemsReturnValueLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueLanguage]
  }
}

