package typings.yogBigpipe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default extends js.Object {
  
  var _default: js.UndefOr[String] = js.native
  
  var quickling: js.UndefOr[String] = js.native
}
object Default {
  
  @scala.inline
  def apply(): Default = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    
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
    def set_default(value: String): Self = this.set("_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_default: Self = this.set("_default", js.undefined)
    
    @scala.inline
    def setQuickling(value: String): Self = this.set("quickling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickling: Self = this.set("quickling", js.undefined)
  }
}
