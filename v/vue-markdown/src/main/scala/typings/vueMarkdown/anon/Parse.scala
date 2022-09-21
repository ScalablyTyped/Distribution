package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse extends StObject {
  
  var State: scala.Any
  
  var parse: scala.Any
  
  var ruler: After
  
  var tokenize: scala.Any
}
object Parse {
  
  inline def apply(State: scala.Any, parse: scala.Any, ruler: After, tokenize: scala.Any): Parse = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  extension [Self <: Parse](x: Self) {
    
    inline def setParse(value: scala.Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setRuler(value: After): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    
    inline def setState(value: scala.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setTokenize(value: scala.Any): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
  }
}
