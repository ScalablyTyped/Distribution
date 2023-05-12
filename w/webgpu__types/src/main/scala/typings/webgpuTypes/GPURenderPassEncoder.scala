package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPURenderPassEncoder
  extends StObject
     with GPUObjectBase
     with GPUCommandsMixin
     with GPUDebugCommandsMixin
     with GPUBindingCommandsMixin
     with GPURenderCommandsMixin {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPURenderPassEncoder = js.native
  
  /**
    * @param queryIndex - The index of the query in the query set.
    */
  def beginOcclusionQuery(queryIndex: GPUSize32): Unit = js.native
  
  /**
    * Completes recording of the render pass commands sequence.
    */
  def end(): Unit = js.native
  
  /**
    */
  def endOcclusionQuery(): Unit = js.native
  
  /**
    * Executes the commands previously recorded into the given {@link GPURenderBundle}s as part of
    * this render pass.
    * When a {@link GPURenderBundle} is executed, it does not inherit the render pass's pipeline, bind
    * groups, or vertex and index buffers. After a {@link GPURenderBundle} has executed, the render
    * pass's pipeline, bind group, and vertex/index buffer state is cleared
    * (to the initial, empty values).
    * Note: The state is cleared, not restored to the previous state.
    * This occurs even if zero {@link GPURenderBundle|GPURenderBundles} are executed.
    * @param bundles - List of render bundles to execute.
    */
  def executeBundles(bundles: js.Iterable[GPURenderBundle]): Unit = js.native
  
  /**
    * Sets the constant blend color and alpha values used with {@link GPUBlendFactor#"constant"}
    * and {@link GPUBlendFactor#"one-minus-constant"} {@link GPUBlendFactor}s.
    * @param color - The color to use when blending.
    */
  def setBlendConstant(color: GPUColor): Unit = js.native
  
  /**
    * Sets the scissor rectangle used during the rasterization stage.
    * After transformation into viewport coordinates any fragments which fall outside the scissor
    * rectangle will be discarded.
    * @param x - Minimum X value of the scissor rectangle in pixels.
    * @param y - Minimum Y value of the scissor rectangle in pixels.
    * @param width - Width of the scissor rectangle in pixels.
    * @param height - Height of the scissor rectangle in pixels.
    */
  def setScissorRect(
    x: GPUIntegerCoordinate,
    y: GPUIntegerCoordinate,
    width: GPUIntegerCoordinate,
    height: GPUIntegerCoordinate
  ): Unit = js.native
  
  /**
    * Sets the {@link RenderState#[[stencilReference]]} value used during stencil tests with
    * the {@link GPUStencilOperation#"replace"} {@link GPUStencilOperation}.
    * @param reference - The new stencil reference value.
    */
  def setStencilReference(reference: GPUStencilValue): Unit = js.native
  
  /**
    * Sets the viewport used during the rasterization stage to linearly map from normalized device
    * coordinates to viewport coordinates.
    * @param x - Minimum X value of the viewport in pixels.
    * @param y - Minimum Y value of the viewport in pixels.
    * @param width - Width of the viewport in pixels.
    * @param height - Height of the viewport in pixels.
    * @param minDepth - Minimum depth value of the viewport.
    * @param maxDepth - Maximum depth value of the viewport.
    */
  def setViewport(x: Double, y: Double, width: Double, height: Double, minDepth: Double, maxDepth: Double): Unit = js.native
}
