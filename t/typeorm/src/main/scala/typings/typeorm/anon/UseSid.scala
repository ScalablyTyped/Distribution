package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseSid extends StObject {
  
  var useSid: Boolean
}
object UseSid {
  
  @scala.inline
  def apply(useSid: Boolean): UseSid = {
    val __obj = js.Dynamic.literal(useSid = useSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSid]
  }
  
  @scala.inline
  implicit class UseSidMutableBuilder[Self <: UseSid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseSid(value: Boolean): Self = StObject.set(x, "useSid", value.asInstanceOf[js.Any])
  }
}
