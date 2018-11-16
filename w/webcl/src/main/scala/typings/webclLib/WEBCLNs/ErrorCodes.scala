package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

/* Error Codes */
@JSGlobal("WEBCL.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait BUILD_PROGRAM_FAILURE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait COMPILER_NOT_AVAILABLE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait DEVICE_NOT_AVAILABLE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait DEVICE_NOT_FOUND
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait IMAGE_FORMAT_MISMATCH
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait IMAGE_FORMAT_NOT_SUPPORTED
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_ARG_INDEX
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_ARG_SIZE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_ARG_VALUE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_BINARY
    extends webclLib.WEBCLNs.ErrorCodes
  
  //INVALID_GL_OBJECT                         = -60, // moved to extension
  @js.native
  sealed trait INVALID_BUFFER_SIZE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_BUILD_OPTIONS
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_COMMAND_QUEUE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_CONTEXT
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_DEVICE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_DEVICE_TYPE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_EVENT
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_EVENT_WAIT_LIST
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_GLOBAL_OFFSET
    extends webclLib.WEBCLNs.ErrorCodes
  
  //INVALID_MIP_LEVEL                         = -62, // moved to extension
  @js.native
  sealed trait INVALID_GLOBAL_WORK_SIZE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_HOST_PTR
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_IMAGE_FORMAT_DESCRIPTOR
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_IMAGE_SIZE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_KERNEL
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_KERNEL_ARGS
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_KERNEL_DEFINITION
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_KERNEL_NAME
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_MEM_OBJECT
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_OPERATION
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_PLATFORM
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_PROGRAM
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_PROGRAM_EXECUTABLE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_PROPERTY
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_QUEUE_PROPERTIES
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_SAMPLER
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_VALUE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_WORK_DIMENSION
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_WORK_GROUP_SIZE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait INVALID_WORK_ITEM_SIZE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait MAP_FAILURE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait MEM_COPY_OVERLAP
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait MEM_OBJECT_ALLOCATION_FAILURE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait MISALIGNED_SUB_BUFFER_OFFSET
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait OUT_OF_HOST_MEMORY
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait OUT_OF_RESOURCES
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait PROFILING_INFO_NOT_AVAILABLE
    extends webclLib.WEBCLNs.ErrorCodes
  
  @js.native
  sealed trait SUCCESS
    extends webclLib.WEBCLNs.ErrorCodes
  
  /* -11 */ val BUILD_PROGRAM_FAILURE: BUILD_PROGRAM_FAILURE with scala.Double = js.native
  /* -3 */ val COMPILER_NOT_AVAILABLE: COMPILER_NOT_AVAILABLE with scala.Double = js.native
  /* -2 */ val DEVICE_NOT_AVAILABLE: DEVICE_NOT_AVAILABLE with scala.Double = js.native
  /* -1 */ val DEVICE_NOT_FOUND: DEVICE_NOT_FOUND with scala.Double = js.native
  /* -14 */ val EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST: EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST with scala.Double = js.native
  /* -9 */ val IMAGE_FORMAT_MISMATCH: IMAGE_FORMAT_MISMATCH with scala.Double = js.native
  /* -10 */ val IMAGE_FORMAT_NOT_SUPPORTED: IMAGE_FORMAT_NOT_SUPPORTED with scala.Double = js.native
  /* -49 */ val INVALID_ARG_INDEX: INVALID_ARG_INDEX with scala.Double = js.native
  /* -51 */ val INVALID_ARG_SIZE: INVALID_ARG_SIZE with scala.Double = js.native
  /* -50 */ val INVALID_ARG_VALUE: INVALID_ARG_VALUE with scala.Double = js.native
  /* -42 */ val INVALID_BINARY: INVALID_BINARY with scala.Double = js.native
  /* -61 */ val INVALID_BUFFER_SIZE: INVALID_BUFFER_SIZE with scala.Double = js.native
  /* -43 */ val INVALID_BUILD_OPTIONS: INVALID_BUILD_OPTIONS with scala.Double = js.native
  /* -36 */ val INVALID_COMMAND_QUEUE: INVALID_COMMAND_QUEUE with scala.Double = js.native
  /* -34 */ val INVALID_CONTEXT: INVALID_CONTEXT with scala.Double = js.native
  /* -33 */ val INVALID_DEVICE: INVALID_DEVICE with scala.Double = js.native
  /* -31 */ val INVALID_DEVICE_TYPE: INVALID_DEVICE_TYPE with scala.Double = js.native
  /* -58 */ val INVALID_EVENT: INVALID_EVENT with scala.Double = js.native
  /* -57 */ val INVALID_EVENT_WAIT_LIST: INVALID_EVENT_WAIT_LIST with scala.Double = js.native
  /* -56 */ val INVALID_GLOBAL_OFFSET: INVALID_GLOBAL_OFFSET with scala.Double = js.native
  /* -63 */ val INVALID_GLOBAL_WORK_SIZE: INVALID_GLOBAL_WORK_SIZE with scala.Double = js.native
  /* -37 */ val INVALID_HOST_PTR: INVALID_HOST_PTR with scala.Double = js.native
  /* -39 */ val INVALID_IMAGE_FORMAT_DESCRIPTOR: INVALID_IMAGE_FORMAT_DESCRIPTOR with scala.Double = js.native
  /* -40 */ val INVALID_IMAGE_SIZE: INVALID_IMAGE_SIZE with scala.Double = js.native
  /* -48 */ val INVALID_KERNEL: INVALID_KERNEL with scala.Double = js.native
  /* -52 */ val INVALID_KERNEL_ARGS: INVALID_KERNEL_ARGS with scala.Double = js.native
  /* -47 */ val INVALID_KERNEL_DEFINITION: INVALID_KERNEL_DEFINITION with scala.Double = js.native
  /* -46 */ val INVALID_KERNEL_NAME: INVALID_KERNEL_NAME with scala.Double = js.native
  /* -38 */ val INVALID_MEM_OBJECT: INVALID_MEM_OBJECT with scala.Double = js.native
  /* -59 */ val INVALID_OPERATION: INVALID_OPERATION with scala.Double = js.native
  /* -32 */ val INVALID_PLATFORM: INVALID_PLATFORM with scala.Double = js.native
  /* -44 */ val INVALID_PROGRAM: INVALID_PROGRAM with scala.Double = js.native
  /* -45 */ val INVALID_PROGRAM_EXECUTABLE: INVALID_PROGRAM_EXECUTABLE with scala.Double = js.native
  /* -64 */ val INVALID_PROPERTY: INVALID_PROPERTY with scala.Double = js.native
  /* -35 */ val INVALID_QUEUE_PROPERTIES: INVALID_QUEUE_PROPERTIES with scala.Double = js.native
  /* -41 */ val INVALID_SAMPLER: INVALID_SAMPLER with scala.Double = js.native
  /* -30 */ val INVALID_VALUE: INVALID_VALUE with scala.Double = js.native
  /* -53 */ val INVALID_WORK_DIMENSION: INVALID_WORK_DIMENSION with scala.Double = js.native
  /* -54 */ val INVALID_WORK_GROUP_SIZE: INVALID_WORK_GROUP_SIZE with scala.Double = js.native
  /* -55 */ val INVALID_WORK_ITEM_SIZE: INVALID_WORK_ITEM_SIZE with scala.Double = js.native
  /* -12 */ val MAP_FAILURE: MAP_FAILURE with scala.Double = js.native
  /* -8 */ val MEM_COPY_OVERLAP: MEM_COPY_OVERLAP with scala.Double = js.native
  /* -4 */ val MEM_OBJECT_ALLOCATION_FAILURE: MEM_OBJECT_ALLOCATION_FAILURE with scala.Double = js.native
  /* -13 */ val MISALIGNED_SUB_BUFFER_OFFSET: MISALIGNED_SUB_BUFFER_OFFSET with scala.Double = js.native
  /* -6 */ val OUT_OF_HOST_MEMORY: OUT_OF_HOST_MEMORY with scala.Double = js.native
  /* -5 */ val OUT_OF_RESOURCES: OUT_OF_RESOURCES with scala.Double = js.native
  /* -7 */ val PROFILING_INFO_NOT_AVAILABLE: PROFILING_INFO_NOT_AVAILABLE with scala.Double = js.native
  /* 0 */ val SUCCESS: SUCCESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.ErrorCodes with scala.Double] = js.native
}

