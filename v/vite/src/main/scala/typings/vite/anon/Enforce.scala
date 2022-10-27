package typings.vite.anon

import typings.vite.mod.IndexHtmlTransformContext
import typings.vite.mod.IndexHtmlTransformHook
import typings.vite.mod.IndexHtmlTransformResult
import typings.vite.viteStrings.post
import typings.vite.viteStrings.pre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enforce extends StObject {
  
  var enforce: js.UndefOr[pre | post] = js.undefined
  
  def transform(html: String, ctx: IndexHtmlTransformContext): IndexHtmlTransformResult | Unit | (js.Promise[IndexHtmlTransformResult | Unit])
  @JSName("transform")
  var transform_Original: IndexHtmlTransformHook
}
object Enforce {
  
  inline def apply(transform: IndexHtmlTransformHook): Enforce = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enforce]
  }
  
  extension [Self <: Enforce](x: Self) {
    
    inline def setEnforce(value: pre | post): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setTransform(value: IndexHtmlTransformHook): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
