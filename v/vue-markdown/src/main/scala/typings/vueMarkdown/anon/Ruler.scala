package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ruler extends StObject {
  
  var State: scala.Any
  
  var parse: scala.Any
  
  var ruler: After
  
  var ruler2: After
  
  var skipToken: scala.Any
  
  var tokenize: scala.Any
}
object Ruler {
  
  inline def apply(
    State: scala.Any,
    parse: scala.Any,
    ruler: After,
    ruler2: After,
    skipToken: scala.Any,
    tokenize: scala.Any
  ): Ruler = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = skipToken.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruler]
  }
  
  extension [Self <: Ruler](x: Self) {
    
    inline def setParse(value: scala.Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setRuler(value: After): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    
    inline def setRuler2(value: After): Self = StObject.set(x, "ruler2", value.asInstanceOf[js.Any])
    
    inline def setSkipToken(value: scala.Any): Self = StObject.set(x, "skipToken", value.asInstanceOf[js.Any])
    
    inline def setState(value: scala.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setTokenize(value: scala.Any): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
  }
}
