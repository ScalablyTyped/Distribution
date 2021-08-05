package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemData extends StObject {
  
  var active: Double
  
  var available: Double
  
  var buffcache: Double
  
  var buffers: Double
  
  var cached: Double
  
  var free: Double
  
  var slab: Double
  
  var swapfree: Double
  
  var swaptotal: Double
  
  var swapused: Double
  
  var total: Double
  
  var used: Double
}
object MemData {
  
  inline def apply(
    active: Double,
    available: Double,
    buffcache: Double,
    buffers: Double,
    cached: Double,
    free: Double,
    slab: Double,
    swapfree: Double,
    swaptotal: Double,
    swapused: Double,
    total: Double,
    used: Double
  ): MemData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], buffcache = buffcache.asInstanceOf[js.Any], buffers = buffers.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], free = free.asInstanceOf[js.Any], slab = slab.asInstanceOf[js.Any], swapfree = swapfree.asInstanceOf[js.Any], swaptotal = swaptotal.asInstanceOf[js.Any], swapused = swapused.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemData]
  }
  
  extension [Self <: MemData](x: Self) {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setBuffcache(value: Double): Self = StObject.set(x, "buffcache", value.asInstanceOf[js.Any])
    
    inline def setBuffers(value: Double): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setCached(value: Double): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setFree(value: Double): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    inline def setSlab(value: Double): Self = StObject.set(x, "slab", value.asInstanceOf[js.Any])
    
    inline def setSwapfree(value: Double): Self = StObject.set(x, "swapfree", value.asInstanceOf[js.Any])
    
    inline def setSwaptotal(value: Double): Self = StObject.set(x, "swaptotal", value.asInstanceOf[js.Any])
    
    inline def setSwapused(value: Double): Self = StObject.set(x, "swapused", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
  }
}
