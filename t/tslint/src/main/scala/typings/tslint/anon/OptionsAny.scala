package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsAny extends StObject {
  
  var options: js.Any = js.native
}
object OptionsAny {
  
  @scala.inline
  def apply(options: js.Any): OptionsAny = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAny]
  }
  
  @scala.inline
  implicit class OptionsAnyMutableBuilder[Self <: OptionsAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
