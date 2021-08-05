package typings.winkPosTagger

import typings.winkPosTagger.winkPosTaggerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Lemma extends StObject {
    
    var lemma: `true`
    
    var normal: `true`
  }
  object Lemma {
    
    inline def apply(): Lemma = {
      val __obj = js.Dynamic.literal(lemma = true, normal = true)
      __obj.asInstanceOf[Lemma]
    }
    
    extension [Self <: Lemma](x: Self) {
      
      inline def setLemma(value: `true`): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: `true`): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    }
  }
}
