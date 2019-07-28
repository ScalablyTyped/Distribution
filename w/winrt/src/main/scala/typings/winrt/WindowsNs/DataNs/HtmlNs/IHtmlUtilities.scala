package typings.winrt.WindowsNs.DataNs.HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHtmlUtilities extends js.Object {
  def convertToText(html: String): String
}

object IHtmlUtilities {
  @scala.inline
  def apply(convertToText: String => String): IHtmlUtilities = {
    val __obj = js.Dynamic.literal(convertToText = js.Any.fromFunction1(convertToText))
  
    __obj.asInstanceOf[IHtmlUtilities]
  }
}

