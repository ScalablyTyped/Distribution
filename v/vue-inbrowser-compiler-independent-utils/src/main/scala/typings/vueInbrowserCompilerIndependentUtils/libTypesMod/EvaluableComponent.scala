package typings.vueInbrowserCompilerIndependentUtils.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluableComponent extends StObject {
  
  var script: String
  
  var style: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
}
object EvaluableComponent {
  
  inline def apply(script: String): EvaluableComponent = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluableComponent]
  }
  
  extension [Self <: EvaluableComponent](x: Self) {
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
