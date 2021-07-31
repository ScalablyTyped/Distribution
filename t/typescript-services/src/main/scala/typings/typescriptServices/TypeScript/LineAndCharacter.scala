package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineAndCharacter extends StObject {
  
  var _character: js.Any
  
  var _line: js.Any
  
  def character(): Double
  
  def line(): Double
}
object LineAndCharacter {
  
  @scala.inline
  def apply(_character: js.Any, _line: js.Any, character: () => Double, line: () => Double): LineAndCharacter = {
    val __obj = js.Dynamic.literal(_character = _character.asInstanceOf[js.Any], _line = _line.asInstanceOf[js.Any], character = js.Any.fromFunction0(character), line = js.Any.fromFunction0(line))
    __obj.asInstanceOf[LineAndCharacter]
  }
  
  @scala.inline
  implicit class LineAndCharacterMutableBuilder[Self <: LineAndCharacter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: () => Double): Self = StObject.set(x, "character", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLine(value: () => Double): Self = StObject.set(x, "line", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_character(value: js.Any): Self = StObject.set(x, "_character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_line(value: js.Any): Self = StObject.set(x, "_line", value.asInstanceOf[js.Any])
  }
}
