package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Supported extends StObject {
  
  var supported: js.UndefOr[Boolean] = js.native
}
object Supported {
  
  @scala.inline
  def apply(): Supported = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Supported]
  }
  
  @scala.inline
  implicit class SupportedMutableBuilder[Self <: Supported] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
  }
}
