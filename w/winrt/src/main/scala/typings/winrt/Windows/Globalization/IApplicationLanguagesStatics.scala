package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationLanguagesStatics extends js.Object {
  var languages: IVectorView[String]
  var manifestLanguages: IVectorView[String]
  var primaryLanguageOverride: String
}

object IApplicationLanguagesStatics {
  @scala.inline
  def apply(
    languages: IVectorView[String],
    manifestLanguages: IVectorView[String],
    primaryLanguageOverride: String
  ): IApplicationLanguagesStatics = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any], manifestLanguages = manifestLanguages.asInstanceOf[js.Any], primaryLanguageOverride = primaryLanguageOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationLanguagesStatics]
  }
}

