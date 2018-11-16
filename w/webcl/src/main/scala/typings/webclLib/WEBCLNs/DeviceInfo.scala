package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceInfo extends js.Object

/* cl_device_info */
@JSGlobal("WEBCL.DeviceInfo")
@js.native
object DeviceInfo extends js.Object {
  @js.native
  sealed trait DEVICE_ADDRESS_BITS
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_AVAILABLE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_COMPILER_AVAILABLE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_ENDIAN_LITTLE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_ERROR_CORRECTION_SUPPORT
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_EXECUTION_CAPABILITIES
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_EXTENSIONS
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_GLOBAL_MEM_CACHELINE_SIZE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_GLOBAL_MEM_CACHE_SIZE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_GLOBAL_MEM_CACHE_TYPE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_GLOBAL_MEM_SIZE
    extends webclLib.WEBCLNs.DeviceInfo
  
  //DEVICE_DOUBLE_FP_CONFIG                   = 0x1032, // moved to extension
  //DEVICE_HALF_FP_CONFIG                     = 0x1033, // moved to extension
  //DEVICE_PREFERRED_VECTOR_WIDTH_HALF        = 0x1034, // moved to extension
  @js.native
  sealed trait DEVICE_HOST_UNIFIED_MEMORY
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_IMAGE2D_MAX_HEIGHT
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_IMAGE2D_MAX_WIDTH
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_IMAGE3D_MAX_DEPTH
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_IMAGE3D_MAX_HEIGHT
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_IMAGE3D_MAX_WIDTH
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_IMAGE_SUPPORT
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_LOCAL_MEM_SIZE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_LOCAL_MEM_TYPE
    extends webclLib.WEBCLNs.DeviceInfo
  
  //DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE      = 0x100B, // moved to extension
  @js.native
  sealed trait DEVICE_MAX_CLOCK_FREQUENCY
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_COMPUTE_UNITS
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_CONSTANT_ARGS
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_CONSTANT_BUFFER_SIZE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_MEM_ALLOC_SIZE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_PARAMETER_SIZE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_READ_IMAGE_ARGS
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_SAMPLERS
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_WORK_GROUP_SIZE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_WORK_ITEM_DIMENSIONS
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_WORK_ITEM_SIZES
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MAX_WRITE_IMAGE_ARGS
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_MEM_BASE_ADDR_ALIGN
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_NAME
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_NATIVE_VECTOR_WIDTH_CHAR
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_NATIVE_VECTOR_WIDTH_FLOAT
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_NATIVE_VECTOR_WIDTH_INT
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_NATIVE_VECTOR_WIDTH_LONG
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_NATIVE_VECTOR_WIDTH_SHORT
    extends webclLib.WEBCLNs.DeviceInfo
  
  //DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE         = 0x103B, // moved to extension
  //DEVICE_NATIVE_VECTOR_WIDTH_HALF           = 0x103C, // moved to extension
  @js.native
  sealed trait DEVICE_OPENCL_C_VERSION
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_PLATFORM
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_PREFERRED_VECTOR_WIDTH_CHAR
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_PREFERRED_VECTOR_WIDTH_INT
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_PREFERRED_VECTOR_WIDTH_LONG
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_PREFERRED_VECTOR_WIDTH_SHORT
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_PROFILE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_PROFILING_TIMER_RESOLUTION
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_QUEUE_PROPERTIES
    extends webclLib.WEBCLNs.DeviceInfo
  
  //DEVICE_MIN_DATA_TYPE_ALIGN_SIZE           = 0x101A, // removed, deprecated in Open1.2
  @js.native
  sealed trait DEVICE_SINGLE_FP_CONFIG
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_TYPE
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_VENDOR
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_VENDOR_ID
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DEVICE_VERSION
    extends webclLib.WEBCLNs.DeviceInfo
  
  @js.native
  sealed trait DRIVER_VERSION
    extends webclLib.WEBCLNs.DeviceInfo
  
