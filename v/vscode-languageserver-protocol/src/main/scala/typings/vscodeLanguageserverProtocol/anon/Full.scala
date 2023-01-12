package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Full extends StObject {
  
  /**
    * The client will send the `textDocument/semanticTokens/full` request if
    * the server provides a corresponding handler.
    */
  var full: js.UndefOr[Boolean | Delta] = js.undefined
  
  /**
    * The client will send the `textDocument/semanticTokens/range` request if
    * the server provides a corresponding handler.
    */
  var range: js.UndefOr[Boolean | js.Object] = js.undefined
}
object Full {
  
  inline def apply(): Full = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
    
    inline def setFull(value: Boolean | Delta): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setRange(value: Boolean | js.Object): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
