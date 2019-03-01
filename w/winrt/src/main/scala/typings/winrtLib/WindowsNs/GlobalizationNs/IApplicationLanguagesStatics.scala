package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationLanguagesStatics extends js.Object {
  var languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var manifestLanguages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var primaryLanguageOverride: java.lang.String
}

object IApplicationLanguagesStatics {
  @scala.inline
  def apply(
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    manifestLanguages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    primaryLanguageOverride: java.lang.String
  ): IApplicationLanguagesStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("languages")(languages)
    __obj.updateDynamic("manifestLanguages")(manifestLanguages)
    __obj.updateDynamic("primaryLanguageOverride")(primaryLanguageOverride)
    __obj.asInstanceOf[IApplicationLanguagesStatics]
  }
}

