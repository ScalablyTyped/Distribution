package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Updated extends StObject {
  
  var updated: Double
}
object Updated {
  
  @scala.inline
  def apply(updated: Double): Updated = {
    val __obj = js.Dynamic.literal(updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Updated]
  }
  
  @scala.inline
  implicit class UpdatedMutableBuilder[Self <: Updated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
