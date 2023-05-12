package typings.webgpuTypes

import typings.std.stdInts.`10`
import typings.std.stdInts.`11`
import typings.std.stdInts.`12`
import typings.std.stdInts.`13`
import typings.std.stdInts.`14`
import typings.std.stdInts.`15`
import typings.std.stdInts.`16`
import typings.std.stdInts.`17`
import typings.std.stdInts.`18`
import typings.std.stdInts.`19`
import typings.std.stdInts.`1`
import typings.std.stdInts.`20`
import typings.std.stdInts.`21`
import typings.std.stdInts.`22`
import typings.std.stdInts.`23`
import typings.std.stdInts.`24`
import typings.std.stdInts.`25`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import typings.std.stdInts.`7`
import typings.std.stdInts.`8`
import typings.std.stdInts.`9`
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GPUInternalError")
  @js.native
  open class GPUInternalError protected ()
    extends StObject
       with typings.webgpuTypes.GPUInternalError {
    def this(message: String) = this()
    
    /**
      * Nominal type branding.
      * https://github.com/microsoft/TypeScript/pull/33038
      * @internal
      */
    /* CompleteClass */
    override val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUInternalError = js.native
    
    /**
      * A human-readable, localizable text message providing information about the error that
      * occurred.
      * Note: This message is generally intended for application developers to debug their
      * applications and capture information for debug reports, not to be surfaced to end-users.
      * Note: User agents should not include potentially machine-parsable details in this message,
      * such as free system memory on {@link GPUErrorFilter#"out-of-memory"} or other details about the
      * conditions under which memory was exhausted.
      * Note: The {@link GPUError#message} should follow the best practices for language and
      * direction information. This includes making use of any future standards which may emerge
      * regarding the reporting of string language and direction metadata.
      * <p class="note editorial">Editorial:
      * At the time of this writing, no language/direction recommendation is available that provides
      * compatibility and consistency with legacy APIs, but when there is, adopt it formally.
      */
    /* CompleteClass */
    override val message: String = js.native
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
      * A human-readable, localizable text message providing information about the error that
      * occurred.
      * Note: This message is generally intended for application developers to debug their
      * applications and capture information for debug reports, not to be surfaced to end-users.
      * Note: User agents should not include potentially machine-parsable details in this message,
      * such as free system memory on {@link GPUErrorFilter#"out-of-memory"} or other details about the
      * conditions under which memory was exhausted.
      * Note: The {@link GPUError#message} should follow the best practices for language and
      * direction information. This includes making use of any future standards which may emerge
      * regarding the reporting of string language and direction metadata.
      * <p class="note editorial">Editorial:
      * At the time of this writing, no language/direction recommendation is available that provides
      * compatibility and consistency with legacy APIs, but when there is, adopt it formally.
      */
    /* CompleteClass */
    override val message: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GPUPipelineError")
  @js.native
  open class GPUPipelineError protected ()
    extends StObject
       with typings.webgpuTypes.GPUPipelineError {
    def this(message: String, options: GPUPipelineErrorInit) = this()
    def this(message: Unit, options: GPUPipelineErrorInit) = this()
    
    /* standard dom */
    /* CompleteClass */
    override val ABORT_ERR: `20` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val DATA_CLONE_ERR: `25` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val DOMSTRING_SIZE_ERR: `2` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val HIERARCHY_REQUEST_ERR: `3` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INDEX_SIZE_ERR: `1` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INUSE_ATTRIBUTE_ERR: `10` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_ACCESS_ERR: `15` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_CHARACTER_ERR: `5` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_MODIFICATION_ERR: `13` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_NODE_TYPE_ERR: `24` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_STATE_ERR: `11` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NAMESPACE_ERR: `14` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NETWORK_ERR: `19` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NOT_FOUND_ERR: `8` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NOT_SUPPORTED_ERR: `9` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NO_DATA_ALLOWED_ERR: `6` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NO_MODIFICATION_ALLOWED_ERR: `7` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val QUOTA_EXCEEDED_ERR: `22` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val SECURITY_ERR: `18` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val SYNTAX_ERR: `12` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val TIMEOUT_ERR: `23` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val TYPE_MISMATCH_ERR: `17` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val URL_MISMATCH_ERR: `21` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val VALIDATION_ERR: `16` = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val WRONG_DOCUMENT_ERR: `4` = js.native
    
    /**
      * Nominal type branding.
      * https://github.com/microsoft/TypeScript/pull/33038
      * @internal
      */
    /* CompleteClass */
    override val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUPipelineError = js.native
    
    /** @deprecated */
    /* standard dom */
    /* CompleteClass */
    override val code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * A read-only slot-backed attribute exposing the type of error encountered in pipeline creation
      * as a <dfn enum for=>GPUPipelineErrorReason</dfn>:
      * <ul dfn-type=enum-value dfn-for=GPUPipelineErrorReason>
      * - <dfn>"validation"</dfn>: A [$validation error$].
      * - <dfn>"internal"</dfn>: An [$internal error$].
      * </ul>
      */
    /* CompleteClass */
    override val reason: GPUPipelineErrorReason = js.native
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
      * A human-readable, localizable text message providing information about the error that
      * occurred.
      * Note: This message is generally intended for application developers to debug their
      * applications and capture information for debug reports, not to be surfaced to end-users.
      * Note: User agents should not include potentially machine-parsable details in this message,
      * such as free system memory on {@link GPUErrorFilter#"out-of-memory"} or other details about the
      * conditions under which memory was exhausted.
      * Note: The {@link GPUError#message} should follow the best practices for language and
      * direction information. This includes making use of any future standards which may emerge
      * regarding the reporting of string language and direction metadata.
      * <p class="note editorial">Editorial:
      * At the time of this writing, no language/direction recommendation is available that provides
      * compatibility and consistency with legacy APIs, but when there is, adopt it formally.
      */
    /* CompleteClass */
    override val message: String = js.native
  }
}
