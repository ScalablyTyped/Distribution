package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Svg2JsOptions extends js.Object {
  
  /** @default true */
  var lowercase: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var normalize: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var position: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var strict: js.UndefOr[Boolean] = js.native
  
  /** @default false */
  var trim: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var xmlns: js.UndefOr[Boolean] = js.native
}
object Svg2JsOptions {
  
  @scala.inline
  def apply(): Svg2JsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Svg2JsOptions]
  }
  
  @scala.inline
  implicit class Svg2JsOptionsOps[Self <: Svg2JsOptions] (val x: Self) extends AnyVal {
    
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
    def setLowercase(value: Boolean): Self = this.set("lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowercase: Self = this.set("lowercase", js.undefined)
    
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setXmlns(value: Boolean): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
  }
}
