package typings.unsplashJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bio extends js.Object {
  
  var bio: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var instagramUsername: js.UndefOr[String] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object Bio {
  
  @scala.inline
  def apply(): Bio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bio]
  }
  
  @scala.inline
  implicit class BioOps[Self <: Bio] (val x: Self) extends AnyVal {
    
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
    def setBio(value: String): Self = this.set("bio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBio: Self = this.set("bio", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setInstagramUsername(value: String): Self = this.set("instagramUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstagramUsername: Self = this.set("instagramUsername", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
