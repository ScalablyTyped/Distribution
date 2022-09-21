package typings.wanakana

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PassKanji extends StObject {
    
    var passKanji: js.UndefOr[Boolean] = js.undefined
  }
  object PassKanji {
    
    inline def apply(): PassKanji = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PassKanji]
    }
    
    extension [Self <: PassKanji](x: Self) {
      
      inline def setPassKanji(value: Boolean): Self = StObject.set(x, "passKanji", value.asInstanceOf[js.Any])
      
      inline def setPassKanjiUndefined: Self = StObject.set(x, "passKanji", js.undefined)
    }
  }
}
