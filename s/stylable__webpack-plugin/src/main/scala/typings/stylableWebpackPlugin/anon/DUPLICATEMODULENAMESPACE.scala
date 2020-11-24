package typings.stylableWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DUPLICATEMODULENAMESPACE extends js.Object {
  
  var DUPLICATE_MODULE_NAMESPACE: Boolean = js.native
}
object DUPLICATEMODULENAMESPACE {
  
  @scala.inline
  def apply(DUPLICATE_MODULE_NAMESPACE: Boolean): DUPLICATEMODULENAMESPACE = {
    val __obj = js.Dynamic.literal(DUPLICATE_MODULE_NAMESPACE = DUPLICATE_MODULE_NAMESPACE.asInstanceOf[js.Any])
    __obj.asInstanceOf[DUPLICATEMODULENAMESPACE]
  }
  
  @scala.inline
  implicit class DUPLICATEMODULENAMESPACEOps[Self <: DUPLICATEMODULENAMESPACE] (val x: Self) extends AnyVal {
    
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
    def setDUPLICATE_MODULE_NAMESPACE(value: Boolean): Self = this.set("DUPLICATE_MODULE_NAMESPACE", value.asInstanceOf[js.Any])
  }
}
