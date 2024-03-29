package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vibrato
  extends StObject
     with Modifier {
  
  def setHarsh(harsh: Boolean): Vibrato
  
  def setVibratoWidth(width: Double): Vibrato
}
object Vibrato {
  
  inline def apply(
    alignSubNotesWithNote: (js.Array[Note], Note) => Unit,
    draw: () => Unit,
    getCategory: () => String,
    getContext: () => IRenderContext,
    getIndex: () => Double,
    getModifierContext: () => ModifierContext,
    getNote: () => Note,
    getPosition: () => Position,
    getStyle: () => FillStyle_,
    getWidth: () => Double,
    setContext: IRenderContext => Modifier,
    setHarsh: Boolean => Vibrato,
    setIndex: Double => Modifier,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setStyle: FillStyle_ => Modifier,
    setTextLine: Double => Modifier,
    setVibratoWidth: Double => Vibrato,
    setWidth: Double => Modifier,
    setXShift: Double => Unit,
    setYShift: Double => Modifier
  ): Vibrato = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2(alignSubNotesWithNote), draw = js.Any.fromFunction0(draw), getCategory = js.Any.fromFunction0(getCategory), getContext = js.Any.fromFunction0(getContext), getIndex = js.Any.fromFunction0(getIndex), getModifierContext = js.Any.fromFunction0(getModifierContext), getNote = js.Any.fromFunction0(getNote), getPosition = js.Any.fromFunction0(getPosition), getStyle = js.Any.fromFunction0(getStyle), getWidth = js.Any.fromFunction0(getWidth), setContext = js.Any.fromFunction1(setContext), setHarsh = js.Any.fromFunction1(setHarsh), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTextLine = js.Any.fromFunction1(setTextLine), setVibratoWidth = js.Any.fromFunction1(setVibratoWidth), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Vibrato]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vibrato] (val x: Self) extends AnyVal {
    
    inline def setSetHarsh(value: Boolean => Vibrato): Self = StObject.set(x, "setHarsh", js.Any.fromFunction1(value))
    
    inline def setSetVibratoWidth(value: Double => Vibrato): Self = StObject.set(x, "setVibratoWidth", js.Any.fromFunction1(value))
  }
}
