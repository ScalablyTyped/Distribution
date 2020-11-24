package typings.vkOpenapi.vk.OpenAPI.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthUserData extends js.Object {
  
  var first_name: String = js.native
  
  var hash: String = js.native
  
  var last_name: String = js.native
  
  var photo: String = js.native
  
  var photo_rec: String = js.native
  
  var uid: Double = js.native
}
object AuthUserData {
  
  @scala.inline
  def apply(first_name: String, hash: String, last_name: String, photo: String, photo_rec: String, uid: Double): AuthUserData = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], photo_rec = photo_rec.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthUserData]
  }
  
  @scala.inline
  implicit class AuthUserDataOps[Self <: AuthUserData] (val x: Self) extends AnyVal {
    
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
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto(value: String): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_rec(value: String): Self = this.set("photo_rec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
}
