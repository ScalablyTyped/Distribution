package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stroke
  extends StObject
     with Modifier {
  
  def addEndNote(note: Note): Stroke
}
object Stroke {
  
  inline def apply(
    addEndNote: Note => Stroke,
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
    setIndex: Double => Modifier,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setStyle: FillStyle_ => Modifier,
    setTextLine: Double => Modifier,
    setWidth: Double => Modifier,
    setXShift: Double => Unit,
    setYShift: Double => Modifier
  ): Stroke = {
    val __obj = js.Dynamic.literal(addEndNote = js.Any.fromFunction1(addEndNote), alignSubNotesWithNote = js.Any.fromFunction2(alignSubNotesWithNote), draw = js.Any.fromFunction0(draw), getCategory = js.Any.fromFunction0(getCategory), getContext = js.Any.fromFunction0(getContext), getIndex = js.Any.fromFunction0(getIndex), getModifierContext = js.Any.fromFunction0(getModifierContext), getNote = js.Any.fromFunction0(getNote), getPosition = js.Any.fromFunction0(getPosition), getStyle = js.Any.fromFunction0(getStyle), getWidth = js.Any.fromFunction0(getWidth), setContext = js.Any.fromFunction1(setContext), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTextLine = js.Any.fromFunction1(setTextLine), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Stroke]
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSGlobal("Vex.Flow.Stroke.Type")
  @js.native
  object Type extends StObject {
    
    @js.native
    sealed trait ARPEGGIO_DIRECTIONLESS
      extends StObject
         with Type
    
    @js.native
    sealed trait BRUSH_DOWN
      extends StObject
         with Type
    
    @js.native
    sealed trait BRUSH_UP
      extends StObject
         with Type
    
    @js.native
    sealed trait RASQUEDO_DOWN
      extends StObject
         with Type
    
    @js.native
    sealed trait RASQUEDO_UP
      extends StObject
         with Type
    
    @js.native
    sealed trait ROLL_DOWN
      extends StObject
         with Type
    
    @js.native
    sealed trait ROLL_UP
      extends StObject
         with Type
  }
  
  extension [Self <: Stroke](x: Self) {
    
    inline def setAddEndNote(value: Note => Stroke): Self = StObject.set(x, "addEndNote", js.Any.fromFunction1(value))
  }
}
