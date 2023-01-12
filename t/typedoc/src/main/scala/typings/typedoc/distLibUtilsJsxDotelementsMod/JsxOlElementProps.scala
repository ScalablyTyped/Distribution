package typings.typedoc.distLibUtilsJsxDotelementsMod

import typings.typedoc.typedocStrings.A
import typings.typedoc.typedocStrings.I
import typings.typedoc.typedocStrings.`1`
import typings.typedoc.typedocStrings.a_
import typings.typedoc.typedocStrings.i_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxOlElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[a_ | A | i_ | I | `1`] = js.undefined
}
object JsxOlElementProps {
  
  inline def apply(): JsxOlElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxOlElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxOlElementProps] (val x: Self) extends AnyVal {
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: a_ | A | i_ | I | `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
