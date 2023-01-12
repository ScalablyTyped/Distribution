package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tuplet extends StObject {
  
  def attach(): Unit
  
  def detach(): Unit
  
  def draw(): Unit
  
  def getBeatsOccupied(): Double
  
  def getNoteCount(): Double
  
  def getNotes(): js.Array[StaveNote]
  
  def resolveGlyphs(): Unit
  
  def setBeatsOccupied(beats: Double): Unit
  
  def setBracketed(bracketed: Boolean): Tuplet
  
  def setContext(context: IRenderContext): Tuplet
  
  def setRatioed(ratioed: Boolean): Tuplet
  
  def setTupletLocation(location: Double): Tuplet
}
object Tuplet {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Tuplet] (val x: Self) extends AnyVal {
    
    inline def setAttach(value: () => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction0(value))
    
    inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    inline def setGetBeatsOccupied(value: () => Double): Self = StObject.set(x, "getBeatsOccupied", js.Any.fromFunction0(value))
    
    inline def setGetNoteCount(value: () => Double): Self = StObject.set(x, "getNoteCount", js.Any.fromFunction0(value))
    
    inline def setGetNotes(value: () => js.Array[StaveNote]): Self = StObject.set(x, "getNotes", js.Any.fromFunction0(value))
    
    inline def setResolveGlyphs(value: () => Unit): Self = StObject.set(x, "resolveGlyphs", js.Any.fromFunction0(value))
    
    inline def setSetBeatsOccupied(value: Double => Unit): Self = StObject.set(x, "setBeatsOccupied", js.Any.fromFunction1(value))
    
    inline def setSetBracketed(value: Boolean => Tuplet): Self = StObject.set(x, "setBracketed", js.Any.fromFunction1(value))
    
    inline def setSetContext(value: IRenderContext => Tuplet): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetRatioed(value: Boolean => Tuplet): Self = StObject.set(x, "setRatioed", js.Any.fromFunction1(value))
    
    inline def setSetTupletLocation(value: Double => Tuplet): Self = StObject.set(x, "setTupletLocation", js.Any.fromFunction1(value))
  }
}
