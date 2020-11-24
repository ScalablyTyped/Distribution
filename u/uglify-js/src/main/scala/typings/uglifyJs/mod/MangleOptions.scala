package typings.uglifyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MangleOptions extends js.Object {
  
  /** Pass true to mangle names visible in scopes where `eval` or with are used. */
  var eval: js.UndefOr[Boolean] = js.native
  
  /** Pass true to not mangle function names. Useful for code relying on `Function.prototype.name`. */
  var keep_fnames: js.UndefOr[Boolean] = js.native
  
  var properties: js.UndefOr[Boolean | ManglePropertiesOptions] = js.native
  
  /** Pass an array of identifiers that should be excluded from mangling. Example: `["foo", "bar"]`. */
  var reserved: js.UndefOr[js.Array[String]] = js.native
  
  /** Pass true to mangle names declared in the top level scope. */
  var toplevel: js.UndefOr[Boolean] = js.native
}
object MangleOptions {
  
  @scala.inline
  def apply(): MangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MangleOptions]
  }
  
  @scala.inline
  implicit class MangleOptionsOps[Self <: MangleOptions] (val x: Self) extends AnyVal {
    
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
    def setEval(value: Boolean): Self = this.set("eval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEval: Self = this.set("eval", js.undefined)
    
    @scala.inline
    def setKeep_fnames(value: Boolean): Self = this.set("keep_fnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_fnames: Self = this.set("keep_fnames", js.undefined)
    
    @scala.inline
    def setProperties(value: Boolean | ManglePropertiesOptions): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setReservedVarargs(value: String*): Self = this.set("reserved", js.Array(value :_*))
    
    @scala.inline
    def setReserved(value: js.Array[String]): Self = this.set("reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserved: Self = this.set("reserved", js.undefined)
    
    @scala.inline
    def setToplevel(value: Boolean): Self = this.set("toplevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToplevel: Self = this.set("toplevel", js.undefined)
  }
}
