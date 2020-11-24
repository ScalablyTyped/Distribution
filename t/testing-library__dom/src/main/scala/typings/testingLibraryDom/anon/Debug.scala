package typings.testingLibraryDom.anon

import typings.prettyFormat.mod.OptionsReceived
import typings.std.Element
import typings.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends js.Object {
  
  /**
    * Convenience function for `pretty-dom` which also allows an array
    * of elements
    */
  def debug(): Unit = js.native
  def debug(element: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def debug(element: js.UndefOr[scala.Nothing], maxLength: Double): Unit = js.native
  def debug(element: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument]): Unit = js.native
  def debug(
    element: js.Array[Element | HTMLDocument],
    maxLength: js.UndefOr[scala.Nothing],
    options: OptionsReceived
  ): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(element: Element): Unit = js.native
  def debug(element: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def debug(element: Element, maxLength: Double): Unit = js.native
  def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(element: HTMLDocument): Unit = js.native
  def debug(element: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
  
  /**
    * Convenience function for `Testing Playground` which logs URL that
    * can be opened in a browser
    */
  def logTestingPlaygroundURL(): Unit = js.native
  def logTestingPlaygroundURL(element: Element): Unit = js.native
  def logTestingPlaygroundURL(element: HTMLDocument): Unit = js.native
}
