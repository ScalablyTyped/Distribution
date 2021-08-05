package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-ui-core.wix-ui-core/src/components/dropdown-option.Option, 'id'> */
trait PickOptionid extends StObject {
  
  var id: Double | String
}
object PickOptionid {
  
  inline def apply(id: Double | String): PickOptionid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickOptionid]
  }
  
  extension [Self <: PickOptionid](x: Self) {
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
