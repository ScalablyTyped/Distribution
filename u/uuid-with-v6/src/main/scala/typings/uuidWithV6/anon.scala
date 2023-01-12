package typings.uuidWithV6

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<uuid-with-v6.uuid-with-v6.V6SetupOpts> */
  trait PartialV6SetupOpts extends StObject {
    
    var disableRandom: js.UndefOr[Boolean] = js.undefined
  }
  object PartialV6SetupOpts {
    
    inline def apply(): PartialV6SetupOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialV6SetupOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialV6SetupOpts] (val x: Self) extends AnyVal {
      
      inline def setDisableRandom(value: Boolean): Self = StObject.set(x, "disableRandom", value.asInstanceOf[js.Any])
      
      inline def setDisableRandomUndefined: Self = StObject.set(x, "disableRandom", js.undefined)
    }
  }
}
