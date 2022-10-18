package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidData extends StObject {
  
  var cid: js.UndefOr[scala.Nothing] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
}
object CidData {
  
  inline def apply(): CidData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CidData]
  }
  
  extension [Self <: CidData](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
