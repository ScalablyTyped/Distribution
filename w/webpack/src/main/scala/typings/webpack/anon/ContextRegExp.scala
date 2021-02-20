package typings.webpack.anon

import typings.std.RegExp
import typings.webpack.ignorePluginMod.IgnorePluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextRegExp extends IgnorePluginOptions {
  
  /**
  			 * A RegExp to test the context (directory) against
  			 */
  var contextRegExp: js.UndefOr[RegExp] = js.native
  
  /**
  			 * A RegExp to test the request against
  			 */
  var resourceRegExp: js.UndefOr[RegExp] = js.native
}
object ContextRegExp {
  
  @scala.inline
  def apply(): ContextRegExp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRegExp]
  }
  
  @scala.inline
  implicit class ContextRegExpMutableBuilder[Self <: ContextRegExp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextRegExp(value: RegExp): Self = StObject.set(x, "contextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextRegExpUndefined: Self = StObject.set(x, "contextRegExp", js.undefined)
    
    @scala.inline
    def setResourceRegExp(value: RegExp): Self = StObject.set(x, "resourceRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRegExpUndefined: Self = StObject.set(x, "resourceRegExp", js.undefined)
  }
}
