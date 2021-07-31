package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastSystem extends StObject {
  
  var value: String
  
  var version: String | Null
}
object VastSystem {
  
  @scala.inline
  def apply(value: String): VastSystem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], version = null)
    __obj.asInstanceOf[VastSystem]
  }
  
  @scala.inline
  implicit class VastSystemMutableBuilder[Self <: VastSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
