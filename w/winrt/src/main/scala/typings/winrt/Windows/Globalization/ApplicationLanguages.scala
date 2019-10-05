package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.ApplicationLanguages")
@js.native
class ApplicationLanguages () extends js.Object

/* static members */
@JSGlobal("Windows.Globalization.ApplicationLanguages")
@js.native
object ApplicationLanguages extends js.Object {
  var languages: IVectorView[String] = js.native
  var manifestLanguages: IVectorView[String] = js.native
  var primaryLanguageOverride: String = js.native
}

