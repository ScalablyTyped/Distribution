package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modifier extends StObject {
  
  def alignSubNotesWithNote(subNotes: js.Array[Note], note: Note): Unit
  
  //inconsistent type: void -> Modifier
  def draw(): Unit
  
  def getCategory(): String
  
  def getContext(): IRenderContext
  
  def getIndex(): Double
  
  def getModifierContext(): ModifierContext
  
  def getNote(): Note
  
  def getPosition(): Position
  
  // (Modifier extends Element in vexflow, but not in these definitions, probably because of some typing problem)
  def getStyle(): FillStyle_
  
  def getWidth(): Double
  
  def setContext(context: IRenderContext): Modifier
  
  def setIndex(index: Double): Modifier
  
  def setModifierContext(c: ModifierContext): Modifier
  
  def setNote(note: Note): Modifier
  
  def setPosition(position: Position): Modifier
  
  def setStyle(style: FillStyle_): Modifier
  
  def setTextLine(line: Double): Modifier
  
  def setWidth(width: Double): Modifier
  
  def setXShift(x: Double): Unit
  
  def setYShift(y: Double): Modifier
}
object Modifier {
  
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
    setIndex: Double => Modifier,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setStyle: FillStyle_ => Modifier,
    setTextLine: Double => Modifier,
    setWidth: Double => Modifier,
    setXShift: Double => Unit,
    setYShift: Double => Modifier
  ): Modifier = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2(alignSubNotesWithNote), draw = js.Any.fromFunction0(draw), getCategory = js.Any.fromFunction0(getCategory), getContext = js.Any.fromFunction0(getContext), getIndex = js.Any.fromFunction0(getIndex), getModifierContext = js.Any.fromFunction0(getModifierContext), getNote = js.Any.fromFunction0(getNote), getPosition = js.Any.fromFunction0(getPosition), getStyle = js.Any.fromFunction0(getStyle), getWidth = js.Any.fromFunction0(getWidth), setContext = js.Any.fromFunction1(setContext), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTextLine = js.Any.fromFunction1(setTextLine), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Modifier]
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("Vex.Flow.Modifier.Position")
  @js.native
  object Position extends StObject {
    
    @js.native
    sealed trait ABOVE
      extends StObject
         with Position
    
    @js.native
    sealed trait BELOW
      extends StObject
         with Position
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Position
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Position
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Modifier] (val x: Self) extends AnyVal {
    
    inline def setAlignSubNotesWithNote(value: (js.Array[Note], Note) => Unit): Self = StObject.set(x, "alignSubNotesWithNote", js.Any.fromFunction2(value))
    
    inline def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    inline def setGetCategory(value: () => String): Self = StObject.set(x, "getCategory", js.Any.fromFunction0(value))
    
    inline def setGetContext(value: () => IRenderContext): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    inline def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    inline def setGetModifierContext(value: () => ModifierContext): Self = StObject.set(x, "getModifierContext", js.Any.fromFunction0(value))
    
    inline def setGetNote(value: () => Note): Self = StObject.set(x, "getNote", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => Position): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetStyle(value: () => FillStyle_): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setSetContext(value: IRenderContext => Modifier): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetIndex(value: Double => Modifier): Self = StObject.set(x, "setIndex", js.Any.fromFunction1(value))
    
    inline def setSetModifierContext(value: ModifierContext => Modifier): Self = StObject.set(x, "setModifierContext", js.Any.fromFunction1(value))
    
    inline def setSetNote(value: Note => Modifier): Self = StObject.set(x, "setNote", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: Position => Modifier): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setSetStyle(value: FillStyle_ => Modifier): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
    
    inline def setSetTextLine(value: Double => Modifier): Self = StObject.set(x, "setTextLine", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Double => Modifier): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetXShift(value: Double => Unit): Self = StObject.set(x, "setXShift", js.Any.fromFunction1(value))
    
    inline def setSetYShift(value: Double => Modifier): Self = StObject.set(x, "setYShift", js.Any.fromFunction1(value))
  }
}
