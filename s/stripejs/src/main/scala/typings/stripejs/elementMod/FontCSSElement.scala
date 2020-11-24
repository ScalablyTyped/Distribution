package typings.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontCSSElement extends js.Object {
  
  /**
    * A relative or absolute URL pointing to a CSS file with `@font-face` definitions
    * @example 'https://fonts.googleapis.com/css?family=Open+Sans'
    */
  var cssSrc: String = js.native
}
object FontCSSElement {
  
  @scala.inline
  def apply(cssSrc: String): FontCSSElement = {
    val __obj = js.Dynamic.literal(cssSrc = cssSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontCSSElement]
  }
  
  @scala.inline
  implicit class FontCSSElementOps[Self <: FontCSSElement] (val x: Self) extends AnyVal {
    
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
    def setCssSrc(value: String): Self = this.set("cssSrc", value.asInstanceOf[js.Any])
  }
}
