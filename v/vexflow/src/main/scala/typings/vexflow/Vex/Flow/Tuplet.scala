package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tuplet extends js.Object {
  def attach(): Unit = js.native
  def detach(): Unit = js.native
  def draw(): Unit = js.native
  def getBeatsOccupied(): Double = js.native
  def getNoteCount(): Double = js.native
  def getNotes(): js.Array[StaveNote] = js.native
  def resolveGlyphs(): Unit = js.native
  def setBeatsOccupied(beats: Double): Unit = js.native
  def setBracketed(bracketed: Boolean): Tuplet = js.native
  def setContext(context: IRenderContext): Tuplet = js.native
  def setRatioed(ratioed: Boolean): Tuplet = js.native
  def setTupletLocation(location: Double): Tuplet = js.native
}

object Tuplet {
  @scala.inline
  def apply(
    attach: () => Unit,
    detach: () => Unit,
    draw: () => Unit,
    getBeatsOccupied: () => Double,
    getNoteCount: () => Double,
    getNotes: () => js.Array[StaveNote],
    resolveGlyphs: () => Unit,
    setBeatsOccupied: Double => Unit,
    setBracketed: Boolean => Tuplet,
    setContext: IRenderContext => Tuplet,
    setRatioed: Boolean => Tuplet,
    setTupletLocation: Double => Tuplet
  ): Tuplet = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), detach = js.Any.fromFunction0(detach), draw = js.Any.fromFunction0(draw), getBeatsOccupied = js.Any.fromFunction0(getBeatsOccupied), getNoteCount = js.Any.fromFunction0(getNoteCount), getNotes = js.Any.fromFunction0(getNotes), resolveGlyphs = js.Any.fromFunction0(resolveGlyphs), setBeatsOccupied = js.Any.fromFunction1(setBeatsOccupied), setBracketed = js.Any.fromFunction1(setBracketed), setContext = js.Any.fromFunction1(setContext), setRatioed = js.Any.fromFunction1(setRatioed), setTupletLocation = js.Any.fromFunction1(setTupletLocation))
    __obj.asInstanceOf[Tuplet]
  }
  @scala.inline
  implicit class TupletOps[Self <: Tuplet] (val x: Self) extends AnyVal {
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
    def setAttach(value: () => Unit): Self = this.set("attach", js.Any.fromFunction0(value))
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    @scala.inline
    def setDraw(value: () => Unit): Self = this.set("draw", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBeatsOccupied(value: () => Double): Self = this.set("getBeatsOccupied", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNoteCount(value: () => Double): Self = this.set("getNoteCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNotes(value: () => js.Array[StaveNote]): Self = this.set("getNotes", js.Any.fromFunction0(value))
    @scala.inline
    def setResolveGlyphs(value: () => Unit): Self = this.set("resolveGlyphs", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBeatsOccupied(value: Double => Unit): Self = this.set("setBeatsOccupied", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBracketed(value: Boolean => Tuplet): Self = this.set("setBracketed", js.Any.fromFunction1(value))
    @scala.inline
    def setSetContext(value: IRenderContext => Tuplet): Self = this.set("setContext", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRatioed(value: Boolean => Tuplet): Self = this.set("setRatioed", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTupletLocation(value: Double => Tuplet): Self = this.set("setTupletLocation", js.Any.fromFunction1(value))
  }
  
}

