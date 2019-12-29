package typings.atTestingDashLibraryDom

import typings.atTestingDashLibraryDom.atTestingDashLibraryDomBooleans.`false`
import typings.prettyDashFormat.prettyDashFormatMod.OptionsReceived
import typings.std.Element
import typings.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/pretty-dom", JSImport.Namespace)
@js.native
object prettyDashDomMod extends js.Object {
  def logDOM(): Unit = js.native
  def logDOM(dom: Element): Unit = js.native
  def logDOM(dom: Element, maxLength: Double): Unit = js.native
  def logDOM(dom: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def logDOM(dom: HTMLDocument): Unit = js.native
  def logDOM(dom: HTMLDocument, maxLength: Double): Unit = js.native
  def logDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
  def prettyDOM(): String | `false` = js.native
  def prettyDOM(dom: Element): String | `false` = js.native
  def prettyDOM(dom: Element, maxLength: Double): String | `false` = js.native
  def prettyDOM(dom: Element, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = js.native
}

