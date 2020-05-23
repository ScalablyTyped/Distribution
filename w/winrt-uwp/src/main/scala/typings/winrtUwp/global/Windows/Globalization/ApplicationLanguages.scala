package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the language-related preferences that the app can use and maintain. */
@JSGlobal("Windows.Globalization.ApplicationLanguages")
@js.native
abstract class ApplicationLanguages ()
  extends typings.winrtUwp.Windows.Globalization.ApplicationLanguages

/* static members */
@JSGlobal("Windows.Globalization.ApplicationLanguages")
@js.native
object ApplicationLanguages extends js.Object {
  /** Gets the ranked list of current runtime language values preferred by the user. */
  var languages: IVectorView[String] = js.native
  /** Gets the app's declared list of supported languages. */
  var manifestLanguages: IVectorView[String] = js.native
  /** Gets or sets an override for the app's preferred language, expressed as a BCP-47 language tag. This setting is persisted. */
  var primaryLanguageOverride: String = js.native
}

