package typings.webpack.anon

import typings.webpack.ignorePluginMod.IgnorePluginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckContext extends IgnorePluginOptions {
  
  /**
  			 * A filter function for context
  			 */
  var checkContext: js.UndefOr[js.Function1[/* context */ String, Boolean]] = js.native
  
  /**
  			 * A filter function for resource and context
  			 */
  var checkResource: js.UndefOr[js.Function2[/* resource */ String, /* context */ String, Boolean]] = js.native
}
object CheckContext {
  
  @scala.inline
  def apply(): CheckContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckContext]
  }
  
  @scala.inline
  implicit class CheckContextOps[Self <: CheckContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckContext(value: /* context */ String => Boolean): Self = this.set("checkContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCheckContext: Self = this.set("checkContext", js.undefined)
    
    @scala.inline
    def setCheckResource(value: (/* resource */ String, /* context */ String) => Boolean): Self = this.set("checkResource", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCheckResource: Self = this.set("checkResource", js.undefined)
  }
}
