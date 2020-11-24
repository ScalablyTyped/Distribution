package typings.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssLess extends js.Object {
  
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: String = js.native
  
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var less: String = js.native
}
object CssLess {
  
  @scala.inline
  def apply(css: String, less: String): CssLess = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssLess]
  }
  
  @scala.inline
  implicit class CssLessOps[Self <: CssLess] (val x: Self) extends AnyVal {
    
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLess(value: String): Self = this.set("less", value.asInstanceOf[js.Any])
  }
}
