package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUBindingCommandsMixin extends StObject {
  
  /**
    * Sets the current {@link GPUBindGroup} for the given index.
    * @param index - The index to set the bind group at.
    * @param bindGroup - Bind group to use for subsequent render or compute commands.
    * 	<!--The overload appears to be confusing bikeshed, and it ends up expecting this to
    * 	define the arguments for the 5-arg variant of the method, despite the "for"
    * 	explicitly pointing at the 3-arg variant. See
    * @param https - //github.com/plinss/widlparser/issues/56 and
    * @param https - //github.com/tabatkins/bikeshed/issues/1740 -->
    * @param dynamicOffsets - Array containing buffer offsets in bytes for each entry in
    * 	`bindGroup` marked as {@link GPUBindGroupLayoutEntry#buffer}.{@link GPUBufferBindingLayout#hasDynamicOffset}.-->
    */
  def setBindGroup(index: GPUIndex32, bindGroup: GPUBindGroup): Unit = js.native
  /**
    * Sets the current {@link GPUBindGroup} for the given index, specifying dynamic offsets as a subset
    * of a {@link Uint32Array}.
    * @param index - The index to set the bind group at.
    * @param bindGroup - Bind group to use for subsequent render or compute commands.
    * @param dynamicOffsetsData - Array containing buffer offsets in bytes for each entry in
    * 	`bindGroup` marked as {@link GPUBindGroupLayoutEntry#buffer}.{@link GPUBufferBindingLayout#hasDynamicOffset}.
    * @param dynamicOffsetsDataStart - Offset in elements into `dynamicOffsetsData` where the
    * 	buffer offset data begins.
    * @param dynamicOffsetsDataLength - Number of buffer offsets to read from `dynamicOffsetsData`.
    */
  def setBindGroup(
    index: GPUIndex32,
    bindGroup: GPUBindGroup,
    dynamicOffsetsData: js.typedarray.Uint32Array,
    dynamicOffsetsDataStart: GPUSize64,
    dynamicOffsetsDataLength: GPUSize32
  ): Unit = js.native
  def setBindGroup(index: GPUIndex32, bindGroup: GPUBindGroup, dynamicOffsets: js.Iterable[GPUBufferDynamicOffset]): Unit = js.native
}
