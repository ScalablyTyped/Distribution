package typings.vextab.mod

import typings.vextab.vextabStrings.annotations
import typings.vextab.vextabStrings.bar
import typings.vextab.vextabStrings.command
import typings.vextab.vextabStrings.rest
import typings.vextab.vextabStrings.tuplet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VexTabNote extends StObject {
  
  var abc: js.UndefOr[ABC] = js.undefined
  
  var articulation: js.UndefOr[String] = js.undefined
  
  var command: js.UndefOr[bar | tuplet | annotations | rest | typings.vextab.vextabStrings.command] = js.undefined
  
  var decorator: js.UndefOr[String] = js.undefined
  
  var dot: js.UndefOr[Boolean] = js.undefined
  
  var fret: js.UndefOr[String] = js.undefined
  
  var octave: js.UndefOr[String] = js.undefined
  
  var string: js.UndefOr[String] = js.undefined
  
  var time: js.UndefOr[Double] = js.undefined
}
object VexTabNote {
  
  inline def apply(): VexTabNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VexTabNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VexTabNote] (val x: Self) extends AnyVal {
    
    inline def setAbc(value: ABC): Self = StObject.set(x, "abc", value.asInstanceOf[js.Any])
    
    inline def setAbcUndefined: Self = StObject.set(x, "abc", js.undefined)
    
    inline def setArticulation(value: String): Self = StObject.set(x, "articulation", value.asInstanceOf[js.Any])
    
    inline def setArticulationUndefined: Self = StObject.set(x, "articulation", js.undefined)
    
    inline def setCommand(value: bar | tuplet | annotations | rest | command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setDecorator(value: String): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    inline def setDecoratorUndefined: Self = StObject.set(x, "decorator", js.undefined)
    
    inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
    
    inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
    
    inline def setFret(value: String): Self = StObject.set(x, "fret", value.asInstanceOf[js.Any])
    
    inline def setFretUndefined: Self = StObject.set(x, "fret", js.undefined)
    
    inline def setOctave(value: String): Self = StObject.set(x, "octave", value.asInstanceOf[js.Any])
    
    inline def setOctaveUndefined: Self = StObject.set(x, "octave", js.undefined)
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
