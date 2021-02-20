package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ornament extends Modifier {
  
  def setDelayed(delayed: Boolean): Ornament = js.native
  
  def setLowerAccidental(acc: String): Ornament = js.native
  
  def setUpperAccidental(acc: String): Ornament = js.native
}
object Ornament {
  
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
    getWidth: () => Double,
    setContext: IRenderContext => Modifier,
    setDelayed: Boolean => Ornament,
    setIndex: Double => Modifier,
    setLowerAccidental: String => Ornament,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setTextLine: Double => Modifier,
    setUpperAccidental: String => Ornament,
    setWidth: Double => Modifier,
    setXShift: Double => Unit,
    setYShift: Double => Modifier
  ): Ornament = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2(alignSubNotesWithNote), draw = js.Any.fromFunction0(draw), getCategory = js.Any.fromFunction0(getCategory), getContext = js.Any.fromFunction0(getContext), getIndex = js.Any.fromFunction0(getIndex), getModifierContext = js.Any.fromFunction0(getModifierContext), getNote = js.Any.fromFunction0(getNote), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), setContext = js.Any.fromFunction1(setContext), setDelayed = js.Any.fromFunction1(setDelayed), setIndex = js.Any.fromFunction1(setIndex), setLowerAccidental = js.Any.fromFunction1(setLowerAccidental), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setTextLine = js.Any.fromFunction1(setTextLine), setUpperAccidental = js.Any.fromFunction1(setUpperAccidental), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Ornament]
  }
  
  @scala.inline
  implicit class OrnamentMutableBuilder[Self <: Ornament] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetDelayed(value: Boolean => Ornament): Self = StObject.set(x, "setDelayed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLowerAccidental(value: String => Ornament): Self = StObject.set(x, "setLowerAccidental", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUpperAccidental(value: String => Ornament): Self = StObject.set(x, "setUpperAccidental", js.Any.fromFunction1(value))
  }
}
