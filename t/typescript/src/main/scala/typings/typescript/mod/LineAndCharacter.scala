package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineAndCharacter extends StObject {
  
  var character: Double
  
  /** 0-based. */
  var line: Double
}
object LineAndCharacter {
  
  @scala.inline
  def apply(character: Double, line: Double): LineAndCharacter = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAndCharacter]
  }
  
  @scala.inline
  implicit class LineAndCharacterMutableBuilder[Self <: LineAndCharacter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
