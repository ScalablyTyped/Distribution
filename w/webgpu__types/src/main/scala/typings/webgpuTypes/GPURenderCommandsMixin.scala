package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPURenderCommandsMixin extends StObject {
  
  /**
    * Draws primitives.
    * See [[#rendering-operations]] for the detailed specification.
    * @param vertexCount - The number of vertices to draw.
    * @param instanceCount - The number of instances to draw.
    * @param firstVertex - Offset into the vertex buffers, in vertices, to begin drawing from.
    * @param firstInstance - First instance to draw.
    */
  def draw(vertexCount: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: Unit, firstVertex: Unit, firstInstance: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: Unit, firstVertex: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: Unit, firstVertex: GPUSize32, firstInstance: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: GPUSize32, firstVertex: Unit, firstInstance: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: GPUSize32, firstVertex: GPUSize32): Unit = js.native
  def draw(vertexCount: GPUSize32, instanceCount: GPUSize32, firstVertex: GPUSize32, firstInstance: GPUSize32): Unit = js.native
  
  /**
    * Draws indexed primitives.
    * See [[#rendering-operations]] for the detailed specification.
    * @param indexCount - The number of indices to draw.
    * @param instanceCount - The number of instances to draw.
    * @param firstIndex - Offset into the index buffer, in indices, begin drawing from.
    * @param baseVertex - Added to each index value before indexing into the vertex buffers.
    * @param firstInstance - First instance to draw.
    */
  def drawIndexed(indexCount: GPUSize32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: Unit,
    firstIndex: Unit,
    baseVertex: Unit,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: Unit, firstIndex: Unit, baseVertex: GPUSignedOffset32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: Unit,
    firstIndex: Unit,
    baseVertex: GPUSignedOffset32,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: Unit, firstIndex: GPUSize32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: Unit,
    firstIndex: GPUSize32,
    baseVertex: Unit,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: Unit, firstIndex: GPUSize32, baseVertex: GPUSignedOffset32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: Unit,
    firstIndex: GPUSize32,
    baseVertex: GPUSignedOffset32,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: GPUSize32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: Unit,
    baseVertex: Unit,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: GPUSize32, firstIndex: Unit, baseVertex: GPUSignedOffset32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: Unit,
    baseVertex: GPUSignedOffset32,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(indexCount: GPUSize32, instanceCount: GPUSize32, firstIndex: GPUSize32): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: GPUSize32,
    baseVertex: Unit,
    firstInstance: GPUSize32
  ): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: GPUSize32,
    baseVertex: GPUSignedOffset32
  ): Unit = js.native
  def drawIndexed(
    indexCount: GPUSize32,
    instanceCount: GPUSize32,
    firstIndex: GPUSize32,
    baseVertex: GPUSignedOffset32,
    firstInstance: GPUSize32
  ): Unit = js.native
  
  /**
    * Draws indexed primitives using parameters read from a {@link GPUBuffer}.
    * See [[#rendering-operations]] for the detailed specification.
    * tightly packed block of **five 32-bit unsigned integer values (20 bytes total)**, given in
    * the same order as the arguments for {@link GPURenderEncoderBase#drawIndexed}. For example:
    * @param indirectBuffer - Buffer containing the indirect drawIndexed parameters.
    * @param indirectOffset - Offset in bytes into `indirectBuffer` where the drawing data begins.
    */
  def drawIndexedIndirect(indirectBuffer: GPUBuffer, indirectOffset: GPUSize64): Unit = js.native
  
  /**
    * Draws primitives using parameters read from a {@link GPUBuffer}.
    * See [[#rendering-operations]] for the detailed specification.
    * packed block of **four 32-bit unsigned integer values (16 bytes total)**, given in the same
    * order as the arguments for {@link GPURenderEncoderBase#draw}. For example:
    * @param indirectBuffer - Buffer containing the indirect draw parameters.
    * @param indirectOffset - Offset in bytes into `indirectBuffer` where the drawing data begins.
    */
  def drawIndirect(indirectBuffer: GPUBuffer, indirectOffset: GPUSize64): Unit = js.native
  
  /**
    * Sets the current index buffer.
    * @param buffer - Buffer containing index data to use for subsequent drawing commands.
    * @param indexFormat - Format of the index data contained in `buffer`.
    * @param offset - Offset in bytes into `buffer` where the index data begins. Defaults to `0`.
    * @param size - Size in bytes of the index data in `buffer`.
    * 	Defaults to the size of the buffer minus the offset.
    */
  def setIndexBuffer(buffer: GPUBuffer, indexFormat: GPUIndexFormat): Unit = js.native
  def setIndexBuffer(buffer: GPUBuffer, indexFormat: GPUIndexFormat, offset: Unit, size: GPUSize64): Unit = js.native
  def setIndexBuffer(buffer: GPUBuffer, indexFormat: GPUIndexFormat, offset: GPUSize64): Unit = js.native
  def setIndexBuffer(buffer: GPUBuffer, indexFormat: GPUIndexFormat, offset: GPUSize64, size: GPUSize64): Unit = js.native
  
  /**
    * Sets the current {@link GPURenderPipeline}.
    * @param pipeline - The render pipeline to use for subsequent drawing commands.
    */
  def setPipeline(pipeline: GPURenderPipeline): Unit = js.native
  
  /**
    * Sets the current vertex buffer for the given slot.
    * @param slot - The vertex buffer slot to set the vertex buffer for.
    * @param buffer - Buffer containing vertex data to use for subsequent drawing commands.
    * @param offset - Offset in bytes into `buffer` where the vertex data begins. Defaults to `0`.
    * @param size - Size in bytes of the vertex data in `buffer`.
    * 	Defaults to the size of the buffer minus the offset.
    */
  def setVertexBuffer(slot: GPUIndex32, buffer: GPUBuffer): Unit = js.native
  def setVertexBuffer(slot: GPUIndex32, buffer: GPUBuffer, offset: Unit, size: GPUSize64): Unit = js.native
  def setVertexBuffer(slot: GPUIndex32, buffer: GPUBuffer, offset: GPUSize64): Unit = js.native
  def setVertexBuffer(slot: GPUIndex32, buffer: GPUBuffer, offset: GPUSize64, size: GPUSize64): Unit = js.native
}
