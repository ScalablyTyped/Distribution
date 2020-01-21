package typings.testingLibraryReact.mod

import typings.react.mod.ReactElement
import typings.testingLibraryReact.Typeofqueries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "render")
@js.native
object render_queries extends js.Object {
  def apply(
    ui: ReactElement,
    options: Omit[
      RenderOptions[Typeofqueries], 
      typings.testingLibraryReact.testingLibraryReactStrings.queries
    ]
  ): RenderResult[Typeofqueries] = js.native
}

