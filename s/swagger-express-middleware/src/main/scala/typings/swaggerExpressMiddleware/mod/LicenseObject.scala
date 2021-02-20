package typings.swaggerExpressMiddleware.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseObject extends StObject {
  
  var name: String = js.native
  
  var url: js.UndefOr[String] = js.native
}
object LicenseObject {
  
  @scala.inline
  def apply(name: String): LicenseObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseObject]
  }
  
  @scala.inline
  implicit class LicenseObjectMutableBuilder[Self <: LicenseObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
