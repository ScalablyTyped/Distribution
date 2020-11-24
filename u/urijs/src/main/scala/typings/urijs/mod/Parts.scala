package typings.urijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parts extends URIOptions {
  
  var duplicateQueryParameters: Boolean = js.native
  
  var escapeQuerySpace: Boolean = js.native
  
  var preventInvalidHostname: Boolean = js.native
}
object Parts {
  
  @scala.inline
  def apply(duplicateQueryParameters: Boolean, escapeQuerySpace: Boolean, preventInvalidHostname: Boolean): Parts = {
    val __obj = js.Dynamic.literal(duplicateQueryParameters = duplicateQueryParameters.asInstanceOf[js.Any], escapeQuerySpace = escapeQuerySpace.asInstanceOf[js.Any], preventInvalidHostname = preventInvalidHostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parts]
  }
  
  @scala.inline
  implicit class PartsOps[Self <: Parts] (val x: Self) extends AnyVal {
    
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
    def setDuplicateQueryParameters(value: Boolean): Self = this.set("duplicateQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeQuerySpace(value: Boolean): Self = this.set("escapeQuerySpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventInvalidHostname(value: Boolean): Self = this.set("preventInvalidHostname", value.asInstanceOf[js.Any])
  }
}
