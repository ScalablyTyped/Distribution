package typings.testingLibraryReact.mod

import typings.prettyFormat.mod.OptionsReceived
import typings.react.mod.ReactElement
import typings.std.DocumentFragment
import typings.std.Element
import typings.testingLibraryDom.getQueriesForElementMod.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderResult[Q /* <: Queries */] extends js.Object {
  
  def asFragment(): DocumentFragment = js.native
  
  var baseElement: Element = js.native
  
  var container: Element = js.native
  
  def debug(): Unit = js.native
  def debug(
    baseElement: js.UndefOr[scala.Nothing],
    maxLength: js.UndefOr[scala.Nothing],
    options: OptionsReceived
  ): Unit = js.native
  def debug(baseElement: js.UndefOr[scala.Nothing], maxLength: Double): Unit = js.native
  def debug(baseElement: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(baseElement: js.Array[Element | DocumentFragment]): Unit = js.native
  def debug(
    baseElement: js.Array[Element | DocumentFragment],
    maxLength: js.UndefOr[scala.Nothing],
    options: OptionsReceived
  ): Unit = js.native
  def debug(baseElement: js.Array[Element | DocumentFragment], maxLength: Double): Unit = js.native
  def debug(baseElement: js.Array[Element | DocumentFragment], maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(baseElement: DocumentFragment): Unit = js.native
  def debug(baseElement: DocumentFragment, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def debug(baseElement: DocumentFragment, maxLength: Double): Unit = js.native
  def debug(baseElement: DocumentFragment, maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(baseElement: Element): Unit = js.native
  def debug(baseElement: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def debug(baseElement: Element, maxLength: Double): Unit = js.native
  def debug(baseElement: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  
  def rerender(ui: ReactElement): Unit = js.native
  
  def unmount(): Boolean = js.native
}
