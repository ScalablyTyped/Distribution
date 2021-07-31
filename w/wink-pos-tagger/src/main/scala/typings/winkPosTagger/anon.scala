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
    
    @scala.inline
    def apply(): Lemma = {
      val __obj = js.Dynamic.literal(lemma = true, normal = true)
      __obj.asInstanceOf[Lemma]
    }
    
    @scala.inline
    implicit class LemmaMutableBuilder[Self <: Lemma] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLemma(value: `true`): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormal(value: `true`): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    }
  }
}
