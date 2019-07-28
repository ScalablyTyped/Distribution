package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.GlobalizationNs.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueLanguage extends js.Object {
  /** An array of Language items that start at startIndex in the HttpLanguageHeaderValueCollection . */ var items: Language
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueLanguage {
  @scala.inline
  def apply(items: Language, returnValue: Double): Anon_ItemsReturnValueLanguage = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueLanguage]
  }
}

