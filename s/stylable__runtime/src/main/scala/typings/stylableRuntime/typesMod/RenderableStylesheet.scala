package typings.stylableRuntime.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderableStylesheet extends js.Object {
  
  @JSName("$css")
  var $css: js.UndefOr[String] = js.native
  
  @JSName("$depth")
  var $depth: Double = js.native
  
  @JSName("$id")
  var $id: String | Double = js.native
}
object RenderableStylesheet {
  
  @scala.inline
  def apply($depth: Double, $id: String | Double): RenderableStylesheet = {
    val __obj = js.Dynamic.literal($depth = $depth.asInstanceOf[js.Any], $id = $id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderableStylesheet]
  }
  
  @scala.inline
  implicit class RenderableStylesheetOps[Self <: RenderableStylesheet] (val x: Self) extends AnyVal {
    
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
    def set$depth(value: Double): Self = this.set("$depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$id(value: String | Double): Self = this.set("$id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$css(value: String): Self = this.set("$css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$css: Self = this.set("$css", js.undefined)
  }
}
