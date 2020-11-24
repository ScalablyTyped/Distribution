package typings.webicon.cssIconSetOptionsMod

import typings.webicon.cssClassConfigMod.CssClassConfig
import typings.webicon.iconMod.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssIconSetOptions extends Icon {
  
  /**
    * An alias of the `className`-property.
    */
  var `class`: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
  ] = js.native
  
  /**
    * Either a text-pattern or a callback which provides a css-classname.
    *
    * The symbols `?` and `%` in the text-pattern are replaced by the icon-id.
    */
  var className: js.UndefOr[CssClassConfig] = js.native
  
  /**
    * An alias of the `className`-property.
    */
  var cssClass: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
  ] = js.native
}
object CssIconSetOptions {
  
  @scala.inline
  def apply(): CssIconSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssIconSetOptions]
  }
  
  @scala.inline
  implicit class CssIconSetOptionsOps[Self <: CssIconSetOptions] (val x: Self) extends AnyVal {
    
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
    def setClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
    ): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setClassNameFunction2(value: (/* id */ String, /* params */ js.Array[String]) => String): Self = this.set("className", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassName(value: CssClassConfig): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCssClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
    ): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
  }
}
