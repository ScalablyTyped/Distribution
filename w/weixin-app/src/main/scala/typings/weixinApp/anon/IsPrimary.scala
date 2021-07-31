package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPrimary extends StObject {
  
  var isPrimary: Boolean
  
  var uuid: String
}
object IsPrimary {
  
  @scala.inline
  def apply(isPrimary: Boolean, uuid: String): IsPrimary = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrimary]
  }
  
  @scala.inline
  implicit class IsPrimaryMutableBuilder[Self <: IsPrimary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
