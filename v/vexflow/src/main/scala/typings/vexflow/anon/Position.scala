package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: js.UndefOr[typings.vexflow.Vex.Flow.TextBracket.Positions] = js.undefined
  
  var start: typings.vexflow.Vex.Flow.Note
  
  var stop: typings.vexflow.Vex.Flow.Note
  
  var superscript: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object Position {
  
  inline def apply(start: typings.vexflow.Vex.Flow.Note, stop: typings.vexflow.Vex.Flow.Note): Position = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: typings.vexflow.Vex.Flow.TextBracket.Positions): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStart(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStop(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setSuperscript(value: String): Self = StObject.set(x, "superscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscriptUndefined: Self = StObject.set(x, "superscript", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
