package typings.webcl.WEBCL

import typings.webcl.webclInts.`0x1000`
import typings.webcl.webclInts.`0x1001`
import typings.webcl.webclInts.`0x1002`
import typings.webcl.webclInts.`0x1003`
import typings.webcl.webclInts.`0x1004`
import typings.webcl.webclInts.`0x1005`
import typings.webcl.webclInts.`0x1006`
import typings.webcl.webclInts.`0x1007`
import typings.webcl.webclInts.`0x1008`
import typings.webcl.webclInts.`0x1009`
import typings.webcl.webclInts.`0x100A`
import typings.webcl.webclInts.`0x100C`
import typings.webcl.webclInts.`0x100D`
import typings.webcl.webclInts.`0x100E`
import typings.webcl.webclInts.`0x100F`
import typings.webcl.webclInts.`0x1010`
import typings.webcl.webclInts.`0x1011`
import typings.webcl.webclInts.`0x1012`
import typings.webcl.webclInts.`0x1013`
import typings.webcl.webclInts.`0x1014`
import typings.webcl.webclInts.`0x1015`
import typings.webcl.webclInts.`0x1016`
import typings.webcl.webclInts.`0x1017`
import typings.webcl.webclInts.`0x1018`
import typings.webcl.webclInts.`0x1019`
import typings.webcl.webclInts.`0x101B`
import typings.webcl.webclInts.`0x101C`
import typings.webcl.webclInts.`0x101D`
import typings.webcl.webclInts.`0x101E`
import typings.webcl.webclInts.`0x101F`
import typings.webcl.webclInts.`0x1020`
import typings.webcl.webclInts.`0x1021`
import typings.webcl.webclInts.`0x1022`
import typings.webcl.webclInts.`0x1023`
import typings.webcl.webclInts.`0x1024`
import typings.webcl.webclInts.`0x1025`
import typings.webcl.webclInts.`0x1026`
import typings.webcl.webclInts.`0x1027`
import typings.webcl.webclInts.`0x1028`
import typings.webcl.webclInts.`0x1029`
import typings.webcl.webclInts.`0x102A`
import typings.webcl.webclInts.`0x102B`
import typings.webcl.webclInts.`0x102C`
import typings.webcl.webclInts.`0x102D`
import typings.webcl.webclInts.`0x102E`
import typings.webcl.webclInts.`0x102F`
import typings.webcl.webclInts.`0x1030`
import typings.webcl.webclInts.`0x1031`
import typings.webcl.webclInts.`0x1035`
import typings.webcl.webclInts.`0x1036`
import typings.webcl.webclInts.`0x1037`
import typings.webcl.webclInts.`0x1038`
import typings.webcl.webclInts.`0x1039`
import typings.webcl.webclInts.`0x103A`
import typings.webcl.webclInts.`0x103D`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_device_info */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclInts.`0x1000`
  - typings.webcl.webclInts.`0x1001`
  - typings.webcl.webclInts.`0x1002`
  - typings.webcl.webclInts.`0x1003`
  - typings.webcl.webclInts.`0x1004`
  - typings.webcl.webclInts.`0x1005`
  - typings.webcl.webclInts.`0x1006`
  - typings.webcl.webclInts.`0x1007`
  - typings.webcl.webclInts.`0x1008`
  - typings.webcl.webclInts.`0x1009`
  - typings.webcl.webclInts.`0x100A`
  - typings.webcl.webclInts.`0x100C`
  - typings.webcl.webclInts.`0x100D`
  - typings.webcl.webclInts.`0x100E`
  - typings.webcl.webclInts.`0x100F`
  - typings.webcl.webclInts.`0x1010`
  - typings.webcl.webclInts.`0x1011`
  - typings.webcl.webclInts.`0x1012`
  - typings.webcl.webclInts.`0x1013`
  - typings.webcl.webclInts.`0x1014`
  - typings.webcl.webclInts.`0x1015`
  - typings.webcl.webclInts.`0x1016`
  - typings.webcl.webclInts.`0x1017`
  - typings.webcl.webclInts.`0x1018`
  - typings.webcl.webclInts.`0x1019`
  - typings.webcl.webclInts.`0x101B`
  - typings.webcl.webclInts.`0x101C`
  - typings.webcl.webclInts.`0x101D`
  - typings.webcl.webclInts.`0x101E`
  - typings.webcl.webclInts.`0x101F`
  - typings.webcl.webclInts.`0x1020`
  - typings.webcl.webclInts.`0x1021`
  - typings.webcl.webclInts.`0x1022`
  - typings.webcl.webclInts.`0x1023`
  - typings.webcl.webclInts.`0x1024`
  - typings.webcl.webclInts.`0x1025`
  - typings.webcl.webclInts.`0x1026`
  - typings.webcl.webclInts.`0x1027`
  - typings.webcl.webclInts.`0x1028`
  - typings.webcl.webclInts.`0x1029`
  - typings.webcl.webclInts.`0x102A`
  - typings.webcl.webclInts.`0x102B`
  - typings.webcl.webclInts.`0x102C`
  - typings.webcl.webclInts.`0x102D`
  - typings.webcl.webclInts.`0x102E`
  - typings.webcl.webclInts.`0x102F`
  - typings.webcl.webclInts.`0x1030`
  - typings.webcl.webclInts.`0x1031`
  - typings.webcl.webclInts.`0x1035`
  - typings.webcl.webclInts.`0x1036`
  - typings.webcl.webclInts.`0x1037`
  - typings.webcl.webclInts.`0x1038`
  - typings.webcl.webclInts.`0x1039`
  - typings.webcl.webclInts.`0x103A`
  - typings.webcl.webclInts.`0x103D`
