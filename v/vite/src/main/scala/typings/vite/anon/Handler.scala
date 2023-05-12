package typings.vite.anon

import typings.vite.mod.IndexHtmlTransformContext
import typings.vite.mod.IndexHtmlTransformHook
import typings.vite.mod.IndexHtmlTransformResult
import typings.vite.mod._IndexHtmlTransform
import typings.vite.viteStrings.post
import typings.vite.viteStrings.pre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler
  extends StObject
     with _IndexHtmlTransform {
  
  /**
    * @deprecated renamed to `order`
    */
  var enforce: js.UndefOr[pre | post] = js.undefined
  
  def handler(html: String, ctx: IndexHtmlTransformContext): IndexHtmlTransformResult | Unit | (js.Promise[IndexHtmlTransformResult | Unit])
  @JSName("handler")
  var handler_Original: IndexHtmlTransformHook
  
  var order: js.UndefOr[pre | post | Null] = js.undefined
}
object Handler {
  
  inline def apply(handler: IndexHtmlTransformHook): Handler = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
    
    inline def setEnforce(value: pre | post): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setHandler(value: IndexHtmlTransformHook): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: pre | post): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
