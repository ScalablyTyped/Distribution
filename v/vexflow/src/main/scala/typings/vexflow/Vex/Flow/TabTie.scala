package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Family
import typings.vexflow.anon.Firstindices
import typings.vexflow.anon.Firstxpx
import typings.vexflow.anon.Lastindices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabTie extends StaveTie {
  def createHammeron(notes: Firstindices): TabTie = js.native
  def createPulloff(notes: Firstindices): TabTie = js.native
}

object TabTie {
  @scala.inline
  def apply(
    createHammeron: Firstindices => TabTie,
    createPulloff: Firstindices => TabTie,
    draw: () => Boolean,
    isPartial: () => Boolean,
    renderText: (Double, Double) => Unit,
    renderTie: Firstxpx => Unit,
    setContext: IRenderContext => StaveTie,
    setFont: Family => StaveTie,
    setNotes: Lastindices => StaveTie
  ): TabTie = {
    val __obj = js.Dynamic.literal(createHammeron = js.Any.fromFunction1(createHammeron), createPulloff = js.Any.fromFunction1(createPulloff), draw = js.Any.fromFunction0(draw), isPartial = js.Any.fromFunction0(isPartial), renderText = js.Any.fromFunction2(renderText), renderTie = js.Any.fromFunction1(renderTie), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[TabTie]
  }
  @scala.inline
  implicit class TabTieOps[Self <: TabTie] (val x: Self) extends AnyVal {
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
    def setCreateHammeron(value: Firstindices => TabTie): Self = this.set("createHammeron", js.Any.fromFunction1(value))
    @scala.inline
    def setCreatePulloff(value: Firstindices => TabTie): Self = this.set("createPulloff", js.Any.fromFunction1(value))
  }
  
}

