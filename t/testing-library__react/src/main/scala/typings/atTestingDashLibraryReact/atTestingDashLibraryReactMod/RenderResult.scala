package typings.atTestingDashLibraryReact.atTestingDashLibraryReactMod

import typings.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.Queries
import typings.react.reactMod.ReactElement
import typings.std.DocumentFragment
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderResult[Q /* <: Queries */] extends js.Object {
  var baseElement: HTMLElement = js.native
  var container: HTMLElement = js.native
  def asFragment(): DocumentFragment = js.native
  def debug(): Unit = js.native
  def debug(baseElement: DocumentFragment): Unit = js.native
  def debug(baseElement: HTMLElement): Unit = js.native
  def rerender(ui: ReactElement): Unit = js.native
  def unmount(): Boolean = js.native
}

