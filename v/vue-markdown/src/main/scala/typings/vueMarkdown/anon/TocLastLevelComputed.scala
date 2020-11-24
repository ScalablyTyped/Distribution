package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TocLastLevelComputed extends js.Object {
  
  var tocLastLevelComputed: js.Any = js.native
}
object TocLastLevelComputed {
  
  @scala.inline
  def apply(tocLastLevelComputed: js.Any): TocLastLevelComputed = {
    val __obj = js.Dynamic.literal(tocLastLevelComputed = tocLastLevelComputed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TocLastLevelComputed]
  }
  
  @scala.inline
  implicit class TocLastLevelComputedOps[Self <: TocLastLevelComputed] (val x: Self) extends AnyVal {
    
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
    def setTocLastLevelComputed(value: js.Any): Self = this.set("tocLastLevelComputed", value.asInstanceOf[js.Any])
  }
}
