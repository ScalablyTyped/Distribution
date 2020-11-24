package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadRequest extends js.Object {
  
  var badRequest: scala.Double = js.native
  
  var invalidResolution: scala.Double = js.native
  
  var notFound: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
  
  var unsupportedConflictType: scala.Double = js.native
}
object BadRequest {
  
  @scala.inline
  def apply(
    badRequest: scala.Double,
    invalidResolution: scala.Double,
    notFound: scala.Double,
    succeeded: scala.Double,
    unsupportedConflictType: scala.Double
  ): BadRequest = {
    val __obj = js.Dynamic.literal(badRequest = badRequest.asInstanceOf[js.Any], invalidResolution = invalidResolution.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unsupportedConflictType = unsupportedConflictType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadRequest]
  }
  
  @scala.inline
  implicit class BadRequestOps[Self <: BadRequest] (val x: Self) extends AnyVal {
    
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
    def setBadRequest(value: scala.Double): Self = this.set("badRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidResolution(value: scala.Double): Self = this.set("invalidResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFound(value: scala.Double): Self = this.set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsupportedConflictType(value: scala.Double): Self = this.set("unsupportedConflictType", value.asInstanceOf[js.Any])
  }
}
