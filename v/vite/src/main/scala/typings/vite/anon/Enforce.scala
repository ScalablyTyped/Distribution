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

trait Enforce
  extends StObject
     with _IndexHtmlTransform {
  
  /**
    * @deprecated renamed to `order`
    */
  var enforce: js.UndefOr[pre | post] = js.undefined
  
  var order: js.UndefOr[pre | post | Null] = js.undefined
  
  /**
    * @deprecated renamed to `handler`
    */
  def transform(html: String, ctx: IndexHtmlTransformContext): IndexHtmlTransformResult | Unit | (js.Promise[IndexHtmlTransformResult | Unit])
  /**
    * @deprecated renamed to `handler`
    */
  @JSName("transform")
  var transform_Original: IndexHtmlTransformHook
}
object Enforce {
  
  inline def apply(transform: IndexHtmlTransformHook): Enforce = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enforce]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enforce] (val x: Self) extends AnyVal {
    
    inline def setEnforce(value: pre | post): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setOrder(value: pre | post): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setTransform(value: IndexHtmlTransformHook): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
