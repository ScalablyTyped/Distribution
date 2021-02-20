package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Supported extends StObject {
  
  /** Whether 3D Secure is supported on this card. */
  var supported: Boolean = js.native
}
object Supported {
  
  @scala.inline
  def apply(supported: Boolean): Supported = {
    val __obj = js.Dynamic.literal(supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Supported]
  }
  
  @scala.inline
  implicit class SupportedMutableBuilder[Self <: Supported] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
