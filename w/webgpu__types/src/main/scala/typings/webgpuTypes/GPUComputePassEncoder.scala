package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUComputePassEncoder
  extends StObject
     with GPUObjectBase
     with GPUCommandsMixin
     with GPUDebugCommandsMixin
     with GPUBindingCommandsMixin {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUComputePassEncoder = js.native
  
  /**
    * Dispatch work to be performed with the current {@link GPUComputePipeline}.
    * See [[#computing-operations]] for the detailed specification.
    * @param workgroupCountX - X dimension of the grid of workgroups to dispatch.
    * @param workgroupCountY - Y dimension of the grid of workgroups to dispatch.
    * @param workgroupCountZ - Z dimension of the grid of workgroups to dispatch.
    */
  def dispatchWorkgroups(workgroupCountX: GPUSize32): Unit = js.native
  def dispatchWorkgroups(workgroupCountX: GPUSize32, workgroupCountY: Unit, workgroupCountZ: GPUSize32): Unit = js.native
  def dispatchWorkgroups(workgroupCountX: GPUSize32, workgroupCountY: GPUSize32): Unit = js.native
  def dispatchWorkgroups(workgroupCountX: GPUSize32, workgroupCountY: GPUSize32, workgroupCountZ: GPUSize32): Unit = js.native
  
  /**
    * Dispatch work to be performed with the current {@link GPUComputePipeline} using parameters read
    * from a {@link GPUBuffer}.
    * See [[#computing-operations]] for the detailed specification.
    * packed block of **three 32-bit unsigned integer values (12 bytes total)**,
    * given in the same order as the arguments for {@link GPUComputePassEncoder#dispatchWorkgroups}.
    * For example:
    * @param indirectBuffer - Buffer containing the indirect dispatch parameters.
    * @param indirectOffset - Offset in bytes into `indirectBuffer` where the dispatch data begins.
    */
  def dispatchWorkgroupsIndirect(indirectBuffer: GPUBuffer, indirectOffset: GPUSize64): Unit = js.native
  
  /**
    * Completes recording of the compute pass commands sequence.
    */
  def end(): Unit = js.native
  
  /**
    * Sets the current {@link GPUComputePipeline}.
    * @param pipeline - The compute pipeline to use for subsequent dispatch commands.
    */
  def setPipeline(pipeline: GPUComputePipeline): Unit = js.native
}
