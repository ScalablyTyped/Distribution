package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsAlphabetize extends StObject {
  
  var options: Alphabetize
}
object OptionsAlphabetize {
  
  @scala.inline
  def apply(options: Alphabetize): OptionsAlphabetize = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAlphabetize]
  }
  
  @scala.inline
  implicit class OptionsAlphabetizeMutableBuilder[Self <: OptionsAlphabetize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Alphabetize): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
