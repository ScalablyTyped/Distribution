package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsString extends StObject {
  
  var options: String = js.native
}
object OptionsString {
  
  @scala.inline
  def apply(options: String): OptionsString = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsString]
  }
  
  @scala.inline
  implicit class OptionsStringMutableBuilder[Self <: OptionsString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
