package typings.vueCompilerSfc.mod

import typings.sourceMap.mod.RawSourceMap
import typings.vueCompilerCore.mod.CompilerError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCTemplateCompileResults extends StObject {
  
  var code: String
  
  var errors: js.Array[String | CompilerError]
  
  var map: js.UndefOr[RawSourceMap] = js.undefined
  
  var source: String
  
  var tips: js.Array[String]
}
object SFCTemplateCompileResults {
  
  @scala.inline
  def apply(code: String, errors: js.Array[String | CompilerError], source: String, tips: js.Array[String]): SFCTemplateCompileResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCTemplateCompileResults]
  }
  
  @scala.inline
  implicit class SFCTemplateCompileResultsMutableBuilder[Self <: SFCTemplateCompileResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Array[String | CompilerError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: (String | CompilerError)*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTips(value: js.Array[String]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsVarargs(value: String*): Self = StObject.set(x, "tips", js.Array(value :_*))
  }
}
