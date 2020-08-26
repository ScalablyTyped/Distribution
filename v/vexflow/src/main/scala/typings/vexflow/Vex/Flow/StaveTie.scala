package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstxpx
import typings.vexflow.anon.Lastindices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaveTie extends js.Object {
  def draw(): Boolean = js.native
  def isPartial(): Boolean = js.native
  def renderText(first_x_px: Double, last_x_px: Double): Unit = js.native
  def renderTie(params: Firstxpx): Unit = js.native
  def setContext(context: IRenderContext): StaveTie = js.native
  def setFont(font: Family): StaveTie = js.native
  def setNotes(notes: Lastindices): StaveTie = js.native
}

object StaveTie {
  @scala.inline
  def apply(
    draw: () => Boolean,
    isPartial: () => Boolean,
    renderText: (Double, Double) => Unit,
    renderTie: Firstxpx => Unit,
    setContext: IRenderContext => StaveTie,
    setFont: Family => StaveTie,
    setNotes: Lastindices => StaveTie
  ): StaveTie = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction0(draw), isPartial = js.Any.fromFunction0(isPartial), renderText = js.Any.fromFunction2(renderText), renderTie = js.Any.fromFunction1(renderTie), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[StaveTie]
  }
  @scala.inline
  implicit class StaveTieOps[Self <: StaveTie] (val x: Self) extends AnyVal {
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
    def setDraw(value: () => Boolean): Self = this.set("draw", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPartial(value: () => Boolean): Self = this.set("isPartial", js.Any.fromFunction0(value))
    @scala.inline
    def setRenderText(value: (Double, Double) => Unit): Self = this.set("renderText", js.Any.fromFunction2(value))
    @scala.inline
    def setRenderTie(value: Firstxpx => Unit): Self = this.set("renderTie", js.Any.fromFunction1(value))
    @scala.inline
    def setSetContext(value: IRenderContext => StaveTie): Self = this.set("setContext", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFont(value: Family => StaveTie): Self = this.set("setFont", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNotes(value: Lastindices => StaveTie): Self = this.set("setNotes", js.Any.fromFunction1(value))
  }
  
}

