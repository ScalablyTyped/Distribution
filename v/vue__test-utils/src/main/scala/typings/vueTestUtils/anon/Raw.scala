package typings.vueTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raw extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object Raw {
  
  inline def apply(): Raw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Raw]
  }
  
  extension [Self <: Raw](x: Self) {
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
