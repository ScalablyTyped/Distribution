package typings.xss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnIgnoreTag extends js.Object {
  
  def onIgnoreTag(tag: String, html: String, options: IsClosing): String = js.native
  
  def remove(html: String): String = js.native
}
object OnIgnoreTag {
  
  @scala.inline
  def apply(onIgnoreTag: (String, String, IsClosing) => String, remove: String => String): OnIgnoreTag = {
    val __obj = js.Dynamic.literal(onIgnoreTag = js.Any.fromFunction3(onIgnoreTag), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[OnIgnoreTag]
  }
  
  @scala.inline
  implicit class OnIgnoreTagOps[Self <: OnIgnoreTag] (val x: Self) extends AnyVal {
    
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
    def setOnIgnoreTag(value: (String, String, IsClosing) => String): Self = this.set("onIgnoreTag", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemove(value: String => String): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