  /* 0x100D */ val DEVICE_ADDRESS_BITS: DEVICE_ADDRESS_BITS with scala.Double = js.native
  /* 0x1027 */ val DEVICE_AVAILABLE: DEVICE_AVAILABLE with scala.Double = js.native
  /* 0x1028 */ val DEVICE_COMPILER_AVAILABLE: DEVICE_COMPILER_AVAILABLE with scala.Double = js.native
  /* 0x1026 */ val DEVICE_ENDIAN_LITTLE: DEVICE_ENDIAN_LITTLE with scala.Double = js.native
  /* 0x1024 */ val DEVICE_ERROR_CORRECTION_SUPPORT: DEVICE_ERROR_CORRECTION_SUPPORT with scala.Double = js.native
  /* 0x1029 */ val DEVICE_EXECUTION_CAPABILITIES: DEVICE_EXECUTION_CAPABILITIES with scala.Double = js.native
  /* 0x1030 */ val DEVICE_EXTENSIONS: DEVICE_EXTENSIONS with scala.Double = js.native
  /* 0x101D */ val DEVICE_GLOBAL_MEM_CACHELINE_SIZE: DEVICE_GLOBAL_MEM_CACHELINE_SIZE with scala.Double = js.native
  /* 0x101E */ val DEVICE_GLOBAL_MEM_CACHE_SIZE: DEVICE_GLOBAL_MEM_CACHE_SIZE with scala.Double = js.native
  /* 0x101C */ val DEVICE_GLOBAL_MEM_CACHE_TYPE: DEVICE_GLOBAL_MEM_CACHE_TYPE with scala.Double = js.native
  /* 0x101F */ val DEVICE_GLOBAL_MEM_SIZE: DEVICE_GLOBAL_MEM_SIZE with scala.Double = js.native
  /* 0x1035 */ val DEVICE_HOST_UNIFIED_MEMORY: DEVICE_HOST_UNIFIED_MEMORY with scala.Double = js.native
  /* 0x1012 */ val DEVICE_IMAGE2D_MAX_HEIGHT: DEVICE_IMAGE2D_MAX_HEIGHT with scala.Double = js.native
  /* 0x1011 */ val DEVICE_IMAGE2D_MAX_WIDTH: DEVICE_IMAGE2D_MAX_WIDTH with scala.Double = js.native
  /* 0x1015 */ val DEVICE_IMAGE3D_MAX_DEPTH: DEVICE_IMAGE3D_MAX_DEPTH with scala.Double = js.native
  /* 0x1014 */ val DEVICE_IMAGE3D_MAX_HEIGHT: DEVICE_IMAGE3D_MAX_HEIGHT with scala.Double = js.native
  /* 0x1013 */ val DEVICE_IMAGE3D_MAX_WIDTH: DEVICE_IMAGE3D_MAX_WIDTH with scala.Double = js.native
  /* 0x1016 */ val DEVICE_IMAGE_SUPPORT: DEVICE_IMAGE_SUPPORT with scala.Double = js.native
  /* 0x1023 */ val DEVICE_LOCAL_MEM_SIZE: DEVICE_LOCAL_MEM_SIZE with scala.Double = js.native
  /* 0x1022 */ val DEVICE_LOCAL_MEM_TYPE: DEVICE_LOCAL_MEM_TYPE with scala.Double = js.native
  /* 0x100C */ val DEVICE_MAX_CLOCK_FREQUENCY: DEVICE_MAX_CLOCK_FREQUENCY with scala.Double = js.native
  /* 0x1002 */ val DEVICE_MAX_COMPUTE_UNITS: DEVICE_MAX_COMPUTE_UNITS with scala.Double = js.native
  /* 0x1021 */ val DEVICE_MAX_CONSTANT_ARGS: DEVICE_MAX_CONSTANT_ARGS with scala.Double = js.native
  /* 0x1020 */ val DEVICE_MAX_CONSTANT_BUFFER_SIZE: DEVICE_MAX_CONSTANT_BUFFER_SIZE with scala.Double = js.native
  /* 0x1010 */ val DEVICE_MAX_MEM_ALLOC_SIZE: DEVICE_MAX_MEM_ALLOC_SIZE with scala.Double = js.native
  /* 0x1017 */ val DEVICE_MAX_PARAMETER_SIZE: DEVICE_MAX_PARAMETER_SIZE with scala.Double = js.native
  /* 0x100E */ val DEVICE_MAX_READ_IMAGE_ARGS: DEVICE_MAX_READ_IMAGE_ARGS with scala.Double = js.native
  /* 0x1018 */ val DEVICE_MAX_SAMPLERS: DEVICE_MAX_SAMPLERS with scala.Double = js.native
  /* 0x1004 */ val DEVICE_MAX_WORK_GROUP_SIZE: DEVICE_MAX_WORK_GROUP_SIZE with scala.Double = js.native
  /* 0x1003 */ val DEVICE_MAX_WORK_ITEM_DIMENSIONS: DEVICE_MAX_WORK_ITEM_DIMENSIONS with scala.Double = js.native
  /* 0x1005 */ val DEVICE_MAX_WORK_ITEM_SIZES: DEVICE_MAX_WORK_ITEM_SIZES with scala.Double = js.native
  /* 0x100F */ val DEVICE_MAX_WRITE_IMAGE_ARGS: DEVICE_MAX_WRITE_IMAGE_ARGS with scala.Double = js.native
  /* 0x1019 */ val DEVICE_MEM_BASE_ADDR_ALIGN: DEVICE_MEM_BASE_ADDR_ALIGN with scala.Double = js.native
  /* 0x102B */ val DEVICE_NAME: DEVICE_NAME with scala.Double = js.native
  /* 0x1036 */ val DEVICE_NATIVE_VECTOR_WIDTH_CHAR: DEVICE_NATIVE_VECTOR_WIDTH_CHAR with scala.Double = js.native
  /* 0x103A */ val DEVICE_NATIVE_VECTOR_WIDTH_FLOAT: DEVICE_NATIVE_VECTOR_WIDTH_FLOAT with scala.Double = js.native
  /* 0x1038 */ val DEVICE_NATIVE_VECTOR_WIDTH_INT: DEVICE_NATIVE_VECTOR_WIDTH_INT with scala.Double = js.native
  /* 0x1039 */ val DEVICE_NATIVE_VECTOR_WIDTH_LONG: DEVICE_NATIVE_VECTOR_WIDTH_LONG with scala.Double = js.native
  /* 0x1037 */ val DEVICE_NATIVE_VECTOR_WIDTH_SHORT: DEVICE_NATIVE_VECTOR_WIDTH_SHORT with scala.Double = js.native
  /* 0x103D */ val DEVICE_OPENCL_C_VERSION: DEVICE_OPENCL_C_VERSION with scala.Double = js.native
  /* 0x1031 */ val DEVICE_PLATFORM: DEVICE_PLATFORM with scala.Double = js.native
  /* 0x1006 */ val DEVICE_PREFERRED_VECTOR_WIDTH_CHAR: DEVICE_PREFERRED_VECTOR_WIDTH_CHAR with scala.Double = js.native
  /* 0x100A */ val DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT: DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT with scala.Double = js.native
  /* 0x1008 */ val DEVICE_PREFERRED_VECTOR_WIDTH_INT: DEVICE_PREFERRED_VECTOR_WIDTH_INT with scala.Double = js.native
  /* 0x1009 */ val DEVICE_PREFERRED_VECTOR_WIDTH_LONG: DEVICE_PREFERRED_VECTOR_WIDTH_LONG with scala.Double = js.native
  /* 0x1007 */ val DEVICE_PREFERRED_VECTOR_WIDTH_SHORT: DEVICE_PREFERRED_VECTOR_WIDTH_SHORT with scala.Double = js.native
  /* 0x102E */ val DEVICE_PROFILE: DEVICE_PROFILE with scala.Double = js.native
  /* 0x1025 */ val DEVICE_PROFILING_TIMER_RESOLUTION: DEVICE_PROFILING_TIMER_RESOLUTION with scala.Double = js.native
  /* 0x102A */ val DEVICE_QUEUE_PROPERTIES: DEVICE_QUEUE_PROPERTIES with scala.Double = js.native
  /* 0x101B */ val DEVICE_SINGLE_FP_CONFIG: DEVICE_SINGLE_FP_CONFIG with scala.Double = js.native
  /* 0x1000 */ val DEVICE_TYPE: DEVICE_TYPE with scala.Double = js.native
  /* 0x102C */ val DEVICE_VENDOR: DEVICE_VENDOR with scala.Double = js.native
  /* 0x1001 */ val DEVICE_VENDOR_ID: DEVICE_VENDOR_ID with scala.Double = js.native
  /* 0x102F */ val DEVICE_VERSION: DEVICE_VERSION with scala.Double = js.native
  /* 0x102D */ val DRIVER_VERSION: DRIVER_VERSION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.DeviceInfo with scala.Double] = js.native
}

