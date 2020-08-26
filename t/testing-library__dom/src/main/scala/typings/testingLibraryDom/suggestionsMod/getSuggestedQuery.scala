package typings.testingLibraryDom.suggestionsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/types/suggestions", "getSuggestedQuery")
@js.native
object getSuggestedQuery extends js.Object {
  def apply(element: HTMLElement): js.UndefOr[Suggestion] = js.native
  def apply(element: HTMLElement, variant: js.UndefOr[scala.Nothing], method: Method): js.UndefOr[Suggestion] = js.native
  def apply(element: HTMLElement, variant: Variant): js.UndefOr[Suggestion] = js.native
  def apply(element: HTMLElement, variant: Variant, method: Method): js.UndefOr[Suggestion] = js.native
}

