package typings.testingLibraryReact.mod

import typings.react.mod.ReactElement
import typings.testingLibraryDom.getQueriesForElementMod.Queries
import typings.testingLibraryReact.Typeofqueries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "render")
@js.native
object render extends js.Object {
  def apply(ui: ReactElement): RenderResult[Typeofqueries] = js.native
  def apply[Q /* <: Queries */](ui: ReactElement, options: RenderOptions[Q]): RenderResult[Q] = js.native
}

