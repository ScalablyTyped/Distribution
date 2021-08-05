package typings.wixStyleReact.anon

import typings.wixStyleReact.formFieldMod.CharactersLeftFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCharactersLeft extends StObject {
  
  var setCharactersLeft: CharactersLeftFn
}
object SetCharactersLeft {
  
  inline def apply(setCharactersLeft: /* lengthLeft */ Double => Unit): SetCharactersLeft = {
    val __obj = js.Dynamic.literal(setCharactersLeft = js.Any.fromFunction1(setCharactersLeft))
    __obj.asInstanceOf[SetCharactersLeft]
  }
  
  extension [Self <: SetCharactersLeft](x: Self) {
    
    inline def setSetCharactersLeft(value: /* lengthLeft */ Double => Unit): Self = StObject.set(x, "setCharactersLeft", js.Any.fromFunction1(value))
  }
}
