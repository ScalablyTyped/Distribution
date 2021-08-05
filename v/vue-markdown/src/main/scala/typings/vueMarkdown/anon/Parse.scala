package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse extends StObject {
  
  var State: js.Any
  
  var parse: js.Any
  
  var ruler: After
  
  var tokenize: js.Any
}
object Parse {
  
  inline def apply(State: js.Any, parse: js.Any, ruler: After, tokenize: js.Any): Parse = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  extension [Self <: Parse](x: Self) {
    
    inline def setParse(value: js.Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setRuler(value: After): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    
    inline def setState(value: js.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setTokenize(value: js.Any): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
  }
}
