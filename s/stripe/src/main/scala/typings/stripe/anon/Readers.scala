package typings.stripe.anon

import typings.stripe.mod.Stripe.TestHelpers.Terminal.ReadersResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Readers extends StObject {
  
  var readers: ReadersResource
}
object Readers {
  
  inline def apply(readers: ReadersResource): Readers = {
    val __obj = js.Dynamic.literal(readers = readers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readers] (val x: Self) extends AnyVal {
    
    inline def setReaders(value: ReadersResource): Self = StObject.set(x, "readers", value.asInstanceOf[js.Any])
  }
}
