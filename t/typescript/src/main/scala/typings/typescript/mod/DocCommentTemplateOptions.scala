package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocCommentTemplateOptions extends StObject {
  
  val generateReturnInDocTemplate: js.UndefOr[Boolean] = js.undefined
}
object DocCommentTemplateOptions {
  
  inline def apply(): DocCommentTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocCommentTemplateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocCommentTemplateOptions] (val x: Self) extends AnyVal {
    
    inline def setGenerateReturnInDocTemplate(value: Boolean): Self = StObject.set(x, "generateReturnInDocTemplate", value.asInstanceOf[js.Any])
    
    inline def setGenerateReturnInDocTemplateUndefined: Self = StObject.set(x, "generateReturnInDocTemplate", js.undefined)
  }
}
