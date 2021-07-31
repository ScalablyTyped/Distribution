package typings.webpack.anon

import typings.webpack.ignorePluginMod.IgnorePluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckContext
  extends StObject
     with IgnorePluginOptions {
  
  /**
  			 * A filter function for context
  			 */
  var checkContext: js.UndefOr[js.Function1[/* context */ String, Boolean]] = js.undefined
  
  /**
  			 * A filter function for resource and context
  			 */
  var checkResource: js.UndefOr[js.Function2[/* resource */ String, /* context */ String, Boolean]] = js.undefined
}
object CheckContext {
  
  @scala.inline
  def apply(): CheckContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckContext]
  }
  
  @scala.inline
  implicit class CheckContextMutableBuilder[Self <: CheckContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckContext(value: /* context */ String => Boolean): Self = StObject.set(x, "checkContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckContextUndefined: Self = StObject.set(x, "checkContext", js.undefined)
    
    @scala.inline
    def setCheckResource(value: (/* resource */ String, /* context */ String) => Boolean): Self = StObject.set(x, "checkResource", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckResourceUndefined: Self = StObject.set(x, "checkResource", js.undefined)
  }
}
