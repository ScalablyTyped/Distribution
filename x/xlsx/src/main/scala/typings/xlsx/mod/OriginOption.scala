package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginOption extends StObject {
  
  /** Top-Left cell for operation (CellAddress or A1 string or row) */
  var origin: js.UndefOr[Double | String | CellAddress] = js.undefined
}
object OriginOption {
  
  inline def apply(): OriginOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginOption] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: Double | String | CellAddress): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
