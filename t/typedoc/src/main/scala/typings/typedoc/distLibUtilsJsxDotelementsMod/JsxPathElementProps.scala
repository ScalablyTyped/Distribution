package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxPathElementProps
  extends StObject
     with JsxSvgCoreProps
     with JsxSvgStyleProps
     with JsxSvgConditionalProcessingProps
     with JsxSvgPresentationProps {
  
  var d: String
  
  var pathLength: js.UndefOr[Double] = js.undefined
}
object JsxPathElementProps {
  
  inline def apply(d: String): JsxPathElementProps = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsxPathElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxPathElementProps] (val x: Self) extends AnyVal {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setPathLength(value: Double): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    inline def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
  }
}
