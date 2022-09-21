package typings.webgpuTypes

import typings.std.BufferSource
import typings.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUQueue
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUQueue = js.native
  
  /**
    * Issues a copy operation of the contents of a platform image/canvas
    * into the destination texture.
    * This operation performs [[#color-space-conversions|color encoding]] into the destination
    * encoding according to the parameters of {@link GPUImageCopyTextureTagged}.
    * Copying into a `-srgb` texture results in the same texture bytes, not the same decoded
    * values, as copying into the corresponding non-`-srgb` format.
    * Thus, after a copy operation, sampling the destination texture has
    * different results depending on whether its format is `-srgb`, all else unchanged.
    * Issue: If an srgb-linear color space is added, explain here how it interacts.
    * @param source - source image and origin to copy to `destination`.
    * @param destination - The texture subresource and origin to write to, and its encoding metadata.
    * @param copySize - Extents of the content to write from `source` to `destination`.
    */
  def copyExternalImageToTexture(
    source: GPUImageCopyExternalImage,
    destination: GPUImageCopyTextureTagged,
    copySize: GPUExtent3DStrict
  ): Unit = js.native
  
  /**
    * Returns a {@link Promise} that resolves once this queue finishes processing all the work submitted
    * up to this moment.
    */
  def onSubmittedWorkDone(): js.Promise[Unit] = js.native
  
  /**
    * Schedules the execution of the command buffers by the GPU on this queue.
    * Submitted command buffers cannot be used again.
    * 	`commandBuffers`:
    */
  def submit(commandBuffers: js.Iterable[GPUCommandBuffer]): Unit = js.native
  
  /**
    * Issues a write operation of the provided data into a {@link GPUBuffer}.
    * @param buffer - The buffer to write to.
    * @param bufferOffset - Offset in bytes into `buffer` to begin writing at.
    * @param data - Data to write into `buffer`.
    * @param dataOffset - Offset in into `data` to begin writing from. Given in elements if
    * 	`data` is a `TypedArray` and bytes otherwise.
    * @param size - Size of content to write from `data` to `buffer`. Given in elements if
    * 	`data` is a `TypedArray` and bytes otherwise.
    */
  def writeBuffer(buffer: GPUBuffer, bufferOffset: GPUSize64, data: BufferSource): Unit = js.native
  def writeBuffer(buffer: GPUBuffer, bufferOffset: GPUSize64, data: BufferSource, dataOffset: Unit, size: GPUSize64): Unit = js.native
  def writeBuffer(buffer: GPUBuffer, bufferOffset: GPUSize64, data: BufferSource, dataOffset: GPUSize64): Unit = js.native
  def writeBuffer(
    buffer: GPUBuffer,
    bufferOffset: GPUSize64,
    data: BufferSource,
    dataOffset: GPUSize64,
    size: GPUSize64
  ): Unit = js.native
  def writeBuffer(buffer: GPUBuffer, bufferOffset: GPUSize64, data: SharedArrayBuffer): Unit = js.native
  def writeBuffer(
    buffer: GPUBuffer,
    bufferOffset: GPUSize64,
    data: SharedArrayBuffer,
    dataOffset: Unit,
    size: GPUSize64
  ): Unit = js.native
  def writeBuffer(buffer: GPUBuffer, bufferOffset: GPUSize64, data: SharedArrayBuffer, dataOffset: GPUSize64): Unit = js.native
  def writeBuffer(
    buffer: GPUBuffer,
    bufferOffset: GPUSize64,
    data: SharedArrayBuffer,
    dataOffset: GPUSize64,
    size: GPUSize64
  ): Unit = js.native
  
  /**
    * Issues a write operation of the provided data into a {@link GPUTexture}.
    * @param destination - The texture subresource and origin to write to.
    * @param data - Data to write into `destination`.
    * @param dataLayout - Layout of the content in `data`.
    * @param size - Extents of the content to write from `data` to `destination`.
    */
  def writeTexture(
    destination: GPUImageCopyTexture,
    data: BufferSource,
    dataLayout: GPUImageDataLayout,
    size: GPUExtent3DStrict
  ): Unit = js.native
  def writeTexture(
    destination: GPUImageCopyTexture,
    data: SharedArrayBuffer,
    dataLayout: GPUImageDataLayout,
    size: GPUExtent3DStrict
  ): Unit = js.native
}
