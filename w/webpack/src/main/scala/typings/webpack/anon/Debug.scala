package typings.webpack.anon

import typings.webpack.webpackOptionsMod.FilterItemTypes
import typings.webpack.webpackOptionsMod.FilterTypes
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.info
import typings.webpack.webpackStrings.log
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.verbose
import typings.webpack.webpackStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends js.Object {
  
  /**
  		 * Enable debug logging for specific loggers
  		 */
  var debug: js.UndefOr[FilterTypes | Boolean] = js.native
  
  /**
  		 * Log level
  		 */
  var level: js.UndefOr[none | error | warn | info | log | verbose] = js.native
}
object Debug {
  
  @scala.inline
  def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
    
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
    def setDebugVarargs(value: FilterItemTypes*): Self = this.set("debug", js.Array(value :_*))
    
    @scala.inline
    def setDebugFunction1(value: /* value */ String => Boolean): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebug(value: FilterTypes | Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setLevel(value: none | error | warn | info | log | verbose): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
}
