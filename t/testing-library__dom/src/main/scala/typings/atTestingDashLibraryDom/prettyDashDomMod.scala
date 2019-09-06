package typings.atTestingDashLibraryDom

import typings.atTestingDashLibraryDom.atTestingDashLibraryDomNumbers.`false`
import typings.prettyDashFormat.prettyDashFormatMod.OptionsReceived
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/pretty-dom", JSImport.Namespace)
@js.native
object prettyDashDomMod extends js.Object {
  def prettyDOM(element: HTMLElement): String | `false` = js.native
  def prettyDOM(element: HTMLElement, maxLength: Double): String | `false` = js.native
  def prettyDOM(element: HTMLElement, maxLength: Double, options: OptionsReceived): String | `false` = js.native
}