*/
trait DeviceInfo extends StObject
object DeviceInfo {
  
  inline def DEVICE_ADDRESS_BITS: `0x100D` = 0x100D.asInstanceOf[`0x100D`]
  
  inline def DEVICE_AVAILABLE: `0x1027` = 0x1027.asInstanceOf[`0x1027`]
  
  inline def DEVICE_COMPILER_AVAILABLE: `0x1028` = 0x1028.asInstanceOf[`0x1028`]
  
  inline def DEVICE_ENDIAN_LITTLE: `0x1026` = 0x1026.asInstanceOf[`0x1026`]
  
  inline def DEVICE_ERROR_CORRECTION_SUPPORT: `0x1024` = 0x1024.asInstanceOf[`0x1024`]
  
  inline def DEVICE_EXECUTION_CAPABILITIES: `0x1029` = 0x1029.asInstanceOf[`0x1029`]
  
  inline def DEVICE_EXTENSIONS: `0x1030` = 0x1030.asInstanceOf[`0x1030`]
  
  inline def DEVICE_GLOBAL_MEM_CACHELINE_SIZE: `0x101D` = 0x101D.asInstanceOf[`0x101D`]
  
  inline def DEVICE_GLOBAL_MEM_CACHE_SIZE: `0x101E` = 0x101E.asInstanceOf[`0x101E`]
  
  inline def DEVICE_GLOBAL_MEM_CACHE_TYPE: `0x101C` = 0x101C.asInstanceOf[`0x101C`]
  
  inline def DEVICE_GLOBAL_MEM_SIZE: `0x101F` = 0x101F.asInstanceOf[`0x101F`]
  
  //DEVICE_DOUBLE_FP_CONFIG                   = 0x1032, // moved to extension
  //DEVICE_HALF_FP_CONFIG                     = 0x1033, // moved to extension
  //DEVICE_PREFERRED_VECTOR_WIDTH_HALF        = 0x1034, // moved to extension
  inline def DEVICE_HOST_UNIFIED_MEMORY: `0x1035` = 0x1035.asInstanceOf[`0x1035`]
  
  inline def DEVICE_IMAGE2D_MAX_HEIGHT: `0x1012` = 0x1012.asInstanceOf[`0x1012`]
  
  inline def DEVICE_IMAGE2D_MAX_WIDTH: `0x1011` = 0x1011.asInstanceOf[`0x1011`]
  
  inline def DEVICE_IMAGE3D_MAX_DEPTH: `0x1015` = 0x1015.asInstanceOf[`0x1015`]
  
  inline def DEVICE_IMAGE3D_MAX_HEIGHT: `0x1014` = 0x1014.asInstanceOf[`0x1014`]
  
  inline def DEVICE_IMAGE3D_MAX_WIDTH: `0x1013` = 0x1013.asInstanceOf[`0x1013`]
  
  inline def DEVICE_IMAGE_SUPPORT: `0x1016` = 0x1016.asInstanceOf[`0x1016`]
  
  inline def DEVICE_LOCAL_MEM_SIZE: `0x1023` = 0x1023.asInstanceOf[`0x1023`]
  
  inline def DEVICE_LOCAL_MEM_TYPE: `0x1022` = 0x1022.asInstanceOf[`0x1022`]
  
  //DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE      = 0x100B, // moved to extension
  inline def DEVICE_MAX_CLOCK_FREQUENCY: `0x100C` = 0x100C.asInstanceOf[`0x100C`]
  
  inline def DEVICE_MAX_COMPUTE_UNITS: `0x1002` = 0x1002.asInstanceOf[`0x1002`]
  
  inline def DEVICE_MAX_CONSTANT_ARGS: `0x1021` = 0x1021.asInstanceOf[`0x1021`]
  
  inline def DEVICE_MAX_CONSTANT_BUFFER_SIZE: `0x1020` = 0x1020.asInstanceOf[`0x1020`]
  
