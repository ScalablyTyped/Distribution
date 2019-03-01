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
    createHtmlFormat: js.Function1[java.lang.String, java.lang.String],
    getStaticFragment: js.Function1[java.lang.String, java.lang.String]
  ): IHtmlFormatHelperStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createHtmlFormat")(createHtmlFormat)
    __obj.updateDynamic("getStaticFragment")(getStaticFragment)
    __obj.asInstanceOf[IHtmlFormatHelperStatics]
  }
}

