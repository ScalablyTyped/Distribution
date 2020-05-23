package typings.vexflow.mod.Flow

import typings.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Barline")
@js.native
class Barline protected ()
  extends typings.vexflow.Vex.Flow.Barline {
  def this(`type`: typings.vexflow.Vex.Flow.Barline.`type`, x: Double) = this()
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  /* CompleteClass */
  override def addToStave(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def addToStaveEnd(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getPadding(index: Double): Double = js.native
  /* CompleteClass */
  override def getPosition(): Double = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def makeSpacer(padding: Double): GetContext = js.native
  /* CompleteClass */
  override def placeGlyphOnLine(glyph: typings.vexflow.Vex.Flow.Glyph, stave: typings.vexflow.Vex.Flow.Stave, line: Double): Unit = js.native
  /* CompleteClass */
  override def setPadding(padding: Double): Unit = js.native
}

@JSImport("vexflow", "Flow.Barline")
@js.native
object Barline extends js.Object {
  @js.native
  object `type` extends js.Object {
    /* 0 */ val DOUBLE: typings.vexflow.Vex.Flow.Barline.`type`.DOUBLE with Double = js.native
    /* 1 */ val END: typings.vexflow.Vex.Flow.Barline.`type`.END with Double = js.native
    /* 5 */ val NONE: typings.vexflow.Vex.Flow.Barline.`type`.NONE with Double = js.native
    /* 2 */ val REPEAT_BEGIN: typings.vexflow.Vex.Flow.Barline.`type`.REPEAT_BEGIN with Double = js.native
    /* 4 */ val REPEAT_BOTH: typings.vexflow.Vex.Flow.Barline.`type`.REPEAT_BOTH with Double = js.native
    /* 3 */ val REPEAT_END: typings.vexflow.Vex.Flow.Barline.`type`.REPEAT_END with Double = js.native
    /* 1 */ val SINGLE: typings.vexflow.Vex.Flow.Barline.`type`.SINGLE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Barline.`type` with Double] = js.native
  }
  
}

