package typings.webpack.anon

import typings.std.RegExp
import typings.webpack.ignorePluginMod.IgnorePluginOptions
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
  implicit class ContextRegExpOps[Self <: ContextRegExp] (val x: Self) extends AnyVal {
    
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
    def setContextRegExp(value: RegExp): Self = this.set("contextRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextRegExp: Self = this.set("contextRegExp", js.undefined)
    
    @scala.inline
    def setResourceRegExp(value: RegExp): Self = this.set("resourceRegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRegExp: Self = this.set("resourceRegExp", js.undefined)
  }
}
