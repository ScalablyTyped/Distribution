package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesFormFieldMod.CharactersLeftFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCharactersLeftCharactersLeftFn extends StObject {
  
  var setCharactersLeft: CharactersLeftFn
}
object SetCharactersLeftCharactersLeftFn {
  
  inline def apply(setCharactersLeft: /* lengthLeft */ Double => Unit): SetCharactersLeftCharactersLeftFn = {
    val __obj = js.Dynamic.literal(setCharactersLeft = js.Any.fromFunction1(setCharactersLeft))
    __obj.asInstanceOf[SetCharactersLeftCharactersLeftFn]
  }
  
  extension [Self <: SetCharactersLeftCharactersLeftFn](x: Self) {
    
    inline def setSetCharactersLeft(value: /* lengthLeft */ Double => Unit): Self = StObject.set(x, "setCharactersLeft", js.Any.fromFunction1(value))
  }
}
