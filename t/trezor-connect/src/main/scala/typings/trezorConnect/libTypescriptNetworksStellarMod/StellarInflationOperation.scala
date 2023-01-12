package typings.trezorConnect.libTypescriptNetworksStellarMod

import typings.trezorConnect.trezorConnectStrings.inflation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarInflationOperation
  extends StObject
     with StellarOperation {
  
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: inflation
}
object StellarInflationOperation {
  
  inline def apply(): StellarInflationOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("inflation")
    __obj.asInstanceOf[StellarInflationOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StellarInflationOperation] (val x: Self) extends AnyVal {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: inflation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
