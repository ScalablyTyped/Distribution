package typings.testingLibraryReact.mod

import typings.prettyFormat.mod.OptionsReceived
import typings.react.mod.ReactElement
import typings.std.DocumentFragment
import typings.std.HTMLElement
import typings.testingLibraryDom.getQueriesForElementMod.Queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderResult[Q /* <: Queries */] extends js.Object {
  var baseElement: HTMLElement = js.native
  var container: HTMLElement = js.native
  def asFragment(): DocumentFragment = js.native
  def debug(): Unit = js.native
  def debug(baseElement: js.Array[HTMLElement | DocumentFragment]): Unit = js.native
  def debug(baseElement: js.Array[HTMLElement | DocumentFragment], maxLength: Double): Unit = js.native
  def debug(baseElement: js.Array[HTMLElement | DocumentFragment], maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(baseElement: DocumentFragment): Unit = js.native
  def debug(baseElement: DocumentFragment, maxLength: Double): Unit = js.native
  def debug(baseElement: DocumentFragment, maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(baseElement: HTMLElement): Unit = js.native
  def debug(baseElement: HTMLElement, maxLength: Double): Unit = js.native
  def debug(baseElement: HTMLElement, maxLength: Double, options: OptionsReceived): Unit = js.native
  def rerender(ui: ReactElement): Unit = js.native
  def unmount(): Boolean = js.native
}

