package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineAndCharacter extends StObject {
  
  /* private */ var _character: Any
  
  /* private */ var _line: Any
  
  def character(): Double
  
  def line(): Double
}
object LineAndCharacter {
  
  inline def apply(_character: Any, _line: Any, character: () => Double, line: () => Double): LineAndCharacter = {
    val __obj = js.Dynamic.literal(_character = _character.asInstanceOf[js.Any], _line = _line.asInstanceOf[js.Any], character = js.Any.fromFunction0(character), line = js.Any.fromFunction0(line))
    __obj.asInstanceOf[LineAndCharacter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineAndCharacter] (val x: Self) extends AnyVal {
    
    inline def setCharacter(value: () => Double): Self = StObject.set(x, "character", js.Any.fromFunction0(value))
    
    inline def setLine(value: () => Double): Self = StObject.set(x, "line", js.Any.fromFunction0(value))
    
    inline def set_character(value: Any): Self = StObject.set(x, "_character", value.asInstanceOf[js.Any])
    
    inline def set_line(value: Any): Self = StObject.set(x, "_line", value.asInstanceOf[js.Any])
  }
}
