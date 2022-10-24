package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCharactersLeft extends StObject {
  
  def setCharactersLeft(lengthLeft: Any): Unit
}
object SetCharactersLeft {
  
  inline def apply(setCharactersLeft: Any => Unit): SetCharactersLeft = {
    val __obj = js.Dynamic.literal(setCharactersLeft = js.Any.fromFunction1(setCharactersLeft))
    __obj.asInstanceOf[SetCharactersLeft]
  }
  
  extension [Self <: SetCharactersLeft](x: Self) {
    
    inline def setSetCharactersLeft(value: Any => Unit): Self = StObject.set(x, "setCharactersLeft", js.Any.fromFunction1(value))
  }
}
