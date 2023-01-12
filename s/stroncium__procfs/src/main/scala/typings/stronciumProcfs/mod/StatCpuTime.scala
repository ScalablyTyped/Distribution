package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatCpuTime extends StObject {
  
  var guest: Double
  
  var guestNice: Double
  
  var idle: Double
  
  var iowait: Double
  
  var irq: Double
  
  var nice: Double
  
  var softirq: Double
  
  var steal: Double
  
  var system: Double
  
  var user: Double
}
object StatCpuTime {
  
  inline def apply(
    guest: Double,
    guestNice: Double,
    idle: Double,
    iowait: Double,
    irq: Double,
    nice: Double,
    softirq: Double,
    steal: Double,
    system: Double,
    user: Double
  ): StatCpuTime = {
    val __obj = js.Dynamic.literal(guest = guest.asInstanceOf[js.Any], guestNice = guestNice.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], iowait = iowait.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], softirq = softirq.asInstanceOf[js.Any], steal = steal.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatCpuTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatCpuTime] (val x: Self) extends AnyVal {
    
    inline def setGuest(value: Double): Self = StObject.set(x, "guest", value.asInstanceOf[js.Any])
    
    inline def setGuestNice(value: Double): Self = StObject.set(x, "guestNice", value.asInstanceOf[js.Any])
    
    inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIowait(value: Double): Self = StObject.set(x, "iowait", value.asInstanceOf[js.Any])
    
    inline def setIrq(value: Double): Self = StObject.set(x, "irq", value.asInstanceOf[js.Any])
    
    inline def setNice(value: Double): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setSoftirq(value: Double): Self = StObject.set(x, "softirq", value.asInstanceOf[js.Any])
    
    inline def setSteal(value: Double): Self = StObject.set(x, "steal", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
