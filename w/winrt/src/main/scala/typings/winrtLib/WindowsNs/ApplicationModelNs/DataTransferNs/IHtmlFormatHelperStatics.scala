package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHtmlFormatHelperStatics extends js.Object {
  def createHtmlFormat(htmlFragment: java.lang.String): java.lang.String
  def getStaticFragment(htmlFormat: java.lang.String): java.lang.String
}

object IHtmlFormatHelperStatics {
  @scala.inline
  def apply(
    createHtmlFormat: java.lang.String => java.lang.String,
    getStaticFragment: java.lang.String => java.lang.String
  ): IHtmlFormatHelperStatics = {
    val __obj = js.Dynamic.literal(createHtmlFormat = js.Any.fromFunction1(createHtmlFormat), getStaticFragment = js.Any.fromFunction1(getStaticFragment))
  
    __obj.asInstanceOf[IHtmlFormatHelperStatics]
  }
}

