package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 描述service的Object */
trait BLEPeripheralService extends StObject {
  
  /** characteristics列表 */
  var characteristics: js.Array[Characteristic]
  
  /** service 的 uuid */
  var uuid: String
}
object BLEPeripheralService {
  
  inline def apply(characteristics: js.Array[Characteristic], uuid: String): BLEPeripheralService = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLEPeripheralService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BLEPeripheralService] (val x: Self) extends AnyVal {
    
    inline def setCharacteristics(value: js.Array[Characteristic]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicsVarargs(value: Characteristic*): Self = StObject.set(x, "characteristics", js.Array(value*))
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
