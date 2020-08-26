package typings.vexflow.Vex.Flow

import typings.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaveModifier extends js.Object {
  def addEndModifier(): Unit = js.native
  def addModifier(): Unit = js.native
  def addToStave(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  def addToStaveEnd(stave: Stave, firstGlyph: Boolean): StaveModifier = js.native
  def getCategory(): String = js.native
  def getPadding(index: Double): Double = js.native
  def getPosition(): Double = js.native
  def getWidth(): Double = js.native
  def makeSpacer(padding: Double): GetContext = js.native
  def placeGlyphOnLine(glyph: Glyph, stave: Stave, line: Double): Unit = js.native
  def setPadding(padding: Double): Unit = js.native
}

@JSGlobal("Vex.Flow.StaveModifier")
@js.native
object StaveModifier extends js.Object {
  @js.native
  sealed trait Position extends js.Object
  
  // @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
  @js.native
  object Position extends js.Object {
    @js.native
    sealed trait ABOVE extends Position
    
    @js.native
    sealed trait BEGIN extends Position
    
    @js.native
    sealed trait BELOW extends Position
    
    @js.native
    sealed trait END extends Position
    
    @js.native
    sealed trait LEFT extends Position
    
    @js.native
    sealed trait RIGHT extends Position
    
  }
  
}

