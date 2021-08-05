package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanIdentifierData extends StObject {
  
  var `type`: Double
  
  var value: IVectorView[Double]
}
object ILanIdentifierData {
  
  inline def apply(`type`: Double, value: IVectorView[Double]): ILanIdentifierData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanIdentifierData]
  }
  
  extension [Self <: ILanIdentifierData](x: Self) {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: IVectorView[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
