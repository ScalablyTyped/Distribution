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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PassKanji] (val x: Self) extends AnyVal {
      
      inline def setPassKanji(value: Boolean): Self = StObject.set(x, "passKanji", value.asInstanceOf[js.Any])
      
      inline def setPassKanjiUndefined: Self = StObject.set(x, "passKanji", js.undefined)
    }
  }
}
