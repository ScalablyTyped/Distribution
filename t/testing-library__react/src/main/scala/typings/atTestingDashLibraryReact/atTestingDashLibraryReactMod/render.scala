package typings.atTestingDashLibraryReact.atTestingDashLibraryReactMod

import typings.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.Queries
import typings.atTestingDashLibraryReact.Typeofqueries
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "render")
@js.native
object render extends js.Object {
  def apply(ui: ReactElement): RenderResult[Typeofqueries] = js.native
  def apply[Q /* <: Queries */](ui: ReactElement, options: RenderOptions[Q]): RenderResult[Q] = js.native
}

