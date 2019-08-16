package typings.atTestingDashLibraryDom

import typings.atTestingDashLibraryDom.atTestingDashLibraryDomNumbers.`false`
import typings.prettyDashFormat.prettyDashFormatMod.Options
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/pretty-dom", JSImport.Namespace)
@js.native
object prettyDashDomMod extends js.Object {
  def prettyDOM(element: HTMLElement): String | `false` = js.native
  def prettyDOM(element: HTMLElement, maxLength: Double): String | `false` = js.native
  def prettyDOM(element: HTMLElement, maxLength: Double, options: Options): String | `false` = js.native
}

