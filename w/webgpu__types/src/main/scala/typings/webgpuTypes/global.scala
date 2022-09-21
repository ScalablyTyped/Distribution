package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object GPUBufferUsage {
    
    @JSGlobal("GPUBufferUsage.COPY_DST")
    @js.native
    val COPY_DST: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUBufferUsage.COPY_SRC")
    @js.native
    val COPY_SRC: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUBufferUsage.INDEX")
    @js.native
    val INDEX: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUBufferUsage.INDIRECT")
    @js.native
    val INDIRECT: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUBufferUsage.MAP_READ")
    @js.native
    val MAP_READ: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUBufferUsage.MAP_WRITE")
    @js.native
    val MAP_WRITE: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUBufferUsage.QUERY_RESOLVE")
    @js.native
    val QUERY_RESOLVE: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUBufferUsage.STORAGE")
    @js.native
    val STORAGE: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUBufferUsage.UNIFORM")
    @js.native
    val UNIFORM: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUBufferUsage.VERTEX")
    @js.native
    val VERTEX: GPUFlagsConstant = js.native
  }
  
  object GPUColorWrite {
    
    @JSGlobal("GPUColorWrite.ALL")
    @js.native
    val ALL: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUColorWrite.ALPHA")
    @js.native
    val ALPHA: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUColorWrite.BLUE")
    @js.native
    val BLUE: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUColorWrite.GREEN")
    @js.native
    val GREEN: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUColorWrite.RED")
    @js.native
    val RED: GPUFlagsConstant = js.native
  }
  
  object GPUMapMode {
    
    @JSGlobal("GPUMapMode.READ")
    @js.native
    val READ: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUMapMode.WRITE")
    @js.native
    val WRITE: GPUFlagsConstant = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GPUOutOfMemoryError")
  @js.native
  open class GPUOutOfMemoryError protected ()
    extends StObject
       with typings.webgpuTypes.GPUOutOfMemoryError {
    def this(message: String) = this()
    
    /**
      * Nominal type branding.
      * https://github.com/microsoft/TypeScript/pull/33038
      * @internal
      */
    /* CompleteClass */
    override val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUOutOfMemoryError = js.native
    
    /**
      * A human-readable message providing information about the error that occurred.
      * Note: This message is generally intended for application developers to debug their
      * applications and capture information for debug reports, not to be surfaced to end-users.
      * Note: User agents should not include potentially machine-parsable details in this message,
      * such as free system memory on "out-of-memory" errors, or other details
      * about the conditions under which memory was exhausted.
      */
    /* CompleteClass */
    override val message: String = js.native
  }
  
  object GPUShaderStage {
    
    @JSGlobal("GPUShaderStage.COMPUTE")
    @js.native
    val COMPUTE: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUShaderStage.FRAGMENT")
    @js.native
    val FRAGMENT: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUShaderStage.VERTEX")
    @js.native
    val VERTEX: GPUFlagsConstant = js.native
  }
  
  object GPUTextureUsage {
    
    @JSGlobal("GPUTextureUsage.COPY_DST")
    @js.native
    val COPY_DST: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUTextureUsage.COPY_SRC")
    @js.native
    val COPY_SRC: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUTextureUsage.RENDER_ATTACHMENT")
    @js.native
    val RENDER_ATTACHMENT: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUTextureUsage.STORAGE_BINDING")
    @js.native
    val STORAGE_BINDING: GPUFlagsConstant = js.native
    
    @JSGlobal("GPUTextureUsage.TEXTURE_BINDING")
    @js.native
    val TEXTURE_BINDING: GPUFlagsConstant = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GPUUncapturedErrorEvent")
  @js.native
  open class GPUUncapturedErrorEvent protected ()
    extends StObject
       with typings.webgpuTypes.GPUUncapturedErrorEvent {
    def this(`type`: String, gpuUncapturedErrorEventInitDict: GPUUncapturedErrorEventInit) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GPUValidationError")
  @js.native
  open class GPUValidationError protected ()
    extends StObject
       with typings.webgpuTypes.GPUValidationError {
    def this(message: String) = this()
    
    /**
      * Nominal type branding.
      * https://github.com/microsoft/TypeScript/pull/33038
      * @internal
      */
    /* CompleteClass */
    override val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUValidationError = js.native
    
    /**
      * A human-readable message providing information about the error that occurred.
      * Note: This message is generally intended for application developers to debug their
      * applications and capture information for debug reports, not to be surfaced to end-users.
      * Note: User agents should not include potentially machine-parsable details in this message,
      * such as free system memory on "out-of-memory" errors, or other details
      * about the conditions under which memory was exhausted.
      */
    /* CompleteClass */
    override val message: String = js.native
  }
}
