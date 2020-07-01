package typings.testingLibraryReact.mod

import typings.std.HTMLElement
import typings.testingLibraryDom.suggestionsMod.Method
import typings.testingLibraryDom.suggestionsMod.Suggestion
import typings.testingLibraryDom.suggestionsMod.Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "getSuggestedQuery")
@js.native
object getSuggestedQuery extends js.Object {
  def apply(element: HTMLElement): js.UndefOr[Suggestion] = js.native
  def apply(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = js.native
  def apply(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = js.native
}

