package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alphabetize extends StObject {
  
  var alphabetize: Boolean
  
  var order: String
}
object Alphabetize {
  
  @scala.inline
  def apply(alphabetize: Boolean, order: String): Alphabetize = {
    val __obj = js.Dynamic.literal(alphabetize = alphabetize.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alphabetize]
  }
  
  @scala.inline
  implicit class AlphabetizeMutableBuilder[Self <: Alphabetize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlphabetize(value: Boolean): Self = StObject.set(x, "alphabetize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
