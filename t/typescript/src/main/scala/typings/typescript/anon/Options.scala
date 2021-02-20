package typings.typescript.anon

import typings.typescript.mod.Diagnostic
import typings.typescript.mod.TypeAcquisition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var errors: js.Array[Diagnostic] = js.native
  
  var options: TypeAcquisition = js.native
}
object Options {
  
  @scala.inline
  def apply(errors: js.Array[Diagnostic], options: TypeAcquisition): Options = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: TypeAcquisition): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
