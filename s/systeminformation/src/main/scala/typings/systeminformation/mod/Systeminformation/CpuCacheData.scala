package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuCacheData extends StObject {
  
  var l1d: Double
  
  var l1i: Double
  
  var l2: Double
  
  var l3: Double
}
object CpuCacheData {
  
  @scala.inline
  def apply(l1d: Double, l1i: Double, l2: Double, l3: Double): CpuCacheData = {
    val __obj = js.Dynamic.literal(l1d = l1d.asInstanceOf[js.Any], l1i = l1i.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], l3 = l3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuCacheData]
  }
  
  @scala.inline
  implicit class CpuCacheDataMutableBuilder[Self <: CpuCacheData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setL1d(value: Double): Self = StObject.set(x, "l1d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL1i(value: Double): Self = StObject.set(x, "l1i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL2(value: Double): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL3(value: Double): Self = StObject.set(x, "l3", value.asInstanceOf[js.Any])
  }
}
