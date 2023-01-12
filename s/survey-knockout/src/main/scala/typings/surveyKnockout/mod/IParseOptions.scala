package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParseOptions extends StObject {
  
  var filename: js.UndefOr[String] = js.undefined
  
  var startRule: js.UndefOr[String] = js.undefined
  
  var tracer: js.UndefOr[Any] = js.undefined
}
object IParseOptions {
  
  inline def apply(): IParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IParseOptions] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setStartRule(value: String): Self = StObject.set(x, "startRule", value.asInstanceOf[js.Any])
    
    inline def setStartRuleUndefined: Self = StObject.set(x, "startRule", js.undefined)
    
    inline def setTracer(value: Any): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
    
    inline def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
  }
}
