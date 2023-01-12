package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CpuCoreInfo extends StObject {
  
  var addressSizes: String
  
  var apicId: Double
  
  var bogoMips: js.UndefOr[Double] = js.undefined
  
  var bugs: js.Array[String]
  
  var cacheAlignment: Double
  
  var cacheSize: String
  
  var clflushSize: Double
  
  var coreId: Double
  
  var cores: Double
  
  var cpuMhz: Double
  
  var cpuidLevel: Double
  
  var family: Double
  
  var flags: js.Array[String]
  
  var fpu: Boolean
  
  var fpuException: Boolean
  
  var id: Double
  
  var initialApicId: Double
  
  var microcode: String
  
  var model: Double
  
  var modelName: String
  
  var physicalId: Double
  
  var siblings: Double
  
  var stepping: Double
  
  var vendorId: String
  
  var wp: Boolean
}
object CpuCoreInfo {
  
  inline def apply(
    addressSizes: String,
    apicId: Double,
    bugs: js.Array[String],
    cacheAlignment: Double,
    cacheSize: String,
    clflushSize: Double,
    coreId: Double,
    cores: Double,
    cpuMhz: Double,
    cpuidLevel: Double,
    family: Double,
    flags: js.Array[String],
    fpu: Boolean,
    fpuException: Boolean,
    id: Double,
    initialApicId: Double,
    microcode: String,
    model: Double,
    modelName: String,
    physicalId: Double,
    siblings: Double,
    stepping: Double,
    vendorId: String,
    wp: Boolean
  ): CpuCoreInfo = {
    val __obj = js.Dynamic.literal(addressSizes = addressSizes.asInstanceOf[js.Any], apicId = apicId.asInstanceOf[js.Any], bugs = bugs.asInstanceOf[js.Any], cacheAlignment = cacheAlignment.asInstanceOf[js.Any], cacheSize = cacheSize.asInstanceOf[js.Any], clflushSize = clflushSize.asInstanceOf[js.Any], coreId = coreId.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], cpuMhz = cpuMhz.asInstanceOf[js.Any], cpuidLevel = cpuidLevel.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fpu = fpu.asInstanceOf[js.Any], fpuException = fpuException.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialApicId = initialApicId.asInstanceOf[js.Any], microcode = microcode.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], physicalId = physicalId.asInstanceOf[js.Any], siblings = siblings.asInstanceOf[js.Any], stepping = stepping.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any], wp = wp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuCoreInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CpuCoreInfo] (val x: Self) extends AnyVal {
    
    inline def setAddressSizes(value: String): Self = StObject.set(x, "addressSizes", value.asInstanceOf[js.Any])
    
    inline def setApicId(value: Double): Self = StObject.set(x, "apicId", value.asInstanceOf[js.Any])
    
    inline def setBogoMips(value: Double): Self = StObject.set(x, "bogoMips", value.asInstanceOf[js.Any])
    
    inline def setBogoMipsUndefined: Self = StObject.set(x, "bogoMips", js.undefined)
    
    inline def setBugs(value: js.Array[String]): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
    
    inline def setBugsVarargs(value: String*): Self = StObject.set(x, "bugs", js.Array(value*))
    
    inline def setCacheAlignment(value: Double): Self = StObject.set(x, "cacheAlignment", value.asInstanceOf[js.Any])
    
    inline def setCacheSize(value: String): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    inline def setClflushSize(value: Double): Self = StObject.set(x, "clflushSize", value.asInstanceOf[js.Any])
    
    inline def setCoreId(value: Double): Self = StObject.set(x, "coreId", value.asInstanceOf[js.Any])
    
    inline def setCores(value: Double): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
    
    inline def setCpuMhz(value: Double): Self = StObject.set(x, "cpuMhz", value.asInstanceOf[js.Any])
    
    inline def setCpuidLevel(value: Double): Self = StObject.set(x, "cpuidLevel", value.asInstanceOf[js.Any])
    
    inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
    
    inline def setFpu(value: Boolean): Self = StObject.set(x, "fpu", value.asInstanceOf[js.Any])
    
    inline def setFpuException(value: Boolean): Self = StObject.set(x, "fpuException", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitialApicId(value: Double): Self = StObject.set(x, "initialApicId", value.asInstanceOf[js.Any])
    
    inline def setMicrocode(value: String): Self = StObject.set(x, "microcode", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Double): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setPhysicalId(value: Double): Self = StObject.set(x, "physicalId", value.asInstanceOf[js.Any])
    
    inline def setSiblings(value: Double): Self = StObject.set(x, "siblings", value.asInstanceOf[js.Any])
    
    inline def setStepping(value: Double): Self = StObject.set(x, "stepping", value.asInstanceOf[js.Any])
    
    inline def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
    
    inline def setWp(value: Boolean): Self = StObject.set(x, "wp", value.asInstanceOf[js.Any])
  }
}
