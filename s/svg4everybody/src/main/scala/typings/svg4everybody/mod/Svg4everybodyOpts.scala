package typings.svg4everybody.mod

import typings.std.SVGElement
import typings.std.SVGUseElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Svg4everybodyOpts extends js.Object {
  
  var attributeName: js.UndefOr[String] = js.native
  
  var fallback: js.UndefOr[
    js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, String]
  ] = js.native
  
  var nosvg: js.UndefOr[Boolean] = js.native
  
  var polyfill: js.UndefOr[Boolean] = js.native
  
  var validate: js.UndefOr[
    js.Function3[/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement, Boolean]
  ] = js.native
}
object Svg4everybodyOpts {
  
  @scala.inline
  def apply(): Svg4everybodyOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Svg4everybodyOpts]
  }
  
  @scala.inline
  implicit class Svg4everybodyOptsOps[Self <: Svg4everybodyOpts] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    
    @scala.inline
    def setFallback(value: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => String): Self = this.set("fallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setNosvg(value: Boolean): Self = this.set("nosvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNosvg: Self = this.set("nosvg", js.undefined)
    
    @scala.inline
    def setPolyfill(value: Boolean): Self = this.set("polyfill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolyfill: Self = this.set("polyfill", js.undefined)
    
    @scala.inline
    def setValidate(value: (/* src */ String, /* svg */ SVGElement, /* use */ SVGUseElement) => Boolean): Self = this.set("validate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
