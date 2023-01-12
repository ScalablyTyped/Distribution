package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPostcssOptions extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var codeFilename: js.UndefOr[String] = js.undefined
  
  var codeProcessors: js.UndefOr[js.Array[CodeProcessor]] = js.undefined
  
  var customSyntax: js.UndefOr[CustomSyntax] = js.undefined
  
  var filePath: js.UndefOr[String] = js.undefined
  
  var syntax: js.UndefOr[String] = js.undefined
}
object GetPostcssOptions {
  
  inline def apply(): GetPostcssOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPostcssOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPostcssOptions] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeFilename(value: String): Self = StObject.set(x, "codeFilename", value.asInstanceOf[js.Any])
    
    inline def setCodeFilenameUndefined: Self = StObject.set(x, "codeFilename", js.undefined)
    
    inline def setCodeProcessors(value: js.Array[CodeProcessor]): Self = StObject.set(x, "codeProcessors", value.asInstanceOf[js.Any])
    
    inline def setCodeProcessorsUndefined: Self = StObject.set(x, "codeProcessors", js.undefined)
    
    inline def setCodeProcessorsVarargs(value: CodeProcessor*): Self = StObject.set(x, "codeProcessors", js.Array(value*))
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCustomSyntax(value: CustomSyntax): Self = StObject.set(x, "customSyntax", value.asInstanceOf[js.Any])
    
    inline def setCustomSyntaxUndefined: Self = StObject.set(x, "customSyntax", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
