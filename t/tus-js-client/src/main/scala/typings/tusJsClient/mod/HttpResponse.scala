package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpResponse extends js.Object {
  
  def getBody(): String = js.native
  
  def getHeader(header: String): String = js.native
  
  def getStatus(): Double = js.native
  
  // Return an environment specific object, e.g. the XMLHttpRequest object in browsers.
  def getUnderlyingObject(): js.Any = js.native
}
object HttpResponse {
  
  @scala.inline
  def apply(
    getBody: () => String,
    getHeader: String => String,
    getStatus: () => Double,
    getUnderlyingObject: () => js.Any
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getHeader = js.Any.fromFunction1(getHeader), getStatus = js.Any.fromFunction0(getStatus), getUnderlyingObject = js.Any.fromFunction0(getUnderlyingObject))
    __obj.asInstanceOf[HttpResponse]
  }
  
  @scala.inline
  implicit class HttpResponseOps[Self <: HttpResponse] (val x: Self) extends AnyVal {
    
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
    def setGetBody(value: () => String): Self = this.set("getBody", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeader(value: String => String): Self = this.set("getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStatus(value: () => Double): Self = this.set("getStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUnderlyingObject(value: () => js.Any): Self = this.set("getUnderlyingObject", js.Any.fromFunction0(value))
  }
}
