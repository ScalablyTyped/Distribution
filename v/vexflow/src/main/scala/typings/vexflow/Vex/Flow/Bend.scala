package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bend
  extends StObject
     with Modifier {
  
  def getText(): String
  
  def setFont(font: String): Bend
  
  def updateWidth(): Bend
}
object Bend {
  
  @scala.inline
  def apply(
    alignSubNotesWithNote: (js.Array[Note], Note) => Unit,
    draw: () => Unit,
    getCategory: () => String,
    getContext: () => IRenderContext,
    getIndex: () => Double,
    getModifierContext: () => ModifierContext,
    getNote: () => Note,
    getPosition: () => Position,
    getText: () => String,
    getWidth: () => Double,
    setContext: IRenderContext => Modifier,
    setFont: String => Bend,
    setIndex: Double => Modifier,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setTextLine: Double => Modifier,
    setWidth: Double => Modifier,
    setXShift: Double => Unit,
    setYShift: Double => Modifier,
    updateWidth: () => Bend
  ): Bend = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2(alignSubNotesWithNote), draw = js.Any.fromFunction0(draw), getCategory = js.Any.fromFunction0(getCategory), getContext = js.Any.fromFunction0(getContext), getIndex = js.Any.fromFunction0(getIndex), getModifierContext = js.Any.fromFunction0(getModifierContext), getNote = js.Any.fromFunction0(getNote), getPosition = js.Any.fromFunction0(getPosition), getText = js.Any.fromFunction0(getText), getWidth = js.Any.fromFunction0(getWidth), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setTextLine = js.Any.fromFunction1(setTextLine), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift), updateWidth = js.Any.fromFunction0(updateWidth))
    __obj.asInstanceOf[Bend]
  }
  
  @scala.inline
  implicit class BendMutableBuilder[Self <: Bend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFont(value: String => Bend): Self = StObject.set(x, "setFont", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateWidth(value: () => Bend): Self = StObject.set(x, "updateWidth", js.Any.fromFunction0(value))
  }
}
