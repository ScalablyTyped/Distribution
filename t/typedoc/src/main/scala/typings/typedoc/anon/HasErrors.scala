package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasErrors extends StObject {
  
  var hasErrors: Boolean = js.native
  
  var inputFiles: js.Array[String] = js.native
}
object HasErrors {
  
  @scala.inline
  def apply(hasErrors: Boolean, inputFiles: js.Array[String]): HasErrors = {
    val __obj = js.Dynamic.literal(hasErrors = hasErrors.asInstanceOf[js.Any], inputFiles = inputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasErrors]
  }
  
  @scala.inline
  implicit class HasErrorsMutableBuilder[Self <: HasErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasErrors(value: Boolean): Self = StObject.set(x, "hasErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFiles(value: js.Array[String]): Self = StObject.set(x, "inputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFilesVarargs(value: String*): Self = StObject.set(x, "inputFiles", js.Array(value :_*))
  }
}
