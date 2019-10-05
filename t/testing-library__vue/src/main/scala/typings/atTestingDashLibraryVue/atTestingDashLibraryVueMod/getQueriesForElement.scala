package typings.atTestingDashLibraryVue.atTestingDashLibraryVueMod

import typings.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.BoundFunctions
import typings.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.Queries
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "getQueriesForElement")
@js.native
object getQueriesForElement extends js.Object {
  def apply[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  def apply[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
}

