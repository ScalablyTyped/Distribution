package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the language-related preferences that the app can use and maintain. */
@JSGlobal("Windows.Globalization.ApplicationLanguages")
@js.native
abstract class ApplicationLanguages () extends js.Object

/** Specifies the language-related preferences that the app can use and maintain. */
@JSGlobal("Windows.Globalization.ApplicationLanguages")
@js.native
object ApplicationLanguages extends js.Object {
  /** Gets the ranked list of current runtime language values preferred by the user. */
  var languages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the app's declared list of supported languages. */
  var manifestLanguages: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets or sets an override for the app's preferred language, expressed as a BCP-47 language tag. This setting is persisted. */
  var primaryLanguageOverride: java.lang.String = js.native
}

