package typings
package winrtLib.WindowsNs.DataNs.HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHtmlUtilities extends js.Object {
  def convertToText(html: java.lang.String): java.lang.String
}

object IHtmlUtilities {
  @scala.inline
  def apply(convertToText: java.lang.String => java.lang.String): IHtmlUtilities = {
    val __obj = js.Dynamic.literal(convertToText = js.Any.fromFunction1(convertToText))
  
    __obj.asInstanceOf[IHtmlUtilities]
  }
}

