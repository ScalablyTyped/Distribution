package typings.terminalKit.anon

import typings.terminalKit.screenBufferHDMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrChar extends js.Object {
  
  var attr: Attributes | Double = js.native
  
  var char: js.UndefOr[String] = js.native
}
object AttrChar {
  
  @scala.inline
  def apply(attr: Attributes | Double): AttrChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrChar]
  }
  
  @scala.inline
  implicit class AttrCharOps[Self <: AttrChar] (val x: Self) extends AnyVal {
    
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
    def setAttr(value: Attributes | Double): Self = this.set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChar(value: String): Self = this.set("char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChar: Self = this.set("char", js.undefined)
  }
}
