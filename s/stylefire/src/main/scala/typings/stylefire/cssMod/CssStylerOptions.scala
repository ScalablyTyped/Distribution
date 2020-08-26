package typings.stylefire.cssMod

import typings.std.HTMLElement
import typings.stylefire.typesMod.ResolvedState
import typings.stylefire.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssStylerOptions extends js.Object {
  var element: HTMLElement = js.native
  var hasCSSVariable: js.UndefOr[Boolean] = js.native
  var preparseOutput: Boolean = js.native
  def buildStyles(state: State): ResolvedState = js.native
}

object CssStylerOptions {
  @scala.inline
  def apply(buildStyles: State => ResolvedState, element: HTMLElement, preparseOutput: Boolean): CssStylerOptions = {
    val __obj = js.Dynamic.literal(buildStyles = js.Any.fromFunction1(buildStyles), element = element.asInstanceOf[js.Any], preparseOutput = preparseOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssStylerOptions]
  }
  @scala.inline
  implicit class CssStylerOptionsOps[Self <: CssStylerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuildStyles(value: State => ResolvedState): Self = this.set("buildStyles", js.Any.fromFunction1(value))
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreparseOutput(value: Boolean): Self = this.set("preparseOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasCSSVariable(value: Boolean): Self = this.set("hasCSSVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCSSVariable: Self = this.set("hasCSSVariable", js.undefined)
  }
  
}

