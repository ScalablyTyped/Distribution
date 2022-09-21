package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUCommandEncoder
  extends StObject
     with GPUObjectBase
     with GPUCommandsMixin
     with GPUDebugCommandsMixin {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUCommandEncoder = js.native
  
  /**
    * Begins encoding a compute pass described by `descriptor`.
    * 	descriptor:
    */
  def beginComputePass(): GPUComputePassEncoder = js.native
  def beginComputePass(descriptor: GPUComputePassDescriptor): GPUComputePassEncoder = js.native
  
  /**
    * Begins encoding a render pass described by `descriptor`.
    * @param descriptor - Description of the {@link GPURenderPassEncoder} to create.
    */
  def beginRenderPass(descriptor: GPURenderPassDescriptor): GPURenderPassEncoder = js.native
  
  /**
    * Encode a command into the {@link GPUCommandEncoder} that fills a sub-region of a
    * {@link GPUBuffer} with zeros.
    * @param buffer - The {@link GPUBuffer} to clear.
    * @param offset - Offset in bytes into `buffer` where the sub-region to clear begins.
    * @param size - Size in bytes of the sub-region to clear. Defaults to the size of the buffer minus `offset`.
    */
  def clearBuffer(buffer: GPUBuffer): Unit = js.native
  def clearBuffer(buffer: GPUBuffer, offset: Unit, size: GPUSize64): Unit = js.native
  def clearBuffer(buffer: GPUBuffer, offset: GPUSize64): Unit = js.native
  def clearBuffer(buffer: GPUBuffer, offset: GPUSize64, size: GPUSize64): Unit = js.native
  
  /**
    * Encode a command into the {@link GPUCommandEncoder} that copies data from a sub-region of a
    * {@link GPUBuffer} to a sub-region of another {@link GPUBuffer}.
    * @param source - The {@link GPUBuffer} to copy from.
    * @param sourceOffset - Offset in bytes into `source` to begin copying from.
    * @param destination - The {@link GPUBuffer} to copy to.
    * @param destinationOffset - Offset in bytes into `destination` to place the copied data.
    * @param size - Bytes to copy.
    */
  def copyBufferToBuffer(
    source: GPUBuffer,
    sourceOffset: GPUSize64,
    destination: GPUBuffer,
    destinationOffset: GPUSize64,
    size: GPUSize64
  ): Unit = js.native
  
  /**
    * Encode a command into the {@link GPUCommandEncoder} that copies data from a sub-region of a
    * {@link GPUBuffer} to a sub-region of one or multiple continuous texture subresources.
    * @param source - Combined with `copySize`, defines the region of the source buffer.
    * @param destination - Combined with `copySize`, defines the region of the destination texture subresource.
    * 	`copySize`:
    */
  def copyBufferToTexture(source: GPUImageCopyBuffer, destination: GPUImageCopyTexture, copySize: GPUExtent3DStrict): Unit = js.native
  
  /**
    * Encode a command into the {@link GPUCommandEncoder} that copies data from a sub-region of one or
    * multiple continuous texture subresourcesto a sub-region of a {@link GPUBuffer}.
    * @param source - Combined with `copySize`, defines the region of the source texture subresources.
    * @param destination - Combined with `copySize`, defines the region of the destination buffer.
    * 	`copySize`:
    */
  def copyTextureToBuffer(source: GPUImageCopyTexture, destination: GPUImageCopyBuffer, copySize: GPUExtent3DStrict): Unit = js.native
  
  /**
    * Encode a command into the {@link GPUCommandEncoder} that copies data from a sub-region of one
    * or multiple contiguous texture subresources to another sub-region of one or
    * multiple continuous texture subresources.
    * @param source - Combined with `copySize`, defines the region of the source texture subresources.
    * @param destination - Combined with `copySize`, defines the region of the destination texture subresources.
    * 	`copySize`:
    */
  def copyTextureToTexture(source: GPUImageCopyTexture, destination: GPUImageCopyTexture, copySize: GPUExtent3DStrict): Unit = js.native
  
  /**
    * Completes recording of the commands sequence and returns a corresponding {@link GPUCommandBuffer}.
    * 	descriptor:
    */
  def finish(): GPUCommandBuffer = js.native
  def finish(descriptor: GPUCommandBufferDescriptor): GPUCommandBuffer = js.native
  
  /**
    * Resolves query results from a {@link GPUQuerySet} out into a range of a {@link GPUBuffer}.
    * 	querySet:
    * 	firstQuery:
    * 	queryCount:
    * 	destination:
    * 	destinationOffset:
    */
  def resolveQuerySet(
    querySet: GPUQuerySet,
    firstQuery: GPUSize32,
    queryCount: GPUSize32,
    destination: GPUBuffer,
    destinationOffset: GPUSize64
  ): Unit = js.native
  
  /**
    * Writes a timestamp value into a querySet when all previous commands have completed executing.
    * @param querySet - The query set that will store the timestamp values.
    * @param queryIndex - The index of the query in the query set.
    */
  def writeTimestamp(querySet: GPUQuerySet, queryIndex: GPUSize32): Unit = js.native
}
