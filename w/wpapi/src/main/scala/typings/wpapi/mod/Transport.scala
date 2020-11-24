package typings.wpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends js.Object {
  
  var delete: js.UndefOr[TransportFunction] = js.native
  
  var get: js.UndefOr[TransportFunction] = js.native
  
  var head: js.UndefOr[TransportFunction] = js.native
  
  var post: js.UndefOr[TransportFunction] = js.native
  
  var put: js.UndefOr[TransportFunction] = js.native
}
object Transport {
  
  @scala.inline
  def apply(): Transport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transport]
  }
  
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = this.set("delete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setGet(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setHead(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = this.set("head", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setPost(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = this.set("post", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPut(value: (/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback]) => js.Promise[js.Any]): Self = this.set("put", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePut: Self = this.set("put", js.undefined)
  }
}
