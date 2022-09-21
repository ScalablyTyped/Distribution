package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUBuffer
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUBuffer = js.native
  
  /**
    * Destroys the {@link GPUBuffer}.
    * Note: It is valid to destroy a buffer multiple times.
    * Note: Since no further operations can be enqueued using this buffer, implementations can
    * free resource allocations, including mapped memory that was just unmapped.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns a mapped range ArrayBuffer with the contents of the {@link GPUBuffer} in the given mapped range.
    * @param offset - Offset in bytes into the buffer to return buffer contents from.
    * @param size - Size in bytes of the {@link ArrayBuffer} to return.
    */
  def getMappedRange(): js.typedarray.ArrayBuffer = js.native
  def getMappedRange(offset: Unit, size: GPUSize64): js.typedarray.ArrayBuffer = js.native
  def getMappedRange(offset: GPUSize64): js.typedarray.ArrayBuffer = js.native
  def getMappedRange(offset: GPUSize64, size: GPUSize64): js.typedarray.ArrayBuffer = js.native
  
  /**
    * Maps the given range of the {@link GPUBuffer} and resolves the returned {@link Promise} when the
    * {@link GPUBuffer}'s content is ready to be accessed with {@link GPUBuffer#getMappedRange}.
    * @param mode - Whether the buffer should be mapped for reading or writing.
    * @param offset - Offset in bytes into the buffer to the start of the range to map.
    * @param size - Size in bytes of the range to map.
    */
  def mapAsync(mode: GPUMapModeFlags): js.Promise[Unit] = js.native
  def mapAsync(mode: GPUMapModeFlags, offset: Unit, size: GPUSize64): js.Promise[Unit] = js.native
  def mapAsync(mode: GPUMapModeFlags, offset: GPUSize64): js.Promise[Unit] = js.native
  def mapAsync(mode: GPUMapModeFlags, offset: GPUSize64, size: GPUSize64): js.Promise[Unit] = js.native
  
  /**
    * The length of the {@link GPUBuffer} allocation in bytes.
    */
  val size: GPUSize64 = js.native
  
  /**
    * Unmaps the mapped range of the {@link GPUBuffer} and makes it's contents available for use by the
    * GPU again.
    */
  def unmap(): Unit = js.native
  
  /**
    * The allowed usages for this {@link GPUBuffer}.
    */
  val usage: GPUBufferUsageFlags = js.native
}