  inline def DEVICE_MAX_MEM_ALLOC_SIZE: `0x1010` = 0x1010.asInstanceOf[`0x1010`]
  
  inline def DEVICE_MAX_PARAMETER_SIZE: `0x1017` = 0x1017.asInstanceOf[`0x1017`]
  
  inline def DEVICE_MAX_READ_IMAGE_ARGS: `0x100E` = 0x100E.asInstanceOf[`0x100E`]
  
  inline def DEVICE_MAX_SAMPLERS: `0x1018` = 0x1018.asInstanceOf[`0x1018`]
  
  inline def DEVICE_MAX_WORK_GROUP_SIZE: `0x1004` = 0x1004.asInstanceOf[`0x1004`]
  
  inline def DEVICE_MAX_WORK_ITEM_DIMENSIONS: `0x1003` = 0x1003.asInstanceOf[`0x1003`]
  
  inline def DEVICE_MAX_WORK_ITEM_SIZES: `0x1005` = 0x1005.asInstanceOf[`0x1005`]
  
  inline def DEVICE_MAX_WRITE_IMAGE_ARGS: `0x100F` = 0x100F.asInstanceOf[`0x100F`]
  
  inline def DEVICE_MEM_BASE_ADDR_ALIGN: `0x1019` = 0x1019.asInstanceOf[`0x1019`]
  
  inline def DEVICE_NAME: `0x102B` = 0x102B.asInstanceOf[`0x102B`]
  
  inline def DEVICE_NATIVE_VECTOR_WIDTH_CHAR: `0x1036` = 0x1036.asInstanceOf[`0x1036`]
  
  inline def DEVICE_NATIVE_VECTOR_WIDTH_FLOAT: `0x103A` = 0x103A.asInstanceOf[`0x103A`]
  
  inline def DEVICE_NATIVE_VECTOR_WIDTH_INT: `0x1038` = 0x1038.asInstanceOf[`0x1038`]
  
  inline def DEVICE_NATIVE_VECTOR_WIDTH_LONG: `0x1039` = 0x1039.asInstanceOf[`0x1039`]
  
  inline def DEVICE_NATIVE_VECTOR_WIDTH_SHORT: `0x1037` = 0x1037.asInstanceOf[`0x1037`]
  
  //DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE         = 0x103B, // moved to extension
  //DEVICE_NATIVE_VECTOR_WIDTH_HALF           = 0x103C, // moved to extension
  inline def DEVICE_OPENCL_C_VERSION: `0x103D` = 0x103D.asInstanceOf[`0x103D`]
  
  inline def DEVICE_PLATFORM: `0x1031` = 0x1031.asInstanceOf[`0x1031`]
  
  inline def DEVICE_PREFERRED_VECTOR_WIDTH_CHAR: `0x1006` = 0x1006.asInstanceOf[`0x1006`]
  
  inline def DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT: `0x100A` = 0x100A.asInstanceOf[`0x100A`]
  
  inline def DEVICE_PREFERRED_VECTOR_WIDTH_INT: `0x1008` = 0x1008.asInstanceOf[`0x1008`]
  
  inline def DEVICE_PREFERRED_VECTOR_WIDTH_LONG: `0x1009` = 0x1009.asInstanceOf[`0x1009`]
  
  inline def DEVICE_PREFERRED_VECTOR_WIDTH_SHORT: `0x1007` = 0x1007.asInstanceOf[`0x1007`]
  
  inline def DEVICE_PROFILE: `0x102E` = 0x102E.asInstanceOf[`0x102E`]
  
  inline def DEVICE_PROFILING_TIMER_RESOLUTION: `0x1025` = 0x1025.asInstanceOf[`0x1025`]
  
  inline def DEVICE_QUEUE_PROPERTIES: `0x102A` = 0x102A.asInstanceOf[`0x102A`]
  
  //DEVICE_MIN_DATA_TYPE_ALIGN_SIZE           = 0x101A, // removed, deprecated in Open1.2
  inline def DEVICE_SINGLE_FP_CONFIG: `0x101B` = 0x101B.asInstanceOf[`0x101B`]
  
  inline def DEVICE_TYPE: `0x1000` = 0x1000.asInstanceOf[`0x1000`]
  
  inline def DEVICE_VENDOR: `0x102C` = 0x102C.asInstanceOf[`0x102C`]
  
  inline def DEVICE_VENDOR_ID: `0x1001` = 0x1001.asInstanceOf[`0x1001`]
  
  inline def DEVICE_VERSION: `0x102F` = 0x102F.asInstanceOf[`0x102F`]
  
  inline def DRIVER_VERSION: `0x102D` = 0x102D.asInstanceOf[`0x102D`]
}
