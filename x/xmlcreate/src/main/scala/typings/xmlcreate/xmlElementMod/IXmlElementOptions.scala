package typings.xmlcreate.xmlElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlElementOptions extends js.Object {
  
  /**
    * The name of the element.
    */
  var name: String = js.native
  
  /**
    * Whether to replace any invalid characters in the name of the element
    * with the Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInName: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to use a self-closing tag if this element is empty.
    *
    * For example, use:
    * ```xml
    * <element/>
    * ```
    * instead of:
    * ```xml
    * <element></element>
    * ```
    *
    * By default, this is enabled.
    */
  var useSelfClosingTagIfEmpty: js.UndefOr[Boolean] = js.native
}
object IXmlElementOptions {
  
  @scala.inline
  def apply(name: String): IXmlElementOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlElementOptions]
  }
  
  @scala.inline
  implicit class IXmlElementOptionsOps[Self <: IXmlElementOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceInvalidCharsInName(value: Boolean): Self = this.set("replaceInvalidCharsInName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceInvalidCharsInName: Self = this.set("replaceInvalidCharsInName", js.undefined)
    
    @scala.inline
    def setUseSelfClosingTagIfEmpty(value: Boolean): Self = this.set("useSelfClosingTagIfEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSelfClosingTagIfEmpty: Self = this.set("useSelfClosingTagIfEmpty", js.undefined)
  }
}
