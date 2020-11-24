package typings.typestyle.typestyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylesTarget extends js.Object {
  
  var textContent: String | Null = js.native
}
object StylesTarget {
  
  @scala.inline
  def apply(): StylesTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylesTarget]
  }
  
  @scala.inline
  implicit class StylesTargetOps[Self <: StylesTarget] (val x: Self) extends AnyVal {
    
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
    def setTextContent(value: String): Self = this.set("textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentNull: Self = this.set("textContent", null)
  }
}
