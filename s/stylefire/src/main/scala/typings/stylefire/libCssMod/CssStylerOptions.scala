package typings.stylefire.libCssMod

import typings.std.HTMLElement
import typings.stylefire.libStylerTypesMod.ResolvedState
import typings.stylefire.libStylerTypesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssStylerOptions extends js.Object {
  var element: HTMLElement
  var hasCSSVariable: js.UndefOr[Boolean] = js.undefined
  var preparseOutput: Boolean
  def buildStyles(state: State): ResolvedState
}

object CssStylerOptions {
  @scala.inline
  def apply(
    buildStyles: State => ResolvedState,
    element: HTMLElement,
    preparseOutput: Boolean,
    hasCSSVariable: js.UndefOr[Boolean] = js.undefined
  ): CssStylerOptions = {
    val __obj = js.Dynamic.literal(buildStyles = js.Any.fromFunction1(buildStyles), element = element.asInstanceOf[js.Any], preparseOutput = preparseOutput.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCSSVariable)) __obj.updateDynamic("hasCSSVariable")(hasCSSVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssStylerOptions]
  }
}

