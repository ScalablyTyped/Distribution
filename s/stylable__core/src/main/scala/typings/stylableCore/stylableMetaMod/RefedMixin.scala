package typings.stylableCore.stylableMetaMod

import typings.stylableCore.stylableValueParsersMod.MixinValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefedMixin extends js.Object {
  
  var mixin: MixinValue = js.native
  
  var ref: ImportSymbol | ClassSymbol = js.native
}
object RefedMixin {
  
  @scala.inline
  def apply(mixin: MixinValue, ref: ImportSymbol | ClassSymbol): RefedMixin = {
    val __obj = js.Dynamic.literal(mixin = mixin.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefedMixin]
  }
  
  @scala.inline
  implicit class RefedMixinOps[Self <: RefedMixin] (val x: Self) extends AnyVal {
    
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
    def setMixin(value: MixinValue): Self = this.set("mixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: ImportSymbol | ClassSymbol): Self = this.set("ref", value.asInstanceOf[js.Any])
  }
}
