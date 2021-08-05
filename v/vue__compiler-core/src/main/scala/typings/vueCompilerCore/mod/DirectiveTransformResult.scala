package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveTransformResult extends StObject {
  
  var needRuntime: js.UndefOr[Boolean | js.Symbol] = js.undefined
  
  var props: js.Array[Property]
  
  var ssrTagParts: js.UndefOr[js.Array[String | JSChildNode]] = js.undefined
}
object DirectiveTransformResult {
  
  inline def apply(props: js.Array[Property]): DirectiveTransformResult = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveTransformResult]
  }
  
  extension [Self <: DirectiveTransformResult](x: Self) {
    
    inline def setNeedRuntime(value: Boolean | js.Symbol): Self = StObject.set(x, "needRuntime", value.asInstanceOf[js.Any])
    
    inline def setNeedRuntimeUndefined: Self = StObject.set(x, "needRuntime", js.undefined)
    
    inline def setProps(value: js.Array[Property]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsVarargs(value: Property*): Self = StObject.set(x, "props", js.Array(value :_*))
    
    inline def setSsrTagParts(value: js.Array[String | JSChildNode]): Self = StObject.set(x, "ssrTagParts", value.asInstanceOf[js.Any])
    
    inline def setSsrTagPartsUndefined: Self = StObject.set(x, "ssrTagParts", js.undefined)
    
    inline def setSsrTagPartsVarargs(value: (String | JSChildNode)*): Self = StObject.set(x, "ssrTagParts", js.Array(value :_*))
  }
}
