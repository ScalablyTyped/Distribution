package typings.traverson.mod.Traverson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraversonMethods extends js.Object {
  
  def errors(): TraversonMethods = js.native
  
  def from(uri: String): Builder = js.native
  
  def json(): Builder = js.native
  
  def jsonHal(): Builder = js.native
  
  def mediaTypes(): TraversonMethods = js.native
  
  def newRequest(): Builder = js.native
  
  def registerMediaType(name: String, handler: js.Any): TraversonMethods = js.native
}
object TraversonMethods {
  
  @scala.inline
  def apply(
    errors: () => TraversonMethods,
    from: String => Builder,
    json: () => Builder,
    jsonHal: () => Builder,
    mediaTypes: () => TraversonMethods,
    newRequest: () => Builder,
    registerMediaType: (String, js.Any) => TraversonMethods
  ): TraversonMethods = {
    val __obj = js.Dynamic.literal(errors = js.Any.fromFunction0(errors), from = js.Any.fromFunction1(from), json = js.Any.fromFunction0(json), jsonHal = js.Any.fromFunction0(jsonHal), mediaTypes = js.Any.fromFunction0(mediaTypes), newRequest = js.Any.fromFunction0(newRequest), registerMediaType = js.Any.fromFunction2(registerMediaType))
    __obj.asInstanceOf[TraversonMethods]
  }
  
  @scala.inline
  implicit class TraversonMethodsOps[Self <: TraversonMethods] (val x: Self) extends AnyVal {
    
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
    def setErrors(value: () => TraversonMethods): Self = this.set("errors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFrom(value: String => Builder): Self = this.set("from", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJson(value: () => Builder): Self = this.set("json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJsonHal(value: () => Builder): Self = this.set("jsonHal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMediaTypes(value: () => TraversonMethods): Self = this.set("mediaTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRequest(value: () => Builder): Self = this.set("newRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterMediaType(value: (String, js.Any) => TraversonMethods): Self = this.set("registerMediaType", js.Any.fromFunction2(value))
  }
}
