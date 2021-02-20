package typings.winkPosTagger

import typings.winkPosTagger.winkPosTaggerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Lemma extends StObject {
    
    var lemma: `true` = js.native
    
    var normal: `true` = js.native
  }
  object Lemma {
    
    @scala.inline
    def apply(lemma: `true`, normal: `true`): Lemma = {
      val __obj = js.Dynamic.literal(lemma = lemma.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
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
