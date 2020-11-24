package typings.stylableRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Css extends js.Object {
  
  @JSName("$css")
  var $css: String = js.native
  
  @JSName("$depth")
  var $depth: String | Double = js.native
  
  @JSName("$id")
  var $id: String | Double = js.native
  
  @JSName("$theme")
  var $theme: Boolean = js.native
}
object Css {
  
  @scala.inline
  def apply($css: String, $depth: String | Double, $id: String | Double, $theme: Boolean): Css = {
    val __obj = js.Dynamic.literal($css = $css.asInstanceOf[js.Any], $depth = $depth.asInstanceOf[js.Any], $id = $id.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit class CssOps[Self <: Css] (val x: Self) extends AnyVal {
    
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
    def set$css(value: String): Self = this.set("$css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$depth(value: String | Double): Self = this.set("$depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$id(value: String | Double): Self = this.set("$id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$theme(value: Boolean): Self = this.set("$theme", value.asInstanceOf[js.Any])
  }
}
