package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meminfo extends StObject {
  
  var active: Double
  
  var anonHugePages: Double
  
  var anonPages: Double
  
  var available: Double
  
  var bounceBuffers: Double
  
  var buffers: Double
  
  var cached: Double
  
  var commitLimit: Double
  
  var directMap1G: Double
  
  var directMap2M: Double
  
  var directMap4K: Double
  
  var directMap4M: Double
  
  var dirty: Double
  
  var free: Double
  
  var hardwareCorrupted: js.UndefOr[Double] = js.undefined
  
  var hugepageSize: js.UndefOr[Double] = js.undefined
  
  var hugepagesFree: js.UndefOr[Double] = js.undefined
  
  var hugepagesReserved: js.UndefOr[Double] = js.undefined
  
  var hugepagesSurplus: js.UndefOr[Double] = js.undefined
  
  var hugepagesTotal: js.UndefOr[Double] = js.undefined
  
  var inactive: Double
  
  var kernelReclaimable: js.UndefOr[Double] = js.undefined
  
  var kernelStack: Double
  
  var mapped: Double
  
  var pageTables: Double
  
  var shmem: Double
  
  var shmemHugePages: js.UndefOr[Double] = js.undefined
  
  var shmemPmdMapped: js.UndefOr[Double] = js.undefined
  
  var slab: Double
  
  var slabReclaimable: Double
  
  var slabUnreclaimable: Double
  
  var swapCached: Double
  
  var swapFree: Double
  
  var swapTotal: Double
  
  var total: Double
  
  var vmallocTotal: Double
  
  var writeback: Double
  
  var writebackTmp: Double
}
object Meminfo {
  
