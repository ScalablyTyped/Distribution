package typings.winrtUwp

import typings.winrtUwp.Windows.Globalization.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsLanguage extends js.Object {
  /** An array of Language items that start at startIndex in the HttpLanguageHeaderValueCollection . */ var items: Language
  /** The number of items retrieved. */ var returnValue: Double
}

object AnonItemsLanguage {
  @scala.inline
  def apply(items: Language, returnValue: Double): AnonItemsLanguage = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsLanguage]
  }
}

