package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mixin extends js.Object {
  
  var mixin: js.UndefOr[String] = js.native
  
  var sizes: js.UndefOr[String] = js.native
  
  var sprites: js.UndefOr[String] = js.native
  
  var variables: js.UndefOr[String] = js.native
}
object Mixin {
  
  @scala.inline
  def apply(): Mixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mixin]
  }
  
  @scala.inline
  implicit class MixinOps[Self <: Mixin] (val x: Self) extends AnyVal {
    
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
    def setMixin(value: String): Self = this.set("mixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixin: Self = this.set("mixin", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setSprites(value: String): Self = this.set("sprites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSprites: Self = this.set("sprites", js.undefined)
    
    @scala.inline
    def setVariables(value: String): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
