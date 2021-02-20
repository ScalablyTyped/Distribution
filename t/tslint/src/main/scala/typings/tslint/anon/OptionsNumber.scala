package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsNumber extends StObject {
  
  var options: Double = js.native
}
object OptionsNumber {
  
  @scala.inline
  def apply(options: Double): OptionsNumber = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsNumber]
  }
  
  @scala.inline
  implicit class OptionsNumberMutableBuilder[Self <: OptionsNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Double): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
