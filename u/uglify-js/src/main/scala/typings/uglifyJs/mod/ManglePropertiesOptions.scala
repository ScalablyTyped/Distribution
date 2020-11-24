package typings.uglifyJs.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManglePropertiesOptions extends js.Object {
  
  /** Use true to allow the mangling of builtin DOM properties. Not recommended to override this setting. */
  var builtins: js.UndefOr[Boolean] = js.native
  
  /** Mangle names with the original name still present. Pass an empty string "" to enable, or a non-empty string to set the debug suffix. */
  var debug: js.UndefOr[Boolean] = js.native
  
  /** Only mangle unquoted property names */
  var keep_quoted: js.UndefOr[Boolean] = js.native
  
  /** Pass a RegExp literal to only mangle property names matching the regular expression. */
  var regex: js.UndefOr[RegExp] = js.native
  
  /** Do not mangle property names listed in the reserved array */
  var reserved: js.UndefOr[js.Array[String]] = js.native
}
object ManglePropertiesOptions {
  
  @scala.inline
  def apply(): ManglePropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManglePropertiesOptions]
  }
  
  @scala.inline
  implicit class ManglePropertiesOptionsOps[Self <: ManglePropertiesOptions] (val x: Self) extends AnyVal {
    
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
    def setBuiltins(value: Boolean): Self = this.set("builtins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltins: Self = this.set("builtins", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setKeep_quoted(value: Boolean): Self = this.set("keep_quoted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_quoted: Self = this.set("keep_quoted", js.undefined)
    
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setReservedVarargs(value: String*): Self = this.set("reserved", js.Array(value :_*))
    
    @scala.inline
    def setReserved(value: js.Array[String]): Self = this.set("reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserved: Self = this.set("reserved", js.undefined)
  }
}
