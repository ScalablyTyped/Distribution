package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHtmlFormatHelperStatics extends js.Object {
  def createHtmlFormat(htmlFragment: String): String
  def getStaticFragment(htmlFormat: String): String
}

object IHtmlFormatHelperStatics {
  @scala.inline
  def apply(createHtmlFormat: String => String, getStaticFragment: String => String): IHtmlFormatHelperStatics = {
    val __obj = js.Dynamic.literal(createHtmlFormat = js.Any.fromFunction1(createHtmlFormat), getStaticFragment = js.Any.fromFunction1(getStaticFragment))
  
    __obj.asInstanceOf[IHtmlFormatHelperStatics]
  }
}

