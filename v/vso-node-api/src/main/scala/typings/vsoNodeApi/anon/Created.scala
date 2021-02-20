package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Created extends StObject {
  
  var created: scala.Double = js.native
  
  var pendingUpload: scala.Double = js.native
}
object Created {
  
  @scala.inline
  def apply(created: scala.Double, pendingUpload: scala.Double): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], pendingUpload = pendingUpload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  @scala.inline
  implicit class CreatedMutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: scala.Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUpload(value: scala.Double): Self = StObject.set(x, "pendingUpload", value.asInstanceOf[js.Any])
  }
}
