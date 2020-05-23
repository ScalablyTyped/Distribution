package typings.vexflow.Vex.Flow

import typings.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaveModifier extends js.Object {
  def addEndModifier(): Unit
  def addModifier(): Unit
  def addToStave(stave: Stave, firstGlyph: Boolean): StaveModifier
  def addToStaveEnd(stave: Stave, firstGlyph: Boolean): StaveModifier
  def getCategory(): String
  def getPadding(index: Double): Double
  def getPosition(): Double
  def getWidth(): Double
  def makeSpacer(padding: Double): GetContext
  def placeGlyphOnLine(glyph: Glyph, stave: Stave, line: Double): Unit
  def setPadding(padding: Double): Unit
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