  inline def apply(
    active: Double,
    anonHugePages: Double,
    anonPages: Double,
    available: Double,
    bounceBuffers: Double,
    buffers: Double,
    cached: Double,
    commitLimit: Double,
    directMap1G: Double,
    directMap2M: Double,
    directMap4K: Double,
    directMap4M: Double,
    dirty: Double,
    free: Double,
    inactive: Double,
    kernelStack: Double,
    mapped: Double,
    pageTables: Double,
    shmem: Double,
    slab: Double,
    slabReclaimable: Double,
    slabUnreclaimable: Double,
    swapCached: Double,
    swapFree: Double,
    swapTotal: Double,
    total: Double,
    vmallocTotal: Double,
    writeback: Double,
    writebackTmp: Double
  ): Meminfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], anonHugePages = anonHugePages.asInstanceOf[js.Any], anonPages = anonPages.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], bounceBuffers = bounceBuffers.asInstanceOf[js.Any], buffers = buffers.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], commitLimit = commitLimit.asInstanceOf[js.Any], directMap1G = directMap1G.asInstanceOf[js.Any], directMap2M = directMap2M.asInstanceOf[js.Any], directMap4K = directMap4K.asInstanceOf[js.Any], directMap4M = directMap4M.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], free = free.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], kernelStack = kernelStack.asInstanceOf[js.Any], mapped = mapped.asInstanceOf[js.Any], pageTables = pageTables.asInstanceOf[js.Any], shmem = shmem.asInstanceOf[js.Any], slab = slab.asInstanceOf[js.Any], slabReclaimable = slabReclaimable.asInstanceOf[js.Any], slabUnreclaimable = slabUnreclaimable.asInstanceOf[js.Any], swapCached = swapCached.asInstanceOf[js.Any], swapFree = swapFree.asInstanceOf[js.Any], swapTotal = swapTotal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], vmallocTotal = vmallocTotal.asInstanceOf[js.Any], writeback = writeback.asInstanceOf[js.Any], writebackTmp = writebackTmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meminfo]
  }
  
  extension [Self <: Meminfo](x: Self) {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAnonHugePages(value: Double): Self = StObject.set(x, "anonHugePages", value.asInstanceOf[js.Any])
    
    inline def setAnonPages(value: Double): Self = StObject.set(x, "anonPages", value.asInstanceOf[js.Any])
    
    inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setBounceBuffers(value: Double): Self = StObject.set(x, "bounceBuffers", value.asInstanceOf[js.Any])
    
    inline def setBuffers(value: Double): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setCached(value: Double): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setCommitLimit(value: Double): Self = StObject.set(x, "commitLimit", value.asInstanceOf[js.Any])
    
    inline def setDirectMap1G(value: Double): Self = StObject.set(x, "directMap1G", value.asInstanceOf[js.Any])
    
    inline def setDirectMap2M(value: Double): Self = StObject.set(x, "directMap2M", value.asInstanceOf[js.Any])
    
    inline def setDirectMap4K(value: Double): Self = StObject.set(x, "directMap4K", value.asInstanceOf[js.Any])
    
    inline def setDirectMap4M(value: Double): Self = StObject.set(x, "directMap4M", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Double): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setFree(value: Double): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    inline def setHardwareCorrupted(value: Double): Self = StObject.set(x, "hardwareCorrupted", value.asInstanceOf[js.Any])
    
    inline def setHardwareCorruptedUndefined: Self = StObject.set(x, "hardwareCorrupted", js.undefined)
    
    inline def setHugepageSize(value: Double): Self = StObject.set(x, "hugepageSize", value.asInstanceOf[js.Any])
    
    inline def setHugepageSizeUndefined: Self = StObject.set(x, "hugepageSize", js.undefined)
    
    inline def setHugepagesFree(value: Double): Self = StObject.set(x, "hugepagesFree", value.asInstanceOf[js.Any])
    
    inline def setHugepagesFreeUndefined: Self = StObject.set(x, "hugepagesFree", js.undefined)
    
    inline def setHugepagesReserved(value: Double): Self = StObject.set(x, "hugepagesReserved", value.asInstanceOf[js.Any])
    
    inline def setHugepagesReservedUndefined: Self = StObject.set(x, "hugepagesReserved", js.undefined)
    
    inline def setHugepagesSurplus(value: Double): Self = StObject.set(x, "hugepagesSurplus", value.asInstanceOf[js.Any])
    
    inline def setHugepagesSurplusUndefined: Self = StObject.set(x, "hugepagesSurplus", js.undefined)
    
    inline def setHugepagesTotal(value: Double): Self = StObject.set(x, "hugepagesTotal", value.asInstanceOf[js.Any])
    
    inline def setHugepagesTotalUndefined: Self = StObject.set(x, "hugepagesTotal", js.undefined)
    
    inline def setInactive(value: Double): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setKernelReclaimable(value: Double): Self = StObject.set(x, "kernelReclaimable", value.asInstanceOf[js.Any])
    
    inline def setKernelReclaimableUndefined: Self = StObject.set(x, "kernelReclaimable", js.undefined)
    
    inline def setKernelStack(value: Double): Self = StObject.set(x, "kernelStack", value.asInstanceOf[js.Any])
    
    inline def setMapped(value: Double): Self = StObject.set(x, "mapped", value.asInstanceOf[js.Any])
    
    inline def setPageTables(value: Double): Self = StObject.set(x, "pageTables", value.asInstanceOf[js.Any])
    
    inline def setShmem(value: Double): Self = StObject.set(x, "shmem", value.asInstanceOf[js.Any])
    
    inline def setShmemHugePages(value: Double): Self = StObject.set(x, "shmemHugePages", value.asInstanceOf[js.Any])
    
    inline def setShmemHugePagesUndefined: Self = StObject.set(x, "shmemHugePages", js.undefined)
    
    inline def setShmemPmdMapped(value: Double): Self = StObject.set(x, "shmemPmdMapped", value.asInstanceOf[js.Any])
    
    inline def setShmemPmdMappedUndefined: Self = StObject.set(x, "shmemPmdMapped", js.undefined)
    
    inline def setSlab(value: Double): Self = StObject.set(x, "slab", value.asInstanceOf[js.Any])
    
    inline def setSlabReclaimable(value: Double): Self = StObject.set(x, "slabReclaimable", value.asInstanceOf[js.Any])
    
    inline def setSlabUnreclaimable(value: Double): Self = StObject.set(x, "slabUnreclaimable", value.asInstanceOf[js.Any])
    
    inline def setSwapCached(value: Double): Self = StObject.set(x, "swapCached", value.asInstanceOf[js.Any])
    
    inline def setSwapFree(value: Double): Self = StObject.set(x, "swapFree", value.asInstanceOf[js.Any])
    
    inline def setSwapTotal(value: Double): Self = StObject.set(x, "swapTotal", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setVmallocTotal(value: Double): Self = StObject.set(x, "vmallocTotal", value.asInstanceOf[js.Any])
    
    inline def setWriteback(value: Double): Self = StObject.set(x, "writeback", value.asInstanceOf[js.Any])
    
    inline def setWritebackTmp(value: Double): Self = StObject.set(x, "writebackTmp", value.asInstanceOf[js.Any])
  }
}
