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
  def apply(convertToText: js.Function1[java.lang.String, java.lang.String]): IHtmlUtilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convertToText")(convertToText)
    __obj.asInstanceOf[IHtmlUtilities]
  }
}

