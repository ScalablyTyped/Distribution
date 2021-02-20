package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarAndFullName extends StObject {
  
  var avatarAndFullName: scala.Double = js.native
  
  var avatarOnly: scala.Double = js.native
  
  var fullName: scala.Double = js.native
}
object AvatarAndFullName {
  
  @scala.inline
  def apply(avatarAndFullName: scala.Double, avatarOnly: scala.Double, fullName: scala.Double): AvatarAndFullName = {
    val __obj = js.Dynamic.literal(avatarAndFullName = avatarAndFullName.asInstanceOf[js.Any], avatarOnly = avatarOnly.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarAndFullName]
  }
  
  @scala.inline
  implicit class AvatarAndFullNameMutableBuilder[Self <: AvatarAndFullName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatarAndFullName(value: scala.Double): Self = StObject.set(x, "avatarAndFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarOnly(value: scala.Double): Self = StObject.set(x, "avatarOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: scala.Double): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
  }
}
