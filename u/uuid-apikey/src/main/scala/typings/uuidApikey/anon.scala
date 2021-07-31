package typings.uuidApikey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<uuid-apikey.uuid-apikey.UUIDOptions> */
  trait PartialUUIDOptions extends StObject {
    
    var noDashes: js.UndefOr[Boolean] = js.undefined
  }
  object PartialUUIDOptions {
    
    @scala.inline
    def apply(): PartialUUIDOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialUUIDOptions]
    }
    
    @scala.inline
    implicit class PartialUUIDOptionsMutableBuilder[Self <: PartialUUIDOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoDashes(value: Boolean): Self = StObject.set(x, "noDashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDashesUndefined: Self = StObject.set(x, "noDashes", js.undefined)
    }
  }
}
