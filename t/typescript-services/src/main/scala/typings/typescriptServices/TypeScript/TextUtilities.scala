package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextUtilities {
  
  trait ICharacterSequence extends StObject {
    
    def charCodeAt(index: Double): Double
    
    var length: Double
  }
  object ICharacterSequence {
    
    @scala.inline
    def apply(charCodeAt: Double => Double, length: Double): ICharacterSequence = {
      val __obj = js.Dynamic.literal(charCodeAt = js.Any.fromFunction1(charCodeAt), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICharacterSequence]
    }
    
    @scala.inline
    implicit class ICharacterSequenceMutableBuilder[Self <: ICharacterSequence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharCodeAt(value: Double => Double): Self = StObject.set(x, "charCodeAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
